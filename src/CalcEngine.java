import java.util.Scanner;
/*
BMI calculator engine - calculates result based on user input
Interprets results into category (underweight, normal etc.)
 */
public class CalcEngine {

    public static void calcEngine() {
        float height;
        float weight;
        String resultInterpretation = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("How tall are you (in cm)? ");
        height = scanner.nextFloat();
        System.out.printf("%nWhat is your weight (in kg)? ");
        weight = scanner.nextFloat();

        User user = new User(weight, height);
        System.out.printf("Your BMI is %.2f. ", user.getBMI());

        if (user.getBMI() < 18.5) {
            resultInterpretation = "You are underweight";
        } else if (user.getBMI() >= 18.5 && user.getBMI() < 25) {
            resultInterpretation = "Your weight is normal";
        } else if (user.getBMI() >= 25 && user.getBMI() < 30) {
            resultInterpretation = "You are overweight (pre-obese)";
        } else if (user.getBMI() >= 30) {
            resultInterpretation = "You are obese";
        }
        System.out.println(resultInterpretation);
    }
}