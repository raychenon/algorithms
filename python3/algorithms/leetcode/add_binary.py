#!/bin/python3

def addBinary(a: str,b: str) -> str:
	return '{0:b}'.format(int(a,2) + int(b,2))

if __name__ == "__main__":
	assert addBinary("11","1") == "100"
	assert addBinary("1010","1011") == "10101"