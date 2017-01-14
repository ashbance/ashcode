/**
 * Created by ashokbance on 13/01/2017.
 */
public class Shaan {


    /*
       --------
       |5 | 6 |     is 56 + 78 + 57 + 68
       --------        so think of numbers that add upto 200.
       |7 | 8 |
       --------

     */



    public static void main(String[] args) {
        calculateSquares(200);

    }

    public static void calculateSquares(int answer) {


        for (int a = 1; a < 10; a++) {

            for (int b = 1; b < 10; b++) {

                for (int c = 1; c < 10; c++) {

                    for (int d = 1; d < 10; d++) {

                        if (20*a + 11*b + 11*c + 2*d == answer) {
                            System.out.println("a =" + a);
                            System.out.println("b =" + b);
                            System.out.println("c =" + c);
                            System.out.println("d =" + d);
                            System.out.println(" ====================== ");
                        }

                    }

                }

            }
        }
    }
}
