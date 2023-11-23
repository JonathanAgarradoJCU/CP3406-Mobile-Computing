package au.edu.jcu.guessinggame;

import java.util.Random;

public class Game {
    private final int targetNumber;

    public Game() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;
        // Generate a random number between 1-100, inclusive
    }

    public boolean check(int guess) {
        if (guess == targetNumber) {
            System.out.println("You guessed correctly!");
            return true;
        } else if (guess < targetNumber) {
            System.out.println("Your guess is too low.");
        } else {
            System.out.println("Your guess is too high.");
        }
        return false;
    }
}
