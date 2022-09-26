import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1.1

        int[] i = new int[3];
        i[0] = 1;
        for (int i1 = i[0]; i1 <= 3; i1++){
            System.out.println(i1);
        }

        //Задача 1.2

        double[] h = {1.57, 7.654, 9.986};
        h[0] = 1.57;
        h[1] = 7.654;
        h[2] = 9.986;
        System.out.println(h[0]);
        System.out.println(h[1]);
        System.out.println(h[2]);

        //Задача 1.3

        int[] y = new int[10];
        y[0] = 0;
        for (int y1 = y[0]; y1 <= 10; y1 = y1 + 2){
            System.out.println(y1);
        }

        //Задача 2.1

        int[] k = new int[3];
        k[0] = 1;
        for (int k1 = k[0]; k1 <= 3; k1++){
            System.out.print(k1 + ",");
        }
        System.out.println();

        //Задача 2.2

        double[] l = {1.57, 7.654, 9.986};
        l[0] = 1.57;
        l[1] = 7.654;
        l[2] = 9.986;
        System.out.print(l[0] + ", ");
        System.out.print(l[1] + ", ");
        System.out.print(l[2]);
        System.out.println();

        //Задача 2.3

        int[] p = new int[10];
        p[0] = 0;
        for (int p1 = p[0]; p1 <= 10; p1 = p1 + 2){
            System.out.print(p1 + ",");
        }
        System.out.println();

        //Задача 3.1

        int[] q = new int[3];
        q[0] = 3;
        for (int q1 = q[0]; q1 >= 1; q1--){
            System.out.print(q1 + ",");
        }
        System.out.println();

        //Задача 3.2

        double[] w = {1.57, 7.654, 9.986};
        w[0] = 1.57;
        w[1] = 7.654;
        w[2] = 9.986;
        System.out.print(w[2] + ", ");
        System.out.print(w[1] + ", ");
        System.out.print(w[0]);
        System.out.println();

        //Задача 3.3

        int[] s = new int[10];
        s[0] = 10;
        for (int s1 = s[0]; s1 >= 0; s1 = s1 - 2){
            System.out.print(s1 + ",");
        }
        System.out.println();

        //Задача 4

        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int z = 0; z < number.length; z++){
            if (number[z] % 2 != 0) {
                number[z] += 1;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}