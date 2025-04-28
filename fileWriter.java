import java.io.*;

public class fileWriter {
    public static void main(String[] args) throws IOException{
        String filePath = "/home/sshree/test2.txt";
        FileWriter fw = new FileWriter(filePath);

        String str = "We are studying file writer and reader in java";
        fw.write(str);
        System.out.println(" Information is stored into the file");
        fw.close();
    }
}

