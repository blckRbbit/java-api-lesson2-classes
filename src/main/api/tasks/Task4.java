package api.tasks;

import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void write() {
        String part = createTestString();
        System.out.printf("Test string length = %s%n", part.length());
        try(FileWriter in = new FileWriter("test.txt")) {
            in.append(part);
            System.out.println("Recorded!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String createTestString() {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < 100; i++) {
//            result.append("TEST");
//        }
//        return result.toString();
        return "TEST".repeat(100);
    }
}
