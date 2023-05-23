package br.senai.sp.jandira.lionschool.model

data class Alunos(
    val foto: String,
    val nome: String,
    val matricula: Int,
    val sexo: String,
    val curso: Curso,
    val status: String
)
