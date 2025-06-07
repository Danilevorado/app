package s4;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class f extends n implements g {
    public f() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // s4.n
    protected final boolean C(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            k3((b) v.b(parcel, b.CREATOR));
        } else {
            if (i10 != 2) {
                return false;
            }
            d();
        }
        return true;
    }
}
