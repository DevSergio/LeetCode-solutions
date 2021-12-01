fun main() {  
    var nums = intArrayOf(3,3)
    var target = 6
    twoSum(nums, target)
}

fun twoSum(nums: IntArray, target: Int): IntArray {
        
        var result = IntArray(2)
        for(i in 0 until nums.size) {
            for(j in i+1 until nums.size) { 
                if(nums[i] + nums[j] == target) {
                    result[0] = i
                    result[1] = j
                }
            }
        }
        return result    
}