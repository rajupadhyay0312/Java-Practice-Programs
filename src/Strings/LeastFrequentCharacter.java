package Strings;

public class LeastFrequentCharacter{
    public static void main(String[] args) {
        String str = "LapataLadies";
        System.out.println("original str: "+str);
        char [] arr = str.toCharArray();
        int min = Integer.MAX_VALUE;
        char leastFreq =' ';
        boolean[] b = new boolean[arr.length];
        for( int i=0;i<arr.length; i++){
            if(b[i]) continue;
            int cnt = 1;
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                    b[j]=true;
                }
            }
            if(min>cnt){
                min=cnt;
                leastFreq = arr[i];
            }
        }
        System.out.println("Most Frequent character: "+leastFreq);
        System.out.println("Frequency: "+min);
    }
}
