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

//     lateinit var list:List<Weather>
     var data: Array<Weather>? = null
    //var data:List<Weather>?=null
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.viewholder_layout, parent, false)
        return EventViewHolder(view)

    }

    override fun getItemCount(): Int {
        return if (data == null) 0 else data!!.size
    }

    override fun onBindViewHolder(holder: EventViewHolder?, position: Int) {
       var weather:Weather=data!!.get(position)
        holder!!.textView.setText(weather.province)
        holder.tvmax.setText(weather.max)
        holder.tvmin.setText(weather.min)

    }

    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        lateinit var imageView: ImageView
        lateinit var textView:TextView
        lateinit var tvmax:TextView
        lateinit var tvmin:TextView

        init {
            imageView = itemView.profile
            textView=itemView.province
            tvmax=itemView.max
            tvmin=itemView.min
        }

    }
}