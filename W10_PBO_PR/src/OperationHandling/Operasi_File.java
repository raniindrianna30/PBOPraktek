package OperationHandling;
import java.util.*;
import java.io.*;


public class Operasi_File {
   public static void main(String[] args){  
        String fileName = "src/File.txt" ; 
        try {
            // membaca file
            File inputFile = new File(fileName);
            Scanner fileReader = new Scanner(inputFile);
            // cetak isi file
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                System.out.println(data);
            }  
            fileReader.close();
        } 
        catch (FileNotFoundException ex) {
            System.out.println("File tidak ditemukan!");
            System.out.println("Terjadi Kesalahan: " + ex);
        }
    }
}

  /*
            // membaca file
            File inputFile = new File("src/File.txt");
            Scanner fileReader = new Scanner(inputFile);
            // cetak isi file
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                System.out.println(data);
            }  
            fileReader.close();*/