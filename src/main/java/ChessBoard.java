import java.util.Scanner;
//1.26
//Проверяет сталкиваются ли две королевы на шахматной доске
public class ChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Первая королева
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        //Вторая королева
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if(x1 == x2 || y1 == y2){
            System.out.println("YES");
            return;
        } else {
            int newX1 = x1;
            int newY1 = y1;
            while(newX1 < 7 || newY1 < 7){
                newX1++;
                newY1++;
                if(newX1 == x2 && newY1 == y2){
                    System.out.println("YES");
                    return;
                }
            }
            newX1 = x1;
            newY1 = y1;
            while(newX1 > 1 || newY1 > 1){
                newX1--;
                newY1--;
                if(newX1 == x2 && newY1 == y2){
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        }
    }
}
