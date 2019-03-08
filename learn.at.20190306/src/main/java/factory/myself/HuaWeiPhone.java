package factory.myself;

/**
 * @author loda
 * @date 2019-03-08 14:29
 */
public class HuaWeiPhone implements IPhone {
    @Override
    public void call() {
        System.out.println("Call By Hua Wei Phone!");
    }
}
