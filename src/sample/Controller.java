package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import sample.write.Reading;

public class Controller {

    @FXML
    private Button btn_save;

    @FXML
    private Button btn_open;

    @FXML
    private TextArea tarea_skriv;

    Reading readfile = new Reading();



    @FXML
    private void handleButtonAction(ActionEvent e){
        if(e.getSource()==btn_save){
            System.out.println("save clicked");
        }

        if(e.getSource()==btn_open){
            String outputReadFile = readfile.readfile("saves/test.txt");
            tarea_skriv.setText(outputReadFile);
            System.out.println("Opened file");
        }
    }


}
