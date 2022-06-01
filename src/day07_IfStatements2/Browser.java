package day07_IfStatements2;

public class Browser {
    public static void main(String[] args) {

        String browserName = "Operand";
        String result = "";

        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari" || browserName == "edge") {
            if (browserName == "chrome") {
                result = "chrome";
            } else if (browserName == "firefox") {
                result = "firefox";
            } else if (browserName == "opera") {
                result = "opera";
            } else if (browserName == "safari") {
                result = "safari";
            } else {
                result = "edge";
            }
            }else {
                result = "Invalid Browser Name";
            }
            System.out.println("result = " + result);

    }

}

