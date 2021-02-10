fun main() {
    val a = 10
    val b = 35
    
    //if else
    if(a < b) {
        println("'a' é menor 'b'")
    }else if( a > b){
        println("'a' é maior que 'b")
    }else{
        println("'a' é igual a 'b'")
    }

    //when
    when(0) {
       in 0..5 -> "Ruim"
       in 6..7 -> "Bom"
       in 8..10 -> "Excelente"
       else -> "Indefinido"
    }
}