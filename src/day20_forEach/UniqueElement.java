package day20_forEach;

public class UniqueElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 4, 1, 2, 3, 5, 8, 8, 6};
        String unique = "";
        for (int each : numbers) {
            int frequency = 0;
            for (int each1 : numbers) {
                if (each == each1) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                unique += each + " ";
            }
        }

        System.out.println(unique);
    }

}
/*

5. Write a program that can display the unique elements of an array

			MUST use for each loops


Create fox class and objects
Fox1 set info

 */