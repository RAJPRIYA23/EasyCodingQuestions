"""
Given strings s1 and s2, you need to find if s2 is a rotated version of the string s1. The strings are lowercase.

Constraints:
1 <= T <= 103
1 <= |s1|, |s2| <= 107

Example:
Input:
4
geeksforgeeks
forgeeksgeeks
mightandmagic
andmagicmigth
mushroomkingdom
itsamemario
geekofgeeks
geeksgeekof

Output:
1
0
0
1

Explanation:
Testcase 1: s1 is geeksforgeeks, s2 is forgeeksgeeks. Clearly, s2 is a rotated version of s1 as s2 can be obtained by left-rotating s1 by 5 units.
"""
#-----------------------------------------------------------------------------------------------------------------------------------------------------------------

t=int(input())
for i in range(t):
    s1=input()
    s2=input()
    if len(s1) != len(s2):
        print("0")
        continue
    s1=s1+s1
    if s2 in s1:
        print("1")
    else:
        print("0")
        
