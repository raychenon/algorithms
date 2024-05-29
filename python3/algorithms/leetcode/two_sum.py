from typing import List
def twoSum(nums: List[int], target: int) -> List[int]:
    """
    https://leetcode.com/problems/two-sum/

    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    Assumption: each input is unique
    """
    map = dict()
    for i in range(len(nums)):
        complement = target - nums[i]
        if complement in map:
            return [map.get(complement), i]
        map[nums[i]] = i

    return []


if __name__ == "__main__":
    assert twoSum([2, 7, 11, 15], 9) == [0, 1]
