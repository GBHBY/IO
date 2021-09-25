package part01;//: io/BufferedInputFile.java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;

public class BufferedInputFile {
    // Throw exceptions to console:
    public static String read(String filename) throws IOException, ClassNotFoundException, NoSuchMethodException {
//        BufferedReader in2 = new BufferedReader();
        // Reading input by lines:
        BufferedReader in = new BufferedReader(
                new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();
        Method read = Class.forName("part01.Demo1").getMethod("read", String.class);
        System.out.println(read);
        return sb.toString();


    }

    public static void main(String[] args)
            throws IOException, ClassNotFoundException, NoSuchMethodException {
        System.out.print(read("BufferedInputFile.java"));
    }
} /* (Execute to see output) *///:~
