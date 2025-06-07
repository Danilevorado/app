package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public abstract class x0 extends ej implements y0 {
    public x0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static y0 L5(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof y0 ? (y0) iInterfaceQueryLocalInterface : new v0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        fj.c(parcel);
        z0(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
