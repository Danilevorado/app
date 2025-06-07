package d4;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
final class j0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f22907m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f22908n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ k0 f22909o;

    j0(k0 k0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f22909o = k0Var;
        this.f22907m = lifecycleCallback;
        this.f22908n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        k0 k0Var = this.f22909o;
        if (k0Var.f22912n > 0) {
            LifecycleCallback lifecycleCallback = this.f22907m;
            if (k0Var.f22913o != null) {
                bundle = k0Var.f22913o.getBundle(this.f22908n);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.f22909o.f22912n >= 2) {
            this.f22907m.j();
        }
        if (this.f22909o.f22912n >= 3) {
            this.f22907m.h();
        }
        if (this.f22909o.f22912n >= 4) {
            this.f22907m.k();
        }
        if (this.f22909o.f22912n >= 5) {
            this.f22907m.g();
        }
    }
}
