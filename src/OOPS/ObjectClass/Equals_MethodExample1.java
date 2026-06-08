package OOPS.ObjectClass;
class Instagram implements Cloneable{
    String userName;
    String bio;
    int follower;
    int following;

    public Instagram(String userName, String bio, int follower, int following) {
        this.userName = userName;
        this.bio = bio;
        this.follower = follower;
        this.following = following;
    }

    @Override
    public String toString() {
        return "Instagram{" +
                "userName='" + userName + '\'' +
                ", bio='" + bio + '\'' +
                ", follower=" + follower +
                ", following=" + following +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public boolean equals(Object obj){
        Instagram obj2 = (Instagram)obj;
        if(this.userName.equals(obj2.userName) && this.bio.equals(obj2.bio)
                && this.follower==obj2.follower && this.following==obj2.following){
            return true;
        }
        return false;
    }
}
public class Equals_MethodExample1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Instagram obj = new Instagram("Ramesh","busy day",237,400);
        System.out.println(obj);
        Instagram obj1 = new Instagram("Suresh","busy day",237,400);
        System.out.println(obj1);

        System.out.println("-----Original obj-----");
        System.out.println(obj);
        System.out.println("-------Clone obj------");
        Instagram clone = (Instagram)obj.clone();
        System.out.println(clone);

        System.out.println(obj.equals(obj1));
    }
}
