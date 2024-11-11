import java.io.File

//А.Баг в библиотеке
fun num1(){

    var output = File("C:\\Users\\Admin\\IdeaProjects\\Algorithmic tasks\\src\\files\\output").printWriter()
    var input = File("C:\\Users\\Admin\\IdeaProjects\\Algorithmic tasks\\src\\files\\input").readLines()

    var number: String = ""

    var currentStr = ""
    var outputMap = mutableMapOf<Int, String>()

    input.forEach { line ->
        currentStr = line
        line.forEach { letter ->
            if(letter.isDigit()){
                number += letter
            }
        }
        outputMap.put(number.toInt(),currentStr.replace(oldValue = number, newValue = ""))
        number = ""
    }

    outputMap = outputMap.toSortedMap()

    output.use { out ->
        outputMap.forEach{
            out.println(it.value)
        }
    }
}