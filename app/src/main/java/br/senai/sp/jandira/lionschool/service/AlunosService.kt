package br.senai.sp.jandira.lionschool.service

import br.senai.sp.jandira.lionschool.model.ListaAlunos
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AlunosService {

    ///////////////////////////RETORNO DOS ALUNOS POR (CURSO, STATUS E ANO)///////////////////////////////

    //http://localhost:8080/v1/lion-school/alunos?curso=DS&status=Cursando&ano=2023
    //Alunos pelos 3 parametros(CURSO, STATUS e ANO)
    @GET("alunos/")
    fun getAlunosCursoStatusAno(@Query("curso") curso: String, @Query("status") status: String, @Query("ano") ano: Int): Call<ListaAlunos>

    ///////////////////////////RETORNO DOS ALUNOS POR (CURSO, STATUS)////////////////////

    //http://localhost:8080/v1/lion-school/alunos?curso=DS&status=Cursando
    //Alunos pelos 2 parametros(CURSO e STATUS)
    @GET("alunos/")
    fun getAlunosCursoStatus(@Query("curso") curso: String, @Query("status") status: String): Call<ListaAlunos>

    ////////////////////////////RETORNO DOS ALUNOS POR (CURSO, ANO) ///////////////////////

    //http://localhost:8080/v1/lion-school/alunos?curso=DS&ano=2023
    //Alunos pelos 2 parametros(CURSO e ANO)
    @GET("alunos/")
    fun getAlunosCursoAno(@Query("curso") curso: String,@Query("ano") ano: Int): Call<ListaAlunos>

    //////////////////////////////RETORNO DOS ALUNOS POR (STATUS, ANO) //////////////////////

    //http://localhost:8080/v1/lion-school/alunos?status=Cursando&ano=2023
    //Alunos pelos 2 parametros(STATUS e ANO)
    @GET("alunos/")
    fun getAlunosStatusAno(@Query("status") status: String, @Query("ano") ano: Int): Call<ListaAlunos>

    /////////////////////////////RETORNO DOS ALUNOS SOMENTE PELO CURSO////////////////

    //http://localhost:8080/v1/lion-school/alunos?curso=DS&status=Cursando&ano=2023
    //Alunos pelo parametro (CURSO)
    @GET("alunos/")
    fun getAlunosCurso(@Query("curso") curso: String): Call<ListaAlunos>

    ////////////////////////////RETORNO DOS ALUNOS SOMENTE PELO STATUS/////////////////

    //http://localhost:8080/v1/lion-school/alunos?curso=DS&status=Cursando&ano=2023
    //Alunos pelo parametro (STATUS)
    @GET("alunos/")
    fun getAlunosStatus(@Query("status") status: String): Call<ListaAlunos>



}