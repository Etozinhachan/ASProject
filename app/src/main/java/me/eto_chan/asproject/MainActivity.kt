package me.eto_chan.asproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import me.eto_chan.asproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener{

            val availableUsernames = arrayOf("user","user1","user2","jorginho","arroz","batata")
            val passwords = arrayOf("pass","pass1","pass2","passJorginho","passArroz","passBatata")

            val username = binding.usernameField.text.toString().trim()
            val password = binding.passwordField.text.toString().trim()

            if(availableUsernames.contains(username)){
                val usernameIndex = availableUsernames.indexOf(username)
                if (passwords[usernameIndex] == password) {
                    Toast.makeText(applicationContext, "Login Sucessful!", Toast.LENGTH_SHORT)
                        .show()
                    //val i = Intent(this, ProfileActivity::class.java)
                    //startActivity(i)

                }else{
                    Toast.makeText(applicationContext, "Wrong password!", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(applicationContext, "Username doesn't exist!", Toast.LENGTH_SHORT).show()
            }
            binding.usernameField.setText("")
            binding.passwordField.setText("")

        }
    }
}