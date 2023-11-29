package me.eto_chan.asproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.eto_chan.asproject.databinding.ActivityListaTelefonicaBinding
import me.eto_chan.asproject.databinding.ActivityMainBinding

class lista_telefonica : AppCompatActivity() {

    private lateinit var binding: ActivityListaTelefonicaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaTelefonicaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            finish() //so para teste para voltar ao menu de login
        }

    }
}