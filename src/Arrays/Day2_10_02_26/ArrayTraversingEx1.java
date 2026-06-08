package Arrays.Day2_10_02_26;

public class ArrayTraversingEx1 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,4,5,6};

        //for loop
        System.out.println("Traversing Using for Loop:");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");

        //while loop
        System.out.println("Traversing Using while Loop:");
        int i=0;
        while(i<a.length){
            System.out.print(a[i]+" ");
            i++;
        }
        System.out.println("\n");

        //do-while
        System.out.println("Traversing Using do-while Loop:");
         i=0;
        do{
            System.out.print(a[i]+" ");
            i++;
        }while(i<a.length);

        System.out.println("\n");
        //for each
        System.out.println("Traversing Using for each loop: ");
        for(int ele : a){
            System.out.print(ele+ " ");
        }
    }
}
