package src.CombineTwoSortedArrays;

//Quest: Combine two sorted array to produce a single sorted array without using sorting
public class CombineTwoArrayWithoutSorting {

    //We will be using the flag technique here. It is possible that one array will be smaller than the other.
    //thus it is possible one array traversal can be completed before than other while adding element in final array.
    public static void main(String[] args){
        int[] arr1 = {13,20,45,51};
        int[] arr2 = {21,23,40,44,49,50,60,70,80};
        int[] combArray = new int[arr1.length+arr2.length];
        int index1 = 0;
        int index2 = 0;
        int combIndex = 0;              //this is used to keep track of  index of final array while copying.
        boolean flag1 = true;
        boolean flag2 = true;

        //Here we will be checking if flag which marks an array traversal is completed out of both, to break loop.
        while(flag1 && flag2) {

            if (arr1[index1] < arr2[index2]) {
                combArray[combIndex] = arr1[index1];
                if (index1 < arr1.length - 1)              //keep track of index, so we don't get ArrayIndexOutOfBounds.
                    index1++;
                else                                       //if end index is reached, simply raise the flag for array1.
                    flag1 = false;
            } else {
                combArray[combIndex] = arr2[index2];
                if (index2 < arr2.length - 1)              //keep track of index, so we don't get ArrayIndexOutOfBounds.
                    index2++;
                else                                       //if end index is reached, simply raise the flag for array2.
                    flag2 = false;
            }
            combIndex++;
        }

        //if flag was raise for array1 that means array1 is completed, so simply copy remaining array2 in final array.
        if(!flag1){
            for(int i = combIndex; i < combArray.length; i++)
                combArray[i] = arr2[index2++];
        }
        //if flag was raise for array2 that means array2 is completed, so simply copy remaining array1 in final array.
        if(!flag2){
            for(int i = combIndex; i < combArray.length; i++)
                combArray[i] = arr1[index1++];
        }

        for (int i : combArray) {
            System.out.print(i + " ");
        }
    }
}
