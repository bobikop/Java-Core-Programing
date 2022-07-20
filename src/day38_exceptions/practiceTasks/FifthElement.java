package day38_exceptions.practiceTasks;

public class FifthElement {
    public static void main(String[] args) {

        String[] array = new String[3];

        try {
            System.out.println(array[4]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(array[array.length - 1] + ": object in the last index " + (array.length - 1));
            e.printStackTrace();
        }

    }
}
