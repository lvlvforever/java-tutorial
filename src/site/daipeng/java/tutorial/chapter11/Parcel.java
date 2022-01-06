package site.daipeng.java.tutorial.chapter11;

import com.sun.corba.se.spi.orbutil.fsm.FSMImpl;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/6 12:00 下午
 **/
interface Content{

}
public class Parcel {

    public Content sayName() {
        class ClassInMethod implements Content{ }
        ClassInMethod cim = new ClassInMethod();
        System.err.println(cim);
        Content content = null;
        if(true){
            class ClassInScope implements Content{ }
            content = new ClassInScope();
        }
        return content;
    }

    private class PContent implements Content {

    }
    public Content createContent() {
        return new PContent();
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        Content content = parcel.createContent();
    }
}
