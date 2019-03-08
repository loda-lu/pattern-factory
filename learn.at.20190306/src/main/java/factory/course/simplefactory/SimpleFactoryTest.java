package factory.course.simplefactory;

import factory.course.ICourse;
import factory.course.PythonCourse;

/**
 * @author loda
 * @date 2019-03-08 12:41
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        /*
        SimpleFactoryTest simpleFactory = new SimpleFactoryTest();
        ICourse course = simpleFactory.create("java");
        course.create();
        */
        /*
        SimpleFactoryTest simpleFactory = new SimpleFactoryTest();
        ICourse course = simpleFactory.create("factory.course.JavaCourse");
        course.create();
        */
        SimpleFactory simpleFactory = new SimpleFactory();
        ICourse course = simpleFactory.create(PythonCourse.class);
        course.create();
    }
}
