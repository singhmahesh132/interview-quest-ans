package src.ShiftZerosToStart;

//Ques : Shift Zeros to the start of the array without changing the sequence of other non-zero numbers.
public class MyClass {

    public static void main(String[] args) {

        //If array only contains just 1's and 0's.
        //reading original array and then keeping the 0's in front and 1's at last
        //but for non-zero numbers like 1,2,3,etc., the sequence is reversed in this implementation. thus it not works.
        int[] arr = {0, 1, 0, 0, 0, 2, 0, 3};
        int[] cpyArr = new int[arr.length];
        int startIndex = 0;
        int endIndex = arr.length-1;
        for (int i : arr) {
            if (i != 0)
                cpyArr[endIndex--] = i;
            else
                cpyArr[startIndex++] = i;
        }
        for (int k : cpyArr) {
            System.out.print(k+" ");
        }
        System.out.println();

        //if array contains numbers like 1,2,3,etc.
        //we create two array, one to store zero's only and other to store non-zeros.
        //then in end first write zero array and then non-zero array.
        int[] arr1 = {0, 1, 0, 0, 0, 2, 0, 3};
        int[] zeroArr = new int[arr1.length];
        int[] nonZeroArr = new int[arr1.length];
        int zeroEndIndex = 0;
        int nonZeroEndIndex =0;
        for (int k : arr1) {
            if (k == 0) {
                zeroArr[zeroEndIndex++] = k;
            } else {
                nonZeroArr[nonZeroEndIndex++] = k;
            }
        }

        nonZeroEndIndex = 0;
        for(int i = 0; i < zeroArr.length; i++){
            if(i<zeroEndIndex)
                System.out.print(zeroArr[i]+" ");
            else
                System.out.print(nonZeroArr[nonZeroEndIndex++]+" ");
        }
        System.out.println();

        //Using two pointer
        int[] arr2 = {0, 1, 0, 0, 0, 0, 2, 0, 3, 0};
        int zeroPiIndex = arr2.length-1;
        int nonZeroPiIndex = 0;
        boolean zeroFlag = false;
        boolean nonZeroFlag = false;

        while(nonZeroPiIndex != -1){

            if(arr2[zeroPiIndex] == 0 && !zeroFlag){
                nonZeroPiIndex = zeroPiIndex - 1;
                zeroFlag = true;
            }else if(arr2[nonZeroPiIndex] != 0 && !nonZeroFlag){
                nonZeroFlag = true;
            }else if(!zeroFlag){
                zeroPiIndex--;
            }else
                nonZeroPiIndex--;

            if(zeroFlag && nonZeroFlag){
                arr2[zeroPiIndex] = arr2[nonZeroPiIndex];
                arr2[nonZeroPiIndex] = 0;
                zeroFlag =  false;
                nonZeroFlag = false;
            }

        }
        for (int j : arr2) {
            System.out.print(j+" ");
        }
    }
}
