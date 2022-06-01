package Self_PracticingAprilMay;

public class Bitwise {
    public static void main(String[] args) {
        byte flag_status = 53; //Combined flag status of 00110101
        System.out.println("Flag 1:" + (((flag_status & 1) > 0) ? "ON" : "off"));
        System.out.println("Flag 2:" + (((flag_status & 2) > 0) ? "ON" : "off"));
        System.out.println("Flag 3:" + (((flag_status & 4) > 0) ? "ON" : "off"));
        System.out.println("Flag 4:" + (((flag_status & 8) > 0) ? "ON" : "off"));
        System.out.println("Flag 5:" + (((flag_status & 16) > 0) ? "ON" : "off"));
        System.out.println("Flag 6:" + (((flag_status & 32) > 0) ? "ON" : "off"));
        System.out.println("Flag 7:" + (((flag_status & 64) > 0) ? "ON" : "off"));
        System.out.println("Flag 8:" + (((flag_status & 128) > 0) ? "ON" : "off"));
    }
}
