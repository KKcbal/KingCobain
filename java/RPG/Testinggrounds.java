public class Testinggrounds {
    int num = 3;

    public static void fight(int user) {
        user = user - 1;
        System.out.println(user);
    }
    public static void main(String[] args) {
        Testinggrounds user = new Testinggrounds();
        System.out.println(user.num);
        fight(user.num);
        System.out.println(user.num);
    }
}
