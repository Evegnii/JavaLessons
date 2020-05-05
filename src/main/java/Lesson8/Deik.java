package Lesson8;

        import java.util.Arrays;

public class Deik {
    public static void main(String[] args) {
        Integer[][] table = new Integer[5][5];
        table[0][1] = 10;
        table[0][2] = 30;
        table[0][3] = 50;
        table[0][4] = 10;

        table[2][4] = 10;

        table[3][1] = 40;
        table[3][2] = 20;

        table[4][0] = 10;
        table[4][2] = 10;
        table[4][3] = 30;

        Integer[] result = new Integer[5];
        for (int i = 1; i < result.length; i++) {
            result[i] = 10000;
        }
        result[0] = 0;     //эта часть под вопросом
        result[1] = 10;
        result[2] = 30;
        result[3] = 50;
        result[4] = 10;

        Boolean[] flags = new Boolean[5];
        flags[0]=true;
        Integer[] parent = new Integer[5];
        Integer min = 0;
        Integer temp = 0;
        Integer minindex = 0;




        do {
            min = 10000;
            minindex = 10000;    //Нужен дебагинг !!!!!
            for (int i = 0; i < table.length; i++) {
                if (flags[i] == null && result[i] < min ) {
                    min=result[i];
                    minindex=i;

                }
            }
            if (minindex!=10000){
                for (int i=0;i<table.length;i++){
                    temp=min+table[minindex][i];
                    if (temp<result[i]){
                        result[i]=temp;
                    }

                }
                flags[minindex]=true;
            }
        } while (minindex < 10000);

        System.out.println(Arrays.toString(result));


    }
}
