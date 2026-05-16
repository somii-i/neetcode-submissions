class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();
        int a =0, b=0;
        int res=0;
        for(String s: tokens){
            if(s.equals("+")){
                st.push(st.pop() + st.pop());
            }
            else if (s.equals("-")){
                a = st.pop();
                b = st.pop();
                st.push(b - a);
            }
            else if (s.equals("*")){
               st.push(st.pop() * st.pop());
            }
            else if (s.equals("/")){
                a = st.pop();
                b = st.pop();
                st.push (b/a);
            }
            else{
                st.push(Integer.parseInt(s));
            }            
        }
        return st.pop();
    }
}
