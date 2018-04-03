public class Main04 {
    public static void main(String[] args) {
        argsFunction();
        argsFunction("value1","value2");
        argsFunction("value3");
    }

    private static void argsFunction(String... args) {
        for(String arg: args) {
            System.out.println(arg);
        }

    }
}
