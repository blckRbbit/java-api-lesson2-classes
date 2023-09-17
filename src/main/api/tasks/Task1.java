package api.tasks;

public class Task1 {
    private static final String ONE = "c1";
    private static final String TWO = "c2";

    public static void repeat(int amount) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            if ((i % 2) == 0) {
                builder.append(ONE);
            } else {
                builder.append(TWO);
            }

        }
        System.out.println(builder);
    }
}
