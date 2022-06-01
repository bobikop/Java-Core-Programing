package day15_whileLoop;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Will you marry me?");
        String yesOrNo=input.next().toLowerCase();

        while(!(yesOrNo.equals("yes") || yesOrNo.equals("no"))){
            System.err.println("Invalid answer, please re-enter");
            System.err.println("Will you marry me?");
            yesOrNo=input.next().toLowerCase();
        }

        if(yesOrNo.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbuy"); input.close();
        }
    }





}
