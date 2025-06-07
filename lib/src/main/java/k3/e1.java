package k3;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public abstract class e1 extends ej implements f1 {
    public e1() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            w2 w2Var = (w2) fj.a(parcel, w2.CREATOR);
            fj.c(parcel);
            I0(w2Var);
        } else if (i10 == 2) {
            e();
        } else if (i10 == 3) {
            d();
        } else if (i10 == 4) {
            c();
        } else {
            if (i10 != 5) {
                return false;
            }
            b();
        }
        parcel2.writeNoException();
        return true;
    }
}
