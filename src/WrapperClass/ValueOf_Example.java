package WrapperClass;

public class ValueOf_Example {
    public static void main(String[] args) {
        int num = 123234;
        System.out.println("Decimal: "+num);

        String bin = Integer.toBinaryString(num);
        System.out.println("Binary: "+bin);

        String oct = Integer.toOctalString(num);
        System.out.println("Octal: "+oct);

        String hex = Integer.toHexString(num);
        System.out.println("Hex: "+hex);

        int binNum = Integer.valueOf(bin,2);
        System.out.println("Bin conv num: "+binNum);

        int octNum = Integer.valueOf(oct,8);
        System.out.println("Oct conv num: "+octNum);

        int hexNum = Integer.valueOf(hex,16);
        System.out.println("Hex conv num: "+hexNum);
    }
}
