package com.example.clicklistchangecolor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clicklistchangecolor.databinding.ActivitySetDataBinding

class SetDataActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySetDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySetDataBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val setSchoolReceivesData = intent.getStringExtra("dataOfStudent")


        binding.dataSend.setOnClickListener {

            finish()
            }
        }
    }
