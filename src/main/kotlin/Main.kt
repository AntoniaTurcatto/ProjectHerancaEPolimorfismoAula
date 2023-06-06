//    Crie uma classe Pessoa com propriedades como nome, idade e genero.
//    Crie uma classe derivada Estudante que herda de Pessoa e adiciona a propriedade curso.
//    Crie uma outra classe derivada Professor que herda de Pessoa e adiciona a propriedade disciplina.
//    Crie objetos dessas classes e imprima as informações de cada um.

fun main(args: Array<String>) {
    val maria = Estudante("Maria", 17, "F", "Computacao")
    maria.status()

    val miguel = Professor("miguel", 32, "m", "Sistemas Operacionais")
    miguel.status()

}