package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
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

    @FXML
    private Text text_title;

    Reading readfile = new Reading();
    Writing writing = new Writing();

    String currentFileName= "none";


    @FXML
    private void handleButtonAction(ActionEvent e){
        if(e.getSource()==btn_save){
            System.out.println("save clicked "+tarea_skriv.getText());
            writing.writeTo(tarea_skriv.getText(),"saves/test.txt");
        }

        if(e.getSource()==btn_open){

            text_title.setText(currentFileName);
            ListFiles listFiles = new ListFiles();
            listFiles.listing("saves");
            String outputReadFile = readfile.readfile("saves/test.txt");
            tarea_skriv.setText(outputReadFile);
            System.out.println("Opened file");
        }
    }


}
