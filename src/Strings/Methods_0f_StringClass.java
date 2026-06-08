package Strings;

class UserStringIndexOutOfBoundException extends RuntimeException {
    public UserStringIndexOutOfBoundException(String desc) {
        super(desc);
    }
}

class UserClassCastException extends RuntimeException {
    public UserClassCastException() {
        this("");
    }

    public UserClassCastException(String desc) {
        super(desc);
    }
}

class UserNullPointerException extends RuntimeException {
    public UserNullPointerException() {
        super();
    }

    public UserNullPointerException(String desc) {
        super(desc);
    }
}

final class UserString {
    private char[] value;

    public UserString() {
        this("");
    }

    public UserString(String str) {
        super();
        value = new char[str.length()];
        for (int i = 0; i < value.length; i++) {
            value[i] = str.charAt(i);
        }
    }

    public UserString(StringBuffer sb) {
        this(sb.toString());
    }

    public UserString(StringBuilder sb) {
        value = new char[sb.length()];
        for (int i = 0; i < value.length; i++) {
            value[i] = sb.charAt(i);
        }
    }

    public UserString(char[] arr) {
        value = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            value[i] = arr[i];
        }
    }

    @Override
    public String toString() {
        if (value.length == 0)
            return "";
        String rep = "";
        for (char ele : value) {
            rep += ele;
        }
        return rep;
    }

    public int length() {
        return value.length;
    }

    public boolean isEmpty() {
        return value.length == 0;
    }

    public char charAt(int index) {
        if (index < 0 || index >= value.length)
            throw new UserStringIndexOutOfBoundException("Wrong index");

        return value[index];
    }

    public UserString concat(UserString anotherStr) {
        UserString newStr = new UserString();
        char[] newArr = new char[this.value.length + anotherStr.length()];
        int index = 0;

        for (char ele : this.value) {
            newArr[index++] = ele;
        }
        for (int i = 0; i < anotherStr.length(); i++) {
            char ch = anotherStr.charAt(i);
            newArr[index++] = ch;
        }
        return new UserString(newArr);
    }

    public int codePointAt(int index) {
        if (index < 0 || index >= value.length)
            throw new UserStringIndexOutOfBoundException("Wrong index");
        return value[index];
    }

    public int codePointBefore(int index) {
        if (index < 1 || index > value.length)
            throw new UserStringIndexOutOfBoundException("Wrong index");
        return value[index - 1];
    }

    public int codePointCount(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > value.length || startIndex > endIndex)
            throw new IndexOutOfBoundsException
                    ("Range [" + startIndex + "," + endIndex + " out of bounds");
        return endIndex - startIndex;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof UserString))
            throw new UserClassCastException
                    ("Object cannot be castes to UserString");

        UserString anotherStr = (UserString) obj;
        if (this.value.length != anotherStr.length()) return false;

        for (int i = 0; i < this.value.length; i++) {
            if (this.value[i] != anotherStr.charAt(i))
                return false;
        }
        return true;
    }

    public UserString toUpperCase() {
        UserString newStr = new UserString();
        for (char ele : this.value) {
            if (ele >= 97 && ele <= 122) {
                char ch = (char) (ele - 32);
                String str = ch + "";
                newStr = newStr.concat(new UserString(str));
            } else {
                String str = ele + "";
                newStr = newStr.concat(new UserString(str));
            }
        }
        return newStr;
    }

    public UserString toLowerCase() {
        UserString newStr = new UserString();
        for (char ele : this.value) {
            if (ele >= 65 && ele <= 90) {
                char ch = (char) (ele + 32);
                String str = ch + "";
                newStr = newStr.concat(new UserString(str));
            } else {
                String str = ele + "";
                newStr = newStr.concat(new UserString(str));
            }
        }
        return newStr;
    }

    public boolean equalsIgnoreCase(UserString anotherStr) {
        if (anotherStr == null)
            throw new UserNullPointerException();
        if (this.value.length != anotherStr.length())
            return false;
        UserString str1 = anotherStr.toUpperCase();
        UserString str2 = this.toUpperCase();

        return str1.equals(str2);
    }

    public int indexOf(int asciiValue) {
        return indexOf(asciiValue, 0);
    }

    public int indexOf(int asciiValue, int startIndex) {
        if (startIndex < 0 || startIndex >= value.length) return -1;
        for (int i = startIndex; i < value.length; i++) {
            if (value[i] == (char) asciiValue) return i;
        }
        return -1;
    }

    public int lastIndexOf(int asciiValue) {
        return lastIndexOf(asciiValue, 0);
    }

    public int lastIndexOf(int asciiValue, int startIndex) {
        if (startIndex < 0 || startIndex >= value.length)
            return -1;
        for (int i = startIndex; i >= 0; i--)
            if (value[i] == asciiValue)
                return i;
        return -1;
    }
    public UserString replace(char oldChar,char newChar){
        UserString newStr = new UserString();
        for(int i=0;i<this.length();i++){
            char ch = this.charAt(i);
            if(ch==oldChar){
                newStr = newStr.concat(new UserString(newChar+""));
            }else{
                newStr = newStr.concat(new UserString(ch+""));
            }
        }
        return newStr;
    }
    public boolean startWith(String str){
       return startWith(str,0);
    }
    public boolean startWith(String str,int start){
        if(str==null)
            throw new UserNullPointerException("str is null");
        if(str.length()>(this.length()-start)) return false;
        for(int i=0;i<str.length();i++){
            if(this.charAt(i)!=str.charAt(i)) return false;
        }
        return true;
    }
    public boolean endsWith(UserString str){
        if(str == null)
            throw new NullPointerException("str is null");
        if(str.length()>this.length()) return false;
        for(int i=str.length()-1,j=this.length()-1;i>=0;i--,j--){
             if(str.charAt(i)!=this.charAt(j)) return false;
        }
        return true;
    }
    public int hashCode(){
        int hc = 0;
        for(int i=0; i<this.length();i++){
            hc+=this.charAt(i);
        }
        return hc;
    }
}

