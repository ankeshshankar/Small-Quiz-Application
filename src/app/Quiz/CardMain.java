package app.Quiz;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import static java.lang.System.exit;

public class CardMain extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        Parent subject = FXMLLoader.load(getClass().getResource("FlashCardViewMain.fxml"));
        stage.setTitle("Quiz Time");
        stage.setScene(new Scene(subject, 297, 400));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);

    }

}
