class Main02 extends SuperClass{

    public static void main(String[] args) {
        (new Main02()).override();
        suppressWarnings();
    }

    @SuppressWarnings("deprecation")
    private static void suppressWarnings() {
        Thread.currentThread().stop();
    }

    @Override
    public void override() {
        System.out.println("SubClass");
    }
}