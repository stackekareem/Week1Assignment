package com.weekone.assignment3;

import java.io.File;

/**
 * prints file/dirctory under a given directory
 */
public class Directory {

    public static void main(String args[]){
        try{
            String path = args[0];
            System.out.println("args: "+path);
            //directory
            File filepath = new File(path);
            //list of file
            File files[] = filepath.listFiles();

            //prints file
            String output = "";
            for(File file : files) {
                output = file.getName();
                if (file.isDirectory())
                    output += "/";
                System.out.println(output);
            }
        }catch(Exception e){
            System.err.println("not a valid path");
        }
    }
}
