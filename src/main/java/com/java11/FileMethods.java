package com.java11;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;


public class FileMethods {
    public void method(){

        try {
            // create a temp file
            File f = File.createTempFile("geeks",".SVP",new File("C:"));
            // check if the file is created
            if (f.exists()) {
                // the file is created
                // as the function returned true
                System.out.println("Temp File created: "
                        + f.getAbsolutePath());
            } else {
                // display the file cannot be created
                // as the function returned false
                System.out.println("Temp File cannot be created: "
                        + f.getAbsolutePath());
            }
        } catch (Exception e) {

            // display the error message
            System.err.println(e);
        }
    }
    public void method2(){
        try{
            String tempDir = "C:\\Users\\16027\\OneDrive - Encore Software Services\\Documents\\";
            Path path = Paths.get(tempDir);

            Path filePath = Files.writeString(Files.createTempFile(path, "demo", ".txt"), "Sample text");
            String fileContent = Files.readString(filePath);

            System.out.println("Temp File cannot be created: "
                    + filePath.toString());


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String tempDir = "C:\\Users\\16027\\OneDrive - Encore Software Services\\Documents\\";

        FileMethods fileMeth = new FileMethods();
        fileMeth.method2();
    }
}
