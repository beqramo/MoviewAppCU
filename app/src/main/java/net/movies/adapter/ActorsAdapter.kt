package net.movies.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.artist_row.view.*
import net.movies.R
import net.movies.model.Artist
import net.movies.model.Movie

class ActorsAdapter (val actors : List<Artist>, val context: Context) : RecyclerView.Adapter<ActorsAdapter.ActorViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorsAdapter.ActorViewHolder {

        return ActorsAdapter.ActorViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.artist_row, parent, false)
        )
    }

    override fun getItemCount() = actors.size

    override fun onBindViewHolder(holder: ActorsAdapter.ActorViewHolder, position: Int) {
        val actor = actors[position]
        holder.view.originalName.text = actor.fullName
        holder.view.role.text = actor.fullName

        Glide.with(holder.view.context)
            .load(actor.imageUrl)
            .into(holder.view.imageView2)

    }


    class ActorViewHolder(val view: View) : RecyclerView.ViewHolder(view)

}