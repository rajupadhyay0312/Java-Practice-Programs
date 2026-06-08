package Strings;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String str = "LapataLadies";
        System.out.println("original str: "+str);
        char [] arr = str.toCharArray();
        int max = 0;
        char mostFreq =' ';
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
            if(max<cnt){
                max=cnt;
                mostFreq = arr[i];
            }
        }
        System.out.println("Most Frequent character: "+mostFreq);
        System.out.println("Frequency: "+max);
    }
}
