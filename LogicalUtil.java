

class LogicalUtil {

 
    public static boolean thereExists(boolean p, boolean q, boolean r) {
        return (p || q || r);
    }

   
    public static boolean forAll(boolean p, boolean q, boolean r) {
        return (p && q && r);
    }

   
    public static boolean majority(boolean p, boolean q, boolean r) {
        int trueCount = 0;
        if (p) {
            trueCount++;
        }
        if (q) {
            trueCount++;
        }
        if (r) {
            trueCount++;
        }
        return (trueCount >= 2);
    }

    
    public static boolean minority(boolean p, boolean q, boolean r) {
        int falseCount = 0;
        if (!p) {
            falseCount++;
        }
        if (!q) {
            falseCount++;
        }
        if (!r) {
            falseCount++;
        }
        return (falseCount >= 2);
    }

   
    public static boolean implies(boolean p, boolean q) {
        return (!p || q);
    }

    public static boolean implies(boolean p, boolean q, boolean r) {
        return (!(p && q) || r);
    }
}