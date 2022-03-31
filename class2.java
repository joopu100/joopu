import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int score = 0;
        String grade ;

        do
        {
            System.out.println("점수를 입력하세요(0~100)");
            score = sc.nextInt();
        }while(score>100||score<0);

        
        if(score >= 90)
        {
            if(score>=95){
                grade = "A+";
            }
            grade = "A";
        }
        else if(score >= 80)
        {
            grade = "B";
        }
        else if(score >= 70)
        {
            grade = "C";
        }
        else if(score >= 60)
        {
            grade = "D";
        }
        else
        {
            grade = "F";
        }

        System.out.println("성적은 "+grade+"입니다.");

    }
}
