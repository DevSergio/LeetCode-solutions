class Solution {
    fun climbStairs(n: Int): Int {
       return fibonaci(n + 1)
    }

    private fun fibonaci(n : Int , first : Int = 0 ,second : Int = 1) : Int {
       if(n == 0) return first
    
       else return fibonaci(n - 1 , second, first+second)
    
    }
}