import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        Remote remote = new Remote();
        TV tv = new TV();

        String control;

        while (!tv.isOn()) {
            clearScreen();
            tv.powerState();

            remote.printOptions();
            control = input.nextLine();

            if (Objects.equals(control, "p")) {
                tv.power();
                //remote.power();
                // Clearing Screen to act like when the TV turns on
                clearScreen();
                tv.powerState();
            }
        }

        do {
            remote.printOptions();
            control = input.nextLine();
            System.out.println();

            // Determine Actions Based on Input
            switch (control) {
                case "p":
                    tv.power();
                    //remote.power();
                    break;
                case "c":
                    System.out.print("What channel would you like to switch too? ");
                    tv.changeChannelNumber(input.nextInt());
                    //remote.changeChannel((input.nextInt()));
                    break;
                case "^":
                    tv.channelUp();
                    //remote.channelUp();
                    break;
                case "v":
                    tv.channelDown();
                    //remote.channelDown();
                    break;
                case "b":
                    tv.flashback();
                    //remote.flashback();
                    break;
                case "+":
                    tv.volumeUp();
                    //remote.volumeUp();
                    break;
                case "-":
                    tv.volumeDown();
                    //remote.volumeDown();
                    break;
                case "m":
                    tv.mute();
                    //remote.mute();
                    break;
                default:
                    System.out.println();
                    System.out.println("Selected Option Is Invalid!");
                    System.out.println();
            }
        } while (tv.isOn());

        tv.powerState();
    }
}

