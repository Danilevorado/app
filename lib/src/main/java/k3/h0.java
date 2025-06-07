package k3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public final class h0 extends dj implements j0 {
    h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // k3.j0
    public final void E3(c4 c4Var) {
        Parcel parcelC = C();
        fj.d(parcelC, c4Var);
        L0(1, parcelC);
    }
}
