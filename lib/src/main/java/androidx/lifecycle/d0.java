package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List f3110a = ib.j.e(Application.class, y.class);

    /* renamed from: b, reason: collision with root package name */
    private static final List f3111b = ib.i.b(y.class);

    public static final Constructor c(Class cls, List list) throws SecurityException {
        rb.h.e(cls, "modelClass");
        rb.h.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        rb.h.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            rb.h.d(parameterTypes, "constructor.parameterTypes");
            List listI = ib.f.i(parameterTypes);
            if (rb.h.a(list, listI)) {
                return constructor;
            }
            if (list.size() == listI.size() && listI.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final f0 d(Class cls, Constructor constructor, Object... objArr) {
        rb.h.e(cls, "modelClass");
        rb.h.e(constructor, "constructor");
        rb.h.e(objArr, "params");
        try {
            return (f0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Failed to access " + cls, e5);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e11.getCause());
        }
    }
}
