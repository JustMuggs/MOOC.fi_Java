
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    public static int smallest(int[] array){
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
    public static int indexOfSmallest(int[] array){
        int minIndex = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]==smallest(array)){
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int[] newArr = new int[table.length-startIndex];
        for (int i=0;i<table.length-startIndex;i++){
            newArr[i] = table[i+startIndex];
        }
        return indexOfSmallest(newArr)+startIndex;
    }
    public static void swap(int[] array, int index1, int index2){
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    public static void sort(int[] array){
        System.out.println(array);
        for(int i=0;i<array.length;i++){
            int min = indexOfSmallestFrom(array, i);
            if(array[i]!=array[min]){
                swap(array,i,min);
            }
            System.out.println(array);
        }
    }
}
