package isp.lab8.airways;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReadUtil {
    public static List<String> readAllFileLines(String file) throws IOException {
        Path path = Paths.get(file);
        byte[] bytes = Files.readAllBytes(path);
        return Files.readAllLines(path, StandardCharsets.UTF_8);
    }

    /**
     * For large text file we can use a buffered reader.
     *
     * @param fileName
     * @param cs
     * @return
     * @throws IOException
     */
    public static List<String> readUsingBufferedReader(String fileName, Charset cs) throws IOException {
        Path path = Paths.get(fileName);
        List<String> lines = new ArrayList<>();
        try(BufferedReader br = Files.newBufferedReader(path, cs)){
            String line;

            while((line = br.readLine()) != null){
                //process the line
                lines.add(line);
            }
        }
        return lines;
    }
}
