def insert(intervals: 'List[Interval]', newInterval: 'Interval') -> 'List[Interval]':
    """
    https://leetcode.com/problems/insert-interval/

     Time complexity: O(N) , N is the number of subarrays in intervals
     Space complexity: O(N)

    :param intervals:
    :param newInterval:
    :return:
    """
    # init data
    new_start, new_end = newInterval
    index = 0
    n = len(intervals)
    output = []

    # 1 add all intervals starting before newInterval
    while index < n and new_start > intervals[index][0]:
        output.append(intervals[index])
        index += 1

    # 2 add newInterval
    # if there is no overlap, add the interval
    previous_end = output[-1][1]
    if not output or previous_end < new_start:
        output.append(newInterval)
    else:
        output[-1][1] = max(output[-1][1], new_end)

    # 3 add next intervals, merge with newInterval if needed
    while index < n:
        interval = intervals[index]
        start, end = interval
        index += 1
        # no overlap, add an interval
        if output[-1][1] < start:
            output.append(interval)
        # overlap, merge with the last interval
        else:
            output[-1][1] = max(output[-1][1], end)

    return output


if __name__ == "__main__":
    assert [[1, 5], [6, 9]] == insert([[1, 3], [6, 9]], [2, 5])
    assert [[1, 2], [3, 10], [12, 16]] == insert([[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]], [4, 8])
    assert [[1, 16]] == insert([[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]], [2, 13])
