import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class F1 {

    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("welcome.txt");
        System.out.println("file created");
        fw.write("hii");
        fw.write(97);//only print character and ascii value
        fw.close();
        System.out.println(fw);
        /////////////
        //////buffer writer
        BufferedWriter bw= new BufferedWriter(fw);// doesnt accept file name ,so we use filewriter object
        bw.write("BUFFER WRITER HIIhii");
        bw.write(97);//only print character and ascii value
        //bw.write(true);
        bw.close();
        System.out.println("data insertd buffer");


    }
}