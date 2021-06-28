package com.example.demo.corejava.practice;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * @author syam dinesh
 * Stream API practice class
 */
public class StreamApi {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        try{
//            Files.lines(Paths.get("C:\\Users\\syamd\\OneDrive\\Desktop\\edo.txt")).map(s->s.subSequence(4,s.length())).forEach(System.out::println);
            Stream<String> sm= Stream.of("Syam","Syamala","Revanth");

//            The third method signature is used when we are dealing with different types
            String s=sm.parallel().reduce("Bayyana ",(ss,p)->ss+" ".concat(p+", "), String::concat);
            logger.info("reduced string:- "+s);
//            int stringLength=sm.parallel().reduce(0,(ss,p)->ss+p.length(),(s1,s2)->s1+s2);
//            logger.info("reduced string:- "+stringLength);

        }catch (Exception e){
            logger.log(Level.WARNING,"File not found in specefied path"+e);
        }finally {
            List<String> list= Arrays.asList("Syam", "Dinesh","Bayyana");
            int count= (int) list.stream().filter(s->s.startsWith("B")).peek(System.out::print).count();
            logger.log(Level.INFO,"Matched string count:- "+count);
        }
    }
}
