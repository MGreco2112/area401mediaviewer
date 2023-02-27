package com.example.area401video;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private MediaView mediaView;
    @FXML
    private Button playButton;
    @FXML
    private Button pauseButton;
    @FXML
    private Button resetButton;

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        file = new File("sams song.mp4");
        media = new Media(file.toURI().toString());

    }

    public void playMedia() {

    }

    public void pauseMedia() {

    }

    public void resetMedia() {

    }
}