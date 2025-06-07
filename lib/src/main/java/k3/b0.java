package k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public final class b0 extends dj implements d0 {
    b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // k3.d0
    public final void H(int i10) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        L0(2, parcelC);
    }

    @Override // k3.d0
    public final void d() {
        L0(6, C());
    }

    @Override // k3.d0
    public final void f() {
        L0(1, C());
    }

    @Override // k3.d0
    public final void g() {
        L0(3, C());
    }

    @Override // k3.d0
    public final void h() {
        L0(7, C());
    }

    @Override // k3.d0
    public final void i() {
        L0(4, C());
    }

    @Override // k3.d0
    public final void j() {
        L0(5, C());
    }

    @Override // k3.d0
    public final void k() {
        L0(9, C());
    }

    @Override // k3.d0
    public final void y(w2 w2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, w2Var);
        L0(8, parcelC);
    }
}
