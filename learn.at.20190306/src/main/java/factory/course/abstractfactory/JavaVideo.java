package factory.course.abstractfactory;

/**
 * @author loda
 * @date 2019-03-08 13:04
 */
public class JavaVideo implements IVideo {
    @Override
    public void create() {
        System.out.println("this is java video!");
    }
}
