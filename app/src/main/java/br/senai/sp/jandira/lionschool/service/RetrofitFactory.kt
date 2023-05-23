package br.senai.sp.jandira.lionschool.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val URL_BASE = "http://localhost:8080/v1/lion-school/"

    //Guarda a conexão com o servidor, devolve a conexão
    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(URL_BASE)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    //Conexão com ALUNOS pela MATRICULA
    fun getAlunosMatriculaService(): AlunosMatriculaService {
        return retrofitFactory.create(AlunosMatriculaService::class.java)
    }

    //Conexão com ALUNOS por parametros como (CURSO, STATUS, ANO)
    fun getAlunosService(): AlunosService{
        return retrofitFactory.create(AlunosService::class.java)
    }

    //Conexão com CURSOS
    fun getCursoService(): CursoService{
        return retrofitFactory.create(CursoService::class.java)
    }

    //Conexão com DISCIPLINAS dos ALUNOS
    fun getDisciplinasService(): DisciplinasService{
        return retrofitFactory.create(DisciplinasService::class.java)
    }
}

