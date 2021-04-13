package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\LaboratorPao2021\\Laborator6\\ex1\\src\\data\\data.txt";
        File file = new File(filePath);

//        try {
//            FileReader fileReader = new FileReader(file);
//            int ch;
//            while((ch = fileReader.read()) != -1) {
//                System.out.print((char)ch);
//            }
//        } catch (IOException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }

//        try {
//            FileWriter fileWriter = new FileWriter(file,true);
//            fileWriter.append("\n");
//            fileWriter.append("Salut din file writer.");
//            fileWriter.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            FileInputStream fileInputStream = new FileInputStream(file);
//            int ch;
//            while ((ch = fileInputStream.read())!= -1) {
//                System.out.print((char)ch);
//            }
//        } catch (IOException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }
//
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(file);
//            fileOutputStream.write("\n".getBytes());
//            fileOutputStream.write("Salut din fileOutputStream".getBytes());
//        } catch (IOException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }
//        try {
//            FileInputStream fileInputStream = new FileInputStream(file);
//            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
//            int ch;
//            while ((ch = dataInputStream.read())!= -1){
//                System.out.print((char)ch);
//            }
//        } catch (IOException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }
//
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(file);
//            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
//            dataOutputStream.writeBytes("\n");
//            dataOutputStream.writeBytes("Salut din fileOutputStream");
//        } catch (IOException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }


//        try {
//            FileInputStream fileInputStream = new FileInputStream(file);
//            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//            int ch;
//            while((ch = bufferedInputStream.read()) != -1){
//                System.out.print((char)ch);
//            }
//        } catch (IOException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }
//
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(file);
//            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//            bufferedOutputStream.write("\n".getBytes());
//            bufferedOutputStream.write("Salut din BufferedOutputStream".getBytes());
//        } catch (IOException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }
//        try {
//            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
//            String line;
//            while ((line = randomAccessFile.readLine()) != null){
//                System.out.println(line);
//            }
//
//            randomAccessFile.write("\n".getBytes());
//            randomAccessFile.write("Salut din Random Access File".getBytes());
//        } catch (IOException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }
//        FileOutputStream fileOutputStream = null;
//        BufferedOutputStream bufferedOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream(file);
//            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//            bufferedOutputStream.write("\n".getBytes());
//            bufferedOutputStream.write("Salut din BufferedOutputStream".getBytes());
//        } catch (IOException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        } finally {
//            try {
//                fileOutputStream.close();
//                bufferedOutputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


//        try(FileOutputStream fileOutputStream1 = new FileOutputStream(file);
//            BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(fileOutputStream1)
//        ){
//            bufferedOutputStream.write("\n".getBytes());
//            bufferedOutputStream.write("Salut din BufferedOutputStream".getBytes());
//        }catch (IOException exception){
//            exception.printStackTrace();
//        }


        try {
            Files.write(Paths.get(filePath),"\nSalut din files!!!".getBytes(), APPEND);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try {
            Files.lines(Paths.get(filePath))
                    .forEach(System.out::println);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
