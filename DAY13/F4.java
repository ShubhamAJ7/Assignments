import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F4 {
    public static void main(String[] args) throws IOException {
        FileReader fr= new FileReader("Welcome.txt");
        BufferedReader br= new BufferedReader(fr);//doest not accept file name
        String data=br.readLine();
        while(data!=null) //if equal to -1 no data
        {
            System.out.println(data);
            data=br.readLine();
            //////////////////////it only print character only and not read all and distrupted reading
        }
    }
    
}
