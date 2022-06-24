class Solution {
    fun reverseString(s: CharArray): Unit {
     
  	    var begin = 0 
        var end = s.size - 1 
    
        while(end > begin) {
             var temp = s[begin]
             s[begin] = s[end]
             s[end] = temp 
             end--
             begin++
        }
  
    }
}