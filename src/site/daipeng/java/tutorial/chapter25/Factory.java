package site.daipeng.java.tutorial.chapter25;

import com.sun.codemodel.internal.JCase;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/15 5:36 下午
 **/
public class Factory {

    public static LifeRoutine create(String name) {
        switch (name) {
            case "mingming":
                return new Mingming();
            case "chencheng":
                return new Chengcheng();
        }
        return null;
    }

    public static void main(String[] args) {

        LifeRoutine mingming = create("mingming");
        LifeRoutine chencheng = create("chencheng");
        mingming.startADay();
        chencheng.startADay();

    }

}
