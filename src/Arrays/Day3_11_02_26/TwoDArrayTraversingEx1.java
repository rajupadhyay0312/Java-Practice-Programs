package Arrays.Day3_11_02_26;

public class TwoDArrayTraversingEx1 {
    public static void main(String[] args) {
        char[][] a = {{'a', 'b'}, {'c', 'd', 'e', 'f'}, {'g'}, {'h', 'i'}};

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
        }
    }
}

