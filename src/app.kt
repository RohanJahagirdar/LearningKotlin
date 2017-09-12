
fun main(args: Array<String>) {
    println("Hello World!!")
    testPersons()
    testYouth()
}
// --------------------------------------------PERSONS-----------------------------------------------------
fun testPersons() {
    val c = Person("Pete", 51)
    testPerson(c)
    testPerson()
    testPersonThird()
}
fun testPerson(person: Person ) {
    println("First Person method")
    println("Name: ${person.getName()}")
    println("Age: ${person.getAge()}")
    println("Is eligible to vote: ${isEligibleToVote(person)}")
}

fun testPerson() {
    val c = Person("Rohan", 18)
    println("Second Person method")
    println("name: ${c.getName()}")
    println("age: ${c.getAge()}")
    println("Is eligible to vote: ${isEligibleToVote(c)}")
}

fun testPersonThird() {
    println("Third person method: ")
    val c = Person("Test Name" , 19 , "Test citizenship")
    println("Is eligible to vote: ${isEligibleToVote(c)}")
}

fun isEligibleToVote(person:Person):Boolean {
    return person.getAge()>=18
}


//----------------------------------------YOUTH----------------------


fun testYouth() {
    var youth = Youth("Youth Name", 10)
    println("Youth details: Name is ${youth.getName()} who is ${youth.getAge()} years. Voting eligibility: ${isEligibleToVote(youth)}")
}