package salmon;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class sal {
        
    
    public static void main(String[] args)throws IOException{//throws IOException예외 처리
    
        //시도해보고 싶은 거, 근데 에러가 발생할 수 있는 거
        FileReader fr = new FileReader("salmon_bass_data.csv");//파일 열기
        BufferedReader br=new BufferedReader(fr);//한 줄씩 읽을 수 있음
        String line = br.readLine();
        
        int count=0;
        
        while((line=br.readLine())!=null)//끝까지 가겠다.
        {
            if(line==null){
                System.out.println("마지막 줄 아무것도 없어요");
            }
            String[] parse =line.split(",");
            System.out.printf("%s %s %s\n",parse[0],parse[1],parse[2]);
            
            ++count;
           
        }
        System.out.println(count);
    
    }   
}

