package HelloWorldEight;

public class HelloWorldEight {
    public static void main(String... args) {
        String greetingPartOne = "This is one way to say \"Hello ";
        String greetingPartTwo = "!\" in Java Eight";

        System.out.println(greetingPartOne + args[0] + greetingPartTwo);
    }
}
