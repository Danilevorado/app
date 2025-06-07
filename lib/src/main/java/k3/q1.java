package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ej;

/* loaded from: classes.dex */
public abstract class q1 extends ej implements r1 {
    public q1() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static r1 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof r1 ? (r1) iInterfaceQueryLocalInterface : new p1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String strC;
        if (i10 == 1) {
            strC = c();
        } else {
            if (i10 != 2) {
                return false;
            }
            strC = e();
        }
        parcel2.writeNoException();
        parcel2.writeString(strC);
        return true;
    }
}
