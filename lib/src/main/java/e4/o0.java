package e4;

import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes.dex */
abstract class o0 extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f23211d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f23212e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f23213f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected o0(c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f23213f = cVar;
        this.f23211d = i10;
        this.f23212e = bundle;
    }

    @Override // e4.z0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f23211d != 0) {
            this.f23213f.m0(1, null);
            Bundle bundle = this.f23212e;
            f(new b4.b(this.f23211d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f23213f.m0(1, null);
            f(new b4.b(8, null));
        }
    }

    @Override // e4.z0
    protected final void b() {
    }

    protected abstract void f(b4.b bVar);

    protected abstract boolean g();
}
