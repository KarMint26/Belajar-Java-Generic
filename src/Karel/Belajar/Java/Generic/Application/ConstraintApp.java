package Karel.Belajar.Java.Generic.Application;

public class ConstraintApp {
    public static void main(String[] args) {

        NumberData<Integer> integerNumberData = new NumberData<>(120);
        NumberData<Long> longNumberData = new NumberData<>(26L);

        System.out.println(integerNumberData.getData());
        System.out.println(longNumberData.getData());

        // NumberData<String> stringNumberData = new NumberData<String>("Karel"); // ERROR Karena Cuma boleh Turunan Number

    }

    public static class NumberData<T extends Number> { // Default nya object namun jika Di define Number maka turunan harus number

        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
