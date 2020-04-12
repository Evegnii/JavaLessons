package Lesson1;// Вопрос заданный на последнем интервью

public class QuestionFromGoogle {

    public static class Calculator {
        int num = 100;

        public void calc(int num) {
           this.num = num * 10;
        }

        public void printNum() {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.calc(2);
        obj.printNum();
    }
//    Варианты ответа были
////    1)20
////    2)100
////    3)1000
////    4)2
}
