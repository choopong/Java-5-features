class Main01 {

    public static void main(String[] args) {
        loop1();
        loop2();
    }

    private static void loop1() {
        int sum = 0;
        int[] nums = {1,2,3,4};
        for(int num: nums) {
            sum += num;
        }
        System.out.println(sum);
    }

    private static void loop2() {
        int sum = 0;
        for(int num: getNums()) {
            sum += num;
        }
        System.out.println(sum);
    }

    private static int[] getNums() {
        int[] nums = {1,2,3,4};
        return nums;
    }
}