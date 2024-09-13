import java.util.Scanner;

public class homework {

    public class exam1 {

        public static String printFullName(String firstName, String lastName) {
            String fullName = firstName + lastName;
            return fullName;
        }



        public static void main(String[] args) {
            String firstName = "Chaela";
            String lastName = "Wills";
            char[] sizes = {'S', 'M', 'L'};
            final String expirationDate = "09/20/2024";
            System.out.println(printFullName(firstName, lastName));
        }
    }

    public static int getPrice(int prices) {
        int price = 5;
        while (price < 16);
        int randomNum = (int) (Math.random() * 15);
        return price;

    }
    public static char printSizes(char sizes){
       return sizes (sizes.length - 1);

    }

    public static void main(String[] args) {
        char[] sizes = {'S', 'M', 'L', 'X',};
    }

}

    public static void printOrder(Scanner order){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Burger Joint! Is it true or false that you want your order to go?");

        String toGo = scanner.nextLine();
        System.out.println("What type of burger would you like? Cheese, ham or turkey?");

        String typeOfBurger = scanner.nextLine();
        System.out.println("Please enter a tip of 0%, 5%, 10%, 15% or 20%");




    }




