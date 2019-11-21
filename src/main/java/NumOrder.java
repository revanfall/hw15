import java.lang.reflect.Array;
import java.util.Arrays;

class NumOrder {

    void orderNumber(int x) throws NullPointerException {

        NumbersDrawn numDrawn = new NumbersDrawn();
        int[] numbers = Integer.toString(x).chars().map(i->i-'0').toArray();//разбиваю числа по разрядам
        System.out.println(Arrays.toString(numbers));


        if (numbers.length == 1) {
            for (int i = 0; i < 7; i++) {
                if (x == 1)
                    System.out.println(numDrawn.one(numbers[0])[i]);
                if (x == 2)
                    System.out.println(numDrawn.two(numbers[0])[i]);
                if (x == 3)
                    System.out.println(numDrawn.three(numbers[0])[i]);
                if (x == 4)
                    System.out.println(numDrawn.four(numbers[0])[i]);
                if (x == 5)
                    System.out.println(numDrawn.five(numbers[0])[i]);
                if (x == 6)
                    System.out.println(numDrawn.six(numbers[0])[i]);
                if (x == 7)
                    System.out.println(numDrawn.seven(numbers[0])[i]);
                if (x == 8)
                    System.out.println(numDrawn.eight(numbers[0])[i]);
                if (x == 9)
                    System.out.println(numDrawn.nine(numbers[0])[i]);
                if (x == 0)
                    System.out.println(numDrawn.zero(numbers[0])[i]);
            }
        }
     else if(numbers.length==2){
        for (int i = 0; i < 7; i++) {
            if (numbers[0] == 1)
                System.out.println(numDrawn.one(numbers[0])[i]
                        + numDrawn.one(numbers[1])[i]
                        + numDrawn.two(numbers[1])[i]
                        + numDrawn.three(numbers[1])[i]
                        + numDrawn.four(numbers[1])[i]
                        + numDrawn.five(numbers[1])[i]
                        + numDrawn.six(numbers[1])[i]
                        + numDrawn.seven(numbers[1])[i]
                        + numDrawn.eight(numbers[1])[i]
                        + numDrawn.nine(numbers[1])[i]
                        + numDrawn.zero(numbers[1])[i]);
            if (numbers[0] == 2)
                System.out.println(numDrawn.two(numbers[0])[i]
                        + numDrawn.one(numbers[1])[i]
                        + numDrawn.two(numbers[1])[i]
                        + numDrawn.three(numbers[1])[i]
                        + numDrawn.four(numbers[1])[i]
                        + numDrawn.five(numbers[1])[i]
                        + numDrawn.six(numbers[1])[i]
                        + numDrawn.seven(numbers[1])[i]
                        + numDrawn.eight(numbers[1])[i]
                        + numDrawn.nine(numbers[1])[i]
                        + numDrawn.zero(numbers[1])[i]);
            if (numbers[0] == 3)
                System.out.println(numDrawn.three(numbers[0])[i]
                        + numDrawn.one(numbers[1])[i]
                        + numDrawn.two(numbers[1])[i]
                        + numDrawn.three(numbers[1])[i]
                        + numDrawn.four(numbers[1])[i]
                        + numDrawn.five(numbers[1])[i]
                        + numDrawn.six(numbers[1])[i]
                        + numDrawn.seven(numbers[1])[i]
                        + numDrawn.eight(numbers[1])[i]
                        + numDrawn.nine(numbers[1])[i]
                        + numDrawn.zero(numbers[1])[i]);
            if (numbers[0] == 4)
                System.out.println(numDrawn.four(numbers[0])[i]
                        + numDrawn.one(numbers[1])[i]
                        + numDrawn.two(numbers[1])[i]
                        + numDrawn.three(numbers[1])[i]
                        + numDrawn.four(numbers[1])[i]
                        + numDrawn.five(numbers[1])[i]
                        + numDrawn.six(numbers[1])[i]
                        + numDrawn.seven(numbers[1])[i]
                        + numDrawn.eight(numbers[1])[i]
                        + numDrawn.nine(numbers[1])[i]
                        + numDrawn.zero(numbers[1])[i]);
            if (numbers[0] == 5)
                System.out.println(numDrawn.five(numbers[0])[i]
                        + numDrawn.one(numbers[1])[i]
                        + numDrawn.two(numbers[1])[i]
                        + numDrawn.three(numbers[1])[i]
                        + numDrawn.four(numbers[1])[i]
                        + numDrawn.five(numbers[1])[i]
                        + numDrawn.six(numbers[1])[i]
                        + numDrawn.seven(numbers[1])[i]
                        + numDrawn.eight(numbers[1])[i]
                        + numDrawn.nine(numbers[1])[i]
                        + numDrawn.zero(numbers[1])[i]);
            if (numbers[0] == 6)
                System.out.println(numDrawn.six(numbers[0])[i]
                        + numDrawn.one(numbers[1])[i]
                        + numDrawn.two(numbers[1])[i]
                        + numDrawn.three(numbers[1])[i]
                        + numDrawn.four(numbers[1])[i]
                        + numDrawn.five(numbers[1])[i]
                        + numDrawn.six(numbers[1])[i]
                        + numDrawn.seven(numbers[1])[i]
                        + numDrawn.eight(numbers[1])[i]
                        + numDrawn.nine(numbers[1])[i]
                        + numDrawn.zero(numbers[1])[i]);
            if (numbers[0] == 7)
                System.out.println(numDrawn.seven(numbers[0])[i]
                        + numDrawn.one(numbers[1])[i]
                        + numDrawn.two(numbers[1])[i]
                        + numDrawn.three(numbers[1])[i]
                        + numDrawn.four(numbers[1])[i]
                        + numDrawn.five(numbers[1])[i]
                        + numDrawn.six(numbers[1])[i]
                        + numDrawn.seven(numbers[1])[i]
                        + numDrawn.eight(numbers[1])[i]
                        + numDrawn.nine(numbers[1])[i]
                        + numDrawn.zero(numbers[1])[i]);
            if (numbers[0] == 8)
                System.out.println(numDrawn.eight(numbers[0])[i]
                        + numDrawn.one(numbers[1])[i]
                        + numDrawn.two(numbers[1])[i]
                        + numDrawn.three(numbers[1])[i]
                        + numDrawn.four(numbers[1])[i]
                        + numDrawn.five(numbers[1])[i]
                        + numDrawn.six(numbers[1])[i]
                        + numDrawn.seven(numbers[1])[i]
                        + numDrawn.eight(numbers[1])[i]
                        + numDrawn.nine(numbers[1])[i]
                        + numDrawn.zero(numbers[1])[i]);
            if (numbers[0] == 9)
                System.out.println(numDrawn.nine(numbers[0])[i]
                        + numDrawn.one(numbers[1])[i]
                        + numDrawn.two(numbers[1])[i]
                        + numDrawn.three(numbers[1])[i]
                        + numDrawn.four(numbers[1])[i]
                        + numDrawn.five(numbers[1])[i]
                        + numDrawn.six(numbers[1])[i]
                        + numDrawn.seven(numbers[1])[i]
                        + numDrawn.eight(numbers[1])[i]
                        + numDrawn.nine(numbers[1])[i]
                        + numDrawn.zero(numbers[1])[i]);
        }
    }
}
}



