package tde4

sealed class Result(var message : String) {
    class Success : Result("Sucesso!")
    class Error: Result("Erro.")
    class Loading: Result("Carregando . . .")
}

fun showResult(state : Result) = when(state){
        is Result.Success -> Result.Success()
        is Result.Error -> Result.Error()
        is Result.Loading -> {
            println("Minha interface agora mostra o loading")
            Result.Loading()
        }
    }