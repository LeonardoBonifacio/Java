package academy.devdojo.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;



class ListAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        Path fileName = file.getFileName();
        System.out.println(fileName);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Pre visit: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Post visit: " + dir.getFileName());
        return super.postVisitDirectory(dir, exc);
    }
}
public class SimpleFileVisitorTest02 {
     public static void main(String[] args) throws IOException {
        Path root = Paths.get("folder");
        Files.walkFileTree(root, new ListAllFiles());
    } 
}
