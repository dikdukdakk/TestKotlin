import java.awt.BufferCapabilities

fun main(args: Array<String>){
   /* val _p1 = PersonV1() //create an obj
    _p1.display()

    val _p2 = PersonV2("Nuttapon",22)
    _p2.display()

    val _p3 = PersonV3()
    _p3.display()

    */

    val _p4 = PersonV4()
    _p4.display()

    val _p41 = PersonV4("nuttapon",22)
    _p41.display()

    val _p42 = PersonV4("nuttapon",22,true)
    _p42.display()
}

class PersonV1(){
    fun display(){
        println("OK")
    }
}

//Primary Constructor
class PersonV2(val _name2:String, var _age2:Int){
    fun display(){
        println("name: $_name2, age: $_age2")
    }
}

//Primary Constructor with Init
class PersonV3(val _name:String = "Nuttapon Yumin", var _age:Int = 22){

    var _mName:String? = null
    var _mAge:Int? = null

    //บล็อกที่เข้ามาช่วยให้สามารถเปลี่ยนแปลงค่าที่ต้องการได้
    init {
        //this._mName = _name.capitalize()
        //this._mName = _name.toLowerCase()
        this._mName = _name.toUpperCase()
        this._mAge = _age
    }

    fun display(){
        println("name: $_mName, age: $_mAge")
    }


}

//Primary Constructor with Init
class PersonV4{

    var _mName:String? = null
    var _mAge:Int? = null

    //บล็อกที่เข้ามาช่วยให้สามารถเปลี่ยนแปลงค่าที่ต้องการได้
    constructor(){
        _mName = "Noname"
        _mAge = 0
    }

    constructor(_name: String,_age: Int){
        _mName = _name
        _mAge = _age
    }

    constructor(_name: String,_age: Int, istoUpperCase:Boolean){
        if(istoUpperCase) {
            _mName = _name.toUpperCase()
        }else{
            _mName = _name
        }
        _mAge = _age
    }

    fun display(){
        println("name: $_mName, age: $_mAge")
    }
}