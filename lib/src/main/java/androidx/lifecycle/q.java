package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static Map f3157a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Map f3158b = new HashMap();

    private static g a(Constructor constructor, Object obj) {
        try {
            return (g) constructor.newInstance(obj);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Constructor b(Class cls) throws NoSuchMethodException, SecurityException {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strC = c(canonicalName);
            if (!name.isEmpty()) {
                strC = name + "." + strC;
            }
            Constructor declaredConstructor = Class.forName(strC).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    private static int d(Class cls) throws NoSuchMethodException, SecurityException {
        Integer num = (Integer) f3157a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        f3157a.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private static boolean e(Class cls) {
        return cls != null && m.class.isAssignableFrom(cls);
    }

    static l f(Object obj) {
        boolean z10 = obj instanceof l;
        boolean z11 = obj instanceof f;
        if (z10 && z11) {
            return new FullLifecycleObserverAdapter((f) obj, (l) obj);
        }
        if (z11) {
            return new FullLifecycleObserverAdapter((f) obj, null);
        }
        if (z10) {
            return (l) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f3158b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a((Constructor) list.get(0), obj));
        }
        g[] gVarArr = new g[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            gVarArr[i10] = a((Constructor) list.get(i10), obj);
        }
        return new CompositeGeneratedAdaptersObserver(gVarArr);
    }

    private static int g(Class cls) throws NoSuchMethodException, SecurityException {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f3158b.put(cls, Collections.singletonList(constructorB));
            return 2;
        }
        if (b.f3097c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (e(superclass)) {
            if (d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList((Collection) f3158b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (e(cls2)) {
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll((Collection) f3158b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f3158b.put(cls, arrayList);
        return 2;
    }
}
