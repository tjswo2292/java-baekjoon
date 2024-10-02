import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] nums = new int[input.length];

        for (int j = 0; j < nums.length; j++) {
            nums[j] = Integer.parseInt(input[j]);
        }

        int count = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
