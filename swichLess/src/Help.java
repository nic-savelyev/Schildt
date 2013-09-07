import java.io.IOException;

public class Help {
    public static void main(String[] args) {
        char choice = '0';
        char ignore = ' ';

        HelpDemo helpObj = new HelpDemo();

        for (;;) {
            helpObj.showMenu();

            do {
                try {
                    choice = (char) System.in.read();
                }
                catch (IOException e){
                    System.out.println("Input error!");
                }

            } while ( helpObj.invalid(choice) );


            if (choice == 'q') {
                break;
            }

            helpObj.showAnswer(choice);
            choice = '0';

            System.out.println();
        }




    }
}
