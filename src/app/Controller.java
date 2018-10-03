package app;

import app.Quiz.FlashCardData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.logging.Logger;

public class Controller {
    public static String subject = null;
    private FlashCardData flashCardData = new FlashCardData();
    @FXML
    public void java(ActionEvent actionEvent) {
        /*    Stage stage = null;
        Parent subject = null;
        try {
            subject = FXMLLoader.load(getClass().getResource("FlashCardView.fxml"));
            stage.setTitle("Quiz Time");
            stage.setScene(new Scene(subject, 297, 400));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        }*/

        subject = "java";
        flashCardData.searchCard(subject);
        try {
            flashCardData.loadData();
        }catch (Exception ignored) {
            //System.out.println("Questions not Found");
        }
        System.out.println("Note :- Select another subject or Press Cross Button to exit");
    }

    public void python(ActionEvent actionEvent) {
        subject = "python";
        flashCardData.searchCard(subject);
        try {
            flashCardData.loadData();
        }catch (Exception ignored){

        }
        System.out.println("Note :- Select another subject or Press Cross Button to exit");
    }

    public void cpp(ActionEvent actionEvent) {
        subject = "cpp";
        flashCardData.searchCard(subject);
        try {
            flashCardData.loadData();
        }catch (Exception ignored){

        }
        System.out.println("Note :- Select another subject or Press Cross Button to exit");
    }
/*
    public void net(ActionEvent actionEvent) {
        subject = "net";

        try {
            flashCardData.loadData();
        }catch (Exception ignored){

        }
        System.out.println("Note :- Select another subject or Press Cross Button to exit");
    }*/
}
   /* public void handle(ActionEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("FlashCardView.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Answer it..");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }*/
