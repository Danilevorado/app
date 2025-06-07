package d4;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes.dex */
public final class f0 implements GoogleApiClient.b, GoogleApiClient.c {

    /* renamed from: m, reason: collision with root package name */
    public final com.google.android.gms.common.api.a f22904m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f22905n;

    /* renamed from: o, reason: collision with root package name */
    private g0 f22906o;

    public f0(com.google.android.gms.common.api.a aVar, boolean z10) {
        this.f22904m = aVar;
        this.f22905n = z10;
    }

    private final g0 b() {
        e4.p.m(this.f22906o, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f22906o;
    }

    @Override // d4.d
    public final void C(int i10) {
        b().C(i10);
    }

    @Override // d4.d
    public final void L0(Bundle bundle) {
        b().L0(bundle);
    }

    public final void a(g0 g0Var) {
        this.f22906o = g0Var;
    }

    @Override // d4.g
    public final void w0(b4.b bVar) {
        b().p1(bVar, this.f22904m, this.f22905n);
    }
}
