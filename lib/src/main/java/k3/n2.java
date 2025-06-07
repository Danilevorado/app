package k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public final class n2 extends dj implements p2 {
    n2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // k3.p2
    public final void B0(boolean z10) {
        Parcel parcelC = C();
        int i10 = fj.f8294b;
        parcelC.writeInt(z10 ? 1 : 0);
        L0(5, parcelC);
    }

    @Override // k3.p2
    public final void c() {
        L0(4, C());
    }

    @Override // k3.p2
    public final void g() {
        L0(2, C());
    }

    @Override // k3.p2
    public final void h() {
        L0(3, C());
    }

    @Override // k3.p2
    public final void i() {
        L0(1, C());
    }
}
