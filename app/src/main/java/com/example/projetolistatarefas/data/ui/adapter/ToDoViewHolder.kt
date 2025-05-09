package br.com.ulbra.projetoaulaquinta.ui.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projetolistatarefas.R
import com.example.projetolistatarefas.data.model.ToDo
import com.google.android.material.checkbox.MaterialCheckBox

class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val title: TextView = itemView.findViewById(R.id.titleTodo)
    private val description: TextView = itemView.findViewById(R.id.todoTaskDescription)
    private val isCheck: MaterialCheckBox = itemView.findViewById(R.id.todoCheck)

    fun bind(todo: ToDo) {
        title.text = todo.title
        description.text = todo.description
        isCheck.isChecked = todo.isCheck
    }
}