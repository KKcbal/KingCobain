import java.util.Scanner;

public class RPG {
    String name;
    int hp;
    int atk;
    int mp;
    boolean here = false;

    public RPG(String name, int hp, int atk, int mp) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.mp = mp;
    }

    public static void asdf() {
        //
    }
    public static void fight(RPG user, RPG op1, RPG op2) {
        //
    }
    public static void fight(RPG user, RPG op1) {
        //
    }

    public static void main(String[] args) {
        RPG team1 = new RPG("name", 7, 3, 5);
        RPG team2 = new RPG("name", 7, 3, 5);
        RPG team3 = new RPG("name", 7, 3, 5);
        RPG op1 = new RPG("pikmin", 6, 2, 4);
        RPG op2 = new RPG("pikmin", 6, 2, 4);
        RPG boss = new RPG("bulbmin", 30, 5, 20);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");

        String uinp = scanner.nextLine();

        RPG user = new RPG(uinp, 7, 1, 10);

        System.out.println("Hello " + user.name);

        System.out.println("What would you like to do?");
        System.out.println("Find enemy, fight boss, recruit teammate");

        while (1 < 2) {
            uinp = scanner.nextLine();

            if (uinp.equalsIgnoreCase("find enemy") || uinp.equalsIgnoreCase("enemy")) {
                while (1 < 2) {
                    asdf();
                }
            } else if (uinp.equalsIgnoreCase("fight boss") || uinp.equalsIgnoreCase("boss")) {
                while (1 < 2) {
                    asdf();
                    break;
                }
                break;
            } else if (uinp.equalsIgnoreCase("recruit teammate") || uinp.equalsIgnoreCase("teammate") || uinp.equalsIgnoreCase("recruit")) {
                System.out.println("Who would you like to recruit?");
                System.out.println("team1, team2, team3");
                while (1 < 2) {
                    uinp = scanner.nextLine();
                    if (uinp.equalsIgnoreCase("team1")) {
                        while (1 < 2) {
                            fight(user, op1);
                        }
                    } else if (uinp.equalsIgnoreCase("team2")) {
                        //
                    } else if (uinp.equalsIgnoreCase("team3")) {
                        //
                    }
                }
            }
            System.out.println("What would you like to do?");
            System.out.println("Find enemy, fight boss, recruit teammate");
        }

        System.out.println("after while loop");

        scanner.close();
    }
}
