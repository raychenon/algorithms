from typing import List
import sys


def maxSubarraySumCircular(A: List[int]) -> int:
    """
    https://leetcode.com/problems/maximum-sum-circular-subarray/
    :param A:
    :return:  maximum possible sum of a non-empty subarray of C.
    """

    total_sum = 0
    min_sum = sys.maxsize
    max_sum = -sys.maxsize
    acc_min = 0
    acc_max = 0
    for e in A:
        total_sum += e

        acc_max += e
        max_sum = max(max_sum, acc_max)
        acc_max = 0 if acc_max < 0 else acc_max

        acc_min += e
        min_sum = min(min_sum, acc_min)
        acc_min = 0 if acc_min > 0 else acc_min

    return total_sum if total_sum == min_sum else max(max_sum, total_sum - min_sum)


def maxSubarraySumCircularSimple(A: List[int]) -> int:
    """
    * Time complexity: O(N)
     * Space complexity: O(1)
     * <p>
     * case 1 : the max subarray  is NOT circular
     * [    | max_subarray_sum |       ]
     * <p>
     * case 2 : the max subarray  is circular
     * [max_subarray_sum1 | min_subarray_sum  | max_subarray_sum2]
     * == total_sum - min_subarray_sum
     * <p>
     * Corner case
     * If all numbers are negative, maxSum = max(A) and minSum = sum(A).
     * <p>
     * https://leetcode.com/problems/maximum-sum-circular-subarray/discuss/178422/One-Pass
    :param A:
    :return:
    """
    total_sum, max_sum, acc_max, min_sum, acc_min = 0, A[0], 0, A[0], 0
    for a in A:
        acc_max = max(acc_max + a, a)
        max_sum = max(max_sum, acc_max)

        acc_min = min(acc_min + a, a)
        min_sum = min(min_sum, acc_min)

        total_sum += a

    return max(max_sum, total_sum - min_sum) if max_sum > 0 else max_sum


def assertMaxSubarraySumCircular(A: List[int], expected: int) -> None:
    assert maxSubarraySumCircular(A) == expected
    assert maxSubarraySumCircularSimple(A) == expected


if __name__ == "__main__":
    assertMaxSubarraySumCircular([1, -2, 3, -2], 3)
    assertMaxSubarraySumCircular([3, -1, 2, -1], 4)
    assertMaxSubarraySumCircular([3, -2, 2, -3], 3)
