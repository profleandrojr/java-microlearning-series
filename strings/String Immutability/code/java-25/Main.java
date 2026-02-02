void main() {
    String greeting = "Hello, World";
    IO.println(greeting);

    int n = greeting.indexOf(",");
    greeting = greeting.substring(0, n)
            + "... Duke, the Decepticon!!!";
    
    IO.println(greeting);
}
