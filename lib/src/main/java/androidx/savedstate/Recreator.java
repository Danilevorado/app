package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import rb.f;
import rb.h;
import t0.c;
import t0.e;

/* loaded from: classes.dex */
public final class Recreator implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3812b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final e f3813a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public static final class b implements c.InterfaceC0188c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f3814a;

        public b(c cVar) {
            h.e(cVar, "registry");
            this.f3814a = new LinkedHashSet();
            cVar.h("androidx.savedstate.Restarter", this);
        }

        @Override // t0.c.InterfaceC0188c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f3814a));
            return bundle;
        }

        public final void b(String str) {
            h.e(str, "className");
            this.f3814a.add(str);
        }
    }

    public Recreator(e eVar) {
        h.e(eVar, "owner");
        this.f3813a = eVar;
    }

    private final void h(String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(c.a.class);
            h.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                    h.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((c.a) objNewInstance).a(this.f3813a);
                } catch (Exception e5) {
                    throw new RuntimeException("Failed to instantiate " + str, e5);
                }
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("Class " + str + " wasn't found", e11);
        }
    }

    @Override // androidx.lifecycle.l
    public void d(n nVar, j.b bVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h.e(nVar, "source");
        h.e(bVar, "event");
        if (bVar != j.b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        nVar.s().c(this);
        Bundle bundleB = this.f3813a.c().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
    }
}
