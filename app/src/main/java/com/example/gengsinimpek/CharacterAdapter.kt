package com.example.gengsinimpek

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CharacterAdapter(private val data: List<CharacterModel>) : RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val listItem: CardView = itemView.findViewById(R.id.list_item)
        val characterIcon: ImageView = itemView.findViewById(R.id.character_icon)
        val characterIconBg: CardView = itemView.findViewById(R.id.character_icon_bg)
        val characterName: TextView = itemView.findViewById(R.id.character_name)
        val characterTitle: TextView = itemView.findViewById(R.id.character_title)
        val characterElementImg: ImageView = itemView.findViewById(R.id.character_element_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.list_character, parent, false)
        return ViewHolder(view)
    }

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        Picasso.get().load(item.icon).error(R.drawable.bx_error).into(holder.characterIcon)
        holder.characterName.text = item.name
        holder.characterTitle.text = item.title

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailActivity::class.java)
            intent.putExtra("url", item.url)
            intent.putExtra("wish", item.wish)
            intent.putExtra("item", item.item)
            intent.putExtra("name", item.name)
            intent.putExtra("quality", item.quality)
            intent.putExtra("title", item.title)
            intent.putExtra("birthday", item.birthday)
            intent.putExtra("constellation", item.constellation)
            intent.putExtra("element", item.element)
            intent.putExtra("weapon", item.weapon)
            intent.putExtra("region", item.region)
            intent.putExtra("detail", item.detail)
            it.context.startActivity(intent)
        }

        when (item.element.toString()) {
            "Anemo" -> {
                holder.characterElementImg.setImageResource(R.drawable.element_anemo)
                holder.characterIconBg.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#3EB6B9"))
                holder.characterIconBg.outlineSpotShadowColor = Color.parseColor("#74C2A8")
                holder.listItem.outlineSpotShadowColor = Color.parseColor("#74C2A8")
            }
            "Cryo" -> {
                holder.characterElementImg.setImageResource(R.drawable.element_cryo)
                holder.characterIconBg.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#6AC9DB"))
                holder.characterIconBg.outlineSpotShadowColor = Color.parseColor("#9Fd6E3")
                holder.listItem.outlineSpotShadowColor = Color.parseColor("#9Fd6E3")
            }
            "Dendro" -> {
                holder.characterElementImg.setImageResource(R.drawable.element_dendro)
                holder.characterIconBg.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#749F3C"))
                holder.characterIconBg.outlineSpotShadowColor = Color.parseColor("#A5C83B")
                holder.listItem.outlineSpotShadowColor = Color.parseColor("#A5C83B")
            }
            "Electro" -> {
                holder.characterElementImg.setImageResource(R.drawable.element_electro)
                holder.characterIconBg.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#8558B2"))
                holder.characterIconBg.outlineSpotShadowColor = Color.parseColor("#AF8EC1")
                holder.listItem.outlineSpotShadowColor = Color.parseColor("#AF8EC1")
            }
            "Geo" -> {
                holder.characterElementImg.setImageResource(R.drawable.element_geo)
                holder.characterIconBg.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#BE9946"))
                holder.characterIconBg.outlineSpotShadowColor = Color.parseColor("#FAB632")
                holder.listItem.outlineSpotShadowColor = Color.parseColor("#FAB632")
            }
            "Hydro" -> {
                holder.characterElementImg.setImageResource(R.drawable.element_hydro)
                holder.characterIconBg.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#3A75BC"))
                holder.characterIconBg.outlineSpotShadowColor = Color.parseColor("#4CC2F1")
                holder.listItem.outlineSpotShadowColor = Color.parseColor("#4CC2F1")
            }
            "Pyro" -> {
                holder.characterElementImg.setImageResource(R.drawable.element_pyro)
                holder.characterIconBg.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#BC6243"))
                holder.characterIconBg.outlineSpotShadowColor = Color.parseColor("#EF7938")
                holder.listItem.outlineSpotShadowColor = Color.parseColor("#EF7938")
            }
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}