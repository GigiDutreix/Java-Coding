public class LogicalUtilTester {

    public static void main(String[] args) {

        boolean result;

        result = LogicalUtil.thereExists(false, false, true);
        System.out.println("thereExists(false, false, true): " + result);

        result = LogicalUtil.forAll(true, true, true);
        System.out.println("forAll(true, true, true): " + result);

        result = LogicalUtil.majority(true, true, false);
        System.out.println("majority(true, true, false): " + result);

        result = LogicalUtil.minority(false, false, false);
        System.out.println("minority(false, false, false): " + result);

        result = LogicalUtil.implies(true, false);
        System.out.println("implies(true, false): " + result);

        result = LogicalUtil.implies(true, true, false);
        System.out.println("implies(true, true, false): " + result);

    }
}