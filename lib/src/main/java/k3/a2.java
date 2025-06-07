package k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public final class a2 extends dj implements c2 {
    a2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // k3.c2
    public final void F2(j4 j4Var) {
        Parcel parcelC = C();
        fj.d(parcelC, j4Var);
        L0(1, parcelC);
    }
}
