public class main {
  public static void main(String[] args) {
        double mainNumber = 5; //The number you want the square root of
        double guessv1 = mainNumber / 2; 
        double g2 = mainNumber / guessv1;
        while((float)g2 != (float)guessv1) { //Keeps going until the two guesses are the same
            g2 = (guessv1 + g2) / 2;
            guessv1 = mainNumber / g2;
        }
        System.out.println("square root of " + mainNumber + " is " +guessv1); //The answer
    }
}
