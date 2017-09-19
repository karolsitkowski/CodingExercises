package pl.training.exercises;

public class ExPackOne {

    /*  Ex1 The sum of the two inputs

    Write a function that returns the sum of two numbers
    [input] integer param1
    Guaranteed constraints:
    -100 ≤ param1 ≤ 1000.
    [input] integer param2
    Guaranteed constraints:
    -100 ≤ param2 ≤ 1000.
    [output] integer    */
    public int theSumOfTwoInputs(int param1, int param2){
        if ((param1 >= -100 && param1 <= 1000) &&
                (param2 >= -100 && param2 <= 1000)){
            return param1 + param2;
        }
        else return 0;
    }

/*
Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100,
the second - from the year 101 up to and including the year 200
Input/Output
[input] integer year
A positive integer, designating the year.
Guaranteed constraints:
1 ≤ year ≤ 2005.
[output] integer The number of the century the year is in.
 */
    int centuryFromYear(int year) {
        if (year >= 1 && year <= 2005){
            int century = 1;
            for(int i=100;i<year;i=i+100){
                century++;
            }
            return century;
        }
        return 0;

    }
}
