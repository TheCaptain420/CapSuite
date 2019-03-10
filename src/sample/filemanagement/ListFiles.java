package sample.filemanagement;

import java.io.File;

public class ListFiles {

    public String listing(String directory){
        File filescanner = new File(directory);
        File[] listOfFiles = filescanner.listFiles();

        //goes through array and posts all files in sout
        for (int i = 0; i < listOfFiles.length ; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File: " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }

        }


        return null;
    }

}
