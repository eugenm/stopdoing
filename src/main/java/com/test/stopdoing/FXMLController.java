package com.test.stopdoing;

import java.awt.Canvas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private ToggleButton toggle;
    @FXML
    private TextField text;
    
    TaskService service;
    Task task;
    
    Image stop = new Image(getClass().getResourceAsStream("/images/stop.png"));
    Image start = new Image(getClass().getResourceAsStream("/images/start.png"));
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if ( toggle.isSelected()){
            task.setName(text.getText());
            service.start(task);
        }else{
            service.stop(task);
            label.setText(TaskUtil.getTimeDifferenceInMinutes(task));
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        toggle.setGraphic(new ImageView(start));
        toggle.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if( newValue == true){
                    toggle.setGraphic(new ImageView(stop));
                    toggle.setText("Stop");
                }else {
                    toggle.setGraphic(new ImageView(start));
                    toggle.setText("Start");
                }
            }
        });
        
        service = new TaskService();
        task = new Task();
    }    
}
