import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MostCommonWord {
  public static void main(String[] args) {

    if (args.length == 0) {
      System.out.println(" no source is provided, usage: java MostCommonWord [source]");
    } else if (args.length == 1) {
      File source = new File(args[0]);
      if (source.exists()) {
        try {
          Path filePath = Paths.get(args[0]);
          List<String> lines = Files.readAllLines(filePath);
          HashMap<String, Integer> counter = new HashMap<>();
          for (String s : lines) {
            String[] words = s.split("\\s+");
            for (int i = 0; i < words.length; i++) {
              if (!counter.containsKey((words[i]))) {
                counter.put(words[i], 1);
              } else {
                counter.put(words[i], counter.get(words) + 1);
              }
            }
          }
          System.out.println(Collections.max(counter.values()));
        } catch (Exception e) {
          System.out.println("error");
        }
      } else {
        System.out.println("source doesn't exit");
      }
    } else {
      System.out.println("Too many arguments, please give only one source file");
    }
  }
}


    // This should be a simple word counter which give us the most common string in a file
    // If ran from the command line without arguments it should print out the usage:
    // java MostCommonWord [source]
    // When no argument is provided print out
    // No source provided
    // When the argument provided and the source is a file
    // count all words in the given file and print the most common
    // ("cat", "CAT", "cat," "cat." are different words )

