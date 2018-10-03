package app.Quiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import static app.Controller.subject;

public class FlashCardData implements CardSearchable {
    public FlashCardData() {
    }
    private static int getCount(){
        BufferedReader bufferedReader= null;
        int count = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/ankesh/Documents/java/card_data.txt"));
            while ((bufferedReader.readLine()) != null ) {
                count++;
            }
        } catch (IOException e) {
            System.out.println("file not found");
        }finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return count;
    }
    @Override
    public void searchCard(String subject) {
        BufferedReader bufferedReader;
        try {
            String data;
            bufferedReader = new BufferedReader(new FileReader("/home/ankesh/Documents/java/card_data.txt"));
            while ((data = bufferedReader.readLine()) != null) {
                    String[] line = data.split(";");  //'^[a-z]*'
                    if (line[0].equals(subject)) {
                        System.out.println(" Card Found ");
                        break;
                    } /*else {
                        ///continue;
                        //System.out.println(" Card you are looking for is not found \n");
                    }*/
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Unable to read");
        }
    }
    private String randomLine(){
        int count = getCount();
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/ankesh/Documents/java/card_data.txt"));
            Random random = new Random();
            int no = random.nextInt(count);
            int lines = 0;
            String data ;
            while((data = bufferedReader.readLine()) != null ){
                if(lines == no){
                    bufferedReader.close();
                    return data;
                }
                lines++;
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return " ";
    }
    public void loadData() {
        int count = getCount();
        BufferedReader bufferedReader;
        FlashCard[] flashCards = new FlashCard[count];
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/ankesh/Documents/java/card_data.txt"));
            String data = null;
            int i =0;
            while ((data = bufferedReader.readLine()) != null) {
                /*String[] line = data.split(";");*/
                String[] line = randomLine().split(";");
                if (line[0].equals(subject)){
                    flashCards[i] = new FlashCard(line[0], line[1], line[2]);
                    ++i;
                }

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Unable to read");
        }
        for (int j = 0; j < count; j++) {
            flashCards[j].displayCard();
        }
    }
}
