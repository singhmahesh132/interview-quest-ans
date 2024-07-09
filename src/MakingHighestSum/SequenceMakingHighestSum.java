package src.MakingHighestSum;

//Question : Find the continuous sequence in array which creates max sum
public class SequenceMakingHighestSum {

    static class maxSeqClass {
        private int sum;
        private int startIndex;
        private int endIndex;

        public int getSum() {
            return sum;
        }

        public int getStartIndex() {
            return startIndex;
        }

        public int getEndIndex() {
            return endIndex;
        }
    }

    public static void main(String[] args){

        int[] arr = {1,9,-10,5,3,-4,10,6,9,4,2,-9,2,-20,1,2,3};

        int startIndex = 0;
        int endIndex = 0;
        int sum = 0;
        maxSeqClass maxSumObj = new maxSeqClass();

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
            System.out.println(sum);

            //now compare the sum with seqObj sum and is less, then update the sum and start end index.
            if(maxSumObj.sum < sum) {
                maxSumObj.sum = sum;
                maxSumObj.startIndex = startIndex;
                maxSumObj.endIndex = endIndex;
            }
        }

        System.out.println("sum=" + maxSumObj.getSum()+" :: startIndex="+maxSumObj.getStartIndex()+" :: endIndex="+maxSumObj.getEndIndex());
        for(int i = maxSumObj.getStartIndex(); i <= maxSumObj.getEndIndex(); i++){
            System.out.print(arr[i]+" ");
        }
    }
}
