package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;

/* loaded from: classes.dex */
public abstract class l2 extends ej implements m2 {
    public l2() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static m2 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof m2 ? (m2) iInterfaceQueryLocalInterface : new k2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        float fH;
        p2 n2Var;
        int i12;
        boolean zQ;
        switch (i10) {
            case 1:
                l();
                parcel2.writeNoException();
                return true;
            case 2:
                k();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zG = fj.g(parcel);
                fj.c(parcel);
                x0(zG);
                parcel2.writeNoException();
                return true;
            case 4:
                zQ = q();
                parcel2.writeNoException();
                int i13 = fj.f8294b;
                i12 = zQ;
                parcel2.writeInt(i12);
                return true;
            case 5:
                int iG = g();
                parcel2.writeNoException();
                i12 = iG;
                parcel2.writeInt(i12);
                return true;
            case 6:
                fH = h();
                parcel2.writeNoException();
                parcel2.writeFloat(fH);
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                fH = e();
                parcel2.writeNoException();
                parcel2.writeFloat(fH);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    n2Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    n2Var = iInterfaceQueryLocalInterface instanceof p2 ? (p2) iInterfaceQueryLocalInterface : new n2(strongBinder);
                }
                fj.c(parcel);
                O0(n2Var);
                parcel2.writeNoException();
                return true;
            case 9:
                fH = c();
                parcel2.writeNoException();
                parcel2.writeFloat(fH);
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                zQ = o();
                parcel2.writeNoException();
                int i132 = fj.f8294b;
                i12 = zQ;
                parcel2.writeInt(i12);
                return true;
            case 11:
                p2 p2VarI = i();
                parcel2.writeNoException();
                fj.f(parcel2, p2VarI);
                return true;
            case 12:
                zQ = p();
                parcel2.writeNoException();
                int i1322 = fj.f8294b;
                i12 = zQ;
                parcel2.writeInt(i12);
                return true;
            case 13:
                m();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
