package com.day0405.fileandbufferedorinputstreamreader;


import java.io.*;
//Create a class ConvertByteStreamToCharacterStream to convert byte code stream to character stream
public class ConvertByteStreamToCharacterStream {
    public static void main(String[] args) {
        //Create a variable filePath to store the file path
        String filePath ="src\\day0405\\fileandbufferedorinputstreamreader\\examplefile1.txt";

        //use try block to catch the exception
        try{
            //Create an object of BufferReader call and wrap thr InputStreamReader class object
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"UTF-8"));

            //Create a variable to store value
            String data ="";

            //use while loop to read the line and print the output
            while((data = br.readLine())!=null){
                System.out.println(data);
            }
        } catch (UnsupportedEncodingException e) {//Catch block to catch the exception throw by try block
            //Print the error message
            System.out.println("Error "+e.getMessage());
        } catch (IOException e){
            //Print the message when exception occurs
            System.out.println("Error "+e.getMessage());
        }
    }
}
