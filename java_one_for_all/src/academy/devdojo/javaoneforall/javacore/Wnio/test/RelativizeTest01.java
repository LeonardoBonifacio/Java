package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        // Given two path how do i get the extend path to one from another
        Path dir = Paths.get("/home/william");// absolute path
        Path clazz = Paths.get("/home/william/devdojo/project/Test01.java");// also one absolute Path
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);
        System.out.println();

        Path absolute1 = Paths.get("/home/william");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/william/devdojo/project/Test01.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.212121");
        System.out.println("1 " + absolute1.relativize(absolute3));
        System.out.println("2 " + absolute3.relativize(absolute1));
        System.out.println("3 " + absolute1.relativize(absolute2));
        System.out.println("4 " + relative1.relativize(relative2));
        System.out.println("5 " + absolute1.relativize(relative1));// absolute to relative pahts doens't works
    }
}
