package api.tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task5 {
    private static final Logger LOG = Log.log(Task5.class.getName());
    private final static String PATH = ".";

    public static void write() {
        try(FileWriter in = new FileWriter("task5.txt")) {
            String[] data = getFileNamesInDir();
            for (String s : data) {
                in.append(s).append("\n");
            }
            System.out.println("File names in goal dir recorded!");
            if (isThrow()) {
                throw new IOException("Some kind of mistake");
            }

        } catch (IOException e) {
            LOG.log(Level.INFO, e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
    private static String[] getFileNamesInDir(String path) {
        File dir = new File(path);
        String[] result = new String[0];
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    File file = files[i];
                    String name = file.getName();
                    if (file.isFile()) {
                        System.out.println("\tFile - " + name);
                    } else {
                        System.out.println("Directory - " + name);
                    }
                    result[i] = name;
                }
            }
        } else {
            System.out.println(dir.getName() + " не является папкой");
        }
        return result;
    }

    private static String[] getFileNamesInDir() {
        File dir = new File(PATH);
        String[] result = new String[0];
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    File file = files[i];
                    String name = file.getName();
                    if (file.isFile()) {
                        System.out.println("\tFile - " + name);
                    } else {
                        System.out.println("Directory - " + name);
                    }
                    result[i] = name;
                }
            }
        } else {
            System.out.println(dir.getName() + " не является папкой");
        }
        return result;
    }

    private static boolean isThrow() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }
}


