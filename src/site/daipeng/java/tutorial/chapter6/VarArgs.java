package site.daipeng.java.tutorial.chapter6;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/19 12:36 上午
 **/


interface Mac{
    void playMusic(String name);
}


class A implements Mac {
    @Override
    public void playMusic(String name) {
        System.err.println(name);
    }
}






public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{47, (float) 3.14, 11.11});
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
}