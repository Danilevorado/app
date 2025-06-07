package k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public final class t1 extends dj implements w1 {
    t1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // k3.w1
    public final void P3(w2 w2Var) {
        Parcel parcelC = C();
        fj.d(parcelC, w2Var);
        L0(1, parcelC);
    }
}
