// Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,3,2]
// Output: 3
// Example 2:

// Input: nums = [0,1,0,1,0,1,99]
// Output: 99
 

// Constraints:

// 1 <= nums.length <= 3 * 104
// -231 <= nums[i] <= 231 - 1
// Each element in nums appears exactly three times except for one element which appears once.


class singlenumber {
    public int singleNumber(int[] nums) {
       HashMap <Integer,Integer> mp = new HashMap <>();
       for(int ele : nums){ //using iterator
            mp.put(ele,mp.getOrDefault(ele,0) +1); 
            //search element in the new hashmap ,if not found put it in the map with value 0 with key 
            //from nums[], else value as the frequency +1(with every new occurance) 
       }
       for(Map.Entry <Integer,Integer> key : mp.entrySet()){ //traverse through hashmap
            if(key.getValue()==1)
                return key.getKey();
       }
        return -1;     
    }
}