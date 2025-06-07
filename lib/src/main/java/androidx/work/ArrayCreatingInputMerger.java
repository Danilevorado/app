package androidx.work;

import androidx.work.b;
import b1.h;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends h {
    private final Object c(Object obj, Object obj2, Class cls) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance((Class<?>) cls, length + 1);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        Array.set(objNewInstance, length, obj2);
        rb.h.d(objNewInstance, "newArray");
        return objNewInstance;
    }

    private final Object d(Object obj, Object obj2) throws NegativeArraySizeException {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        rb.h.b(componentType);
        Object objNewInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        System.arraycopy(obj2, 0, objNewInstance, length, length2);
        rb.h.d(objNewInstance, "newArray");
        return objNewInstance;
    }

    private final Object e(Object obj, Class cls) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objNewInstance = Array.newInstance((Class<?>) cls, 1);
        Array.set(objNewInstance, 0, obj);
        rb.h.d(objNewInstance, "newArray");
        return objNewInstance;
    }

    @Override // b1.h
    public b b(List list) throws Throwable {
        rb.h.e(list, "inputs");
        b.a aVar = new b.a();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map mapJ = ((b) it.next()).j();
            rb.h.d(mapJ, "input.keyValueMap");
            for (Map.Entry entry : mapJ.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(str);
                rb.h.d(str, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (rb.h.a(cls2, cls)) {
                        rb.h.d(value, "value");
                        value = d(obj, value);
                    } else {
                        if (!rb.h.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        value = c(obj, value, cls);
                    }
                } else if (!cls.isArray()) {
                    value = e(value, cls);
                }
                rb.h.d(value, "if (existingValue == nul…      }\n                }");
                map.put(str, value);
            }
        }
        aVar.d(map);
        b bVarA = aVar.a();
        rb.h.d(bVarA, "output.build()");
        return bVarA;
    }
}
