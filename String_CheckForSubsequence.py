"""
Given two strings A and B, find if A is a subsequence of B.

Constraints:
1 <= T <= 900
1<= |A|,|B| <=104

Example:
Input:
2
AXY YADXCP
gksrek geeksforgeeks

Output:
0
1

Explanation:
Testcase1:
Input: A = "axy", B = "yadxcp"
Output: 0 (A is not a subsequence of B)
Testcase2:
Input: A = "gksrek", B = "geeksforgeeks"
Output: 1 (str1 is a subsequence of str2)
"""
#-----------------------------------------------------------------------------------------------------------------------------------------------------------------

t = int(input())
while t:
    t-=1
    s1,s2 = input().split()
    k=0
    l=0
    n = len(s1)
    m = len(s2)
    while k < n and l < m:
        if s1[k] == s2[l]:
            k+=1
            l+=1
        else:
            l+=1
    if k==n:
        print("1")
    else:
        print("0")
