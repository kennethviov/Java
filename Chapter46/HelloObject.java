public class HelloObject {
    public void speak(){
        String greet = "Hello";
        for (int i = 0; i < greet.length(); i++)
            System.out.println(greet);
    }

    public void talk() {
        System.out.println("Good morning World!");
        System.out.println("Good evening World!");
    }

    public void greet(String greetings) {
        System.out.println(greetings);
    }
}