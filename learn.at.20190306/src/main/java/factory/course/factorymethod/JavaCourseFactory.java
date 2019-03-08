package factory.course.factorymethod;

import factory.course.ICourse;
import factory.course.JavaCourse;

/**
 * @author loda
 * @date 2019-03-08 12:56
 */
public class JavaCourseFactory implements Coursefactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
