public class ArgsProcessor {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please input at least 2 arguments");
        } else {
            System.out.println("You typed \"" + args[0] + "\" and \"" + args[1] + "\"");
        }
        if (args.length <= 0) {
            System.out.println("Nothing to process");
        } else {
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                String[] currentArray = args[i].split(" ");
                for (int j = 0; j < currentArray.length; j++) {
                    String currentString = currentArray[j];
                    int currentNum = Integer.parseInt(currentString);
                    sum += currentNum;
                }
            }
            System.out.println("Addition: " + sum);
        }
    }
}
