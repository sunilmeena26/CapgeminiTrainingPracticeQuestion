package com.day0405.fileandbufferedorinputstreamreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Create a class ConcatenationString
class ConcatenationString{
    //Create a instance variable
    String text = "hello";

    //Create a method to compare the concatenation time
    public void compareConcatenation() {
        //Create a variable to store the start time
        long startTimeForBuilder = System.nanoTime();

        //Create an object of stringBuilder class
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append(text);
        }

        //Create a variable to store the time
        long endTimeForBuilder = System.nanoTime();

        //Create a variable to store the time
        long startTimeForBuffer = System.nanoTime();

        //Create an object of stringBuffer class
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            stringBuffer.append(text);
        }

        //Create a variable to store the time
        long endTimeForBuffer = System.nanoTime();

        //Print the result
        System.out.println("Time taken by StringBuilder : "+(endTimeForBuilder-startTimeForBuilder)+" ns");
        System.out.println("Time taken by StringBuffer : "+(endTimeForBuffer-startTimeForBuffer)+" ns");
    }
}

//Create a class to File comparison
class FileComparison {
    //Create a variable to store value
    String filePath;

    //Parameterized constructor to initialize variable
    public FileComparison(String filePath) {
        this.filePath = filePath;
    }

    //Create a method to compare the file reading
    public void compareFileReading() {

        //Create a variable to store the time
        long startTimeForFileReader = System.nanoTime();

        try{
            //Create an object of Bufferreader class
            BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
            int wordCount = countWords(fileReader);
            System.out.println("Word count using FileReader: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error reading the file with FileReader: " + e.getMessage());
        }

        //Create a variable to store the time
        long endTimeForFileReader = System.nanoTime();


        //Create a variable to store the time
        long startTimeForInputStream = System.nanoTime();

        try {
            //Create an object of inputStreamReader class
            BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
            int wordCount = countWords(inputStreamReader);
            System.out.println("Word count using InputStreamReader: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error : " + e.getMessage());
        }

        //Create a variable to store the time
        long endTimeForInputStream = System.currentTimeMillis();

        System.out.println("Time taken by FileReader: " + (endTimeForFileReader - startTimeForFileReader) + " ns");
        System.out.println("Time taken by InputStreamReader: " + (endTimeForInputStream - startTimeForInputStream) + " ns");
    }
    // Create a variable to count the method
    int countWords(BufferedReader reader) throws IOException {
        String line;
        int wordCount = 0;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }
        return wordCount;
    }
}
//Create a class ChallengeProblem
public class ChallengeProblem {
    public static void main(String[] args) {
        //Create a object of ConcatenationString
        ConcatenationString getStringCompare = new ConcatenationString();

        //Call the method
        getStringCompare.compareConcatenation();

        //Create a variable to store variable
        String filePath = "src\\day0405\\fileandbufferedorinputstreamreader\\examplefile3.txt";

        //Create a object of FileComparison
        FileComparison getFileCompare = new FileComparison(filePath);

        //Call the method
        getFileCompare.compareFileReading();
    }
}
