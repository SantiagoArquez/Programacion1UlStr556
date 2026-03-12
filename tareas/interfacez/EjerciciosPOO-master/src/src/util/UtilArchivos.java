package util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UtilArchivos {
    
    public static void guardar(String filename, String[] data, boolean append) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, append))) {
            for (String line : data) {
                writer.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
