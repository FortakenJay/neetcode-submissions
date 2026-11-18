class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        dic = dict()
        if len(s) != len(t):
            return False
        for char in s:
            dic[char] = dic.get(char,0) +1
        for char in t:
            dic[char] = dic.get(char,0) -1
        for count in dic.values():
            if count < 0:
                return False     
        return True              