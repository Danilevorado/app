package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.cw;
import com.google.android.gms.internal.ads.dw;
import com.google.android.gms.internal.ads.e00;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.eu;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.mv;
import com.google.android.gms.internal.ads.n00;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.pv;
import com.google.android.gms.internal.ads.qv;
import com.google.android.gms.internal.ads.sv;
import com.google.android.gms.internal.ads.tv;
import com.google.android.gms.internal.ads.vv;
import com.google.android.gms.internal.ads.wv;
import com.google.android.gms.internal.ads.zv;

/* loaded from: classes.dex */
public abstract class l0 extends ej implements m0 {
    public l0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        d0 b0Var = null;
        c1 c1Var = null;
        switch (i10) {
            case 1:
                j0 j0VarC = c();
                parcel2.writeNoException();
                fj.f(parcel2, j0VarC);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    b0Var = iInterfaceQueryLocalInterface instanceof d0 ? (d0) iInterfaceQueryLocalInterface : new b0(strongBinder);
                }
                fj.c(parcel);
                l4(b0Var);
                break;
            case 3:
                nv nvVarL5 = mv.L5(parcel.readStrongBinder());
                fj.c(parcel);
                V4(nvVarL5);
                break;
            case 4:
                qv qvVarL5 = pv.L5(parcel.readStrongBinder());
                fj.c(parcel);
                C4(qvVarL5);
                break;
            case 5:
                String string = parcel.readString();
                wv wvVarL5 = vv.L5(parcel.readStrongBinder());
                tv tvVarL5 = sv.L5(parcel.readStrongBinder());
                fj.c(parcel);
                B3(string, wvVarL5, tvVarL5);
                break;
            case 6:
                eu euVar = (eu) fj.a(parcel, eu.CREATOR);
                fj.c(parcel);
                Y3(euVar);
                break;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c1Var = iInterfaceQueryLocalInterface2 instanceof c1 ? (c1) iInterfaceQueryLocalInterface2 : new c1(strongBinder2);
                }
                fj.c(parcel);
                a4(c1Var);
                break;
            case 8:
                aw awVarL5 = zv.L5(parcel.readStrongBinder());
                h4 h4Var = (h4) fj.a(parcel, h4.CREATOR);
                fj.c(parcel);
                Z3(awVarL5, h4Var);
                break;
            case 9:
                g3.g gVar = (g3.g) fj.a(parcel, g3.g.CREATOR);
                fj.c(parcel);
                y2(gVar);
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                dw dwVarL5 = cw.L5(parcel.readStrongBinder());
                fj.c(parcel);
                G4(dwVarL5);
                break;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                e00 e00Var = (e00) fj.a(parcel, e00.CREATOR);
                fj.c(parcel);
                T0(e00Var);
                break;
            case 14:
                n00 n00VarL5 = m00.L5(parcel.readStrongBinder());
                fj.c(parcel);
                s1(n00VarL5);
                break;
            case 15:
                g3.a aVar = (g3.a) fj.a(parcel, g3.a.CREATOR);
                fj.c(parcel);
                a1(aVar);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
