class Professor(nome:String, idade:Int, genero:String, disciplina:String): Pessoa(nome, idade, genero) {
    private var disciplinaClass=""

    init{

        disciplinaClass=disciplina.uppercase()
    }
    fun status(){
        println("${getNome()}, ${getIdade()}, ${getGenero()}, ${getDisciplinas()}")
    }

    fun getDisciplinas():String{
        return disciplinaClass
    }
}