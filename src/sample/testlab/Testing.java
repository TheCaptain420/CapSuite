package sample.testlab;

import sample.write.Reading;

public class Testing {

    public static void main(String[] args) {

        Reading reading = new Reading();

        System.out.println(reading.readfile("saves/test.txt"));

    }
}
