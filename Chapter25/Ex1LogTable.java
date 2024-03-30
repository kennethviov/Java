/* This program is displays a log table and is ready to run as html
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
*/

public class Ex1LogTable {
    public static void main(String[] args) {
        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<table>");
        System.out.println("<tr><td>x</th><th>ln(x)</th></tr>");

        for (double x = 1.0/8.0; x <= 2.0; x = x + 1.0/8.0) {
            System.out.println("<tr><td>" + x + "</th><th>" + Math.log(x) + "</th></tr>");
        }
    }
}
