package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final q.g f2854a = new q.g();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        q.g gVar = f2854a;
        q.g gVar2 = (q.g) gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new q.g();
            gVar.put(classLoader, gVar2);
        }
        Class cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e5) {
            throw new Fragment.f("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e5);
        } catch (ClassNotFoundException e10) {
            throw new Fragment.f("Unable to instantiate fragment " + str + ": make sure class name exists", e10);
        }
    }

    public abstract Fragment a(ClassLoader classLoader, String str);
}
