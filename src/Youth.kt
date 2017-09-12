class Youth: Person {
    constructor():super()
    constructor(personName: String):super(personName)
    constructor(personName: String, personAge: Int):super(personName, personAge)
    constructor(personName: String, personAge: Int, citizenship: String):super(personName, personAge, citizenship)


    override fun isEligibleForVoting(): Boolean {
        return false
    }
}