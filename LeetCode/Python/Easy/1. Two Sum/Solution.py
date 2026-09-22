class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        seen = {}  # Dictionary to store numbers and their indices -> {num: index}
        
        for i, num in enumerate(nums):
            complement = target - num
            
            # If the complement is already in our dictionary, return its index and the current index
            if complement in seen:
                return [seen[complement], i]
            
            # Otherwise, add the current number and its index to the dictionary
            seen[num] = i