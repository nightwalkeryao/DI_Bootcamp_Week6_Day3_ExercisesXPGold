import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivesCount = 0;
        int negativesCount = 0;
        int zerosCount = 0;
        String input;

        do {
            System.out.println("Input an integer or type [Enter] to exit: ");
            input = sc.nextLine();
            try {
                int val = Integer.parseInt(input);
                if(val > 0)
                    positivesCount++;
                else if(val < 0)
                    negativesCount++;
                else 
                    zerosCount++;
            } catch (Exception e) {
                input = "";
            }
        } while (input != "");

        System.out.println("Positive values:" + positivesCount);
        System.out.println("Negative values:" + negativesCount);
        System.out.println("Zero values:" + zerosCount);
    }
}
