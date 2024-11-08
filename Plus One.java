

//User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        int carry = 0;
        for(int i= N-1; i>=0;i--){
            if(arr.get(i)<9){
                arr.set(i,arr.get(i)+1);
                return arr;
            }
            else{
                carry=1;
                arr.set(i,0);
            }
        }
        if(carry==1){
            arr.add(0,carry);
        }
        return arr;
    }
};
