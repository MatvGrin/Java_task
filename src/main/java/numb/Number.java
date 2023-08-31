package numb;

public class Number {
    private int[] array;


    public Number(int[] array) {
        this.array = array;
    }

    public void startAndEnd(int start, int end){
        int temp = 0;
        int len = 0;
        for (int i : array) {
            if (i >= start && i <= end){
                temp += i;
                len++;
            }
        }
        int rez = temp / len;
        System.out.println(rez);
    }

    public int elementsOfArithmeticProgression(){
        int d = array[1] - array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i+1] - array[i] != d){
                return 0;
            }
        }
        return d;
    }

    public int elementsOfGeometricProgression(){
        int b = array[1] / array[0];
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]*b != array[i+1]){
                return 0;
            }
        }
        return b;
    }

    public int positiveAndNegativeNumbers(){
        System.out.print("Positive and negative numbers: ");
        boolean temp = array[0] > 0;
        for (int i = 0; i < array.length; i++) {
            if (temp) {
                if (array[i] < 0) return i;
                temp = false;
            } else {
                if (array[i] > 0) return i;
                temp = true;
            }
        }
        return 0;
    }

    public void minimalElementAmongAllElements(){
        int min = array[1];
        for (int i = 3; i < array.length; i+=2) {
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public void theMinimumOfTheLocalMaxima(){
        int min = -1;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i-1] && array[i] > array[i+1]){
                min = array[i];
                break;
            }
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i-1] && array[i] > array[i+1]){
                if (min > array[i]){
                    min = array[i];
                }
            }
        }
        System.out.println(min);
    }


}
