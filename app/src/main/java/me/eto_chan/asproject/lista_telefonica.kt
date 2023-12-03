package me.eto_chan.asproject

import android.content.Intent
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


        binding.userCircle.setOnClickListener{
            finish() //fazer para aceder as informações do utilizador e para editar as informações
        }

        binding.addNumber.setOnClickListener{
            finish() //fazer para adicionar um novo numero
        }

        binding.deleteNumber.setOnClickListener{
            finish() //fazer para deletar um novo numero
        }

        binding.aboutUs.setOnClickListener{
            val i2 = Intent(this, about_us::class.java)
            startActivity(i2)
        }

    }
}