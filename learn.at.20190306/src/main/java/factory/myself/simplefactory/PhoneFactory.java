package factory.myself.simplefactory;

import factory.myself.HuaWeiPhone;
import factory.myself.IPhone;
import factory.myself.XiaoMiPhone;

/**
 * @author loda
 * @date 2019-03-08 14:30
 */
public class PhoneFactory {

    public IPhone createByName(String name) {
        if("xiaomi".equals(name)) {
            return new XiaoMiPhone();
        } else if ("huawei".equals(name)){
            return new HuaWeiPhone();
        }

        return null;
    }

    public IPhone createByClassName(String className) {
       if(null != className && !"".equals(className)) {
           try {
               return (IPhone)Class.forName(className).newInstance();
           } catch (InstantiationException e) {
               e.printStackTrace();
           } catch (IllegalAccessException e) {
               e.printStackTrace();
           } catch (ClassNotFoundException e) {
               e.printStackTrace();
           }
       }

        return null;
    }

    public IPhone createByClass(Class clazz) {
        if(null != clazz){
            try {
                return (IPhone)clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
