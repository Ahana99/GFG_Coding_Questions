class Solution{
    int findFrequency(int Arr[], int X){
        return (int)Arrays.stream(Arr).filter(num -> num==X).count();
    }
}