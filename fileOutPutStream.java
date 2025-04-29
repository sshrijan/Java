import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class fileOutPutStream {
    public static void main(String[] args) throws IOException{
        String filePath = "/home/sshree/test1.txt";
        FileOutputStream fout = new FileOutputStream(filePath);
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String str = "We are studying file input and output stream in java";
        byte[] b = str.getBytes();
        bout.write(b);
        bout.flush();
        System.out.println(" Information is stored into the file");
        fout.close();
    }
}
