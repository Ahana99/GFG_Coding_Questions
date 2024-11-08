class Solution {
    // Function to check if brackets are balanced or not.
    static boolean isParenthesisBalanced(String s) {
        Stack<Character> paran = new Stack<>();
        
        for(char c: s.toCharArray()){
             if(c== '{' || c== '[' || c=='('){
                 paran.push(c);
             }
             else if(c=='}' || c==']' || c==')'){
                 if(paran.isEmpty()){
                     return false;
                 }
                 else{
                     char top = paran.pop();
                     if((c=='}' && top!='{') || (c==']' && top!='[') || (c==')' && top!='(')){
                         return false;
                     }
                 }
             }
        }
        
        return paran.isEmpty();
    }
}