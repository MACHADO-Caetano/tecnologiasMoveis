package br.com.ulbra.projetoaulaquinta.ui.adapter

import androidx.recyclerview.widget.DiffUtil

import com.example.projetolistatarefas.data.model.ToDo

class TodoDiffCallback : DiffUtil.ItemCallback<ToDo>() {

    // Verifica se os IDs dos itens são iguais
    override fun areItemsTheSame(oldItem: ToDo, newItem: ToDo): Boolean {
        return oldItem.id == newItem.id
    }

    // Verifica se o conteúdo do item mudou
    override fun areContentsTheSame(oldItem: ToDo, newItem: ToDo): Boolean {
        return oldItem == newItem // Usa o equals da data class
    }
}