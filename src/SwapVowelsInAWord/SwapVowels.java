package src.SwapVowelsInAWord;

//Ques: Given a string swap vowels in the string such that first vowel is swapped with last vowel
//and non vowel letters positions are unchanged.
public class SwapVowels {

    public static void main(String[] args){

        String word = "education";
        char[] alphaArr = word.toCharArray();
        int ei = alphaArr.length-1;
        int fdwVowel = -1;
        int bkdVowel = -1;
        for(int i = 0; i <= alphaArr.length/2; i++){
            if(alphaArr[i] == 'a' || alphaArr[i] == 'e' || alphaArr[i] == 'i' || alphaArr[i] == 'o' || alphaArr[i] == 'u' )
                fdwVowel = i;

            if(alphaArr[ei] == 'a' || alphaArr[ei] == 'e' || alphaArr[ei] == 'i' || alphaArr[ei] == 'o' || alphaArr[ei] == 'u')
                bkdVowel = ei;

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
