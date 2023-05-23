package br.senai.sp.jandira.lionschool.service

import br.senai.sp.jandira.lionschool.model.ListaAlunos
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface AlunosMatriculaService {

    /////////////////////////// RETORNO DOS ALUNOS PELA MATRICULA ////////////////////////////////////

    //http://localhost:8080/v1/lion-school/
    //http://localhost:8080/v1/lion-school/alunos-matricula?matricula=20151001004

    // Retorna os Alunos pela matricula
    @GET("alunos-matricula/")
    fun getAlunosMatricula(@Query("matricula") matricula: Int): Call<ListaAlunos>
}