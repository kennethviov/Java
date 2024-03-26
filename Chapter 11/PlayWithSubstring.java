/*  This program creates a substring
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 13, 2024
*/

public class PlayWithSubstring {
    public static void main (String[] args){
        String str = new String("Golf is a good walk spoiled.");
        int len = str.length();
        String sub = str.substring(8,len);

        System.out.println(sub);
    }
}