import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        /*
        Main page.
         */
        System.out.println("                                               _\n" +
                "                                              ~\\\\_\n" +
                "                                                \\\\\\\\\n" +
                "                                                `\\\\\\\\\\\n" +
                "                         |                       |\\\\\\\\\\\n" +
                "          \\_            /;   Urdven               \\\\\\\\\\|__.--~~\\\n" +
                "          `\\~--.._     //'    by M.A Gachich   _--~             /\n" +
                "           `//////\\  \\\\/;'                   /~ //////  _-~~~~'\n" +
                "             ~/////\\~\\`)'                   ('-//////-//\n" +
                "                 `~'  |                      //////(((-)\n" +
                "Cover: T. Xiong  ;'_\\'\\                    /////\"\n" +
                "                /~/ '\" \"'               _///\"\n" +
                "               `\\/'                    ~\"\n");
        /*
        Wait for dramatic effect.
         */
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch(InterruptedException a) {
        }
        System.out.println("\"What be yer name, traveler?\"");
        Scanner scanner = new Scanner(System.in);
        /*
        Player name.
         */
        String name = scanner.nextLine();
        System.out.println("\""+ name + ", is it?\"(y/n)");
        String resp = scanner.next();
        /*
        If player is making things difficult.
         */
        while (!(resp.equals("y")) && !(resp.equals("n"))) {
            System.out.println("\"I don't understand that gibberish.\"");
            resp = scanner.next();
        }
        if (resp.equals("y")) {
            System.out.println("\"Good\"");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch(InterruptedException a) {
            }
        } else if (resp.equals("n")) {
            System.out.println("\"Well, what is it, then?\"");
            name = scanner.next();
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch(InterruptedException a) {
            }
        }
        System.out.println("\"Greetings, " + name + "...\" The man writes down " + name + " on a worn out parchment," +
                " eyeing you up and down in the process.");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch(InterruptedException a) {
        }
        System.out.println("\"It's me job to see that everyone which passes through the village is written down, ye know..." +
                "we've had far too many...\n terrible things happen to us lately. And it always be yus foreigners causin' trouble.\"");
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch(InterruptedException a) {
        }
        System.out.println("_________________________________________");
        System.out.println("This is the dialogue box. You can choose from the responses by inputting the number of the response.\n");
        System.out.println("\"What kind of things?\" (1)\n" + "\"Oh, I'm just here for a night or two, just passing through...\" (2)\n" + "_________________________________________");
        int response = scanner.nextInt();
        while (response != 1 && response != 2) {
            System.out.println("You might need to level up your reading skill..." );
            response = scanner.nextInt();
        }
        if (response == 1) {
            System.out.println("\"What kind of things?\"");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch(InterruptedException a) {
            }
            System.out.println("The man's expression becomes ridden with a mixture of ire and sorrow. \"Hooded men comin' into town, promisin' they'll leave in the morn... \nThen the next day, someone's dead" +
            " and they're gone...\" He sheds a tear. \"My beloved was murdered a few weeks ago.\"");
        }
    }
}
