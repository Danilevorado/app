package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.android.gms.internal.ads.a00;
import com.google.android.gms.internal.ads.b00;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.n30;
import com.google.android.gms.internal.ads.o30;
import java.util.List;
import l4.a;

/* loaded from: classes.dex */
public abstract class j1 extends ej implements k1 {
    public j1() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        w1 t1Var;
        switch (i10) {
            case 1:
                k();
                break;
            case 2:
                float f5 = parcel.readFloat();
                fj.c(parcel);
                g1(f5);
                break;
            case 3:
                String string = parcel.readString();
                fj.c(parcel);
                y0(string);
                break;
            case 4:
                boolean zG = fj.g(parcel);
                fj.c(parcel);
                K0(zG);
                break;
            case 5:
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                String string2 = parcel.readString();
                fj.c(parcel);
                w4(aVarW0, string2);
                break;
            case 6:
                String string3 = parcel.readString();
                l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                x3(string3, aVarW02);
                break;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                float fC = c();
                parcel2.writeNoException();
                parcel2.writeFloat(fC);
                return true;
            case 8:
                boolean zV = v();
                parcel2.writeNoException();
                int i12 = fj.f8294b;
                parcel2.writeInt(zV ? 1 : 0);
                return true;
            case 9:
                String strE = e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                String string4 = parcel.readString();
                fj.c(parcel);
                Z(string4);
                break;
            case 11:
                o30 o30VarL5 = n30.L5(parcel.readStrongBinder());
                fj.c(parcel);
                n1(o30VarL5);
                break;
            case 12:
                b00 b00VarL5 = a00.L5(parcel.readStrongBinder());
                fj.c(parcel);
                S0(b00VarL5);
                break;
            case 13:
                List listH = h();
                parcel2.writeNoException();
                parcel2.writeTypedList(listH);
                return true;
            case 14:
                q3 q3Var = (q3) fj.a(parcel, q3.CREATOR);
                fj.c(parcel);
                V2(q3Var);
                break;
            case 15:
                i();
                break;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    t1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    t1Var = iInterfaceQueryLocalInterface instanceof w1 ? (w1) iInterfaceQueryLocalInterface : new t1(strongBinder);
                }
                fj.c(parcel);
                K3(t1Var);
                break;
            case 17:
                boolean zG2 = fj.g(parcel);
                fj.c(parcel);
                x0(zG2);
                break;
            case 18:
                String string5 = parcel.readString();
                fj.c(parcel);
                m0(string5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
