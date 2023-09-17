package api.tasks;

import java.io.File;

public class Task6 {
    private final static String PATH = ".";

    public static void getFileNamesAndExtensionsInDir() {
        File dir = new File(PATH);
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    String name = file.getName();
                    String[]arr = name.split("\\.");
                    String extension = "";
                    if (arr.length > 1) {
                      extension = arr[arr.length - 1];
                    }
                    if (file.isFile()) {
                        System.out.println("\tFile - " + name);
                        System.out.println("\tFile extension: " + extension);
                    } else {
                        System.out.println("Directory - " + name);
                        System.out.println("\tFile extension: " + extension);
                    }
                }
            }
        } else {
            System.out.println(dir.getName() + " не является папкой");
        }
    }

    public static void getFileNamesAndExtensionsInDir(String path) {
        File dir = new File(path);
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    String name = file.getName();
                    String[]arr = name.split("\\.");
                    String extension = "";
                    if (arr.length > 1) {
                        extension = arr[arr.length - 1];
                    }
                    if (file.isFile()) {
                        System.out.println("\tFile - " + name);
                        System.out.println("\tFile extension: " + extension);
                    } else {
                        System.out.println("Directory - " + name);
                        System.out.println("\tFile extension: " + extension);
                    }
                }
            }
        } else {
            System.out.println(dir.getName() + " не является папкой");
        }
    }



}
