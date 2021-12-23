import java.util.Scanner;

pubilc class Lottery{
    public static void main(String[] args) {
        int lottery=(int)(Math.random()*100);
        Scanner.input=new Scanner(System.in);
        System.out.print("快点输入");
        int guess=input.nextInt();
        int lotteryDigit1=lottery/10;
        int lotteryDigit2=lottery%10;

        int guessDigit1=guess/10;
        int guessDigit2=guess%10;
        System.out.printkln("lottery是");
        if(guess==lottery)
            System.out.println("撞大运啦");
        else if(guessDigit2==lotteryDigit1)&&(guessDigit1==lotteryDigit2)
                System.out.println("二等奖哇");
        else if(guessDigit2==lotteryDigit2)||(guessDigit2==lotteryDigit1)||(guessDigit1==lotteryDigit1)||
                (guessDigit1== lotteryDigit2)
                System.out.println("");
        else
            System.out.println(""); 
    }
}