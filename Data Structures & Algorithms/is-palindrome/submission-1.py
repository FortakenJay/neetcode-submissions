class Solution:
    def isPalindrome(self, s: str) -> bool:
        lower = s.lower()
        left = 0 
        right = len(lower)- 1

        while (left < right):
            if lower[left] == lower[right] and (lower[left].isalnum() and lower[right].isalnum()):
                left = left + 1
                right = right -1
            elif (not lower[left].isalnum()):
                left = left+1
            elif (not lower[right].isalnum()):
                right = right -1
            else:
                return False
        return True 

        