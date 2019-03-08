package factory.course.abstractfactory;

/**
 * @author loda
 * @date 2019-03-08 13:07
 */
public class JavaNote implements INote {
    @Override
    public void create() {
        System.out.println("this is java note!");
    }
}
