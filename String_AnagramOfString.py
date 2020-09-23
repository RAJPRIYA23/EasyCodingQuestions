"""
Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. 
Find the minimum number of characters to be deleted to make both the strings anagram. Two strings are called anagram of each other if one of them 
can be converted into another by rearranging its letters.

Example 1:

Input:
S1 = bcadeh
S2 = hea
Output: 3
Explanation: We need to remove b, c
and d from S1.
"""

#-----------------------------------------------------------------------------------------------------------------------------------------------------------------

# to be removed to make two strings anagram
def remAnagram(str1,str2):
    
    fr1 = [ 0 for x in range(26)]
    fr2 = [ 0 for x in range(26)]
    
    for c in str1:
        ascii_value = ord(c) - ord('a')
        fr1[ascii_value] += 1
    
    for c in str2:
        ascii_value = ord(c) - ord('a')
        fr2[ascii_value] += 1
    
    ans = 0
    for i in range(26):
        ans += abs(fr1[i] - fr2[i])
    
    return ans
    
