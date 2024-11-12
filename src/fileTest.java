import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileTest {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("src/text",true);
            fw.write("kkkkkkkkkkkk");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
