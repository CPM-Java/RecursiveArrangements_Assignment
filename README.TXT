The term "permutations" is used to refer to the 
number of ways in which we can arrange k objects
from a set of n objects, where n >= k >= 0.
For example if you choose 5 unique letters from the 
alphabet, how many possible "words" are possible?

When you choose the first letter you have 26 possibilities.
For the second letter there are 25 possible letters because
one of them is taken. The third letter must come from the 
remaining 24 etc.

So the number of arrangements or "words" = 26*25*24*23*22

Write a static method arrangements(int n, int k) that takes the values
of n and k as inputs and returns the number of possible permutations
of size k that can be made from n unique objects.

Your arrangements method must be completely recursive. No looping! 

You may not use instance variables for storage 
or other helper methods. 

