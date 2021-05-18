package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        /**
         * IO
         */

        File file = new File("D:/data");

        try {
            file.createNewFile();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        //create single folder
        file.mkdir();

        //create multiple folders(e.g: "D:/data/data1/data2")
        file.mkdirs();

        //check if file or folder exist
        file.exists();


        /**
         * NIO
         */

        /**
         * FILES -> uses -> PATHS -> creates -> PATH -> converts -> FILE
         */
        Path path = Paths.get("D:/data");
        try {
            Files.createFile(path);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try {
            Files.createDirectory(path);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try {
            Files.createDirectories(path);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        Files.exists(path);


    }
}
