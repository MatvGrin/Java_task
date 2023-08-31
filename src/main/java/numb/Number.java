package numb;

public class Number {
    private int[] array;


    public Number(int[] array) {
        this.array = array;
    }

//    private int avarice(int num){
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i+1;
//        }
//        return ;
//    }
//
    public void startAndEnd(int start, int end){
        int temp = 0;
        for (int i : array) {
            if (i >= start && i <= end){
                temp++;
            }
        }
    }



}
