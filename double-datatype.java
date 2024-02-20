**Double Datatype**

Statement) If we want to store decimal values we use the double data type.

Syntax to declare a double:

double radius = 8.9;
Task
Write a program which does the following:

Find the area of a circle whose radius is 8.9. Take pi = 3.14
Declare variables radius, pi and area and assign the relevant values to them
Formula for area of a circle is Pi * radius * radius

-----------------------------------------------------------------------------------
SOLUTion = class Codechef
{
    public static void main (String[] args)
    {
        // your code goes here
        double pi = 3.14;
        double radius = 8.9;
        double area = pi * radius * radius;
        System.out.println("The Area of the given Circle is " + area);
    }
}
