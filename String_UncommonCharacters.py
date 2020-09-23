"""
Find and print the uncommon characters of the two given strings S1 and S2.
Here uncommon character means that either the character is present in one string or it is present in other string but not in both.
The strings contains only lowercase characters and can contain duplicates.

Constraints:
1 <= T <= 100
1 <= |S1|, |S2| <= 105

Example:
Input:
1
characters
alphabets
Output:
bclpr
"""

#-----------------------------------------------------------------------------------------------------------------------------------------------------------------

while t>0:
    a = input().strip()
    b = input().strip()
    
    set_a = set(a)
    set_b = set(b)
    
    st = ""
    for c in sorted((set_a - set_b) | (set_b - set_a)):
        st += c
    print(st)
    
    
    
    t-=1
