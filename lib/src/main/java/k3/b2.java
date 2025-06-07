package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public abstract class b2 extends ej implements c2 {
    public b2() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static c2 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof c2 ? (c2) iInterfaceQueryLocalInterface : new a2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        j4 j4Var = (j4) fj.a(parcel, j4.CREATOR);
        fj.c(parcel);
        F2(j4Var);
        parcel2.writeNoException();
        return true;
    }
}
