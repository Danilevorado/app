package k3;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public abstract class o2 extends ej implements p2 {
    public o2() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            i();
        } else if (i10 == 2) {
            g();
        } else if (i10 == 3) {
            h();
        } else if (i10 == 4) {
            c();
        } else {
            if (i10 != 5) {
                return false;
            }
            boolean zG = fj.g(parcel);
            fj.c(parcel);
            B0(zG);
        }
        parcel2.writeNoException();
        return true;
    }
}
