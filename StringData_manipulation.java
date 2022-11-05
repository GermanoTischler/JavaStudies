import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringData_manipulation{

    public static void main(String[] args) {

        //STRING AND DATA MANIPULATION

        //Hello, {nome}. Today is {dayOfWeek}, GOOD MORNING.

        String name = "Germano";
        System.out.println(name.toUpperCase());   //Convert to upper case.
        System.out.println(name.toLowerCase());   //Convert to lower case
        System.out.println(name.length());        //Mostra a quantidade de caracteres

        //String outroNome = "germano";
        //System.out.println(nome.equals(outroNome));           //Compara duas strings
        //System.out.println(nome.equalsIgnoreCase(outroNome)); //Compara duas strings ignorando maiúsculas e minúsculas

        // ISO 8461
        LocalDate today = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        System.out.println(today);
        System.out.println(today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String dayOfWeek = today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String salute;
        LocalDateTime now = LocalDateTime.now();

        if (now.getHour() >= 0 && now.getHour() < 12) {
            salute = "Good Morning!";
        } else if (now.getHour() >= 12 && now.getHour() < 18) {
            salute = "Good Afternoon!";
        } else if (now.getHour() >= 18 && now.getHour() < 24) {
            salute = "Good Night!";
        } else {
            salute = "Hi";
        }

        System.out.printf("Hello, %s. Today is %s, %s.%n", name, dayOfWeek, salute.toUpperCase());

    }
}
