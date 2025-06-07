package s4;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class h extends a implements i {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // s4.i
    public final void K0(boolean z10) {
        Parcel parcelC = C();
        v.a(parcelC, z10);
        L0(12, parcelC);
    }

    @Override // s4.i
    public final Location U(String str) {
        Parcel parcelC = C();
        parcelC.writeString(str);
        Parcel parcelW0 = w0(80, parcelC);
        Location location = (Location) v.b(parcelW0, Location.CREATOR);
        parcelW0.recycle();
        return location;
    }

    @Override // s4.i
    public final void c4(q qVar) {
        Parcel parcelC = C();
        v.c(parcelC, qVar);
        L0(59, parcelC);
    }

    @Override // s4.i
    public final Location n() {
        Parcel parcelW0 = w0(7, C());
        Location location = (Location) v.b(parcelW0, Location.CREATOR);
        parcelW0.recycle();
        return location;
    }
}
