package part01;

import java.io.*;

/**
 * @author gb
 * @version 1.0
 * description:
 * @date 2021/8/9 13:08
 */

public class BasicFileOutput {
    static String file = "BasicFileOutput.out";

    public static void main(String[] args)
            throws IOException, ClassNotFoundException, NoSuchMethodException {
        BufferedReader in = new BufferedReader(new FileReader("G:\\IntelliJ IDEAWorkplace\\IO\\src\\main\\java\\part01\\BasicFileOutput.java"));
        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();
        // Show the stored file:
//        System.out.println(BufferedInputFile.read(file));
    }
}