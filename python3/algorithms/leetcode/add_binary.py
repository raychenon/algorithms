#!/bin/python3

"""
time complexity: O(A+B)
space complexity: O(max(A+B))
"""
def addBinary(a: str,b: str) -> str:
	x, y = int(a,2), int(b,2)
	while y:
		answer = x ^ y
		carry = (x & y) << 1
		x, y = answer, carry
	return bin(x)[2:]

if __name__ == "__main__":
	assert addBinary("11","1") == "100"
	assert addBinary("1010","1011") == "10101"