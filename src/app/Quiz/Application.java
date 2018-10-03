/*
package app.Quiz;
import java.util.Scanner;

import static java.lang.System.exit;

public class Application  {
    public static String subject ;
    public static void main(String[] args) {
        FlashCardData flashCardData = new FlashCardData();
        while (true) {
            System.out.println(" enter your cho1ice \n 1. Java 2. Python 3. Cpp 5. Exit");
            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    subject = "java";
                    flashCardData.searchCard(subject);
                    try {
                        flashCardData.loadData();
                    }catch (Exception ignored){

                    }
                    break;
                case 2:
                    subject = "python";
                    flashCardData.searchCard(subject);
                    try {
                        flashCardData.loadData();
                    }catch (Exception ignored){

                    }
                    break;
                case 3:
                    subject = "cpp";
                    flashCardData.searchCard(subject);
                    try {
                        flashCardData.loadData();
                    }catch (Exception ignored){

                    }
                    break;
                case 4:
                    exit(0);
                default:
                    System.out.println("Your Choice is wrong");
                    break;
            }
        }
    }

}
*/
