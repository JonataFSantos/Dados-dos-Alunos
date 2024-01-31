package com.example.clicklistchangecolor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clicklistchangecolor.databinding.ActivityLeonardoListBinding

class LeonardoListActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLeonardoListBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding=ActivityLeonardoListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dataOfStudent = DataOfStudent ("LEONARDO")



        binding.btnFabAddNewData.setOnClickListener {
            val intent = Intent(this,SetDataActivity::class.java)
            intent.putExtra("dataOfStudent",dataOfStudent.school)
            startActivity(intent)
        }
    }
}