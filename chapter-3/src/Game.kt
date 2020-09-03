fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val userChoice = getUserChoice(options)
    val gameChoice = getGameChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[kotlin.random.Random.nextInt(optionsParam.size)]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValid = false
    var userChoice = ""

    // Loop until the user enters a valid choice.
    while (!isValid) {
        print("Please enter one of the following:")
        for (choice in optionsParam) print(" $choice")
        println(".")
        val userInput = readLine()
        if (userInput != null && userInput in optionsParam) {
            isValid = true
            userChoice = userInput
        }
        if (!isValid) println("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result = if (userChoice == gameChoice) "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")
    ) "You win!"
    else "You lose!"
    println("You chose $userChoice. I chose $gameChoice. $result")
}