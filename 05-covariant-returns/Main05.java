public class Main05 {
    public static void main(String[] args) {
        new Main05();
    }

    Main05() {
        System.out.println(new SubClass().getReturn());
    }

     abstract public class SuperClass {
         abstract public SuperReturnClass getReturn();
    }

    public class SuperReturnClass {
        public String toString() {
            return "SuperReturnClass";
        }
    }

    public class SubClass extends SuperClass {
        @Override
        public SubReturnClass getReturn() {
            return new SubReturnClass();
        }
    }

    public class SubReturnClass extends SuperReturnClass {
        public String toString() {
            return "SubReturnClass";
        }
    }
}
