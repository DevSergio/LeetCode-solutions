fun main() {
    println(isPalindrome(12001))
}

fun isPalindrome(x: Int): Boolean {
        val characters = x.toString()
        var check = true

        for(i in 0 until characters.length){
            val element = characters[i]

            if(element != characters[characters.length - 1 - i]) {
                check = false
            }

        }
        return check
}
