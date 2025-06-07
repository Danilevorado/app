package s4;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final s f26886a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f26887b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26888c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Map f26889d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f26890e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map f26891f = new HashMap();

    public l(Context context, s sVar) {
        this.f26887b = context;
        this.f26886a = sVar;
    }

    public final Location a(String str) {
        ((w) this.f26886a).f26911a.v();
        return ((w) this.f26886a).a().U(str);
    }

    public final Location b() {
        ((w) this.f26886a).f26911a.v();
        return ((w) this.f26886a).a().n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(LocationRequest locationRequest, com.google.android.gms.common.api.internal.d dVar, g gVar) {
        k kVar;
        k kVar2;
        ((w) this.f26886a).f26911a.v();
        d.a aVarB = dVar.b();
        if (aVarB == null) {
            kVar2 = null;
        } else {
            synchronized (this.f26889d) {
                kVar = (k) this.f26889d.get(aVarB);
                if (kVar == null) {
                    kVar = new k(dVar);
                }
                this.f26889d.put(aVarB, kVar);
            }
            kVar2 = kVar;
        }
        if (kVar2 == null) {
            return;
        }
        ((w) this.f26886a).a().c4(new q(1, o.f(null, locationRequest), kVar2, null, null, gVar));
    }

    public final void d(d.a aVar, g gVar) {
        ((w) this.f26886a).f26911a.v();
        e4.p.m(aVar, "Invalid null listener key");
        synchronized (this.f26889d) {
            k kVar = (k) this.f26889d.remove(aVar);
            if (kVar != null) {
                kVar.d();
                ((w) this.f26886a).a().c4(q.f(kVar, gVar));
            }
        }
    }

    public final void e(boolean z10) {
        ((w) this.f26886a).f26911a.v();
        ((w) this.f26886a).a().K0(z10);
        this.f26888c = z10;
    }

    public final void f() {
        synchronized (this.f26889d) {
            for (k kVar : this.f26889d.values()) {
                if (kVar != null) {
                    ((w) this.f26886a).a().c4(q.f(kVar, null));
                }
            }
            this.f26889d.clear();
        }
        synchronized (this.f26891f) {
            Iterator it = this.f26891f.values().iterator();
            while (it.hasNext()) {
                a5.a.a(it.next());
            }
            this.f26891f.clear();
        }
        synchronized (this.f26890e) {
            Iterator it2 = this.f26890e.values().iterator();
            while (it2.hasNext()) {
                a5.a.a(it2.next());
            }
            this.f26890e.clear();
        }
    }

    public final void g() {
        if (this.f26888c) {
            e(false);
        }
    }
}
