package factory.course.abstractfactory;

/**
 * @author loda
 * @date 2019-03-08 13:10
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        CourseFactory abstractFactory = new JavaCourseFactory();
        abstractFactory.course().create();
        abstractFactory.note().create();
        abstractFactory.video().create();

        abstractFactory = new PythonCourseFactory();
        abstractFactory.course().create();
        abstractFactory.note().create();
        abstractFactory.video().create();
    }
}
