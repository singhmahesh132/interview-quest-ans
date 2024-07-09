package src.ShiftZerosToStart;


//Ques : Shift Zeros to the start of the array without changing the sequence of other non-zero numbers.
public class MyClass {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 0, 0, 2, 0, 3};

        //If array only contains just 1's and 0's.
        //reading original array and then keeping the 0's in front and 1's at last
        //but for non-zero numbers like 1,2,3,etc., the sequence is reversed in this implementation. thus it not works.
        /*
        int[] cpyArr = new int[arr.length];
        int startIndex = 0;
        int endIndex = arr.length-1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=0)
                cpyArr[endIndex--] = arr[i];
            else
                cpyArr[startIndex++] = arr[i];
        }
        for(int i = 0; i < cpyArr.length; i++) {
            System.out.println(cpyArr[i]);
        }*/


        //if array contains numbers like 1,2,3,etc.
        //we create two array, one to store zero's only and other to store non-zeros.
        //then in end first writ zero array and then non-zero array.
        int[] zeroArr = new int[arr.length];
        int[] nonZeroArr = new int[arr.length];
        int zeroEndIndex = 0;
        int nonZeroEndIndex =0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==0) {
                zeroArr[zeroEndIndex++] = arr[i];
            }
            else {
                nonZeroArr[nonZeroEndIndex++] = arr[i];
            }
        }

        nonZeroEndIndex = 0;
        for(int i = 0; i < zeroArr.length; i++){
            if(i<zeroEndIndex)
                System.out.println(zeroArr[i]);
            else
                System.out.println(nonZeroArr[nonZeroEndIndex++]);
        }
    }
}
