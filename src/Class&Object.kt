

class Account(val Username:String, val Password:String) {
    fun login(log_username: String, log_password:String) : Boolean{
        if(log_username == Username && log_password == Password){
            return true
        }else{
            return false
        }
    }
}

fun main(args: Array<String>){
    val acc = Account("Nuttapon","Moodey04")
    if(acc.login("Nuttapon","Moodey04") == true){
        println("success")
    }else{
        println("failed")
    }
}