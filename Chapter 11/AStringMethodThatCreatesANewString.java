/*  This program creates and prints a trimmed string
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 13, 2024
*/

public class AStringMethodThatCreatesANewString {
    public static void main (String[] args){
        String first = new String("     In a Hole   in the ground there lived a Hobbit.     ");
        String second;

        second = first.trim();

        System.out.println(second);
    }
}