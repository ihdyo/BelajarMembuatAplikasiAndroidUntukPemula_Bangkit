package com.example.gengsinimpek

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val back: ImageView = findViewById(R.id.btn_back)
        val openUrl: ImageView = findViewById(R.id.btn_internet)
        val shareUrl: ImageView = findViewById(R.id.btn_share)
        val characterWish: ImageView = findViewById(R.id.character_wish)
        val characterWishBg: View = findViewById(R.id.character_wish_bg)
        val characterItem: ImageView = findViewById(R.id.character_item)
        val characterName: TextView = findViewById(R.id.character_name)
        val characterQuality: ImageView = findViewById(R.id.character_quality)
        val characterTitle: TextView = findViewById(R.id.character_title)
        val characterBirthday: TextView = findViewById(R.id.character_birthday)
        val characterConstellation: TextView = findViewById(R.id.character_constellation)
        val characterElement: TextView = findViewById(R.id.character_element)
        val characterElementImg: ImageView = findViewById(R.id.character_element_img)
        val characterWeapon: TextView = findViewById(R.id.character_weapon)
        val characterWeaponImg: ImageView = findViewById(R.id.character_weapon_img)
        val characterRegion: TextView = findViewById(R.id.character_region)
        val characterRegionImg: ImageView = findViewById(R.id.character_region_img)
        val characterDetail: TextView = findViewById(R.id.character_detail)

        val url = intent.getStringExtra("url")
        val wish = intent.getStringExtra("wish")
        val item = intent.getStringExtra("item")
        val name = intent.getStringExtra("name")
        val quality = intent.getIntExtra("quality", 0)
        val title = intent.getStringExtra("title")
        val birthday = intent.getStringExtra("birthday")
        val constellation = intent.getStringExtra("constellation")
        val element = intent.getStringExtra("element")
        val weapon = intent.getStringExtra("weapon")
        val region = intent.getStringExtra("region")
        val detail = intent.getStringExtra("detail")

        Picasso.get().load(wish).error(R.drawable.bx_error).into(characterWish)
        Picasso.get().load(item).error(R.drawable.bx_error).into(characterItem)
        characterName.text = name
        characterTitle.text = title
        characterBirthday.text = birthday
        characterConstellation.text = constellation
        characterElement.text = element
        characterWeapon.text = weapon
        characterRegion.text = region
        characterDetail.text = detail

        when (quality) {
            4 -> characterQuality.setImageResource(R.drawable.icon_4_stars)
            5 -> characterQuality.setImageResource(R.drawable.icon_5_stars)
        }

        when (element.toString()) {
            getString(R.string.anemo) -> {
                characterElementImg.setImageResource(R.drawable.element_anemo)
                characterWishBg.background.setTint(ContextCompat.getColor(this, R.color.alt_anemo))
            }
            getString(R.string.cryo) -> {
                characterElementImg.setImageResource(R.drawable.element_cryo)
                characterWishBg.background.setTint(ContextCompat.getColor(this, R.color.alt_cryo))
            }
            getString(R.string.dendro) -> {
                characterElementImg.setImageResource(R.drawable.element_dendro)
                characterWishBg.background.setTint(ContextCompat.getColor(this, R.color.alt_dendro))
            }
            getString(R.string.electro) -> {
                characterElementImg.setImageResource(R.drawable.element_electro)
                characterWishBg.background.setTint(ContextCompat.getColor(this, R.color.alt_electro))
            }
            getString(R.string.geo) -> {
                characterElementImg.setImageResource(R.drawable.element_geo)
                characterWishBg.background.setTint(ContextCompat.getColor(this, R.color.alt_geo))
            }
            getString(R.string.hydro) -> {
                characterElementImg.setImageResource(R.drawable.element_hydro)
                characterWishBg.background.setTint(ContextCompat.getColor(this, R.color.alt_hydro))
            }
            getString(R.string.pyro) -> {
                characterElementImg.setImageResource(R.drawable.element_pyro)
                characterWishBg.background.setTint(ContextCompat.getColor(this, R.color.alt_pyro))
            }
        }

        when (weapon.toString()) {
            getString(R.string.bow) -> characterWeaponImg.setImageResource(R.drawable.icon_bow)
            getString(R.string.catalyst) -> characterWeaponImg.setImageResource(R.drawable.icon_catalyst)
            getString(R.string.claymore) -> characterWeaponImg.setImageResource(R.drawable.icon_claymore)
            getString(R.string.polearm) -> characterWeaponImg.setImageResource(R.drawable.icon_polearm)
            getString(R.string.sword) -> characterWeaponImg.setImageResource(R.drawable.icon_sword)
        }

        when (region.toString()) {
            getString(R.string.inazuma) -> characterRegionImg.setImageResource(R.drawable.emblem_inazuma)
            getString(R.string.liyue) -> characterRegionImg.setImageResource(R.drawable.emblem_liyue)
            getString(R.string.mondstadt) -> characterRegionImg.setImageResource(R.drawable.emblem_mondstadt)
            getString(R.string.sumeru) -> characterRegionImg.setImageResource(R.drawable.emblem_sumeru)
        }

        openUrl.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        shareUrl.setOnClickListener {
            val sharingIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, url)
            }
            startActivity(Intent.createChooser(sharingIntent, "Share URL using"))
        }

        back.setOnClickListener {
            finish()
        }
    }
}