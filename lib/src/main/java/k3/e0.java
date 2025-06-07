package k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public final class e0 extends dj implements g0 {
    e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // k3.g0
    public final void d() {
        L0(1, C());
    }

    @Override // k3.g0
    public final void q0(w2 w2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, w2Var);
        L0(2, parcelC);
    }
}
