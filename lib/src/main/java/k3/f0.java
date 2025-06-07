package k3;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public abstract class f0 extends ej implements g0 {
    public f0() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            d();
        } else {
            if (i10 != 2) {
                return false;
            }
            w2 w2Var = (w2) fj.a(parcel, w2.CREATOR);
            fj.c(parcel);
            q0(w2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
