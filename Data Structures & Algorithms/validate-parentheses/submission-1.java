class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character,Character> m = new HashMap<>();
        m.put(')','(');
        m.put(']','[');
        m.put('}','{');

        for(char i : s.toCharArray()){
            if(m.containsKey(i)){
                if(!st.isEmpty() && st.peek() == m.get(i)){
                    st.pop();
                }
                else return false;
            }
            else st.push(i);
        }
        return st.isEmpty();
    }
}
