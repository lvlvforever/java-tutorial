package site.daipeng.java.tutorial.chapter13;

/**
 * @author daipeng01
 * @desc
 * @date 2021/12/16 11:40 下午
 **/
class Device{
    String name(){
        return "device";
    }
}

class Mac extends Device{
     String playMusic(){
        return "Mac play music";
    }
}

class SilverMac extends Mac{

}

interface MakeString{
    String make();
}

interface Computer{
    String transform(Mac mac);
}
interface Computer2{
    String transform(String s);
}

public class UnboundMethodReference {

    public static void main(String[] args) {
//        MakeString makeString = Mac::playMusic; //编译错误，提示这里需要使用static方法，因为类名::实例方法名需要存在实例才可以调用。
        Computer computer = Mac::playMusic; //这里怎么就可以了呢？接口方法第一个参数是类名
//        Computer2 computer2 = Mac::playMusic; //假如第一个参数不是Mac，则不能赋值
//        Computer computer3 = SilverMac::playMusic;//SilverMac::playMusic需要的SilverMac实例
        Computer computer4 = Device::name; //Device::name需要的是Device实例，而Mac的实例是Device实例，继承关系

        Mac mac = new Mac();
        System.err.println(computer.transform(mac));
        System.err.println(mac.playMusic());
    }

}
