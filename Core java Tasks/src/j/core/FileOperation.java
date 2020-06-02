package j.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @Deepak Gaur
 */
public class FileOperation {

    public int getNumberOfLines(String fileName) {
        int counter = 0;
        try {
            java.io.File file = new java.io.File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                if (st.contains("/*")) {
                    st.replace("/*", "");
                    if (!st.contains("*/")) {
                        while (!(st = br.readLine()).contains("*/")) {

                        }
                    }
                } else if (st.contains("//")) {

                } else if (st.contains("package")) {

                } else if (st.length()==0) {

                } else {
                    counter++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return counter;
    }
}
