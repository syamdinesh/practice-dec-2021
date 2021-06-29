package com.example.demo.corejava.practice;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author syam dinesh
 * Stream API practice class
 */
public class StreamApi {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        try {
            String filePath="C:\\Users\\syamd\\OneDrive\\Desktop\\edo.txt";
            String string = Files.lines(Paths.get(filePath)).parallel().reduce("Bayyana ", (s, y) -> s.concat(y.substring(2, y.length())) + ", ", String::concat);
            List<String> listOfStrings = Files.lines(Paths.get(filePath)).collect(Collectors.toList());
            listOfStrings.forEach(System.out::println);
            logger.info(string);
            IntSummaryStatistics collect = Files.lines(Paths.get(filePath)).collect(Collectors.summarizingInt(s -> s.length()));
            logger.info("this is intSummary:- "+collect);
            
//            Stream<String> sm= Stream.of("Syam","Syamala","Revanth","Narayana","Ashwath");
//            The third method signature is used when we are dealing with different types
//            String s=sm.parallel().reduce("Bayyana ",(ss,p)->ss+" ".concat(p+", "), String::concat);

//            Files.write(Paths.get("C:\\Users\\syamd\\OneDrive\\Desktop\\edo1.txt"), string.getBytes());
//            logger.info("reduced string:- "+s);
//            int stringLength=sm.parallel().reduce(0,(ss,p)->p.indexOf(p),(s1,s2)->s1+s2);
//            logger.info("reduced string:- "+stringLength);

        } catch (Exception e) {
            logger.log(Level.WARNING, "File not found in specefied path" + e);
        } finally {
            List<String> list = Arrays.asList("Syam", "Dinesh", "Bayyana");
            int count = (int) list.stream().filter(s -> s.startsWith("B")).peek(System.out::print).count();
            logger.log(Level.INFO, "Matched string count:- " + count);
        }
    }
}
