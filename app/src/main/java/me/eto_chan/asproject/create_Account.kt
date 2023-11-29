package me.eto_chan.asproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.eto_chan.asproject.databinding.ActivityCreateAccountBinding
import me.eto_chan.asproject.databinding.ActivityListaTelefonicaBinding

class create_Account : AppCompatActivity() {
    private lateinit var binding: ActivityCreateAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backLogin.setOnClickListener{
            finish()
        }
    }
}