package com.example.proyectofinal

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.google.firebase.auth.FirebaseUser
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.firebase.ui.auth.AuthUI
import com.google.android.gms.auth.api.Auth


class MainActivity : AppCompatActivity() {
    private val RC_SIGN_IN: Int = 44
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val providers = arrayListOf(
                AuthUI.IdpConfig.AnonymousBuilder().build(),
                AuthUI.IdpConfig.EmailBuilder().build(),
                AuthUI.IdpConfig.PhoneBuilder().build()


                //AuthUI.IdpConfig.PhoneBuilder().build(),
                //AuthUI.IdpConfig.GoogleBuilder().build(),
                //AuthUI.IdpConfig.FacebookBuilder().build(),
                //AuthUI.IdpConfig.TwitterBuilder().build()
            )

            // Create and launch sign-in intent
            startActivityForResult(
                AuthUI.getInstance()
                    .createSignInIntentBuilder()
                    .setAvailableProviders(providers)
                    .build(),
                RC_SIGN_IN
            )
            // [END auth_fui_create_intent]
            setContentView(R.layout.activity_main)

                var ListView = findViewById(R.id.ListView) as ListView
                var arrcoca:ArrayList<Cocacola> = ArrayList()
                arrcoca.add(Cocacola("coca en lata",R.drawable.cocacola_lata))
                arrcoca.add(Cocacola("Vidrio Retornable 6.5 oz",R.drawable.vidrio_retornable_6))
        arrcoca.add(Cocacola("Vidrio Retornable 12 oz",R.drawable.vidrio_retornable_12_oz))
        arrcoca.add(Cocacola("Vidrio Retornable medio Litro",R.drawable.vidrio_retornable_medio_litro))
        arrcoca.add(Cocacola("Vidrio Retornable 1 Litro",R.drawable.vidrio_retornable_1_litro))
        arrcoca.add(Cocacola("Pet medio Litro",R.drawable.pet_medio_litro))
        arrcoca.add(Cocacola("Pet 1.1 Litros",R.drawable.pet_1_1_litros))
        arrcoca.add(Cocacola("Pet 1.25 Litros",R.drawable.pet_1_25_litros))
        arrcoca.add(Cocacola("Pet 1.5 Litros",R.drawable.pet_1_5_litros))
        arrcoca.add(Cocacola("Pet 2 Litros",R.drawable.pet_2_litros))
        arrcoca.add(Cocacola("Pet 2.5 Litros",R.drawable.pet_2_5_litros))
        arrcoca.add(Cocacola("Pet 3 Litros",R.drawable.pet_3_litros))


                ListView.adapter=CustomAdapter(applicationContext, arrcoca)
            ListView.setOnItemClickListener{ parent: AdapterView<*>, view: View, position: Int, id:Long ->
                var precio: Int
                var refresco: String
                if (position==0){
                     precio= 192
                    refresco="coca en lata"
                    //paquete de 24 unidades
                    //Toast.makeText(this@MainActivity,"Item one clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MostrarActivity::class.java)
                    intent.putExtra("precio",precio)
                    intent.putExtra("refresco",refresco)
                    startActivity(intent)
                }
                if (position==1){
                    precio=120
                    refresco="Vidrio Retornable 6.5 oz"
                    //paquete de 24 unidades
                    //Toast.makeText(this@MainActivity,"Item two clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MostrarActivity::class.java)
                    intent.putExtra("precio",precio)
                    intent.putExtra("refresco",refresco)
                    startActivity(intent)
                }
                if (position==2){
                    precio=192
                    refresco="Vidrio Retornable 12 oz"
                    //paquete de 24 unidades
                    //Toast.makeText(this@MainActivity,"Item two clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MostrarActivity::class.java)
                    intent.putExtra("precio",precio)
                    intent.putExtra("refresco",refresco)
                    startActivity(intent)
                }
                if (position==3){
                    precio=240
                    refresco="Vidrio Retornable medio Litro"
                    //paquete de 24 unidades
                    //Toast.makeText(this@MainActivity,"Item two clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MostrarActivity::class.java)
                    intent.putExtra("precio",precio)
                    intent.putExtra("refresco",refresco)
                    startActivity(intent)
                }
                if (position==4){
                    precio=180
                    refresco="Vidrio Retornable 1 Litro"
                    //paquete de 12 unidades
                    //Toast.makeText(this@MainActivity,"Item two clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MostrarActivity::class.java)
                    intent.putExtra("precio",precio)
                    intent.putExtra("refresco",refresco)
                    startActivity(intent)
                }
                if (position==5){
                    precio=300
                    refresco="Pet medio Litro"
                    //paquete de 24 unidades
                    //Toast.makeText(this@MainActivity,"Item two clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MostrarActivity::class.java)
                    intent.putExtra("precio",precio)
                    intent.putExtra("refresco",refresco)
                    startActivity(intent)
                }
                if (position==6){
                    precio=216
                    refresco="Pet 1.1 Litros"
                    //paquete de 12 unidades
                    //Toast.makeText(this@MainActivity,"Item two clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MostrarActivity::class.java)
                    intent.putExtra("precio",precio)
                    intent.putExtra("refresco",refresco)
                    startActivity(intent)
                }
                if (position==7){
                    precio=264
                    refresco="Pet 1.25 Litros"
                    //paquete de 12 unidades
                    //Toast.makeText(this@MainActivity,"Item two clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MostrarActivity::class.java)
                    intent.putExtra("precio",precio)
                    intent.putExtra("refresco",refresco)
                    startActivity(intent)
                }
                if (position==8){
                    precio=312
                    refresco="Pet 1.5 Litros"
                    //paquete de 6 unidades
                    //Toast.makeText(this@MainActivity,"Item two clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MostrarActivity::class.java)
                    intent.putExtra("precio",precio)
                    intent.putExtra("refresco",refresco)
                    startActivity(intent)
                }
                if (position==9){
                    precio=420
                    refresco="Pet 2 Litros"
                    //paquete de 6 unidades
                    //Toast.makeText(this@MainActivity,"Item two clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MostrarActivity::class.java)
                    intent.putExtra("precio",precio)
                    intent.putExtra("refresco",refresco)
                    startActivity(intent)
                }
                if (position==10){
                    precio=480
                    refresco="Pet 2.5 Litros"
                    //paquete de 6 unidades
                    //Toast.makeText(this@MainActivity,"Item two clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MostrarActivity::class.java)
                    intent.putExtra("precio",precio)
                    intent.putExtra("refresco",refresco)
                    startActivity(intent)
                }
                if (position==11){
                    precio=288
                    refresco="Pet 3 Litros"
                    //paquete de 6 unidades
                    //Toast.makeText(this@MainActivity,"Item two clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MostrarActivity::class.java)
                    intent.putExtra("precio",precio)
                    intent.putExtra("refresco",refresco)
                    startActivity(intent)
                }
            }

            }
        }






