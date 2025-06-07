package k3;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ej;

/* loaded from: classes.dex */
public abstract class z extends ej implements a0 {
    public z() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        b();
        parcel2.writeNoException();
        return true;
    }
}
