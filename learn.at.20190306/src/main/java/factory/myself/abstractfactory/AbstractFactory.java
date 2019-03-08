package factory.myself.abstractfactory;

import factory.myself.IPhone;

/**
 * @author loda
 * @date 2019-03-08 14:47
 */
public interface AbstractFactory {

    public IPhone createPhone();

    public IPad CreatePad();

    public IComputer createComputer();
}
