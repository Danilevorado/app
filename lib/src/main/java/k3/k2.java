package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public final class k2 extends dj implements m2 {
    k2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // k3.m2
    public final void O0(p2 p2Var) {
        Parcel parcelC = C();
        fj.f(parcelC, p2Var);
        L0(8, parcelC);
    }

    @Override // k3.m2
    public final float c() {
        throw null;
    }

    @Override // k3.m2
    public final float e() {
        throw null;
    }

    @Override // k3.m2
    public final float h() {
        throw null;
    }

    @Override // k3.m2
    public final p2 i() {
        p2 n2Var;
        Parcel parcelW0 = w0(11, C());
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            n2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            n2Var = iInterfaceQueryLocalInterface instanceof p2 ? (p2) iInterfaceQueryLocalInterface : new n2(strongBinder);
        }
        parcelW0.recycle();
        return n2Var;
    }
}
