package s4;

import android.location.Location;

/* loaded from: classes.dex */
final class k extends v4.j {

    /* renamed from: m, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.d f26885m;

    k(com.google.android.gms.common.api.internal.d dVar) {
        this.f26885m = dVar;
    }

    @Override // v4.k
    public final synchronized void L1(Location location) {
        this.f26885m.c(new j(this, location));
    }

    public final synchronized void d() {
        this.f26885m.a();
    }
}
