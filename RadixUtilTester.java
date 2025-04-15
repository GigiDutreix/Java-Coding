
public class RadixUtilTester {

    public static void main(String[] args) {
        // Test base2 methods
        String result;

        result = String.valueOf(RadixUtil.base2("111"));
        System.out.println(result);

        result = RadixUtil.base2(7);
        System.out.println(result);

        // Test base8 methods
        result = String.valueOf(RadixUtil.base8("10"));
        System.out.println(result);

        result = RadixUtil.base8(8);
        System.out.println(result);

        // Test base16 methods
        result = String.valueOf(RadixUtil.base16("f"));
        System.out.println(result);

        result = RadixUtil.base16(15);
        System.out.println(result);

    }
}