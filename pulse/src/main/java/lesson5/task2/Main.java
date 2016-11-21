package lesson5.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        copyFile("D:/TEST/src/zxc.txt", "D:/TEST/dest/ta.txt");
    }

    public static void copyFile(String src, String dest) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(src), "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(dest), "KOI8-R");

        while (isr.ready()) {
            osw.write(isr.read());
        }
        isr.close();
        osw.flush();
        osw.close();
    }
}
