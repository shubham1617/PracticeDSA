package DSA.LinearSearch;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
    static int arrangeCoins(int n) {
        int i =1;
        while(n>0){
            i++;
            n=n-i;
        }
        return i-1;
    }
}
