import org.omg.Dynamic.Parameter;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class demo {
    public static void main(String[] args) throws NoSuchMethodException {

        Method method = Idemo.class.getMethod("take");

        Type type = method.getGenericReturnType();
        System.out.println(type);
        if (type instanceof ParameterizedType){

            ParameterizedType ptype=(ParameterizedType)type;
            Type[] types = ptype.getActualTypeArguments();
            Class domainClass = (Class) types[0];
            String name = domainClass.getName();
            System.out.println(name);


        }

    }
}
