package edu.rupp.ckcc.recyclerview_kotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.viewholder_layout.view.*

class EventAdapter(context:Context): RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    lateinit var list:List<Weather>
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.viewholder_layout, parent, false)
        return EventViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: EventViewHolder?, position: Int) {
       var weather:Weather=list.get(position)
        holder!!.textView.setText(weather.province)
    }

    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        lateinit var imageView: ImageView
        lateinit var textView:TextView

        init {
            imageView = itemView.profile
            textView=itemView.province
        }

    }
}