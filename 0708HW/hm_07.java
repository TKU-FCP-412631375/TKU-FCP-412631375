import java.util.Scanner;

public class hm_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("請輸入圓的半徑: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        
        System.out.println("圓的面積為: " + area);
    }
}