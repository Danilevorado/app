package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i2 extends ej implements j2 {
    public i2() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static j2 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof j2 ? (j2) iInterfaceQueryLocalInterface : new h2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String strH;
        Parcelable parcelableE;
        switch (i10) {
            case 1:
                strH = h();
                parcel2.writeNoException();
                parcel2.writeString(strH);
                return true;
            case 2:
                strH = i();
                parcel2.writeNoException();
                parcel2.writeString(strH);
                return true;
            case 3:
                List listJ = j();
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ);
                return true;
            case 4:
                parcelableE = e();
                parcel2.writeNoException();
                fj.e(parcel2, parcelableE);
                return true;
            case 5:
                parcelableE = c();
                parcel2.writeNoException();
                fj.e(parcel2, parcelableE);
                return true;
            case 6:
                strH = g();
                parcel2.writeNoException();
                parcel2.writeString(strH);
                return true;
            default:
                return false;
        }
    }
}
