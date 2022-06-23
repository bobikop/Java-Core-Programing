package Self_PracticingReplitTasks.replit6Array;

public class EvenNumbers {
    public static void main(String[] args) {


        int[] nums = {2, 4, 2, 3, -2 };

        int count = 0;


        for (int i = 0; i < nums.length; i++) {

            if(nums[i] % 2 == 0){
                count++;
            }

        }

        System.out.println(count);
    }
}
