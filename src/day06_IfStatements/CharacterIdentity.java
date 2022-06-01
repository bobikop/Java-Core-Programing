package day06_IfStatements;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = '^';

        String charType = "";

        if (ch >= 32 && ch <= 47 || ch >= 58 && ch <= 64 || ch >= 91 && ch <= 96 || ch >= 123 && ch <= 126) {
            charType = "Special Character";
        }
        if (ch >= 48 && ch <= 57) {
            charType = "digit";
        }

        if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
            charType = "Alphabetic Character(A~Z or a~Z)";
        }

        System.out.println(charType);

    }
}
/*
Create a class named CharacterIdentity,
and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z)
or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */