package factory.course.abstractfactory;

import factory.course.ICourse;

/**
 * @author loda
 * @date 2019-03-08 12:59
 */
public interface CourseFactory {

    public ICourse course();

    public INote note();

    public IVideo video();
}
