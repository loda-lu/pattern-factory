package factory.myself.factorymethod;

import factory.myself.IPhone;

/**
 * @author loda
 * @date 2019-03-08 14:44
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        //create by Xiao Mi Factory
        PhoneFactory phoneFactory = new XiaoMiPhoneFactory();
        IPhone phone = phoneFactory.create();
        phone.call();
        //create by Hua Wei Factory
        phoneFactory = new HuaWeiPhoneFactory();
        phone = phoneFactory.create();
        phone.call();
    }
}
