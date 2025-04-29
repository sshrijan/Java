import java.io.FileReader;
import java.io.IOException;


public class fileReader {
    public static void main(String[] args) throws IOException{

        String filePath = "/home/sshree/test2.txt";
        FileReader fr = new FileReader(filePath);

        int i;
        while((i=fr.read()) != -1){
            System.out.print((char)i);
        }
        fr.close();
    }
}