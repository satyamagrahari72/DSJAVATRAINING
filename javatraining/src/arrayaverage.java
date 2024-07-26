public class arrayaverage {
    public static void main(String[] args) {
        int[] arr  = {1,7,9,11,12};
        int sum  =0;
        for(int i = 0; i<arr.length;i++){
            sum+=arr[1];
        }
        float average = (float)sum/arr.length;

        System.out.println("Average of the array elements:" +average);

    }
}
