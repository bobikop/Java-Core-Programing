package day08_ternary_switch;

public class NumberToWord {
    public static void main(String[] args) {
        int num = 5;

        String wordOfNumber = (num >= 0 && num <= 9) ?
                (num == 0) ? "Zero" : (num == 1) ? "One" : (num == 2) ? "Two" : (num == 3) ? "Three" : (num == 4) ? "Four"
                        : (num == 5) ? "Five" : (num == 6) ? "Six" : (num == 7) ? "Seven" : (num == 8) ? "Eight" : "Nine"
                : "Invalid Entry";
        System.out.println("wordNumber = " + wordOfNumber);

    }
}






/*
int n = 9;

        String day = (n >= 1 && n <= 7) ?
                        (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday"
                                : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday"
                : "No such a day";

 */






/*
1. Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary
 */