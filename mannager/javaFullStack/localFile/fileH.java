import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.lang.classfile.BufWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.nio.Buffer;

public class fileH {
    public static void main(String[] args)throws IOException {
        // File file = new File("abc.txt");
        // System.out.println(file.exists());
        // file.createNewFile();
        // FileWriter wr = new FileWriter(file);
        // wr.write("hello I am Nayan Kumar Vishwakarma.");
        // wr.close();
        // FileReader rd = new FileReader(file);
        // System.out.println(rd.read());
        FileWriter wr = new FileWriter("abc.txt");
        BufferedWriter bw = new BufferedWriter(wr);
        // bw.write("hello , i am nayan kumar vishwakarma.");
        // bw.close();
        FileReader fr = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());

    }
}
