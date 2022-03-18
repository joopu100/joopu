import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

enum FishType {Salmon, Bass}
public class bestx {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("salmon_bass_data.csv");//csv 파일 읽기
        BufferedReader br = new BufferedReader(fr);//쓰기

        String line = br.readLine();//칼럼 이름 한 번 읽어서 테이블 기준값을 없애줌.
        int num_data = 318;//총 데이터 라인은 318개
        int [] length_array = new int[num_data];//길이배열 공간 새롭게 할당
        FishType[]label=new FishType[num_data];
        int index = 0;//목록 초기화
        while(true)//계속 돌아
        {
            line = br.readLine();//라인 한 줄 읽어
            if (line == null)//만약에 라인이 빈 공간이면
            {
                    break;//끝내
                }
                String[] parse = line.split(",");//문자열을 ','를 기준으로 분리해
                label[index] = FishType.valueOf(parse[0]);
                
                length_array[index] = Integer.parseInt(parse[1]);
                ++index;
            }
                
            int n_hit=0, n_miss=0;
            int hitmax=0;
            int lastx=0;
            int []arr=new int[24];
    
            for(int model_length=2;model_length<27;model_length++)
            {  
                 
                for (int i =0; i<num_data;++i)
                {
                    FishType model_decision;

                    if (length_array[i]>model_length)
                    {
                        model_decision = FishType.Bass;
                    }
                    else
                    {
                        model_decision = FishType.Salmon;
                    }
                    if (model_decision == label[i])
                    {
                        ++n_hit;
                    }
                    else
                    {
                        ++n_miss;
                    }
                    
                    
                    
                }
                System.out.printf("%dcm hit = %d, miss = %d\n",model_length, n_hit, n_miss);
                if(hitmax<n_hit){
                    hitmax=n_hit;
                    lastx=model_length;
                }
                
                n_hit=0;
                n_miss=0;
                
            }
            System.out.println(hitmax);
            System.out.println(lastx);
           
            
            
           
                
            
            
            
            
    }
}
