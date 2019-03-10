package sample.write;

import java.io.*;

public class Writing {

    Reading reading = new Reading();
    FileWriter fw;
    BufferedWriter bw;

    public void writeTo(String input, String pathname){


        try {
            fw = new FileWriter(pathname);
            bw = new BufferedWriter(fw);


            bw.write(input);

        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }




    }

}
