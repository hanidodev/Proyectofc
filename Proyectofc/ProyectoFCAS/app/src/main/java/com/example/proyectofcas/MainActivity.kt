package com.example.proyectofcas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectofcas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingActivity:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingActivity = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(bindingActivity.root)
        ViewCompat.setOnApplyWindowInsetsListener(bindingActivity.fragmentContainerView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

}