package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.ll;
import l4.a;

/* loaded from: classes.dex */
public final class o0 extends dj implements q0 {
    o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // k3.q0
    public final void A() {
        L0(2, C());
    }

    @Override // k3.q0
    public final void B1(h4 h4Var) {
        Parcel parcelC = C();
        fj.d(parcelC, h4Var);
        L0(13, parcelC);
    }

    @Override // k3.q0
    public final boolean C1(c4 c4Var) {
        Parcel parcelC = C();
        fj.d(parcelC, c4Var);
        Parcel parcelW0 = w0(4, parcelC);
        boolean zG = fj.g(parcelW0);
        parcelW0.recycle();
        return zG;
    }

    @Override // k3.q0
    public final void C5(y0 y0Var) {
        Parcel parcelC = C();
        fj.f(parcelC, y0Var);
        L0(8, parcelC);
    }

    @Override // k3.q0
    public final void F3(boolean z10) {
        Parcel parcelC = C();
        int i10 = fj.f8294b;
        parcelC.writeInt(z10 ? 1 : 0);
        L0(34, parcelC);
    }

    @Override // k3.q0
    public final void O() {
        L0(6, C());
    }

    @Override // k3.q0
    public final void O2(c4 c4Var, g0 g0Var) {
        Parcel parcelC = C();
        fj.d(parcelC, c4Var);
        fj.f(parcelC, g0Var);
        L0(43, parcelC);
    }

    @Override // k3.q0
    public final void U0(d0 d0Var) {
        Parcel parcelC = C();
        fj.f(parcelC, d0Var);
        L0(7, parcelC);
    }

    @Override // k3.q0
    public final void U2(c2 c2Var) {
        Parcel parcelC = C();
        fj.f(parcelC, c2Var);
        L0(42, parcelC);
    }

    @Override // k3.q0
    public final void c2(n4 n4Var) {
        Parcel parcelC = C();
        fj.d(parcelC, n4Var);
        L0(39, parcelC);
    }

    @Override // k3.q0
    public final void f1(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        L0(44, parcelC);
    }

    @Override // k3.q0
    public final h4 h() {
        Parcel parcelW0 = w0(12, C());
        h4 h4Var = (h4) fj.a(parcelW0, h4.CREATOR);
        parcelW0.recycle();
        return h4Var;
    }

    @Override // k3.q0
    public final void h1(v3 v3Var) {
        Parcel parcelC = C();
        fj.d(parcelC, v3Var);
        L0(29, parcelC);
    }

    @Override // k3.q0
    public final void h3(a0 a0Var) {
        Parcel parcelC = C();
        fj.f(parcelC, a0Var);
        L0(20, parcelC);
    }

    @Override // k3.q0
    public final j2 k() {
        j2 h2Var;
        Parcel parcelW0 = w0(41, C());
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            h2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            h2Var = iInterfaceQueryLocalInterface instanceof j2 ? (j2) iInterfaceQueryLocalInterface : new h2(strongBinder);
        }
        parcelW0.recycle();
        return h2Var;
    }

    @Override // k3.q0
    public final m2 l() {
        m2 k2Var;
        Parcel parcelW0 = w0(26, C());
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            k2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            k2Var = iInterfaceQueryLocalInterface instanceof m2 ? (m2) iInterfaceQueryLocalInterface : new k2(strongBinder);
        }
        parcelW0.recycle();
        return k2Var;
    }

    @Override // k3.q0
    public final l4.a m() {
        Parcel parcelW0 = w0(1, C());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return aVarW0;
    }

    @Override // k3.q0
    public final void m4(ll llVar) {
        Parcel parcelC = C();
        fj.f(parcelC, llVar);
        L0(40, parcelC);
    }

    @Override // k3.q0
    public final void o0() {
        L0(5, C());
    }

    @Override // k3.q0
    public final String r() {
        Parcel parcelW0 = w0(31, C());
        String string = parcelW0.readString();
        parcelW0.recycle();
        return string;
    }

    @Override // k3.q0
    public final void r1(f1 f1Var) {
        Parcel parcelC = C();
        fj.f(parcelC, f1Var);
        L0(45, parcelC);
    }

    @Override // k3.q0
    public final void w5(boolean z10) {
        Parcel parcelC = C();
        int i10 = fj.f8294b;
        parcelC.writeInt(z10 ? 1 : 0);
        L0(22, parcelC);
    }
}
