package class_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.FileVisitResult;

public class Main_0318_2 {
    public static void main(String[] args)throws IOException
    {
        FileReader fr = new FileReader("C:\\java_lgh\\day0318\\class_1\\total_human.csv");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        int num_data = 101;
        int [] age_1 = new int [num_data];
        int [] man_age = new int[num_data];
        int [] woman_age = new int[num_data];
        int [] total_age = new int[num_data];
        int index=0;
        int total=0;
        int half=0;

        while((line = br.readLine())!=null)
        {
          
            String[] split_1 = line.split(",");
            age_1[index]=Integer.parseInt(split_1[0]);
            man_age[index] = Integer.parseInt(split_1[1]);
            woman_age[index] = Integer.parseInt(split_1[2]);
            total_age[index]= man_age[index]+woman_age[index];
            
            

            index++;
        }
        

        for(int i=100;i>=0;i--)
        {
            // System.out.println(total_age[i]);
            total+=total_age[i];
            if(total>=25814058)
            {
                // System.out.println(total);
                // System.out.println(i);
                System.out.println(age_1[i]+"세");
            }
            // System.out.println(age[0]);
            // System.out.println(i);
        }
        
        
        half=total/2;
        System.out.println(total);
        System.out.println(half);
    
    }
}
