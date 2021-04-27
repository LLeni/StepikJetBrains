import java.util.Scanner;

// 1.43
// Как я понял, необходимо посчитать количество 0, 1, -1 и вывести в таком же порядке
public class SizeOfPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Количество значений
        int countZeros = 0;
        int countOnes = 0;
        int countMinusOnes = 0;
        while(n > 0){
            if(sc.nextInt() == 0){
                countZeros++;
            } else if(sc.nextInt() == 1){
                countOnes++;
            } else if(sc.nextInt() == -1){
                countMinusOnes++;
            }
        }

        System.out.printf("%d %d %d", countZeros, countOnes, countMinusOnes);
    }
}
