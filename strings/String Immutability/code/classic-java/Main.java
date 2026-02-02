public class Main {
    public static void main(String[] args) {
        
        String greeting = "Hello, World";
        System.out.println(greeting);

        int n = greeting.indexOf(",");

        greeting = greeting.substring(0, n)
                + "... Duke, the Decepticon!!!";

        System.out.println(greeting);
    }    
}
