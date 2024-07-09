package src.MakingHighestSum;

//Question : Find the continuous sequence in array which creates max sum
public class SequenceMakingHighestSum {

    public static void main(String[] args){

        int[] arr = {1,9,-10,5,3,-4,10,6,9,4,2,-9,2,-20,1,2,3};

        int startIndex = 0;
        int endIndex = 0;
        int sum = 0;
        int maxSum = 0;
        int seqStartIndex = 0;
        int seqEndIndex = 0;

        for(int i = 0 ; i < arr.length; i++){

            //if total sum becomes less than zero then reset the sum.
            if(sum < 0){
                sum = 0;
            }

            //when sum is 0 then reset both the index to point current index or else just increment the end index.
            if(sum == 0)
                startIndex = i;
            endIndex = i;
            sum = sum + arr[i];

            //now compare the sum with seqObj sum and is less, then update the maxSum and start and end index.
            if(maxSum < sum) {
                maxSum = sum;
                seqStartIndex = startIndex;
                seqEndIndex = endIndex;
            }
        }

        System.out.println("sum=" + maxSum+" :: startIndex="+seqStartIndex+" :: endIndex="+seqEndIndex);
        for(int i = seqStartIndex; i <= seqEndIndex; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
