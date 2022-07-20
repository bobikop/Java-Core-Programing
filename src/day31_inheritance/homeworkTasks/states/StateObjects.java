package day31_inheritance.homeworkTasks.states;

public class StateObjects {
    public static void main(String[] args) {

        States state1 = new States("Virginia", "VA", "Republican",  "Glenn Allen Youngkin", "Mark Warner",8626210, 5.3);

        States state2 = new States("California", "CA", "Democratic",  "Gavin Newsom", "Dianne Feinstein",39350000, 7.25);

        States state3 = new States("Texas", "TX", "Republican",  "Greg Abbott", "Ted Cruz",28640000, 6.25);

        States state4 = new States("Florida", "FL", "Republican",  "Ron DeSantis", "Rick Scott",21220000, 6);

        System.out.println(state1);
        System.out.println(state2);
        System.out.println(state3);
        System.out.println(state4);

    }
}
