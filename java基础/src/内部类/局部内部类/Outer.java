package 内部类.局部内部类;

public class Outer {
    private int num = 10;

    public void method() {
        int num2 = 20;
        class Inner {
            public void show() {
                System.out.println("num = " + num);
                System.out.println("num2 = " + num2);
            }
        }
        Inner i = new Inner();
        i.show();

    }

}
