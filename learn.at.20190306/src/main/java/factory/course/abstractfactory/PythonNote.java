package factory.course.abstractfactory;

/**
 * @author loda
 * @date 2019-03-08 13:03
 */
public class PythonNote implements INote {
    @Override
    public void create() {
        System.out.println("this is python note!");
    }
}
