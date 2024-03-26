/*  This program converts degrees into radians.
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 08, 2024
*/

public class DegreesToRadians
{
    public static void main (String[] args)
    {
        short degrees = 30;
        double rad = degrees * Math.PI/180;

        System.out.println("radians: " + rad);
    }
}