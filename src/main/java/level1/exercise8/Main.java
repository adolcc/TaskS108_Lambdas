package level1.exercise8;

public class Main {

    public static void main(String[] args) {

        LambdaInterface.MyReverserInterface reverser = (String message) -> {
            StringBuilder sb = new StringBuilder(message);
            return sb.reverse().toString();
        };

        String originalString1 = "caracas";
        String reversedString1 = reverser.reverse(originalString1);
        System.out.println("Original 1: \"" + originalString1 + "\" -> Reversed 1: \"" + reversedString1 + "\"");

        String originalString2 = "I love Barcelona";
        String reversedString2 = reverser.reverse(originalString2);
        System.out.println("Original 2: \"" + originalString2 + "\" -> Reversed 2: \"" + reversedString2 + "\"");

        String originalString3 = "rio";
        String reversedString3 = reverser.reverse(originalString3);
        System.out.println("Original 3: \"" + originalString3 + "\" -> Reversed 3: \"" + reversedString3 + "\"");
    }
}
