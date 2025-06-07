package d4;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
final class l0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f22915m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f22916n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ m0 f22917o;

    l0(m0 m0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f22917o = m0Var;
        this.f22915m = lifecycleCallback;
        this.f22916n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        m0 m0Var = this.f22917o;
        if (m0Var.f22920o0 > 0) {
            LifecycleCallback lifecycleCallback = this.f22915m;
            if (m0Var.f22921p0 != null) {
                bundle = m0Var.f22921p0.getBundle(this.f22916n);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f22917o.f22920o0 >= 2) {
            this.f22915m.j();
        }
        if (this.f22917o.f22920o0 >= 3) {
            this.f22915m.h();
        }
        if (this.f22917o.f22920o0 >= 4) {
            this.f22915m.k();
        }
        if (this.f22917o.f22920o0 >= 5) {
            this.f22915m.g();
        }
    }
}
