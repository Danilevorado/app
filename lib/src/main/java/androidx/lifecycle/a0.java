package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import t0.c;

/* loaded from: classes.dex */
public final class a0 implements c.InterfaceC0188c {

    /* renamed from: a, reason: collision with root package name */
    private final t0.c f3092a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3093b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f3094c;

    /* renamed from: d, reason: collision with root package name */
    private final hb.f f3095d;

    static final class a extends rb.i implements qb.a {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ k0 f3096n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k0 k0Var) {
            super(0);
            this.f3096n = k0Var;
        }

        @Override // qb.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final b0 a() {
            return z.e(this.f3096n);
        }
    }

    public a0(t0.c cVar, k0 k0Var) {
        rb.h.e(cVar, "savedStateRegistry");
        rb.h.e(k0Var, "viewModelStoreOwner");
        this.f3092a = cVar;
        this.f3095d = hb.h.a(new a(k0Var));
    }

    private final b0 c() {
        return (b0) this.f3095d.getValue();
    }

    @Override // t0.c.InterfaceC0188c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3094c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((y) entry.getValue()).d().a();
            if (!rb.h.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f3093b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        rb.h.e(str, "key");
        d();
        Bundle bundle = this.f3094c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f3094c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f3094c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f3094c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f3093b) {
            return;
        }
        this.f3094c = this.f3092a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.f3093b = true;
        c();
    }
}
