import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class fileWriter {
    public static void main(String[] args) throws IOException{
        String filePath = "/home/sshree/test2.txt";
        FileWriter fw = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(fw);

        String str = "We are studying file writer and reader in java";
        bw.write(str);
        System.out.println(" Information is stored into the file");
        bw.close();
        fw.close();
    }
}

