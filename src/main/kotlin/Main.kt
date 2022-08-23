fun main() {
    val cliente1 = Cliente("Enzo","rua japão","40028922")
    while(true){
        try {
            println("sendo:")
            println("(1) Adicionar")
            println("(2) Remover")
            println("(3) Checar")
            println("(0) Sair")
            print("opção: ")
            val opc = readln().toInt()
            when(opc) {
                1 -> {
                    print("digite item:")
                    cliente1.adicionarItem(readln())
                }
                2 -> {
                    print("Digite item a ser removido: ")
                    val nomeARemover = readln()
                    cliente1.removerItem(nomeARemover)
                }
                3 -> {
                    print("Lista de Itens: \n")
                    cliente1.listaItens()
                }
                0 -> break
            }

        }catch (erro: Exception){
            println(erro.message)
        }
    }
}