package org.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex03 {
    public static void md1() throws IOException{
        Path file = Paths.get("simple.txt");

        try(BufferedWriter writer = Files.newBufferedWriter(file)) {
//            writer = Files.newBufferedWriter(file);
            writer.write('A');
            writer.write("Strings");
        }catch (Exception e){
            e.printStackTrace();
        }
        /*
        finally {
            try {
                if (writer != null)
                    writer.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        if (writer != null)
            writer.close();
         */

    }

    public static void main(String[] args) {
        try{
            md1();
        }catch (Exception e){

        }

    }
}
