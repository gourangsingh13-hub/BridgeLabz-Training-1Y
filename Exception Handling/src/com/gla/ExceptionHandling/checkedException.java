package com.gla.ExceptionHandling;
import java.io.*;
public class checkedException{
        public static void main(String[] args)
        {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader("data.txt"));
                String line;
                while ((line = reader.readLine()) != null)
                {
                    System.out.println(line);
                }

            } catch (IOException e)
            {
                System.out.println("File not found");

            } finally
            {
                try {
                    if (reader != null)
                    {
                        reader.close();
                    }
                } catch (IOException e)
                {
                    System.out.println("Error closing file");
                }
            }
        }
    }
