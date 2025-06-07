package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.dw;
import com.google.android.gms.internal.ads.eu;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.tv;
import com.google.android.gms.internal.ads.wv;

/* loaded from: classes.dex */
public final class k0 extends dj implements m0 {
    k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // k3.m0
    public final void B3(String str, wv wvVar, tv tvVar) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        fj.f(parcelC, wvVar);
        fj.f(parcelC, tvVar);
        L0(5, parcelC);
    }

    @Override // k3.m0
    public final void G4(dw dwVar) {
        Parcel parcelC = C();
        fj.f(parcelC, dwVar);
        L0(10, parcelC);
    }

    @Override // k3.m0
    public final void Y3(eu euVar) {
        Parcel parcelC = C();
        fj.d(parcelC, euVar);
        L0(6, parcelC);
    }

    @Override // k3.m0
    public final j0 c() {
        j0 h0Var;
        Parcel parcelW0 = w0(1, C());
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            h0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            h0Var = iInterfaceQueryLocalInterface instanceof j0 ? (j0) iInterfaceQueryLocalInterface : new h0(strongBinder);
        }
        parcelW0.recycle();
        return h0Var;
    }

    @Override // k3.m0
    public final void l4(d0 d0Var) {
        Parcel parcelC = C();
        fj.f(parcelC, d0Var);
        L0(2, parcelC);
    }
}
