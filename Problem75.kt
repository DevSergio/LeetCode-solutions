class Solution {
    fun sortColors(nums: IntArray): Unit {
    
        for(i in 0 until nums.size -1) {
            for(j in 0 until nums.size -1) {
                if(nums[j] > nums[j+1]) {
                   var temp = nums[j]
                   nums[j] = nums[j + 1]
                   nums[j + 1 ] = temp
            }
               }
          }
   }
}