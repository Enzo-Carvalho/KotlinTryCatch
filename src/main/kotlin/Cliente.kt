class Cliente(
   private var nome: String,
   private var endereco: String,
   private var telefone: String
) {

    private var listaDeCompras = (mutableListOf<String>())

    fun adicionarItem(item: String){
        if(item == ""){
            throw Exception ("Nome inválido para itens")
        }
        listaDeCompras.add(item)
    }

    fun removerItem(item: String){
        for(produto in listaDeCompras){
            if(produto == item){
                listaDeCompras.remove(item)
                break
            }
        }
    }

    fun listaItens(){
       println("Lista de compras \n")
       listaDeCompras.forEach {
           println(it)
       }
    }

    fun validarNome(){
        if(nome == ""){
            throw Exception ("Nome vazio")
        }
    }
     init {
         validarNome()
     }
}