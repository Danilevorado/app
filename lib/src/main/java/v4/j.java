package v4;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s4.v;

/* loaded from: classes.dex */
public abstract class j extends s4.n implements k {
    public j() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static k w0(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new i(iBinder);
    }

    @Override // s4.n
    protected final boolean C(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        L1((Location) v.b(parcel, Location.CREATOR));
        return true;
    }
}
