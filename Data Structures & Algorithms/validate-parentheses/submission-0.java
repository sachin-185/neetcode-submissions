class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character,Character> c = new HashMap<>();
        c.put(')','(');
        c.put(']', '[');
        c.put('}', '{');

        for(char ch : s.toCharArray()){
            if(c.containsKey(ch)){
                if(!st.isEmpty() && st.peek() == c.get(ch)) st.pop();
                else return false;
            }
            else st.push(ch);
        }
        return st.isEmpty();
    }
}
