package factory.course.abstractfactory;

import factory.course.ICourse;
import factory.course.PythonCourse;

/**
 * @author loda
 * @date 2019-03-08 13:05
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public ICourse course() {
        return new PythonCourse();
    }

    @Override
    public INote note() {
        return new PythonNote();
    }

    @Override
    public IVideo video() {
        return new PythonVideo();
    }
}
