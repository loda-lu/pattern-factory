package factory.myself.abstractfactory;

/**
 * @author loda
 * @date 2019-03-08 14:57
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        //Create By Hua Wei Factory
        AbstractFactory huaWeiFactory = new HuaWeiFactory();
        huaWeiFactory.createPhone().call();
        huaWeiFactory.CreatePad().play();
        huaWeiFactory.createComputer().play();
        //Create By Xiao Mi Factory
        AbstractFactory xiaoMiFactory = new XiaoMiFactory();
        xiaoMiFactory.createPhone().call();
        xiaoMiFactory.CreatePad().play();
        xiaoMiFactory.createComputer().play();
    }
}
