package Java.Section8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterFun {

    public static void main(String[] args) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("input2.txt"));

            bufferedWriter.write("Hello world");

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
