package exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App{
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Path.of("/home/cllmk/Hexlet/hexlet-assignments/java-collections-ru/advanced-streams/src/test/resources/fixtures/s2.conf"));
        String result = getForwardedVariables(content);
        System.out.println(result);
    }
    public static String getForwardedVariables(String data){
        String[] linesArray = data.split("\n");
        return Stream.of(linesArray)
                .map(s -> s.trim().replaceAll("environment=\"|\"$", ""))
                .flatMap(s -> Stream.of(s.split(",")))
                .filter(s -> s.startsWith("X_FORWARDED_"))
                .map(s -> s.substring("X_FORWARDED_".length()))
                .collect(Collectors.joining(","));
    }
}
//END
