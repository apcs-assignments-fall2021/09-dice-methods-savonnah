public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int roll = (int)(Math.random()*6 + 1);
        return roll;
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {

        double counter = 0.0;
        // Your code should roll 6 dice 10,000 times, so you should have a
        // for loop such as:
        for (int i = 0; i < 10000; i++) {
            int r1 = rollDie();
            int r2 = rollDie();
            int r3 = rollDie();
            int r4 = rollDie();
            int r5 = rollDie();
            int r6 = rollDie();
            if (r1 == 6 || r2 == 6 || r3 == 6 || r4 == 6 || r5 == 6 || r6 == 6){
                counter++;
            }
        }
        double probs = (counter/10000.0) * 100;

        return probs;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        double counter = 0.0;

        for (int i = 0; i < 10000; i++) {
            int count = 0;
            for (int j = 0; j < 12; j++) {
                int r = rollDie();
                if (r == 6){
                    count++;
                }
            }
            if (count >= 2){
                counter++;
            }
        }
        double probs = (counter/10000.0) * 100;

        return probs;
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        double counter = 0.0;

        for (int i = 0; i < 10000; i++) {
            int count = 0;
            for (int j = 0; j < 18; j++) {
                int r = rollDie();
                if (r == 6){
                    count++;
                }
            }
            if (count >= 3){
                counter++;
            }
        }
        double probs = (counter/10000.0) * 100;

        return probs;
    }

    public static void main(String[] args) {
        System.out.println(rollDie());
        System.out.println("The probability of rolling at least one 6 when rolling six dice is: " + probabilityOneSix());
        System.out.println("The probability of rolling at least two 6's when rolling twelve dice is: " + probabilityTwoSixes());
        System.out.println("The probability of rolling at least three 6's when rolling eighteen dice is: " + probabilityThreeSixes());
    }
}
