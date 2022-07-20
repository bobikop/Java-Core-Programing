package day29_inheritance.homeWorTasks.phoneTask;

public class TestPhoneObjects {
        public static void main(String[] args) {
            IPhone iphone1 = new IPhone();
            iphone1.setInfo("Iphone","iPhone13 Pro","Medium",1099,"Green");
            System.out.println(iphone1);
            iphone1.faceTime(777777777);
            iphone1.faceTime("mike@gmail.com");
            iphone1.call(777777777);
            iphone1.text(777777777);


            Samsung samsung1 = new Samsung();
            samsung1.setInfo("Samsung","Galaxy S22 Ultra","Large",1049.99, "Burgundy");
            System.out.println(samsung1);
            samsung1.freeze();

            Nokia nokia1 = new Nokia();
            nokia1.setInfo("Nokia","XR20","Small",449.99, "Granite");
            System.out.println(nokia1);
            nokia1.selfDefense();
        }

}
