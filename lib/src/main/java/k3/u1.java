package k3;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public abstract class u1 extends ej implements w1 {
    public u1() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        w2 w2Var = (w2) fj.a(parcel, w2.CREATOR);
        fj.c(parcel);
        P3(w2Var);
        parcel2.writeNoException();
        return true;
    }
}
