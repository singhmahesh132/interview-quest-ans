package src.CombineTwoArrays;

//Quest: Combine two sorted array to produce a single sorted array without using sorting
public class CombineTwoArrayWithoutSorting {
    public static void main(String[] args){
        int[] arr1 = {13,20,45,51};
        int[] arr2 = {21,23,40,44,49,50,60,70,80};
        int index1 = 0;
        int index2 = 0;
        boolean flag1 = true;
        boolean flag2 = true;
        int index3 = 0;
        int[] arr3 = new int[arr1.length+arr2.length];

        while(flag1 && flag2) {

            if (arr1[index1] < arr2[index2]) {
                arr3[index3] = arr1[index1];
                if (index1 < arr1.length - 1)
                    index1++;
                else
                    flag1 = false;
            } else {
                arr3[index3] = arr2[index2];
                if (index2 < arr2.length - 1)
                    index2++;
                else
                    flag2 = false;
            }
            index3++;
        }

        if(!flag1){
            for(int i = index3; i < arr3.length; i++)
                arr3[i] = arr2[index2++];
        }
        if(!flag2){
            for(int i = index3; i < arr3.length; i++)
                arr3[i] = arr1[index1++];
        }

        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }
}
