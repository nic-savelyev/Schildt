
public class HelpDemo {

    void showMenu () {
        System.out.println("Help on:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("Chose one: ");
    }

    void showAnswer (int what) {
        switch (what){
            case '1':
                System.out.println("The if: lalala");
                break;
            case '2':
                System.out.println("The switch: lala");
                break;
        }
        System.out.println();
    }

    boolean invalid (int ch) {
        if (ch < '1' && ch > '2' && ch != 'q')
            return true;
        else
            return false;
    }



}
