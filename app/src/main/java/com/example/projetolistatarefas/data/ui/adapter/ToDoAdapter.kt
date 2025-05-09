package br.com.ulbra.projetoaulaquinta.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.projetolistatarefas.R
import com.example.projetolistatarefas.data.model.ToDo

class ToDoAdapter : ListAdapter<ToDo, TodoViewHolder>(TodoDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val itemView =
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.todo_item_list, parent, false)

        return TodoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}