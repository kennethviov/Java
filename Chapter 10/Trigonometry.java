/*  This program calculates the sine and cosine of a value and gets
    the sum of the squares.
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 08, 2024
*/

public class Trigonometry
{
    public static void main (String[] args)
    {
        double value = 0.5236;
        double sinx = Math.sin(value);
        double cosx = Math.cos(value);
        double sum = (sinx * sinx) + (cosx * cosx);

        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum );
    }
}