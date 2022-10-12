import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        Remote remote = new Remote("ax7lb");
        TV tv = new TV("ax7lb");

        String control;
        clearScreen();

        do {
            System.out.println("---------------------");
            System.out.println();
            remote.printOptions();
            control = input.nextLine();
            System.out.println();

            // Determine Actions Based on Input
            switch (control) {
                case "p":
                    remote.power(tv, tv.getUID());
                    break;
                case "c":
                    System.out.print("Channel: ");
                    remote.changeChannel(tv, tv.getUID(), input.nextLine());
                    break;
                case "^":
                    remote.channelUp(tv, tv.getUID());
                    break;
                case "v":
                    remote.channelDown(tv, tv.getUID());
                    break;
                case "b":
                    remote.flashback(tv, tv.getUID());
                    break;
                case "+":
                    remote.volumeUp(tv, tv.getUID());
                    break;
                case "-":
                    remote.volumeDown(tv, tv.getUID());
                    break;
                case "m":
                    remote.mute(tv, tv.getUID());
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

