package Strings;

public class SortWordByLength {
    public static void main(String[] args) {
        String str = "hello java how are you it is easy";
        String[] arr = str.split(" ");
        String newStr = "";
        bubbleSort(arr, arr.length);
        for(String ele : arr){
            newStr+=ele+" ";
        }
        System.out.println(newStr.trim());
    }
    public static void bubbleSort(String[] arr, int n){
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j].length()>arr[j+1].length()){
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
