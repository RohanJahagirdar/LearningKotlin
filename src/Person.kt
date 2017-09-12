open class Person  {

    private var name:String=""
    private var age:Int = 0

    constructor() {
    }

    constructor(personName: String) {
        name = personName
        println("Name")
    }

    constructor(personName:String, personAge: Int) {
         name = personName
         age = personAge
        println("Age Constructor name: ${name} and age= ${age}")
    }

    constructor(name:String, age:Int, citizenship:String?):this(name, age) {
        println("Citizenship Constructor name: ${name}   and age= ${age}  and citizenship = ${citizenship}")
    }

    fun getName():String {
        return name
    }

    fun getAge():Int {
        return age
    }

    open fun isEligibleForVoting():Boolean {
        return age>=18
    }
}