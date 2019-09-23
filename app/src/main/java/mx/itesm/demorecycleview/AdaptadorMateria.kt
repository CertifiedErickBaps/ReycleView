package mx.itesm.demorecycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.elemento_material.view.*

class AdaptadorMateria (val contexto: Context, val arrMaterias: Array<Materia>) : RecyclerView.Adapter<AdaptadorMateria.TarjetaMateria>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarjetaMateria {
        val vista = LayoutInflater.from(contexto).inflate(R.layout.elemento_material, parent, false)
        return TarjetaMateria(vista)
    }

    override fun getItemCount(): Int {
        return arrMaterias.size
    }

    override fun onBindViewHolder(holder: TarjetaMateria, position: Int) {
        val materia = arrMaterias[position]
        holder.set(materia)
    }

    inner class TarjetaMateria(var vistaMateria: View): RecyclerView.ViewHolder(vistaMateria) {
        fun set(materia: Materia) {
            vistaMateria.etClave.text = materia.clave
            vistaMateria.etNombre.text = materia.nombre
        }

    }

}