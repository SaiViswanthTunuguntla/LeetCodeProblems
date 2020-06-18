package easy;

public class GuessNumber {
    public static int guessNumber(int n,int actual) {
         if(guess(1,actual)==0) return 1;
          else if(guess(n,actual)==0) return n;
        int lowerLimit=1;
        int upperLimit=n;
        int mid=(lowerLimit+upperLimit)/2;
        int pick= guess(mid,actual);

        while(pick!=0)
        {
            if(pick==1)
            {
                upperLimit=mid;
            }
            else if(pick==-1)
            {
                lowerLimit=mid;
            }
            mid=(lowerLimit+upperLimit)/2;
            pick=guess(mid, actual);
        }

        return mid;
    }
     public static int guess(int guess, int actual){
        if(guess<actual) return -1;
        else if(guess>actual) return 1;
        else return 0;

     }
     //Accepted answer
    public int AcceptedAnswerOfGuessNumber(int n,int actual) {

        int lowerLimit=1;
        int upperLimit=n;

        while(lowerLimit<=upperLimit)//condn to use in case of Binary search
        {
            //int mid=(lowerLimit+upperLimit)/2; //don't use this..might over flow if n is Integr.MAX value
            int mid=lowerLimit+ (upperLimit-lowerLimit)/2;//import point..use this instead
            int pick= guess(mid, actual);
            if(pick==0) return mid;
            else if(pick==-1)
            {
                upperLimit=mid-1;
            }
            else if(pick==1)
            {
                lowerLimit=mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(guessNumber(200,10));
    }
}
