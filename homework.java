import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class homework {

public static int[] get_minmax(int[] arr){
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int value : arr){
        if(value < min) min = value;
        if(value > max) max = value;
    }
    return new int[] {min, max};
}

public static float[] get_minmax(float[] arr){
    float min = Integer.MAX_VALUE;
    float max = Integer.MIN_VALUE;
    for(float value : arr){
        if(value < min) min = value;
        if(value > max) max = value;
    }
    return new float[] {min, max};
}

//히스토그램을 그려주는 함수
public static void print_histogram_i(int[] histogram, int min){
    for(int i = 0; i < histogram.length; i++){
        if(histogram[i] > 0){
            System.out.printf("\t%2d \t|", (i + min));
            for(int j = 0; j < histogram[i]; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}

public static void print_histogram_f(int[] histogram, int min){
    for(int i = 0; i < histogram.length; i++){
        
        if(histogram[i] > 0){
            System.out.printf("%2d.%d \t|", (i + min + 1)/10, (i+min+1) % 10);
            for(int j = 0; j < histogram[i]; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}

public static void main(String[] args) throws Exception {
    // write your code here
    

    int count = 318;
    
    int[] length_arr = new int[count];
    float[] lightness_arr = new float[count];

    
        FileReader fr = new FileReader("./salmon_bass_data.csv");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();    //c
        
        int cnt = 0;
        while((line = br.readLine()) != null){
            //System.out.println(line);
            String[] parse = line.split(",");

            
            length_arr[cnt] = Integer.parseInt(parse[1]);
            lightness_arr[cnt] = Float.parseFloat(parse[2]);    //데이터를 배열에 저장

            ++cnt;
        }

    

    int[] minmax_length = get_minmax(length_arr);
    float[] minmax_light = get_minmax(lightness_arr);
    System.out.printf("length min = %d, max = %d\n", minmax_length[0], minmax_length[1]);
    System.out.printf("light min = %.2f, max = %.2f\n", minmax_light[0], minmax_light[1]);


    int[] histogram_length = new int[minmax_length[1] - minmax_length[0]+1];
    int[] histogram_light = new int[(minmax_length[1] - minmax_length[0])*10 + 1];
    int a=0;            //318
    for(int i = 0; i < length_arr.length; i++){
        histogram_length[length_arr[i] - minmax_length[0]] += 1;//갯수
        histogram_light[(int) ((int)(lightness_arr[i]*10) - minmax_light[0])]++;
        a++;
        System.out.println(a);
    }
    

    print_histogram_i(histogram_length, minmax_length[0]);
    System.out.println("****************************************************");
    print_histogram_f(histogram_light, (int)minmax_light[0]);
}
}
