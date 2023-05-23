package br.senai.sp.jandira.lionschool.service

import br.senai.sp.jandira.lionschool.model.ListaAlunos
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface DisciplinasService {

    /////////////////////////// RETORNO DA DISCIPLINA DOS ALUNOS ////////////////////////////////////

    //http://localhost:8080/v1/lion-school/
    //http://localhost:8080/v1/lion-school/alunos-disciplinas?matricula=20151001024

    // Retorna as disciplinas dos alunos pela matricula
    @GET("alunos-disciplinas/")
    fun getDisciplinasAlunosMatricula(@Query("matricula") matricula: Int): Call<ListaAlunos>
}