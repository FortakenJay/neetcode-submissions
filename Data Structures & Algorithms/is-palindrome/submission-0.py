class Solution:
    def isPalindrome(self, s: str) -> bool:
        if (s == ""):
            return True
        lower = s.lower()

        cleaned = []
        for char in lower:
            if char.isalnum():
                cleaned.append(char)
        end = len(cleaned)
        
        for char in cleaned:
            endChar = cleaned[end-1]
            if char == endChar: 
                temp = 1
            else:
                return False
            end = end -1 
            
        return True