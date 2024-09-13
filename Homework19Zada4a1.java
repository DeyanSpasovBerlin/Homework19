import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework19Zada4a1 {
    Scanner reader = new Scanner(System.in);
    Random rand = new Random();
    public void printZad1() {
        System.out.println("Insert nuber- the length of array:");
        Integer n = reader.nextInt();
        Integer[] arrZad1 = new Integer[n+1];
        Integer[] arrZad1Trunc = new Integer[n];
        for (int i = 0; i < arrZad1.length; i++) {
            arrZad1[i] = i;
        }
        System.out.println("Initial full Array is: "+ Arrays.toString(arrZad1));
        Integer m = rand.nextInt(0,n);
        //System.out.println("random m= "+m);
        for (int i = 0, j =0; i < arrZad1.length ; i++) {
            if(arrZad1[i] != m){
                arrZad1Trunc[j] = arrZad1[i];
                j++;
            }
        }
        System.out.println("Truncated Array is: "+Arrays.toString(arrZad1Trunc));
        System.out.println("Mixed array is:");
        Integer bufer = 0;
        Integer mixNum =0;
        for (int i = 0; i <arrZad1Trunc.length ; i++) {
            mixNum = rand.nextInt(0,(arrZad1Trunc.length-1));
            bufer = arrZad1Trunc[i];
            arrZad1Trunc[i] = arrZad1Trunc[mixNum];
            arrZad1Trunc[mixNum] = bufer;
        }
        System.out.println(Arrays.toString(arrZad1Trunc));
        Boolean flag = true;
        Integer i = 0;
        bufer = 0;
            while (flag){
                for (int j = 0; j < arrZad1Trunc.length; j++) {
                    if(arrZad1Trunc[j] == i){
                        flag = true;
                        break;
                    }else {
                        flag = false;
                        bufer = i;
                    }
                }
                i++;
            }
        System.out.println("The element which is not present is: "+bufer);
    }
}
