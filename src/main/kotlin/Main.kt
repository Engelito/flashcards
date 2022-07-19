import java.util.Random;
import java.util.Arrays
fun prompt() : String{
    println("Would you like to study keywords or definitions?")
    var user = readLine().toString()
    return user

}
fun main() {
    println("Hello World")
    val c1 = Flashcard("Between", "An operator that compares an expression with a range of values")
    val c2 = Flashcard("Select", "Used to retrieve table data")
    val c3 = Flashcard("From", "A clause that indicates the table from which the data is retrieved")
    val c4 = Flashcard("Order By", "A SQL clause used to sort the rows of a result set")
    val c5 = Flashcard("Limit", "A SQL clause used to indicate the number of rows to return in the result set")
    val c6 = Flashcard("Distinct", "A SQL keyword used to eliminate duplicate rows in the result set")
    val c7 = Flashcard("Where", "A SQL clause used to retrieve just the data to match a stated condition")
    val c8 = Flashcard("Arithmetic operator", "Used to make calculations")
    val c9 = Flashcard("Comparison operators", "Used to make comparison to restrict information in results")
    val c10 = Flashcard("Logical operators", "Use with multiple conditions to combine or negate search")
    val list = arrayOf(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10)
    var answer = prompt();
    if (answer == "keywords") {


        var grade = 0
        for (list in list) {
            println(list.key + " " + list.def)

            println("What is the definition for " + list.key)
            var userDef = readLine()!!
            if (userDef == list.def || userDef == "right") {
                println("Correct!")
                grade = grade + 1

            } else if (userDef == "quit")
                break
            else {
                println("You got it wrong!")
            }


        }
        println("after loop")
        println("You got " + grade + "/10")
        if (grade >= 7 && grade < 9) {
            print("You did okay, but you can do better")
        } else if (grade >= 9) {
            println("You are a super star! I see you shining!")
        } else {
            println("You need to do better buddy!")
        }
    }
    else if(answer == "definitions"){
        println("You selected to work on the keywords!")
        var grade = 0
        for (list in list) {
            println(list.key + " " + list.def)

            println("What is the keyword for " + list.def)
            var userKey = readLine()!!
            if (userKey == list.key || userKey == "right") {
                println("Correct!")
                grade = grade + 1

            } else if (userKey == "quit")
                break
            else {
                println("You got it wrong!")
            }


        }
        println("after loop")
        println("You got " + grade + "/10")
        if (grade >= 7 && grade < 9) {
            print("You did okay, but you can do better")
        } else if (grade >= 9) {
            println("You are a super star! I see you shining!")
        } else {
            println("You need to do better buddy!")
        }
    }
    else{
        println("invalid response")
    }
    println("Would you like to play again?")
    var play = readLine()
    if(play == "yes")
        prompt()
    else
        println("thanks for play!")
}
   // var random = Random()
    //var randomProgram = random.nextInt(list.count())
    //var randomWord = list
    //println("this is an object " + list)
    //print("This is inside the list" + list[randomProgram])
    //println("Welcome to week 7 vocabulary quiz")


   // var play = false
    //while (play) {
      //  println("What is the definition for")
        //var answerString = readLine()!!
    //}


    //print("Please enter your definition: ")
    //val stringInput = readLine()!!

 //   println("You entered: $stringInput")
//}