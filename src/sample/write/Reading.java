package sample.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading {

    public String readfile(String pathname) {
        //"saves/test.txt"
        File file = new File(pathname);


        String finalString = "";

        try {
            Scanner input = new Scanner(file);

            //scan line for line
            while (input.hasNextLine()) {
                String line = input.nextLine();
                finalString += line+"\n";
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return finalString;
    }

}
