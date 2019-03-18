package DaysKotlin.week2

import java.util.*


object Day10StringPermutationProblem {

    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter a string: ")
        val permutationString = Scanner(System.`in`).nextLine()
        println(stringPermutationProblem(permutationString))
    }


    private fun stringPermutationProblem(permutationString: String?): Set<String>? {

        val perm = HashSet<String>()
        //Handling error scenarios
        if (permutationString == null) {
            return null
        } else if (permutationString.isEmpty()) {
            perm.add("")
            return perm
        }


        val initial = permutationString[0] // first character
        val restOfTheString = permutationString.substring(1) // Full string with out first character

        val words = stringPermutationProblem(restOfTheString)

        for (strNew in words!!) {
            for (i in 0..strNew.length) {
                perm.add(charInsert(strNew, initial, i))
            }
        }
        return perm
    }

    private fun charInsert(str: String, c: Char, j: Int): String {
        val begin = str.substring(0, j)
        val end = str.substring(j)
        return begin + c + end
    }


}
