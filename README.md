# Hash Functions

A hash table used for your Electronic Telephone Directory could result in faster operations.

Given an Electronic telephone directory we are to create an application that uses 4 hash functions to generate hash values for each key (full name) in the directory.
Our goal is to measure how well some popular hash functions will generate hash values with maximum spread and minimal collisions.  Do not implement the whole hash table data structure or attempt to resolve collisions.  All that is required is the hash functions.

Assume m=20011 to be the hash table size in all cases.
The worst case hash function, h(x)=1
Hash function 1 (from the slides), to add Unicode values
Hash function 2 (from the slides), to add shifted Unicode values
Another reasonable function of your choice 

The data you are given (see attached file) has the following format:

51850 Kianna Squares, Terre Haute|552.531.3674|Gislason Kenna

17386 Stephanie Parks, Palm Springs|018-594-2935 x716|Hickle Leone

97354 Queen Squares, Birmingham|(332)985-4036|Moore Gilbert

The fields are: address, telephone number, name.  Every full name has a last name and a first name.  The fields are separated by "|".  The lines of the file are unsorted.  When loading this data, the key you must use is the full name.  

In order to test how well a hash function generates unique and dispersed values, you must use the information-theoretic notion of entropy that calculates the information content of a random variable. In our case, the hash function is the random variable.  Higher entropy is better.

Example entropy calculation

Suppose m=7, and we hash n=10 items to produce the following sequence of hash values: 0,2,4,2,6,0,0,5,2,4

Then, the probability of each hash value P(x) can be calculated by counting occurrences of each value and dividing by n, to give us: 0.3, 0, 0.3, 0, 0.2, 0.1, 0.1

For each hash value, we can then compute "-P(x) Log (P(x))", to give us: 0.16, 0, 0.16, 0, 0.14, 0.1, 0.1

The entropy is then the sum of the above values: H(X) = 0.65
