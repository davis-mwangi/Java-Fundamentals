import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.zip.InflaterInputStream;

public class Exceptions {


    public static void readFile(final File file) {
        //Try with resopurces a replacement of try -> catch -< finally
        try (InputStream in = new FileInputStream(file)) {
            in.read();
        } catch (IOException ex) {//IOException is an example of Checked Exemptions
            ex.printStackTrace();
        }
    }

    public static void run(final Runnable runnable) {
        runnable.run();
    }

    /**
     * Reads file from the file System
     *
     * @param fileName the file path with extension
     * @throws IOException          if an I/O error occurs
     * @throws NullPointerException if the fileName is null
     */
    public static void readFile(final String fileName) {
        run(() -> {
            try {
                System.out.println("Executed....");
                Files.readAllBytes(new File(fileName).toPath());
            } catch (IOException ex) {
                throw new FileProcessingException("Error reading file", ex);
            }
        });
    }

    public static void main(String[] args) {
        readFile("sometext.txt");

//        if(!exists("paul")){
//            throw new NotAuthenticatedException("User or Password is incorrect");
//        }
    }

    public static boolean exists(String usernam) {
        return false;
    }
}
