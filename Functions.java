public class Functions {
    public static void main(String[] args) {

        //VECTORS

        //addition
        int result = add(2, 3);
        System.out.println(result);

        //name
        String nameOrigin = "Germano";
        salute(nameOrigin);
    }

    //name
    public static void salute(String nameParameter) {
        System.out.println("Hello, " + nameParameter);
    }

    //addition
    public static int add(int a, int b) {
        return a + b;
    }
}
