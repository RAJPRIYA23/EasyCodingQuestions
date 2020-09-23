"""
Given two strings of lowercase alphabets and a value K, your task is to complete the given function which tells if  two strings are K-anagrams of each other or not.
Two strings are called K-anagrams if both of the below conditions are true.
1. Both have same number of characters.
2. Two strings can become anagram by changing at most K characters in a string.

Constraints:
1 <= T <= 100
1 <= K <= |length of String|

Example:
Input:
1
fodr gork
2
Output:
1

Explanation:
Testcase1: change fd to gk
"""

#-----------------------------------------------------------------------------------------------------------------------------------------------------------------

# Function should return 1/0 or True/False
def areKAnagrams(str1, str2, k):
    if len(str1) != len(str2):
        return False
    
    fr1=[0 for x in range(26)]
    fr2=[0 for x in range(26)]
    
    for i in range(len(str1)):
        fr1[ord(str1[i])-ord('a')]+=1
        fr2[ord(str2[i])-ord('a')]+=1
      
    cnt=0  
    for i in range(26):
        cnt+=abs(fr1[i]-fr2[i])
        
    if cnt/2<=k:
        return True
    else:
        return False
