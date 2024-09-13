import java.util.Arrays;
import java.util.Random;

public class Homework19Zada4a3 {
    private Integer a;
    private Integer b;
    private  Integer c;
    Random rand = new Random();
    public void printZad3(){
        a = rand.nextInt(-99,99);
        b = rand.nextInt(-99,99);
        c = rand.nextInt(-99,99);
        System.out.println("Initial value are:"+"\ta= "+a+ "\tb= "+b+"\tc= "+c);
        Boolean flag = true;
        Integer bufer = 0;
        Integer[] arrAbc = new Integer[]{a, b, c};
        Integer[] copyArrAbc = Arrays.copyOf(arrAbc,arrAbc.length);
        while (flag){
            flag = false;
            for (int i = 0; i < copyArrAbc.length-1; i++) {
                if(copyArrAbc[i] > copyArrAbc[i+1]){
                    bufer = copyArrAbc[i];
                    copyArrAbc[i] = copyArrAbc[i+1];
                    copyArrAbc[i+1] = bufer;
                    flag = true;
                }
            }
        }
        //System.out.println("copyArrAbc= "+Arrays.toString(copyArrAbc));
        a = copyArrAbc[0];
        b = copyArrAbc[1];
        c = copyArrAbc[2];
        System.out.println("Final value are:"+"\ta= "+a+ "\tb= "+b+"\tc= "+c);

    }
}
