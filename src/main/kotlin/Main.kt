fun main() {
 println( names("happiness"))
    var name = "cynthia"
    println(name.reversed())
    println(reversedstring("micheal"))

    println(elements(listOf(3,56,45,100,34)))

}
//Write a function that takes a string as a parameter
//and returns the number of vowels in the string.

fun names(words: String): Int {
    var vowels = listOf('a', 'i', 'o', 'u', 'e')
    var count = 0
    for (x in words) {
        if (x in vowels) {
            count++
        }

    }
    return count
 }
//Write a function that takes a string as a parameter and returns the string in reverse order.

fun reversedstring(student: String): String{

   var hold = student.reversed()

    return hold

 }
//Write a function that takes a list of integers as a
//parameter and return a sorted list.

 fun elements(number: List<Int>) :List<Int> {

     var newList = number.sorted()
     return newList
 }
