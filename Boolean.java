public class Boolean {

    public static void main(String[] args) {
        // BOOLEAN TYPE

        boolean weekend = true;
        boolean sunny = true;
        boolean letsBeach = weekend && sunny;
        System.out.println(letsBeach);

        // Operator && (and)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && flase = false

        // Operator || (pipe) (or)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        String msg = letsBeach ? "It's weekend!" : "Is not weekend!";
        System.out.println(msg);
    }
}
