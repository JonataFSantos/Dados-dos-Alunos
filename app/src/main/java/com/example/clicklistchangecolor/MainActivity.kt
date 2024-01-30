package com.example.clicklistchangecolor

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.clicklistchangecolor.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /*val studentName = mutableListOf<String>()

        val studentAdapter = StudentAdapter(studentName)
        binding.recyclerView.adapter = studentAdapter
        binding.imageButton.setOnClickListener {
            val newStudentName = binding.addStudentInList.text.toString()
            if (newStudentName.isNotEmpty()) {
                studentName.add(newStudentName)
                // Notifica o adaptador sobre a mudança no conjunto de dados
                studentAdapter.notifyItemInserted(studentName.size - 1)
                // Limpa o campo de entrada
                binding.addStudentInList.text.clear()
            }
            Toast.makeText(this,"oi",Toast.LENGTH_LONG).show()


            Log.v("Jonata","$studentName")
        }


        binding.recyclerView.adapter = StudentAdapter(studentName)*/

        binding.imgBtnBernal.setOnClickListener {
            val intent = Intent(this, BernalListActivity::class.java)
            startActivity(intent)
        }

        binding.imgBtnLeonardo.setOnClickListener{
            val intent = Intent(this,LeonardoListActivity::class.java)
            startActivity(intent)
        }


    }
}


