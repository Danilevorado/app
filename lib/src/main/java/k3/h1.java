package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.o30;

/* loaded from: classes.dex */
public abstract class h1 extends ej implements i1 {
    public h1() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static i1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof i1 ? (i1) iInterfaceQueryLocalInterface : new g1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            c3 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            fj.e(parcel2, liteSdkVersion);
        } else {
            if (i10 != 2) {
                return false;
            }
            o30 adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            fj.f(parcel2, adapterCreator);
        }
        return true;
    }
}
