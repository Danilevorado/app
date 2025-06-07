package t0;

import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import k.b;
import rb.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    private static final b f27116g = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private boolean f27118b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f27119c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27120d;

    /* renamed from: e, reason: collision with root package name */
    private Recreator.b f27121e;

    /* renamed from: a, reason: collision with root package name */
    private final k.b f27117a = new k.b();

    /* renamed from: f, reason: collision with root package name */
    private boolean f27122f = true;

    public interface a {
        void a(e eVar);
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(rb.f fVar) {
            this();
        }
    }

    /* renamed from: t0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0188c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(c cVar, n nVar, j.b bVar) {
        boolean z10;
        h.e(cVar, "this$0");
        h.e(nVar, "<anonymous parameter 0>");
        h.e(bVar, "event");
        if (bVar == j.b.ON_START) {
            z10 = true;
        } else if (bVar != j.b.ON_STOP) {
            return;
        } else {
            z10 = false;
        }
        cVar.f27122f = z10;
    }

    public final Bundle b(String str) {
        h.e(str, "key");
        if (!this.f27120d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f27119c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f27119c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f27119c;
        boolean z10 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z10 = true;
        }
        if (!z10) {
            this.f27119c = null;
        }
        return bundle2;
    }

    public final InterfaceC0188c c(String str) {
        h.e(str, "key");
        Iterator it = this.f27117a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            h.d(entry, "components");
            String str2 = (String) entry.getKey();
            InterfaceC0188c interfaceC0188c = (InterfaceC0188c) entry.getValue();
            if (h.a(str2, str)) {
                return interfaceC0188c;
            }
        }
        return null;
    }

    public final void e(j jVar) {
        h.e(jVar, "lifecycle");
        if (!(!this.f27118b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        jVar.a(new l() { // from class: t0.b
            @Override // androidx.lifecycle.l
            public final void d(n nVar, j.b bVar) {
                c.d(this.f27115a, nVar, bVar);
            }
        });
        this.f27118b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f27118b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f27120d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f27119c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f27120d = true;
    }

    public final void g(Bundle bundle) {
        h.e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f27119c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.d dVarH = this.f27117a.h();
        h.d(dVarH, "this.components.iteratorWithAdditions()");
        while (dVarH.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarH.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0188c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void h(String str, InterfaceC0188c interfaceC0188c) {
        h.e(str, "key");
        h.e(interfaceC0188c, "provider");
        if (!(((InterfaceC0188c) this.f27117a.l(str, interfaceC0188c)) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class cls) throws NoSuchMethodException, SecurityException {
        h.e(cls, "clazz");
        if (!this.f27122f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.f27121e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f27121e = bVar;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.b bVar2 = this.f27121e;
            if (bVar2 != null) {
                String name = cls.getName();
                h.d(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e5) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
        }
    }
}
