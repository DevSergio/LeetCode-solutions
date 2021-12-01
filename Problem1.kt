fun main() {  
    var nums = intArrayOf(2,7,11,15)
    var target = 9
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
