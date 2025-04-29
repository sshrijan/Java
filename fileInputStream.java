import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class fileInputStream {
    public static void main(String[] args) throws IOException{
        String filePath = "/home/sshree/test1.txt";
        FileInputStream fin = new FileInputStream(filePath);
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i;
        while((i=bin.read()) != -1){
            System.out.print((char)i);
        }
    bin.close();
    fin.close();
    }
}