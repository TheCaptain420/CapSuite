package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import sample.filemanagement.ListFiles;
import sample.write.Reading;
import sample.write.Writing;

public class Controller {

    @FXML
    private Button btn_save;

    @FXML
    private Button btn_open;

    @FXML
    private TextArea tarea_skriv;

    Reading readfile = new Reading();
    Writing writing = new Writing();



    @FXML
    private void handleButtonAction(ActionEvent e){
        if(e.getSource()==btn_save){
            System.out.println("save clicked "+tarea_skriv.getText());
            writing.writeTo(tarea_skriv.getText(),"saves/test.txt");
        }

        if(e.getSource()==btn_open){
            ListFiles listFiles = new ListFiles();
            listFiles.listing("saves");
            String outputReadFile = readfile.readfile("saves/test.txt");
            tarea_skriv.setText(outputReadFile);
            System.out.println("Opened file");
        }
    }


}
