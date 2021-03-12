import java.util.Arrays;

public class Main_homework {
    public static void main(String[] args) {
        int a=1;
        int b=a--;
        System.out.println(b);
        System.out.println(a);
        int c=++a;
        System.out.println(c);
        int d=a--;
        System.out.println(d);
        int e=++a;
        System.out.println(e);
        int f=++a;
        System.out.println(f);
        int g=--a;
        System.out.println(g);
        int h=a++;
        System.out.println(h);


        short shortVariable = 149;
        int intVariable = 2000;
        long longVariable = 4300;

        float floatVariable = 2.3f;
        float floatVariable2 = 5.17f;
        double doubleVariable = 19.13;

        longVariable = shortVariable;
        floatVariable = intVariable ;
        floatVariable2 = shortVariable;
        doubleVariable = longVariable;
        doubleVariable = floatVariable2;

        double summary = (shortVariable+intVariable+longVariable+floatVariable+floatVariable2+doubleVariable);

        String str = Double.toString(summary);
        System.out.println(str);

//    sum of short, int, long, float and double makes double   ;
/*int someNumber = 24; */
        /**long someOtherNumber;
         *
         */
        // TODO : check file before sending;
int [] someArray = new int [26];
someArray [0] = 12;
someArray [1] = 23;
someArray [2] = 55;
someArray [3] = 3;
someArray [4] = 34;
someArray [5] = 2;
someArray [6] = 47;
someArray [7] = 13;
someArray [8] = 29;
someArray [9] = 103;
        System.out.println(Arrays.toString(someArray));
        someArray [0] = 12;
        someArray [1] = 46;
        someArray [2] = 53;
        someArray [3] = 6;
        someArray [4] = 32;
        someArray [5] = 4;
        someArray [6] = 45;
        someArray [7] = 26;
        someArray [8] = 27;
        someArray [9] = 206;
        System.out.println(Arrays.toString(someArray));
    }
}
