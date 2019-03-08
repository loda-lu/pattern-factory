package factory.course.abstractfactory;

import factory.course.ICourse;
import factory.course.JavaCourse;

/**
 * @author loda
 * @date 2019-03-08 13:04
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public ICourse course() {
        return new JavaCourse();
    }

    @Override
    public INote note() {
        return new JavaNote();
    }

    @Override
    public IVideo video() {
        return new JavaVideo();
    }
}
