

//User function Template for Java


// class pair  {  
//     long first, second;  
//     public pair(long first, long second)  
//     {  
//         this.first = first;  
//         this.second = second;  
//     }  
// }


class Solution {
    
    public pair indexes(long v[], long x)
    {
        int first=-1;
        int last=-1;
        for(int i=0;i<v.length;i++){
            if(v[i]==x){
                if(first==-1){
                    first=i;
                }
                    last=i;
            }
        }
         return new pair(first, last);
    }
}
