/**
 * Created by ashokbance on 19/01/2017.
 */
public class Stars {

    public static void main(String[] args) {
        //StarsRightLightTop(5);
        StarsRightHeavyTop(5);
    }

    private static void StarsRightLightTop(int n) {

        for (int i=0; i<n; i++) {

            for (int j=0; j < n; j++) {
                if (j < n-i-1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    private static void StarsRightHeavyTop(int n) {

        for (int i=0; i<n; i++) {

            for (int j=0; j < n; j++) {
                if (j >= i) {
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


}
