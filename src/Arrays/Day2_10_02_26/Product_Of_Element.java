package Arrays.Day2_10_02_26;

public class Product_Of_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int prod = 1;
        for(int ele : arr){
            prod*=ele;
        }
        System.out.println("Product : "+prod);
    }
}
