package factory.myself.simplefactory;

import factory.myself.IPhone;
import factory.myself.XiaoMiPhone;

/**
 * @author loda
 * @date 2019-03-08 14:32
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        //create phone by name
        PhoneFactory phoneFactory = new PhoneFactory();
        IPhone phone = phoneFactory.createByName("xiaomi");
        phone.call();
        //create phone by class name
        phoneFactory = new PhoneFactory();
        phone = phoneFactory.createByClassName("factory.myself.HuaWeiPhone");
        phone.call();
        //create phone by name
        phoneFactory = new PhoneFactory();
        phone = phoneFactory.createByClass(XiaoMiPhone.class);
        phone.call();
    }
}
