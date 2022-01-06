package site.daipeng.java.tutorial.chapter10;

import java.util.AbstractList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * @author daipeng01
 * @desc
 * @date 2022/1/5 2:53 下午
 **/
public abstract class Basic {
    abstract void saySth();
    private void m1() {}
//    private abstract void m1a() {} 编译错误，private与abstract是冲突的
    protected abstract void m2a();
    public abstract void m3a();
}

abstract class SubBasic extends Basic {

}
 class SubBasic2 extends Basic {
     @Override
     void saySth() {

     }

     @Override
     protected void m2a() {

     }

     @Override
     public void m3a() {

     }
 }