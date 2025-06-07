package com.onesignal;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class d2 {

    /* renamed from: a, reason: collision with root package name */
    private String f21858a;

    /* renamed from: b, reason: collision with root package name */
    private List f21859b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f21860c;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Method f21861m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f21862n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object f21863o;

        a(Method method, Object obj, Object obj2) {
            this.f21861m = method;
            this.f21862n = obj;
            this.f21863o = obj2;
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                this.f21861m.invoke(this.f21862n, this.f21863o);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e10) {
                e10.printStackTrace();
            }
        }
    }

    d2(String str, boolean z10) {
        this.f21858a = str;
        this.f21860c = z10;
    }

    void a(Object obj) {
        this.f21859b.add(new WeakReference(obj));
    }

    void b(Object obj) {
        this.f21859b.add(obj);
    }

    boolean c(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Iterator it = this.f21859b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof WeakReference) {
                next = ((WeakReference) next).get();
            }
            if (next != null) {
                try {
                    Method declaredMethod = next.getClass().getDeclaredMethod(this.f21858a, obj.getClass());
                    declaredMethod.setAccessible(true);
                    if (this.f21860c) {
                        p.f22194a.b(new a(declaredMethod, next, obj));
                    } else {
                        try {
                            declaredMethod.invoke(next, obj);
                        } catch (IllegalAccessException e5) {
                            e5.printStackTrace();
                        } catch (InvocationTargetException e10) {
                            e10.printStackTrace();
                        }
                    }
                    z10 = true;
                } catch (NoSuchMethodException e11) {
                    e11.printStackTrace();
                }
            }
        }
        return z10;
    }
}
