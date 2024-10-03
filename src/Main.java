import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] array = {1, 5, 2, 6, 3, 7, 4};

        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < commands.length; i++) {
            int[] test1 = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);

            Arrays.sort(test1);

            result.push(test1[commands[i][2] - 1]);
        }
    }
}
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int a = Integer.parseInt(br.readLine());
//
//        String[] input = br.readLine().split(" ");
//        int[] nums = new int[a];
//
//        for (int j = 0; j < nums.length; j++) {
//            nums[j] = Integer.parseInt(input[j]);
//        }

