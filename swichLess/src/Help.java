import java.io.IOException;

public class Help {
    public static void main(String[] args) {

            System.out.println("Help on:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("Chose one: ");

            char choice = ' ';
            try {
                choice = (char) System.in.read();
            }
            catch (IOException e){
                System.out.println("Input error!");
            }

            switch (choice){
                case '1':
                    System.out.println("The if: lalala");
                    break;
                case '2':
                    System.out.println("The switch: lala");
                    break;
                default:
                    System.out.println("Selection not found!");

            }

    }
}
