fun main(args: Array<String>){

    //immutable array
    val _intArray = arrayOf(1,2,3)
    for(item in _intArray){
        println(item)
    }
    val _stringArray = arrayOf("dog","cat","tiger")
    for(item in _stringArray){
        println(item)
    }


    //
    val _listArray = ArrayList<String>()
    _listArray.add("Dog")
    _listArray.add("Cat")
    _listArray.add("Tiger")
    for(i in _listArray){
        println(i)
    }
}