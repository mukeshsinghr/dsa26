   
import java.util.Scanner;
public class CodeForces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterMellonWt = scanner.nextInt();
        
        System.out.println(devideWaterMellon(waterMellonWt));
    }
    
    public static String devideWaterMellon(int weight) {
        String result = "NO";
        int parts = weight/2;
        if(weight%2==0 && parts % 2 == 0) {
            result = "YES";
        } 
        return result;
    }
}
