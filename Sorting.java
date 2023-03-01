import java.util.Scanner;
public class Sorting {
        public static void main(String [] args){
            Scanner scan = new Scanner(System.in);
            System.out.print("Введіть кількість елементів в масиві:");
            int length = scan.nextInt();
            int [] array = new int[length];

            for(int i = 0, num = 1; i < array.length; i++, num++){
                System.out.print("Введіть "+ num + " елемент:");
                array[i] = scan.nextInt();
            }
            for (int i = 0; i < array.length - 1; i++) {

                for (int y = array.length - 1; y > i; y--) {
                    if (array[y - 1] > array[y]) {
                        int x = array[y - 1];
                        array[y - 1] = array[y];
                        array[y] = x;
                    }}}
            for(int i = 0, num = 1; i < array.length; i++, num++){
                System.out.println(num + "-й елемент:" + array[i]);
            }


        }}

