class Solution {
    public int calPoints(String[] operations) {
        int r = 0;
        Stack<Integer> s = new Stack<>();
        for(String i : operations){
            if(i.equals("+")){
                int t = s.pop();
                int nt = t + s.peek();
                s.push(t);
                s.push(nt);
                r += nt;
            }
            else if (i.equals("D")){
                s.push(2 * s.peek());
                r += s.peek();
            }
            else if(i.equals("C")){
                r -= s.pop();
            }
            else {
                s.push(Integer.parseInt(i));
                r += s.peek();
            }
        }
        return r;
    }
}