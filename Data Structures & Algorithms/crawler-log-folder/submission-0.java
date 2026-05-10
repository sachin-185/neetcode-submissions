class Solution {
    public int minOperations(String[] logs) {
        Stack<String> s = new Stack<>();
        for(String l: logs){
            if(l.equals("../")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else if(!l.equals("./")){
                s.push(l);
            }
        }
        return s.size();
    }
}