/**
 * オーバーロードの例。これはポリモーフィズムではありません。
 */
public class Overload {
    public void demo(int a){
        System.out.println("a = " + a);
    }

    public void demo(int a, int b){
        System.out.println("a = " + a + ", b = " + b);
    }

    public void demo(double a){
        System.out.println("a = " + a);
    }

    public static void main(String[] args){
        Overload obj = new Overload();
        obj.demo(10);
        obj.demo(10, 20);
        obj.demo(3.14);
    }
}
