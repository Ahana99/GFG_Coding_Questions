//User function Template for Java

class Solution
{
    public String stringFilter(String str) 
    {
        char[] c = str.toCharArray();
        int index=0;
        for(int i=0; i<c.length;i++){
            if(c[i]=='b'){
                continue;
            }
            if(i+1<c.length && c[i]=='a' && c[i+1]=='c'){
                i++;
                continue;
            }
            c[index++] = c[i];
        }
        
        return new String(c, 0, index);
    }
}