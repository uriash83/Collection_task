import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("faf");
        List<String> words = new LinkedList<String>();
        Scanner reader = null;
        try
        {
            reader= new Scanner(new BufferedReader(new FileReader("loremipsum.txt")));
        } catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }


        while(reader.hasNext())
            words.add(reader.next());

        List<String> wordsStream = words.stream()
                                        .map(x->x.replaceAll(",", "").replaceAll("\\.", "") )
                                        .collect(Collectors.toList());
        //int lllong = 0;
        long lllong = words.stream()
                          .filter(x->x.length()==10)
                          .peek(s -> System.out.print(s + " ")).count();
        System.out.println("");
        System.out.println("Contain "+ wordsStream.size() + " items with 's'");
        System.out.println("Word size: " + words.size());
        System.out.println("Contain " + lllong +" word 10 lenght");

    }
}


class nnew
{

}