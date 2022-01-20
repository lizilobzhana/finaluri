package com.example.finaluri

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finaluri.fragments.PlanetDetailFragment
import kotlinx.android.synthetic.main.fragment_view.view.*

class Adapter(var planet: List<PlanetData>) : RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title
        var planetimg = view.planet_img
        var galaxy = view.galaxy
        var distance = view.distance
        var gravity = view.gravity

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_view, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage: Int? = null
        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,PlanetDetailFragment::class.java)
            intent.putExtra("planet",planet[position])
            intent.putExtra("planetImage",dummyImage)
            holder.itemView.context.startActivity(intent)

        }
        holder.title.text = planet[position].title
        holder.galaxy.text = planet[position].galaxy
        holder.distance.text = planet[position].distance + " მლნ კმ"
        holder.gravity.text = planet[position].title + " მ/წწ"

        when (planet[position].title!!.toLowerCase()) {
            "mars" -> {
                dummyImage = R.drawable.mars
            }
            "neptune" -> {
                dummyImage = R.drawable.neptune
            }
            "earth" -> {
                dummyImage = R.drawable.earth
            }
            "moon" -> {
                dummyImage = R.drawable.moon
            }
            "venus" -> {
                dummyImage = R.drawable.venus
            }
            "jupiter" -> {
                dummyImage = R.drawable.jupiter
            }
            "saturn" -> {
                dummyImage = R.drawable.saturn
            }
            "uranus" -> {
                dummyImage = R.drawable.uranus
            }
            "mercury" -> {
                dummyImage = R.drawable.mercury
            }
            "sun" -> {
                dummyImage = R.drawable.sun
            }
        }
        holder.planetimg.setImageResource(dummyImage!!)


    }

    override fun getItemCount(): Int {
        return planet.size
    }
}