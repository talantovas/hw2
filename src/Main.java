// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        System.out.println(walk(22,30));
        System.out.println(walk(47,30));
        System.out.println("Случайный возраст: " + generateRandomAge() + " " + walk(generateRandomAge(),25));
        System.out.println(walk(45,-9));
        System.out.println("Случайный возраст: " + generateRandomAge() + " " + walk(generateRandomAge(),-25));
    }
    public static String walk(int age, int temp){
        if((20 <= age && age <= 45 && -20 <= temp && temp <= 30) || (age < 20 && 0 <= temp && temp <= 28 ) || (age > 45 && -10 <= temp && temp <= 25)){
            return "Можно идти гулять";
        }else{
            return "Оставайтесь дома";
        }
}
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(61) + 10;
    }
}