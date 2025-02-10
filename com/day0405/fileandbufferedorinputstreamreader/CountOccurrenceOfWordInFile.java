package com.day0405.fileandbufferedorinputstreamreader;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

//Create a class CountOccurrenceOfWordInFile to read a file and count how many times a specific word appears in the file.
public class CountOccurrenceOfWordInFile {
    public static void main(String[] args) {

        //Create a string variable path to store file path
        String path="src\\day0405\\fileandbufferedorinputstreamreader\\examplefile1.txt";

        //Create a string variable target to store target word and check their occurrence
        String target="file";
        //Create an integer variable counter to store number word occurrence
        int counter=0;

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
                //Create a string array to store split words
                String []words=line.split("\\s+");
                System.out.println(line);
                for(String word: words){
                    if(word.equals(target)) {
                        counter++;
                    }
                }
            }
            System.out.println();//next line

            //print the word occurrence
            System.out.println("The target word \""+target+"\" and their occurrence "+counter);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        //create a finally block to close the BufferReader
        finally {
            //Use try-catch block to handle exception
            try{
                //close the file
                file.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}