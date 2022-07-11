public class AddTwoInt {
    public static void main(String[] args) {
        System.out.println(getSum(2,5));
    }
    public static int getSum(int a, int b){
        return Math.addExact(a,b);
    }
}
