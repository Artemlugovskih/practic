fun main() {
    //1
    val age1=42
    println(age1)
    val age2=21
    println(age2)
    //2//3
    val avg1=( age1 + age2 ) / 2
    println(avg1)
    //4
    val firstName="Артём"
    println(firstName)
    val lastName="Луговских"
    println(lastName)
    //5
    val fullName=firstName+" "+lastName
    println(fullName)
    //6
    val myDetails="Привет, меня зовут"+" "+fullName
    println(myDetails)
    //7
    val triple=Triple(6 ,24 , 2004)
    println(triple)
    //8
    val month=triple.first
    println(month)
    val day=triple.second
    println(day)
    val year=triple.third
    println(year)
    //10
    val pair = Pair (7, year)
    println(pair)

}