package app.imc.imc.adaptador

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import app.imc.imc.R
import app.imc.imc.data.Imc

class ImcAdapter(val items: ArrayList<Imc>,val context: Context): RecyclerView.Adapter<ImcAdapter.ImcViewholder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImcViewholder {
       return ImcViewholder(LayoutInflater.from(context).inflate(R.layout.item_clasificacion , parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ImcViewholder, position: Int) {
        val imc = items.get(position)
        holder.indice?.text = imc.indicador
        holder.imc?.text = imc.imc
        holder.img?.setImageResource(imc.icono)
    }

    class ImcViewholder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
          val indice = itemView?.findViewById<TextView>(R.id.item_tx_indicador)
          val imc = itemView?.findViewById<TextView>(R.id.item_tx_imc)
          val img = itemView?.findViewById<ImageView>(R.id.item_img_icono)
    }

}