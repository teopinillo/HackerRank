/*
https://www.hackerrank.com/challenges/calculating-volume

You are given a class Solution and its main method in the editor. In each test cases, it takes an input chch which represents a choice of the following:

    ch=1ch=1 represents the volume of a cube that has to be calculated where aa represents the length of the sides of the cube.
    ch=2ch=2 represents the volume of a cuboid that has to be calculated where l,b,hl,b,h represent the dimensions of a cuboid.
    ch=3ch=3 represents the volume of a hemisphere that has to be calculated where rr represents the radius of a hemisphere.
    ch=4ch=4 represents the volume of a cylinder that has to be calculated where r,hr,h represent the radius and height of the cylinder respectively.

Your task is to create the class Calculate and the required methods so that the code prints the volume of the figures rounded to exactly 33 decimal places.

In case any of the values are ≤0≤0, print "java.lang.NumberFormatException: 
All the values must be positive" without quotes and terminate the program.

Note: Use Math.PI or 3.141592653.14159265 as the value of pi.

Input Format

First line contains TT, the number of test cases. Each test case contains ch,
representing the choice as given in the problem statement.

    When ch=1, Next line contains aa, length of the sides of the cube.
    When ch=2, Next three lines contain ll, bb, hh representing length,
breadth and height of the cuboid respectively. ll, bb, hh will be in
three separate lines
    When ch=3, Next line contains rr, the radius of the hemisphere
    When ch=4, Next two lines contain rr, hh representing the radius and height
of the cylinder respectively. rr, hh will be in two separate lines.

Note: You have to determine the data type of each parameter by looking at the
code given in the main method.

Constraints
1≤ch≤41≤ch≤4
−100≤a,l,b,h,r≤100−100≤a,l,b,h,r≤100
There will be at most 33 digits after decimal point in input.

Output Format

For each test case, print the answer rounded up to exactly 3 decimal places in a
single line. For example, 1.2345 should be rounded to 1.235, 3.12995 should be
rounded to 3.130.


 */
public class CalculatingVolume {
    
}
