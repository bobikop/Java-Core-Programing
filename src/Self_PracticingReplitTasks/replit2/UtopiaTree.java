package Self_PracticingReplitTasks.replit2;

public class UtopiaTree {
    public static void main(String[] args) {
        int year = 0;
        int totalHeight = 0;
        int totalHeight2 = 0;
        for (int j = 1; j <=10 ; j++) {
            totalHeight++;


            year = j;
            if (j > 0 && j <= 3){
                System.out.println("year " + year + " - growth 1 cm"); //year x - growth x cm
                System.out.println("tree size: " + totalHeight + "cm"); //tree size: x cm
            }else if (j > 3 && j <=10){

                totalHeight += 1;
                System.out.println("year " + year + " - growth 2 cm"); //year x - growth x cm
                System.out.println("tree size: " + totalHeight + "cm"); //tree size: x cm
            }

        }

    }
}

/*


 for (int i = 1; i <= 3; i++) {
                grow ++;
                System.out.println(grow + " cm");
            }

Use a loop to track the growth of the Utopian Tree. The tree grows exactly 1 cm for the first three years,
and then afterwards it grows by 2 cm every year.
Show the growth of the tree each year up to year 10. See the example flow below.
Use the format:
year x - growth x cm
tree size: x cm

where the 'x' values are different values of year, the growth amount, and the total tree size up to that year


Use the format:
year x - growth x cm
tree size: x cm

where the 'x' values are different values of year, the growth amount, and the total tree size up to that year

year 1 - growth 1 cm
tree size: 1 cm

year 2 - growth 1 cm
tree size: 2 cm

year 3  - growth 1 cm
tree size: 3 cm

year 4 - growth 2 cm
tree size: 5 cm

year 5 - growth 2 cm
tree size: 7 cm

year 6 - growth 2 cm
tree size: 9 cm

... until you reach year 10



 */