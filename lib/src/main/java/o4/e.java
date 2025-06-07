package o4;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class e extends b implements f {
    public e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // o4.b
    protected final boolean C(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        e5((Status) c.a(parcel, Status.CREATOR), (x3.f) c.a(parcel, x3.f.CREATOR));
        return true;
    }
}
