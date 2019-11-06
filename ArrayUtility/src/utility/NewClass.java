package utility;

import java.io.File;

public class NewClass {
    public static void main(String[] args) {
        try {
            for (int i = 0; i <= 20; i++) {
                File f = new  File(".txt");
                f.createNewFile();
            }
        } catch (Exception e) {
        }
    }
}
