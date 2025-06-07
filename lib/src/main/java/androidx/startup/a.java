package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x0.b;
import x0.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f3815d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f3816e = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Context f3819c;

    /* renamed from: b, reason: collision with root package name */
    final Set f3818b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    final Map f3817a = new HashMap();

    a(Context context) {
        this.f3819c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object objCreate;
        if (y0.a.d()) {
            try {
                y0.a.a(cls.getSimpleName());
            } finally {
                y0.a.b();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f3817a.containsKey(cls)) {
            objCreate = this.f3817a.get(cls);
        } else {
            set.add(cls);
            try {
                x0.a aVar = (x0.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listA = aVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.f3817a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objCreate = aVar.create(this.f3819c);
                set.remove(cls);
                this.f3817a.put(cls, objCreate);
            } catch (Throwable th) {
                throw new c(th);
            }
        }
        return objCreate;
    }

    public static a e(Context context) {
        if (f3815d == null) {
            synchronized (f3816e) {
                if (f3815d == null) {
                    f3815d = new a(context);
                }
            }
        }
        return f3815d;
    }

    void a() {
        try {
            try {
                y0.a.a("Startup");
                b(this.f3819c.getPackageManager().getProviderInfo(new ComponentName(this.f3819c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e5) {
                throw new c(e5);
            }
        } finally {
            y0.a.b();
        }
    }

    void b(Bundle bundle) throws ClassNotFoundException {
        String string = this.f3819c.getString(b.f28129a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (x0.a.class.isAssignableFrom(cls)) {
                            this.f3818b.add(cls);
                        }
                    }
                }
                Iterator it = this.f3818b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e5) {
                throw new c(e5);
            }
        }
    }

    Object c(Class cls) {
        Object objD;
        synchronized (f3816e) {
            objD = this.f3817a.get(cls);
            if (objD == null) {
                objD = d(cls, new HashSet());
            }
        }
        return objD;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f3818b.contains(cls);
    }
}
