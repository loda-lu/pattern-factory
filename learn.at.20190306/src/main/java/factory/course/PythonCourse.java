package factory.course;

/**
 * @author loda
 * @date 2019-03-08 12:38
 */
public class PythonCourse implements ICourse {
    @Override
    public void create() {
        System.out.println("this is python!");
    }
}
