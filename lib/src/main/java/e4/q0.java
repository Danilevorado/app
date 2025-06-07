package e4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class q0 extends r4.b implements l {
    public q0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // r4.b
    protected final boolean C(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) r4.c.a(parcel, Bundle.CREATOR);
            r4.c.b(parcel);
            I5(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) r4.c.a(parcel, Bundle.CREATOR);
            r4.c.b(parcel);
            O3(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            e1 e1Var = (e1) r4.c.a(parcel, e1.CREATOR);
            r4.c.b(parcel);
            j4(i14, strongBinder2, e1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
