package com.example.proyectofinal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class CustomAdapter(var context: Context, var cocacola:ArrayList<Cocacola>):BaseAdapter() {

    private class ViewHolder(row: View?){
        var txtName:TextView
        var ivImage: ImageView
init{
    this.txtName=row?.findViewById(R.id.text1) as TextView
    this.ivImage=row?.findViewById(R.id.image1) as ImageView
}

    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if(convertView==null){
            var layout = LayoutInflater.from(context)
            view= layout.inflate(R.layout.cocacola_list,parent,false)
            viewHolder=ViewHolder(view)
            view.tag = viewHolder

        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var cocacola:Cocacola=getItem(position) as Cocacola
        viewHolder.txtName.text= cocacola.name
        viewHolder.ivImage.setImageResource(cocacola.image)
        return view as View
     }

    override fun getItem(position: Int): Any {
   return cocacola.get(position)
    }

    override fun getItemId(position: Int): Long {
   return position.toLong()
    }

    override fun getCount(): Int {
    return cocacola.count()
    }
}