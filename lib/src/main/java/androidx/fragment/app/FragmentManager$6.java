package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.j;

/* loaded from: classes.dex */
class FragmentManager$6 implements androidx.lifecycle.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2719a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f2720b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.j f2721c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m f2722d;

    @Override // androidx.lifecycle.l
    public void d(androidx.lifecycle.n nVar, j.b bVar) {
        Bundle bundle;
        if (bVar == j.b.ON_START && (bundle = (Bundle) this.f2722d.f2876j.get(this.f2719a)) != null) {
            this.f2720b.a(this.f2719a, bundle);
            this.f2722d.q(this.f2719a);
        }
        if (bVar == j.b.ON_DESTROY) {
            this.f2721c.c(this);
            this.f2722d.f2877k.remove(this.f2719a);
        }
    }
}
