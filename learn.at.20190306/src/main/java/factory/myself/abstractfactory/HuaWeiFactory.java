package factory.myself.abstractfactory;

import factory.myself.HuaWeiPhone;
import factory.myself.IPhone;

/**
 * @author loda
 * @date 2019-03-08 14:55
 */
public class HuaWeiFactory implements AbstractFactory {
    @Override
    public IPhone createPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public IPad CreatePad() {
        return new HuaWeiPad();
    }

    @Override
    public IComputer createComputer() {
        return new HuaWeiComputer();
    }
}
