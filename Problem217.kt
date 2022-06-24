class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
    
        val map : HashMap<Int,Int> = HashMap<Int,Int>()
    
        for(i in 0 until nums.size) {
            map.put(nums[i],map.getOrDefault(nums[i],0).plus(1))
        }
    
        val result = map.filterValues { it > 1}.keys
    
        if(result.isNotEmpty()){
            return true
        } else {
            return false
        }
   }
}