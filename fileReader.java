import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class fileReader {
    public static void main(String[] args) throws IOException{

        String filePath = "/home/sshree/test2.txt";
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int i;
        while((i=br.read()) != -1){
            System.out.print((char)i);
        }
        br.close();
        fr.close();
    }
}