**Arithmetic Operations**

Statement) We can also perform mathematical operations (like addition, subtraction etc) with the System.out.println statement.

To add two numbers, we can do this

System.out.println(21 + 40)
The above code will output: 61

Task
Try to add 21 and 40 in code and print the result. Remember, we don't need "" (double quotes) when dealing with numbers.

Comments
Notice that on the editor on the right, the instructions appear in gray color.
This is because they are comments and don't affect the code. The way we write comments is by adding "//" at the start of a line.

  --------------------------------------------------------------------------------------------------------------------------------------------
SOLUTION = class CodeChef
{
    public static void main (String[] args)
    {
        System.out.println(21 + 40);
    }
}
------ Output: 61
----------------Explanation :-
 
  This code defines a simple Java class named CodeChef with a single main method. Here's a breakdown of its functionality:

Class declaration: class CodeChef: This line declares a public class named CodeChef.
public static void main(String[] args): This line defines the main method, which is the entry point of the program.
public: This keyword makes the main method accessible from anywhere outside the class.
static: This keyword indicates that the main method belongs to the class itself and doesn't require creating an instance of the class to be called.
void: This keyword specifies that the main method doesn't return any value.
String[] args: This is an array of strings that can be used to pass command-line arguments to the program. However, in this example, it's not used.
System.out.println(21 + 40);: This line:
Uses System.out to access the standard output stream.
Calls the println method on the output stream to print a message followed by a newline.
The message to be printed is the result of the addition operation 21 + 40, which evaluates to 61.
