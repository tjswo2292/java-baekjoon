import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] nums = new int[a];

        for (int j = 0; j < nums.length; j++) {
            nums[j] = Integer.parseInt(input[j]);
        }
        Arrays.sort(nums);

        int sum = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result += sum;
        }

        System.out.println(result);
    }
}
