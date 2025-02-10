package com.day0405.fileandbufferedorinputstreamreader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

//Create a class ReadUserInputAndWriteFile to read user input and write to file using inputStreamReader
public class ReadUserInputAndWriteFile {
    public static void main(String[] args) {
        //Create a string variable path to store file path
        String path="src\\day0405\\fileandbufferedorinputstreamreader\\examplefile2.txt";

        //Create an object of InputStreamReader
        InputStreamReader input=new InputStreamReader(System.in);
        //Create an object of BufferReader to read the user input
        BufferedReader bufferedReader=new BufferedReader(input);
        //use try-catch block to handle any exceptions that occur during file reading
        try{
            //Create an object of FileWriter class to write the file
            FileWriter fileWriter=new FileWriter(path);
            String line;
            System.out.println("Enter text to write to the file (Exit 'exit' for stop writing): ");

            //Use for loop to write the file
            while(!(line=bufferedReader.readLine()).equalsIgnoreCase("exit")){
             fileWriter.write(line+System.lineSeparator());
            }
            fileWriter.flush();

            //close the file writer
            fileWriter.close();
            System.out.println("User input has been written to the file.");

        }
        catch(IOException ex){
            System.out.println("Error is: "+ex.getMessage());
        }
        //create a finally block to close the BufferReader
        finally {
            //Use try-catch block to handle exception
            try{
                //close the buffer reader
                bufferedReader.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}