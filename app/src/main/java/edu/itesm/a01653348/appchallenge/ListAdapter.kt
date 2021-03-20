package edu.itesm.a01653348.appchallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class ListAdapter(private val cards : List<Card>)
    : RecyclerView.Adapter<ListAdapter.CardViewHolder>(){

    inner class CardViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var model = renglon.findViewById<TextView>(R.id.model)
        var price = renglon.findViewById<TextView>(R.id.price)
        var description = renglon.findViewById<TextView>(R.id.description)
        var picture = renglon.findViewById<ImageView>(R.id.picture)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.row_layout,parent, false)
        return CardViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val card= cards[position]
        holder.picture.setImageResource(card.picture)
        holder.model.text = card.model
        holder.price.text = card.price
        holder.description.text = card.description
        holder.itemView.setOnClickListener{

            val action = ListFragmentDirections.actionListFragmentToDetailsFragment(card)
            holder.itemView.findNavController().navigate(action)
        }
    }

    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return cards.size
    }
}