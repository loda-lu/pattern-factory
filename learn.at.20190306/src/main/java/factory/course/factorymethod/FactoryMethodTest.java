package factory.course.factorymethod;

import factory.course.ICourse;

/**
 * @author loda
 * @date 2019-03-08 12:57
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        Coursefactory coursefactory = new JavaCourseFactory();
        ICourse javaCourse = coursefactory.create();
        javaCourse.create();

        coursefactory = new PythonCourseFactory();
        ICourse pythonCourse = coursefactory.create();
        pythonCourse.create();
    }
}
