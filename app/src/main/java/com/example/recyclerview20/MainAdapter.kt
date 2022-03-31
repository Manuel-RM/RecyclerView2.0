package com.example.recyclerview20

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview20.databinding.ActivityMainBinding
import com.example.recyclerview20.databinding.ItemVideoBinding
import org.json.JSONObject

class MainAdapter(private val music: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemVideoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(music[position])
    }

    override fun getItemCount(): Int = music.size


    class MainHolder(val binding: ItemVideoBinding): RecyclerView.ViewHolder(binding.root){
        fun render(music: JSONObject){
            binding.tvSong.setText(music.getString("song"))
            binding.tvAutor.setText(music.getString("autor"))
            binding.tvDisco.setText(music.getString("disco"))
            binding.Guion.setText(music.getString("guion"))
            binding.ivSmartphone.setImageResource(R.drawable.smartphone_placeholder)
        }
    }
}