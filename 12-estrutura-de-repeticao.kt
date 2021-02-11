fun main() {
    letters()
}

fun downTo(){
    for(i in 10 downTo 0){
        println("$i ")
    }
}

fun until(){
    for(i in 0 until 20){
        println("$i ")
    }
}


fun step(num:Int){
    for(i in 0.. 20 step num){
        println("$i ")
    }
}


fun letters(){
    val sArrey = "Olá essa string!"
    
    sArrey.forEach{l ->
        println(l + " ")
    }
}