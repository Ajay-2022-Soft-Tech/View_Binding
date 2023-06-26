package com.example.day18viewbinding

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.day18viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
                //variable name :  Type (type of class)
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        make instance of binding ( similar of class)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNew.setOnClickListener{
            if (binding.checkBox.isChecked){
                //open a new screen
                val newScreen = Intent(this,newActivity::class.java )
                startActivity(newScreen)
            }
            else{
                // for setting color if user doesnot accept T&C
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this, "Please accept the T&C", Toast.LENGTH_SHORT).show()
            }
        }
    }
}