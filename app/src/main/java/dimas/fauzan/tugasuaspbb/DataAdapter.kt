package dimas.fauzan.tugasuaspbb

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dimas.fauzan.tugasuaspbb.MoveActivity.Companion.EXTRA_DES
import dimas.fauzan.tugasuaspbb.MoveActivity.Companion.EXTRA_NAME
import dimas.fauzan.tugasuaspbb.MoveActivity.Companion.EXTRA_PHOTO


class DataAdapter(private val list: ArrayList<Data>) : RecyclerView.Adapter<DataAdapter.DataViewHolder>(){

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgCat: ImageView = itemView.findViewById(R.id.cat_image)
        var tvName: TextView = itemView.findViewById(R.id.cat_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.card_category, parent, false)
        return DataViewHolder(view)
    }
    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val data = list[position]

        Glide.with(holder.itemView.context)
            .load(data.icon)
            .apply(RequestOptions().override(150, 150))
            .into(holder.imgCat)

        holder.tvName.text = data.name
        holder.itemView.setOnClickListener(View.OnClickListener {
            val activity = holder.itemView.context as Activity
            val dataView = Intent(activity, MoveActivity::class.java)
            dataView.putExtra(MoveActivity.EXTRA_PHOTO, data.icon)
            dataView.putExtra(MoveActivity.EXTRA_NAME, data.name)
            dataView.putExtra(MoveActivity.EXTRA_DES, data.des)
            activity.startActivity(dataView)
        })
    }


}