package com.example.clicklistchangecolor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clicklistchangecolor.databinding.ActivityBernalListBinding

class BernalListActivity : AppCompatActivity() {

    private lateinit var binding:ActivityBernalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityBernalListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dataOfStudent = DataOfStudent ("BERNAL")


        binding.btnFabAddNewData.setOnClickListener {
            val intent = Intent(this,SetDataActivity::class.java)
            intent.putExtra("dataOfStudent",dataOfStudent.school)
            startActivity(intent)

        }



    }
}