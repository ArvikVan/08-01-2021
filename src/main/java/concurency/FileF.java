package concurency;

import java.io.File;
import java.io.IOException;

public class FileF {
    public static void main(String[] args) throws IOException {
        File file = new File("/mnt/v-sql9/CrowdSourcing/templates/actTemplate.docx");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getPath());
        if (file.exists()) {
            System.out.println("ВСе должно быть норм");
        } else {
            System.out.println("файл не найден");
        }
    }
}
