package e4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class r1 extends r4.b implements p0 {
    public r1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static p0 w0(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof p0 ? (p0) iInterfaceQueryLocalInterface : new q1(iBinder);
    }

    @Override // r4.b
    protected final boolean C(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            l4.a aVarF = f();
            parcel2.writeNoException();
            r4.c.d(parcel2, aVarF);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iD = d();
            parcel2.writeNoException();
            parcel2.writeInt(iD);
        }
        return true;
    }
}
