package Self_PracticingReplitTasks.replit6Array;

public class findMax {
    public static void main(String[] args) {


        int[] nums = {2, 4, 2, 3, -2 };

        int max = nums[0];


        for (int i = 0; i < nums.length; i++) {

            if(nums[i] > max){
                max = nums[i];
            }

        }

        System.out.println(max);
    }
}
