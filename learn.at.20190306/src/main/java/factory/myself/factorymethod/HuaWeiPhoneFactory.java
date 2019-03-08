package factory.myself.factorymethod;

import factory.myself.HuaWeiPhone;
import factory.myself.IPhone;

/**
 * @author loda
 * @date 2019-03-08 14:42
 */
public class HuaWeiPhoneFactory implements PhoneFactory {
    @Override
    public IPhone create() {
        return new HuaWeiPhone();
    }
}
