import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class F3 {

    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("welcome.txt");
        System.out.println("file created");
        
        /////////////
        //////Print writer
        PrintWriter pw= new PrintWriter(fw);// doesnt accept file name ,so we use filewriter object
        pw.println("PRINTWRITER WRITER HIIhii");
        pw.println(97);// print all type of values
        pw.println(true);
        pw.append("Appending");
        pw.close();
        System.out.println("data insertd println ");
        ///file reader
        FileReader fr= new FileReader("Welcome.txt");
        while(fr.read()!=-1) //if equal to -1 no data
        {
            char c=(char)fr.read();// we use (char) type castiing here to convert in to character 
            System.out.println(c);
            //////////////////////it only print character only and not read all and distrupted reading
        }
        


    }
}