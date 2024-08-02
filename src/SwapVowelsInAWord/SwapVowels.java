package src.SwapVowelsInAWord;

//Ques: Given a string swap vowels in the string such that first vowel is swapped with last vowel
//and non vowel letters positions are unchanged.
public class SwapVowels {

    //one way is using two arrays, when in one array you can store the vowels and replace the vowels with any character,
    //in the main array as an indicator. then traverse the main array in reverse and add the vowels from vowels array.
    //Other optimised approach is using two pointers as demonstrated below.
    public static void main(String[] args){

        String word = "education";
        int headPtr = 0;
        int tailPtr = word.length()-1;
        boolean headVovFlg = false;
        boolean tailVovFlg = false;
        char[] charArr = word.toCharArray();

        //Traversing only half array as we are using two pointers, one from front and one from back,
        //to find the vowels.
        while(headPtr<tailPtr){

            //if both the pointers are pointing to vowel then just swap the values.
            if(headVovFlg && tailVovFlg){
                char temp = charArr[headPtr];
                charArr[headPtr] = charArr[tailPtr];
                charArr[tailPtr] = temp;
                headVovFlg = false;
                tailVovFlg = false;
                headPtr++;
                tailPtr--;
            }

            //if headPointer is pointing to vowel then mark flag true else increment the pointer.
            if(charArr[headPtr]=='a' || charArr[headPtr]=='e' || charArr[headPtr]=='i' || charArr[headPtr]=='o' || charArr[headPtr]=='u'
                    || charArr[headPtr]=='A' || charArr[headPtr]=='E' || charArr[headPtr]=='I' || charArr[headPtr]=='O' || charArr[headPtr]=='U')
                headVovFlg = true;
            else
                headPtr++;
            //if tailPointer is pointing to vowel then mark flag true else decrement the pointer.
            if(charArr[tailPtr]=='a' || charArr[tailPtr]=='e' || charArr[tailPtr]=='i' || charArr[tailPtr]=='o' || charArr[tailPtr]=='u'
                    || charArr[tailPtr]=='A' || charArr[tailPtr]=='E' || charArr[tailPtr]=='I' || charArr[tailPtr]=='O' || charArr[tailPtr]=='U')
                tailVovFlg = true;
            else
                tailPtr--;
        }

        //instead of for looping the charArray and appending each character to StringBuffer and then printing.
        System.out.println(String.valueOf(charArr));
    }
}
