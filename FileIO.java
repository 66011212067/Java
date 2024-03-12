import java.io.File;
import java.io.IOException;
class FileIO {
    public static void main(String[] args) {
        File file = new File("data.txt");
        System.out.println(file.getName());
        System.out.println(file.getParentFile());
    }
}
