public class lamp {
    String type = "table-lamp";
    String color= "white";
    static boolean pressed = false;
    public static void press() {
        pressed =true;
    }
    public static void unpressed() {
        pressed = false;
    }

}
