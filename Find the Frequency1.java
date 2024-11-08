class Solution{
    int findFrequency(int Arr[], int X){
        int count=0;
        for(int num:Arr){
            if(num==X){
                count++;
            }
        }
        
        return count;
    }
}