// 11. wap to perform parrallel stream api to find the no.



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
  

public class parallelStream {
  
    public static void main(String[] args)
        throws IOException
    {
  
        File fileName
            = new File("D:\\Java8Assignment\\List_Textfile.txt");
  
        List<String> text
            = Files.readAllLines(fileName.toPath());
  
        text.parallelStream().forEach(System.out::println);
    }
}