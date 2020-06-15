package easy;

public class isPrefixOfWord {

    //1 ms	37 MB
    public static int isPrefixOfWord(String sentence, String searchWord) {
        if(!sentence.contains(searchWord)) return -1;
        String[] words=sentence.split("\\s");
        int i=1;
        for(String w:words){
            if(w.startsWith(searchWord)) return i;
            i++;
        }
        return 0;
    }
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Check If a Word Occurs As a Prefix of Any Word in a Sentence.
    //Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Check If a Word Occurs As a Prefix of Any Word in a Sentence.
    public static int isPrefixOfWordMethod2(String sentence, String searchWord) {
        int beginIndex=0; int count=1;
        for (int i = 0; i <sentence.length() ; i++) {
            if(sentence.charAt(i)==' '){
                if(sentence.substring(beginIndex,i).startsWith(searchWord)) return count;
                beginIndex=i+1;
                count++;
            }
            if(sentence.substring(beginIndex).startsWith(searchWord)) return count;
        }
        return -1;
    }
    public int isPrefixOfWordLeetCodeSoln(String s, String sW) {
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].indexOf(sW)==0)
                return i+1;
        }
        return -1;

    }

    public static void main(String[] args) {
        String sentence="hello from the other side";
        String searchWord = "fro";
        System.out.println(isPrefixOfWord(sentence,searchWord));
        System.out.println(isPrefixOfWordMethod2(sentence,searchWord));
    }
}
