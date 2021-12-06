package Java.Section8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderFun {

    public static void main(String[] args) {

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));

            String str;
            while ((str = bufferedReader.readLine())!=null)
            {

                System.out.println(str);
            }

        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
