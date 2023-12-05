package Project1;

public class E4 {
    //Create a 2D array of integers. Develop a program which will calculate the
    //sum of even and odd numbers for that array.
    public static void main(String[] args) {
        int [][] numbers={
                {21,30,10},
                {50,33,12,1,60}
        };
        int sumodd=0;
        int sumeven=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0){
                    sumeven=sumeven+numbers[i][j];
                }else {
                    sumodd=sumodd+numbers[i][j];
                }
            }


        }
        System.out.println("Sum of Even Numbers is "+sumeven);
        System.out.println("Sum of Even Numbers is "+sumodd);
    }
}
