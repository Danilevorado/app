package k3;

import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.ze0;

/* loaded from: classes.dex */
final class h3 extends i0 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ i3 f24650m;

    /* synthetic */ h3(i3 i3Var, g3 g3Var) {
        this.f24650m = i3Var;
    }

    @Override // k3.j0
    public final void E3(c4 c4Var) {
        m5(c4Var, 1);
    }

    @Override // k3.j0
    public final String c() {
        return null;
    }

    @Override // k3.j0
    public final String e() {
        return null;
    }

    @Override // k3.j0
    public final boolean i() {
        return false;
    }

    @Override // k3.j0
    public final void m5(c4 c4Var, int i10) {
        ze0.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        se0.f15201b.post(new f3(this));
    }
}
