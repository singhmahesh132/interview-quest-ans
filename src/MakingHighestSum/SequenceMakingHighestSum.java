package src.MakingHighestSum;

//Question : Find the continuous sequence in array which creates max sum
//input :  int[] arr = {1,9,-10,5,3,-4,10,6,9,4,2,-9,2,-20,1,2,3};
//Output : sum=35 :: startIndex=3 :: endIndex=10
//         5 3 -4 10 6 9 4 2
public class SequenceMakingHighestSum {

    public static void main(String[] args){

        int[] arr = {1,9,-10,5,3,-4,10,6,9,4,2,-9,2,-20,1,2,3};

        int sum = arr[i];
        int maxSum = arr[i];
        int startIndex = 0;
        int seqStartIndex = 0;
        int seqEndIndex = 0;

        //Start iteration over array
        for(int i = 1 ; i < arr.length; i++){

            //if total sum becomes less than zero then reset the sum.
            if(sum < 0){
                sum = 0;
                startIndex = i;
            }
            //if sum is zero then reset the startIndex
            if(sum==0)
                startIndex = i;

            sum = sum + arr[i];

            //now compare the sum with seqObj sum and is less, then update the maxSum and start and end index.
            if(maxSum <= sum) {
                maxSum = sum;
                seqStartIndex = startIndex;
                seqEndIndex = i;
            }
        }

        System.out.println("sum=" + maxSum+" :: startIndex="+seqStartIndex+" :: endIndex="+seqEndIndex);
        for(int i = seqStartIndex; i <= seqEndIndex; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
