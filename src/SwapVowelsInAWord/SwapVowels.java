package src.SwapVowelsInAWord;

//Ques: Given a string swap vowels in the string such that first vowel is swapped with last vowel
//and non vowel letters positions are unchanged.
public class SwapVowels {

    //one way is using two arrays, when in one array you can store the vowels and replace the vowels with any character,
    //in the main array as an indicator. then traverse the main array in reverse and add the vowels from vowels array.
    //Other optimised approach is using two pointers as demonstrated below.
    public static void main(String[] args){

        String word = "qqqqqei";
        char[] alphaArr = word.toCharArray();
        int head = 0;
        int tail = alphaArr.length-1;
        int headFlag = -1;
        int tailFlag = -1;

        //Traversing only half array as we are using two pointers, one from front and one from back,
        //to find the vowels.
        while(head<=tail){
            if(alphaArr[head] == 'a' || alphaArr[head] == 'e' || alphaArr[head] == 'i' || alphaArr[head] == 'o' || alphaArr[head] == 'u')
                headFlag = head;

            if(alphaArr[tail] == 'a' || alphaArr[tail] == 'e' || alphaArr[tail] == 'i' || alphaArr[tail] == 'o' || alphaArr[tail] == 'u')
                tailFlag = tail;

            //if both the pointers are pointing to vowel then just swap the values.
            if(headFlag!=-1 && tailFlag!=-1){
                char temp = alphaArr[headFlag];
                alphaArr[headFlag] = alphaArr[tailFlag];
                alphaArr[tailFlag] = temp;
                headFlag = -1;
                tailFlag = -1;
            }
            //if head or tail flag have value other than -1 i.e. it is holding position of a vowel. 
            //thus do not increment or decremen. else do.
            if(headFlag==-1)
                head++;
            if(tailFlag==-1)
                tail--;
        }

        for (char c : alphaArr){
            System.out.print(c);
        }
    }
}
