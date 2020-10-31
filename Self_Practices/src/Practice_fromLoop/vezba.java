package Practice_fromLoop;
//print odd numbers between 1 to 50, koristiti continue statement

public class vezba {
    public static void main(String[] args) {
        for( int i = 1; i<=50; i++){
            if(i%2 ==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("==============================");

        // 4. print even number between 1 to 50

        for( int i = 1; i<=50; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.print(i+" ");
        }
      
    }
}
