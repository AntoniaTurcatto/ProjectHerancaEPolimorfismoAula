class Estudante(nome: String, idade:Int, genero:String, curso:String) :Pessoa(nome, idade, genero) {
    private var cursoClass=""

    init{
        cursoClass=curso.uppercase()
    }

    fun status(){
        println("${getNome()}, ${getIdade()}, ${getGenero()}, ${getCurso()}")
    }

    fun getCurso():String{
        return cursoClass
    }
}