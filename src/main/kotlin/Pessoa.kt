open class Pessoa(nome:String, idade:Int, genero:String) {

    protected var nomeClass=""
    protected var idadeClass=0
    protected var generoClass=""

    init{
        nomeClass=nome.uppercase()
        idadeClass=idade
        generoClass=genero.uppercase()
    }

    fun getNome():String{
        return nomeClass
    }

    fun getIdade():Int{
        return idadeClass
    }

    fun getGenero():String{
        return generoClass
    }
}