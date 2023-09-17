package api.tasks;

public class Task2 {
    // todo сложная задача -> перенести в конец
    //  aaaabbbcdd → a4b3cd2
    public static void reduce(String arg) {

        int count = 1;
        String[] arr = arg.split("");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result.append(arr[i]);
                continue;
            }

            if (arr[i].equals(arr[i - 1])) {
                count ++;
            } else if (!(arr[i].equals(arr[i - 1])) && count != 1){
                result.append(count).append(arr[i]);
                count = 1;
            } else {
                result.append(arr[i]);
            }
        }
        if (count != 1) {
            result.append(count);
        }
        System.out.println(result);
    }
}
