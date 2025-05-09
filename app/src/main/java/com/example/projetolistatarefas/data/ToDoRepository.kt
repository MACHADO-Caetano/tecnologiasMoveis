package com.example.projetolistatarefas.data

import com.example.projetolistatarefas.data.model.ToDo

class ToDoRepository {
    val todoList = listOf(
        ToDo(
            1,
            "Comprar leite",
            "Comprar 1L de leite no mercado",
            false
        ),
        ToDo(
            2,
            "Estudar Kotlin",
            "Revisar classes, objetos e funções",
            false
        ),
        ToDo(
            3,
            "Fazer exercícios",
            "Treinar na academia por 1 hora",
            false
        ),
        ToDo(
            4,
            "Pagar contas",
            "Pagar fatura do cartão de crédito",
            false
        ),
        ToDo(
            5,
            "Fazer compras",
            "Lista de compras: arroz, feijão, carne",
            false
        ),
        ToDo(
            6,
            "Assistir aula online",
            "Ver aula de programação Android",
            false
        ),
        ToDo(
            7,
            "Ler um livro",
            "Ler 20 páginas do livro atual",
            false
        ),
        ToDo(
            8,
            "Enviar e-mails",
            "Responder e-mails pendentes do trabalho",
            false
        ),
        ToDo(
            9,
            "Organizar a casa",
            "Arrumar a sala e o quarto",
            false
        ),
        ToDo(
            10,
            "Estudar inglês",
            "Praticar 30 minutos de conversação",
            false
        )
    )


    fun getTodos() = todoList


}