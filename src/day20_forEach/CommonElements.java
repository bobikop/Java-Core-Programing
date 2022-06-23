package day20_forEach;

public class CommonElements {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

      for(int i : arr1){
          for (int k : arr2){
              if (i == k){
                  System.out.print(i + " ");
              }


          }
      }
    }
}
/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
          MUST use for each loops
          for(int each : numbers ){
            System.out.println(each);
        }

 */