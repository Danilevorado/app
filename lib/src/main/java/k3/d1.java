package k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public final class d1 extends dj implements f1 {
    d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // k3.f1
    public final void I0(w2 w2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, w2Var);
        L0(1, parcelC);
    }

    @Override // k3.f1
    public final void b() {
        L0(5, C());
    }

    @Override // k3.f1
    public final void c() {
        L0(4, C());
    }

    @Override // k3.f1
    public final void d() {
        L0(3, C());
    }

    @Override // k3.f1
    public final void e() {
        L0(2, C());
    }
}
