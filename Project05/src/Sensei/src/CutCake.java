import java.util.Scanner;;

public class CutCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        sc.close();
        long min = Math.min(a,Math.min(b, c));
        long result = 0;
        for(int i = 1 ; i <= min ; i++){
            if(a*b*c % i*i == 0){
                result = i;
            }
        }       
        System.out.println(result);
    }
}
