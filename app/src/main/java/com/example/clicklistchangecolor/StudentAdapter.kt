package com.example.clicklistchangecolor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.clicklistchangecolor.databinding.RvUserBinding

class StudentAdapter(
    private var studentName: List<String>
):RecyclerView.Adapter<
        StudentAdapter.StudentViewHolder
        >() {



    inner class StudentViewHolder(
        binding: RvUserBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        private val tvStudent = binding.tvNameStudent

        fun bind(nameStudent: String) {
            tvStudent.text = nameStudent
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        return StudentViewHolder(
            RvUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return studentName.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.bind(
            studentName[position]
        )
    }

}