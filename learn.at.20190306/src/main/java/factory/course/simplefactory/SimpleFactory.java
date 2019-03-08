package factory.course.simplefactory;

import factory.course.ICourse;

/**
 * @author loda
 * @date 2019-03-08 12:39
 */
public class SimpleFactory {
/*
    public ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        }
        return null;
    }
*/
/*
    public ICourse create(String className) {
        try {
            if (null != className && !("".equals(className))) {
                return (ICourse) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }
    */


    public ICourse create(Class clazz) {
        if(null != clazz){
            try {
                return (ICourse)clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
