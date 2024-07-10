package src.SwapVowelsInAWord;

//Ques: Given a string swap vowels in the string such that first vowel is swapped with last vowel
//and non vowel letters positions are unchanged.
public class SwapVowels {

    //one way is using two arrays, when in one array you can store the vowels and replace the vowels with any character,
    //in the main array as an indicator. then traverse the main array in reverse and add the vowels from vowels array.
    //Other optimised approach is using two pointers as demonstrated below.
    public static void main(String[] args){

        String word = "mahesh";
        char[] alphaArr = word.toCharArray();
        int ei = alphaArr.length-1;
        int fdwVowel = -1;
        int bkdVowel = -1;

        //Traversing only half array as we are using two pointers, one from front and one from back,
        //to find the vowels.
        for(int i = 0; i <= (alphaArr.length-1)/2; i++){
            if(alphaArr[i] == 'a' || alphaArr[i] == 'e' || alphaArr[i] == 'i' || alphaArr[i] == 'o' || alphaArr[i] == 'u' )
                fdwVowel = i;

            if(alphaArr[ei] == 'a' || alphaArr[ei] == 'e' || alphaArr[ei] == 'i' || alphaArr[ei] == 'o' || alphaArr[ei] == 'u')
                bkdVowel = ei;

            //if both the pointers are pointing to vowel then just swap the values.
            if(fdwVowel!=-1 && bkdVowel!=-1){
                char temp = alphaArr[fdwVowel];
                alphaArr[fdwVowel] = alphaArr[bkdVowel];
                alphaArr[bkdVowel] = temp;
                fdwVowel = -1;
                bkdVowel = -1;
            }
            ei--;
        }

        for (char c : alphaArr){
            System.out.print(c);
        }
    }
}
