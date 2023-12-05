package Project1;

public class E8 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 8, 1};
        int min=numbers[0];
        int max = numbers[0];// Assume the first element is the maximum
        for (int i=0 ; i<numbers.length ;i++){
            if (numbers[i]>max){
                max=numbers[i];// Update max if a higher value is found

            }else {
                min=numbers[i];
            }
        }
        System.out.println("The highest value in the array is: " + max);
        System.out.println("The minimum value in the array is: " + min);
    }
}
