package HelloWorldSeventeen;

public class HelloWorldSeventeen {
    public static void main(String... args) {
        // This a basic example of the new way you can use type inference with the var keyword.
        // If the value is of type String on the other side of the assignment operator,
        // then duh, you already it's a string right?
        // Less code = better code, especially if it is readable.
        var greetingPartOne = "This is one way to say \"Hello ";
        var greetingPartTwo = "!\" in Java 1.17";

        System.out.println(greetingPartOne + args[0] + greetingPartTwo);
    }
}
