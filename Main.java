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
        clearScreen();

        do {
            remote.printOptions();
            control = input.nextLine();
            System.out.println();

            // Determine Actions Based on Input
            switch (control) {
                case "p":
                    remote.power(tv);
                    break;
                case "c":
                    System.out.print("Channel: ");
                    remote.changeChannel(tv, input.nextLine());
                    break;
                case "^":
                    remote.channelUp(tv);
                    break;
                case "v":
                    remote.channelDown(tv);
                    break;
                case "b":
                    remote.flashback(tv);
                    break;
                case "+":
                    remote.volumeUp(tv);
                    break;
                case "-":
                    remote.volumeDown(tv);
                    break;
                case "m":
                    remote.mute(tv);
                    break;
                case "x":
                    break;
                default:
                    System.out.println();
                    System.out.println("Nothing Happened!");
                    System.out.println();
                    break;
            }

        } while (!control.equals("x"));

    }
}

