class Solution {
    public int minLength(String s) {
        Stack<Character> stck= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stck.isEmpty()){
                 if(stck.peek()=='A' && s.charAt(i)=='B'){
                stck.pop();
                continue;
                  
            } 
            if(stck.peek()=='C' && s.charAt(i)=='D'){
                stck.pop();
                continue;
                
            }
           

            }
           
            stck.push(s.charAt(i));
        }
        return stck.size();
        
    }
}