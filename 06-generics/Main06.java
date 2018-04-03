public class Main06 {

    public static void main(String[] args) {
        Main06 main06 = new Main06();
        main06.genericType();
        main06.genericMethod();
    }

    private void genericType() {
        Box<Integer, String> box = new Box<Integer, String>(1, "One");
        System.out.println(box.get(1));
    }

    private Box<Integer, Integer> genericMethod() {
        return Box.createEmptybox();
    }

    private void genericWildcards() {
        Box<? extends Number, String> box1 = new Box<>(1, "One");
        Box<? extends Number, String> box2 = new Box<>(2.0, "Two");
    }

    public static class Box<T1 extends Number, T2> {
        private T1 t1;
        private T2 t2;

        public Box(T1 t1, T2 t2) {
            this.t1 = t1;
            this.t2 = t2;
        }

        public static Box createEmptybox() {
            return new Box(null, null);
        }

        public T2 get(T1 t1) {
            return t2;
        }
    }
}
