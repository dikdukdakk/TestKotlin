fun main(args: Array<String>){
    val username : Any = "nuttapon"
    if(username is String){
        println("Hi, " + username)
    }
}