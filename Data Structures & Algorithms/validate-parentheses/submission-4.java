class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char chara : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (chara == '(' || chara == '{' || chara == '[') {
                stack.push(chara);
            } 
            // For closing brackets, first check if the stack is not empty
            else if (!stack.isEmpty() && 
                ((chara == ')' && stack.peek() == '(') ||
                (chara == '}' && stack.peek() == '{') ||
                (chara == ']' && stack.peek() == '['))) {
                stack.pop();
            } 
            // If no match or stack is empty, return false
            else {
                return false;
            }
        }

        // Return true if stack is empty (i.e., all brackets matched)
        return stack.isEmpty();
    }
}
