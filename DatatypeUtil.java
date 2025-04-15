
public class DatatypeUtil {
    public static String getType(double data) {
        return "double";
    } //If input is a double, return "Double" 

    public static String getType(float data) {
        return "float";
    } //If input is a float, return "data"

    public static String getType(int data) {
        return "int";
    } //if input is a int, return "int"

    public static String getType(long data) {
        return "long";
        //if input is a long, return "long"
    }

    public static String getType(char data) {
        return "char";
        //if input is char, return "char"
    }

    public static String getType(boolean data) {
        return "boolean";
        //if input is boolean, return "boolean"
    }

    public static String getType(String data) {
        return "String";
        // if input is String, return "String"
    }

}