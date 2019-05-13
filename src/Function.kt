fun main(args: Array<String>) {

   /* println("Hello World!")
    val _tmp1:String = "Nuttapon Yumin"
    println(_tmp1)
    val _tmp2:Int = 1234
    val _tmp3:Boolean = true
    println("tmp2= ${_tmp2} and tmp3= ${_tmp3}")
    */

    method_noArg()
    method_args("Dii",1234,true)

    val _result = method_withReturn("Nuttapon Yumin")
    println(_result)
}

fun method_noArg(){
    println("method_noArg")
}

fun method_args(arg1:String, arg2:Int, arg3:Boolean){
    println("arg1 is: $arg1, arg2 is: $arg2, arg3 is: $arg3")
}

fun method_withReturn(name:String) : String{
    return "Hi $name"
}