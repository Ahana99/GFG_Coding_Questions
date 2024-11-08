//User function Template for Java
class Solution 
{ 
    static long countStr(long n)
	{
	    
	    long count=1+(2*n)+(((3*n)*(n-1))/2)+((n*(n-1)*(n-2))/2);
	    return count;
	}
} 
/**
 * Approach ()
-Counting with No 'b' and No 'c':
    -This is simply all 'a's, which is one string ("aaaa..." with length n).

-Counting with One 'b' and No 'c':
    -Place one 'b' at any of the n positions, and fill the rest with 'a's. There are n possible positions for 'b'.

-Counting with No 'b' and One 'c':
    -Place one 'c' at any of the n positions, and fill the rest with 'a's. There are also n possible positions for 'c'.

-Counting with No 'b' and Two 'c's:
    -Place two 'c's in any of the n positions. This is a combinations problem, where we need to choose 2 positions out of n for the two 'c's, and the rest will be 'a's.
    -The number of ways to do this is 𝑛⋅(𝑛−1)/2

-Counting with One 'b' and One 'c':
    -Choose one position for 'b' (there are n choices) and one of the remaining n-1 positions for 'c'.
    -The number of ways to do this is n(n-1)

-Counting with One 'b' and Two 'c's:
    -Choose one position for 'b' (n choices) and two of the remaining n-1 positions for the two 'c's.
    -The number of ways to do this is n.(((n-1)(n-2))/2)

Formula Summary
-Adding these cases together gives the total count of valid strings:

    Total count = 1 + n + n + (𝑛⋅(𝑛−1)/2) + (n(n-1)) + (n.(((n-1)(n-2))/2))
                = 1 + 2n + ((3n.(n-1))/2) + ((n(n-1)(n-2))/2)

 */