public class Main {
    public static void main(String[] args) {
        Date today = new Date(2026, 5, 4);
        System.out.println(today.toString());
        System.out.println(today.toISOString());
        System.out.println(today.toMXString());
    }
}
