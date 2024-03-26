/*  This program calculates the average rainfall in three months.
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 08, 2024
*/

public class AverageRainFall
{
    public static void main (String[] args)
    {
        short aprilRain = 12;
        short mayRain = 14;
        short juneRain = 8;
        double averageRain;

        averageRain = (aprilRain + mayRain + juneRain) / 3.000000;

        System.out.println("Rainfall for April:\t" + aprilRain);
        System.out.println("Rainfall for May:\t" + mayRain);
        System.out.println("Rainfall for June:\t" + juneRain);
        System.out.println("Average rainfall:\t" + averageRain);
    }
}