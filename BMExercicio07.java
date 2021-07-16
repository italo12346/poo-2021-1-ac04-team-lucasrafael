import java.util.Scanner;
public class BMExercio07 {
  public static void main(String[] args) {
    System.out.println("Informe um número: ");
    Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt();
    int n2;
    while(n1 > 1){
    if(n1 % 2 == 0){
      n2 = n1/2;
      System.out.println(n2);
      n1 = n2;
    }
    else if(n1 % 2 != 0){
      n2 = 3* n1 + 1;
      System.out.println(n2);
      n1 = n2;
    }
    }
  }
}