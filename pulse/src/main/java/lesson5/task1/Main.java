package lesson5.task1;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        findFile(args[0], args[1]);
    }

    static void findFile(String startPath, String fileNameToFind) {

        File startCatalog = new File(startPath);

        File[] listFiles = startCatalog.listFiles();

        for (File fileInCatalog : listFiles) {
            if (fileInCatalog.isDirectory()) {
                findFile(fileInCatalog.getAbsolutePath(), fileNameToFind);
            } else {
                if (fileInCatalog.getName().startsWith(fileNameToFind.substring(0, fileNameToFind.length() - 1))) {
                    try {
                        System.out.println(fileInCatalog.getCanonicalPath());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}



