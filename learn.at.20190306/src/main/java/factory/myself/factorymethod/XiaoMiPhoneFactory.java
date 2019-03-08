package factory.myself.factorymethod;

import factory.myself.IPhone;
import factory.myself.XiaoMiPhone;

/**
 * @author loda
 * @date 2019-03-08 14:41
 */
public class XiaoMiPhoneFactory implements PhoneFactory {
    @Override
    public IPhone create() {
        return new XiaoMiPhone();
    }
}
