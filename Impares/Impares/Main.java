import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite Um Valor");
        int a = scanner.nextInt();
        
        System.out.println("Digite Um Valor");
        int b = scanner.nextInt();
        
        while ( a > b ){
            if(b % 2 == 1){
                System.out.println("Impar :" +b);
            }
            b++;
            
        }
        while (b > a){
            if(a % 2 == 1){
                System.out.println("Impar : " +a);
            }
            a++;
        }
        
    }
    
}
