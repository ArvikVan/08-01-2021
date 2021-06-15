package io;
/**
 * класс описывает работу с директориями файлов
 * @author arvik
 * @version 1.0
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class PrintFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (attrs.isSymbolicLink()) {
            System.out.format("Symbolic link: %s", file);
        } else if (attrs.isRegularFile()) {
            System.out.format("Regular file: %s", file);
        } else {
            System.out.format("Other: %s", file);
        }
        System.out.println("(" + attrs.size() + "bytes");
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.err.println(exc);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.format("Directory: %s%n", dir);
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Path path = Path.of("/home/arvik/IdeaProjects");
        PrintFiles printFiles = new PrintFiles();
        Files.walkFileTree(path, printFiles);
    }
}
