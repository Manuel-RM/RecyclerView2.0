package com.example.recyclerview20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview20.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeMusicData: Array <JSONObject> = arrayOf(
            JSONObject("{\"song\": \"Plan A\", \"autor\": \"Paulo Londra\", \"guion\": \"-\", \"disco\": \"Plan A\"}"),
            JSONObject("{\"song\": \"Feel Me??\", \"autor\": \"Trueno\", \"guion\": \"-\", \"disco\": \"FEEL ME??\"}"),
            JSONObject("{\"song\": \"Telaraña\", \"autor\": \"Gera MX, Santa Fe Klan\", \"guion\": \"-\", \"disco\": \"Socios II\"}"),
            JSONObject("{\"song\": \"HUMBLE\", \"autor\": \"Kendrick Lamar\", \"guion\": \"-\" ,\"disco\": \"DAMN\"}"),
            JSONObject("{\"song\": \"Stay With Me\", \"autor\": \"1nonly\", \"guion\": \"-\", \"disco\": \"Stay With Me\"}"),
            JSONObject("{\"song\": \"Last Summer\", \"autor\": \"notstellar\", \"guion\": \"-\", \"disco\": \"Bipolar\"}"),
            JSONObject("{\"song\": \"Volando Bajito\", \"autor\": \"DUKI\", \"guion\": \"-\", \"disco\": \"Desde el Fin del Mundo\"}"),
            JSONObject("{\"song\": \"G.M.T\", \"autor\": \"BANG YONGGUK\", \"guion\": \"-\", \"disco\": \"2\"}"),
            JSONObject("{\"song\": \"Iron\", \"autor\": \"Woodkid\", \"guion\": \"-\", \"disco\": \"The Golden Age\"}"),
            JSONObject("{\"song\": \"Hitboy\", \"autor\": \"DUKI, KHEA\", \"guion\": \"-\", \"disco\": \"Hitboy\"}"),
            JSONObject("{\"song\": \"Only One King\", \"autor\": \"Jung Youth\", \"guion\": \"-\", \"disco\": \"Only One King\"}"),
        )

        binding.rcMusicEntries.adapter = MainAdapter(fakeMusicData)
    }
}