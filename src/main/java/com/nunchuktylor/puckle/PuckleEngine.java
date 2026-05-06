import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordLoader {
    public static String getRandomWord(String fileName) throws FileNotFoundException {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(new File(fileName));

        while (scanner.hasNextLine()) {
            words.add(scanner.nextLine().trim().toUpperCase());
        }
        scanner.close();

        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}

