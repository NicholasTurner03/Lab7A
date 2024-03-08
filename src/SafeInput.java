import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        System.out.print("\n" + prompt + ": ");
        while (!pipe.hasNextInt()) {
            pipe.next();
            System.out.println("Invalid input type, Please try again:");
        }
        return pipe.nextInt();
    }

    public static double getDouble(Scanner pipe, String prompt) {
        System.out.print("\n" + prompt + ": ");
        while (!pipe.hasNextDouble()) {
            pipe.next();
            System.out.println("Invalid input type, Please try again:");
        }
        return pipe.nextDouble();
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int num = SafeInput.getInt(pipe, prompt);
        while ((num < low) || (num > high)) {
            num = SafeInput.getInt(pipe, prompt);

        }
        return num;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double num = SafeInput.getDouble(pipe, prompt);
        while ((num < low) || (num > high)) {
            num = SafeInput.getInt(pipe, prompt);

        }
        return num;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        System.out.print("\n" + prompt + ": ");
        String input = pipe.next();
        boolean yN = false;
        while (!(((input.equalsIgnoreCase("Yes")) || (input.equalsIgnoreCase("y"))) ||
                ((input.equalsIgnoreCase("No")) || (input.equalsIgnoreCase("n"))))) {
            System.out.println("invalid input please try again:");
            input = pipe.nextLine();
        }

        if (input.equalsIgnoreCase("yes") || (input.equalsIgnoreCase("y"))) {
            yN = true;
        }
        if (((input.equalsIgnoreCase("No")) || (input.equalsIgnoreCase("n")))) {
            yN = false;
        }
        return yN;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regExPattern) {
        String value = "";
        boolean gotAValue = false;

        do {
            System.out.print(prompt + ": ");
            value = pipe.nextLine();
            if (value.matches(regExPattern)) {
                gotAValue = true;
            } else {
                System.out.println("\nInvalid input: " + value);
            }

        } while (!gotAValue);

        return value;
    }
    public static void prettyHeader(String msg) {
        int spaceCount=60;
        while(spaceCount!=0)
        {System.out.print("*");
            spaceCount--;
        }
        System.out.println();
        int starLeft=(60-msg.length())/2;
        System.out.print("***");
        int left=4;
        while(left<=starLeft)
        {
            System.out.print(" ");
            left++;
        }
        System.out.print(msg);
        int right=3;
        while(right<=starLeft)
        {
            System.out.print(" ");
            right++;
        }
        System.out.println("***");
        spaceCount=60;
        while(spaceCount!=0)
        {
            System.out.print("*");
            spaceCount--;
        }


    }
    public static double CtoF(double C){
        return (C*9/5)+32;

    }

}



