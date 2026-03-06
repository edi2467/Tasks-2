package task2;

public class EvenOrNotEven {
    public static void main(String[] args) {
        int randomnumber = (int) (Math.random() * 100) + 1;
        System.out.println("Generated a random number between (1-100): " + randomnumber);

        int modResult = randomnumber % 2;
        System.out.println("Mod result (" + randomnumber + " % 2): " + modResult);
        if (modResult == 0) {
            System.out.println("Result: The number " + randomnumber + " is Even.");
        } else {
            System.out.println("Result: The number " + randomnumber + " is NotEven.");
        }

    }
}