public class Methods_0f_StringClass {
    public static void main(String[] args) {
        /// 1.length();
//       UserString str = new UserString("Ramesh");
//        System.out.println("Length:- "+str.length());

        /// 2.isEmpty();
//        UserString str = new UserString();
//        System.out.println(str.isEmpty());
//        UserString str2 = new UserString("Ramesh");
//        System.out.println(str2.isEmpty());

        /// 3.charAt(int index);
//        UserString str = new UserString("Ramesh");
//        System.out.println(str.charAt(5));

        /// 4.codePointAt(int index);
//        UserString str = new UserString("Ramesh");
//        System.out.println(str.codePointAt(0));

        /// 5.codePointBefore(int index);
//        UserString str = new UserString("Ashish");
//        System.out.println(str.codePointBefore(1));

        /// 6.codePointCount(int startIndex, int endIndex);
//          UserString str = new UserString("Ramesh");
//          System.out.println(str.codePointCount(2,5));

        /// 7.equals(Object obj);
//        UserString str = new UserString("Ramesh");
//        UserString str1 = new UserString("Ramesh");
//        System.out.println(str.equals(str1));

        /// 8.equalsIgnoreCase(String str);
//           UserString str1 = new UserString("Ramesh");
//           UserString str2 = new UserString("RAMESH");
//           System.out.println(str1.equalsIgnoreCase(str2));

        /// 9.indexOf(int asciiValue);
//        UserString str1 = new UserString("madam");
//        System.out.println(str1.indexOf('m'));

        /// 10.indexOf(int asciiValue, int startIndex)
//         UserString str = new UserString("Ramesh");
//         System.out.println(str.indexOf('s',2));

        /// 11. lastIndexOf(int asciiValue);
//        UserString str = new UserString("RameshRamesh");
//        System.out.println(str.lastIndexOf('h'));

        ///  12.lastIndexOf(int asciiValue,int startIndex);
//        UserString str = new UserString("RameshRamesh");
//        System.out.println(str.lastIndexOf('h',6));

        /// 13.toUpperCase();
//        UserString str = new UserString("Ramesh");
//        System.out.println(str.toUpperCase());

        /// 14.toLowerCase();
//        UserString str = new UserString("Ramesh");
//        System.out.println(str.toLowerCase());

        /// 15.replace(char oldChar, char newChar);
//        UserString str = new UserString("Java");
//        System.out.println(str.replace('a','j'));

        /// 16.startWith(String str);
//        UserString str = new UserString("Ramesh");
//        System.out.println(str.startWith("Ram"));


        /// 17.startWith(String str, int start);
//        UserString str  = new UserString("Ramesh");
//        System.out.println(str.startWith("Ram",0));

        /// 18.endsWiths(UserString str)
//        UserString str = new UserString("Ramesh");
//        System.out.println(str.endsWith(new UserString("h")));
//        System.out.println(str.endsWith(new UserString("7")));

        /// 19.replaceAll(UserString str1, UserString str2)
//        UserString str = new UserString("Java is easy");
//        UserString str1 = new UserString("Java");
//        UserString str2 = new UserString("Java");
//        System.out.println(str.replaceAll(str1,str2));

        /// 20.hashCode();
        UserString str1 = new UserString("Java");
        UserString str2 = new UserString("code");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}

