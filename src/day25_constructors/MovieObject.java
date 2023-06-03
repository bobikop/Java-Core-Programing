package day25_constructors;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
public class MovieObject {
    public static void main(String[] args) {
        Movie mov = new Movie("USA", "Java Developer: Zero to Hero", LocalDate.of(2021, 4, 18), "Kuzzat Altay");

        mov.casts = new ArrayList<>(Arrays.asList("Ozzy", "Muhtar"));
        mov.addCast("Lorraine");
        String[] addToCast = {"Rasul", "Hrvoje", "Ali", "Umran", "Oleksiy"};
        mov.addCasts(addToCast);

        System.out.println(mov);
    }
}
