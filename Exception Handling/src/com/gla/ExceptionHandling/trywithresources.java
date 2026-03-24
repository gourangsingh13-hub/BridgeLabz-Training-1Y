package com.gla.ExceptionHandling;
import java.io.*;

    public class trywithresources
    {
        public static void main(String[] args)
        {
            try (BufferedReader br = new BufferedReader(new FileReader("info.txt")))
            {
                String line = br.readLine();
                if (line != null)
                {
                    System.out.println("First line: " + line);
                } else
                {
                    System.out.println("File is empty");
                }

            } catch (IOException e)
            {
                System.out.println("Error reading file");
            }
        }
    }