package com.example.proyectofinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.IntegerRes
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_mostrar.*
import kotlinx.android.synthetic.main.cocacola_list.*
import java.lang.reflect.Array.set

class MostrarActivity : AppCompatActivity() {

    var coleccion: HashMap<String, String> = hashMapOf("" to "")
    var refr:String=""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar)


         refr=getIntent().getStringExtra("refresco")
        var x:Int=getIntent().getIntExtra("precio",0)
            tv1.setText("Precio: "+x)


        if(x==192 ||x==120 ||x==240 ||x==300){
            tv2.setText("Paquete de 24 unidades")
        }
        if(x==180 ||x==216 ||x==264){
            tv2.setText("Paquete de 12 unidades")
        }
        if(x==312 ||x==420 ||x==480 ||x==288){
            tv2.setText("Paquete de 6 unidades")
        }

    }
    fun send(view: View){
        Toast.makeText(this, "Se agrego de manera exitosa", Toast.LENGTH_SHORT).show()
        val uid= FirebaseAuth.getInstance().currentUser?.uid
        val email = FirebaseAuth.getInstance().currentUser?.email
        var user=uid
        if(email!=null){
            user=email
        }

        val db= FirebaseFirestore.getInstance()
             coleccion = hashMapOf(et1.text.toString() to refr.toString() )



            db.collection("coca").document("Pedido")
                .set(coleccion)
             .addOnSuccessListener { Log.d("Succes", "DocumentSnapshot successfully written!") }
            .addOnFailureListener { e -> Log.w("Error", "Error writing document", e) }

    }
}
