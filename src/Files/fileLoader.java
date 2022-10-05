package Files;

import Data.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class fileLoader {
final String FILENAME = "/Users/mdziuba/IdeaProjects/Maps2/src/Files/InputData.txt";
String[] currentline = new String[1];

public String[] fileLoader() throws IOException {
    var fileReader = new FileReader(FILENAME);
    var bufferedReader = new BufferedReader(fileReader);
    String nextline = null;
    int index = 0;

    while ((nextline = bufferedReader.readLine()) != null) {

        if (index > 0){
            if (currentline.length == index)
                currentline = Arrays.copyOf(currentline, currentline.length+1);
            currentline[index-1] = nextline;
        }
        index++;
    }
        return currentline;
    }


    }


