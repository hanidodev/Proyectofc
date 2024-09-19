package com.example.proyectofcas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import model.Gasto
import java.text.SimpleDateFormat
import java.util.Locale

class GastoAdapter : ListAdapter<Gasto, GastoAdapter.GastoViewHolder>(GastoDiffCallback()) {

    // ViewHolder: mantiene las referencias a las vistas de cada fila
    class GastoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val cantidadTextView: TextView = itemView.findViewById(R.id.cantidadTextView)
        private val conceptoTextView: TextView = itemView.findViewById(R.id.conceptoTextView)
        private val fechaTextView: TextView = itemView.findViewById(R.id.fechaTextView)

        // Método para enlazar datos del Registro con la vista
        fun bind(gasto:Gasto) {
            cantidadTextView.text = gasto.cantidad.toString()
            conceptoTextView.text = gasto.concepto
            fechaTextView.text = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(gasto.fecha)
        }
    }

    // Crea nuevas vistas (es decir, infla el layout de cada fila)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GastoViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_item, parent, false)
        return GastoViewHolder(itemView)
    }

    // Enlaza los datos de un objeto Registro con una fila específica
    override fun onBindViewHolder(holder: GastoViewHolder, position: Int) {
        val registro = getItem(position)
        holder.bind(registro)
    }

    // GastoDiffCallback: ayuda a RecyclerView a determinar si dos elementos de la lista son iguales o diferentes
    class GastoDiffCallback : DiffUtil.ItemCallback<Gasto>() {
        override fun areItemsTheSame(oldItem:Gasto, newItem: Gasto): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem:Gasto, newItem:Gasto): Boolean {
            return oldItem == newItem
        }
    }
}
