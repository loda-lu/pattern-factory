package factory.myself.abstractfactory;

import factory.myself.IPhone;
import factory.myself.XiaoMiPhone;

/**
 * @author loda
 * @date 2019-03-08 14:54
 */
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public IPhone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public IPad CreatePad() {
        return new XiaoMiPad();
    }

    @Override
    public IComputer createComputer() {
        return new XiaoMiComputer();
    }
}
