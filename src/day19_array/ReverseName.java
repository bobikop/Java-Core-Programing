package day19_array;

public class ReverseName {
    public static void main(String[] args) {

        String[] classMates = {"Ermek Apazov", "Aseel Hussein", "Adil Kuerxiati", "Hasan Ayhan"
                              ,"Dilibaier Tayier" +"Igor Pojar", "Evgeniya Novgorodova","Bilal Ghani"
                              ,"Baturay Gok", "Violetta Queen"};

        for (int i = 0; i < classMates.length; i++) {
            for (int j = classMates[i].length() - 1; j >=0 ; j--) {
                System.out.print(classMates[i].charAt(j));
            }
            System.out.println();
        }



    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */