/* This program displays the nursery rhyme "Monkeys In A Tree" and uses loop and if-statements to determine the number of monkey
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
*/

public class Ex4MonkeysInATree {
    public static void main (String[] args) {
        String monkey = ""; // declared the variable monkey to hold the number in words

        for (int i = 5; i >= 0; i--) { // loop that controls the number of monkey
            if (i > 0) { // condition that checks the number of monkey
                switch (i) { // switch that stores the number in words to the variable monkey
                    case 5:
                        monkey = "Five"; break;
                    case 4:
                        monkey = "Four"; break;
                    case 3:
                        monkey = "Three"; break;
                    case 2:
                        monkey = "Two"; break;
                    case 1:
                        monkey = "One"; break;
                }

                // output
                System.out.println(monkey + " little monkey swinging in a tree");
                System.out.println("Teasing Mr Crocodile \"you can't catch me\"");
                System.out.println("Along came the crocodile as quiet as can be");
                System.out.println("and SNAP!\n");
            } else // output if the number of monkeys reaches zero
                System.out.println("No little monkey swinging in a tree\nNo little monkey swinging in a tree");
        }
    }
}
