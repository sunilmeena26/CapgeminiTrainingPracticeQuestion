package com.day0405.fileandbufferedorinputstreamreader;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

//Create a class ReadFileUsingFileReader to read a text file line by line and use FileReader and BufferedReader
public class ReadFileUsingFileReader {
    public static void main(String[] args) {
        //Create a string variable path to store file path
        String path="src\\day0405\\fileandbufferedorinputstreamreader\\examplefile1.txt";
        //Create a reference of BufferedReader class
        BufferedReader file=null;
        //use try-catch block to handle any exceptions that occur during file reading
        try{
            //Create a object of FileReader class to read a file
            FileReader fileReader=new FileReader(path);
            //Create an object of BufferReader to read the file line by line
            file=new BufferedReader(fileReader);
            String line;
            System.out.println("File text is: ");
            //Use for loop to print text from file
            while((line=file.readLine())!=null){
                System.out.println(line);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        //create a finally block to close the BufferReader
        finally {
            //Use try-catch block to handle exception
            try{
              file.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
