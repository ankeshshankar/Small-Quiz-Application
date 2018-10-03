package app.Quiz;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

class FlashCard extends Card {
    FlashCard(String subject, String question, String answer) {
        super.setter(subject,question,answer);
    }
    void displayCard() {
        System.out.println(" Your subject :- "+getSubject().toUpperCase());
        System.out.println(" \n Answer this question :- "+getQuestion().toUpperCase());
        try {
            System.out.print("Think For the answer ??");
            for (int i = 0; i < 5; i++) {
                System.out.print("..");
                Thread.sleep(1000);
            }
            System.out.println("\n");
            System.out.println(" Answer :- "+getAnswer());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



/* public void start(Stage primaryStage) throws Exception{
        Parent card = FXMLLoader.load(getClass().getResource("FlashCardView.fxml"));
        Parent subject = FXMLLoader.load(getClass().getResource("FlashCardViewMain.fxml"));
        primaryStage.setTitle("Quiz Time");
        primaryStage.setScene(new Scene(subject, 297, 400));
        primaryStage.show();

    }*/