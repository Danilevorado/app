package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fa0;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.ga0;
import com.google.android.gms.internal.ads.gs;
import com.google.android.gms.internal.ads.hs;
import com.google.android.gms.internal.ads.kl;
import com.google.android.gms.internal.ads.l70;
import com.google.android.gms.internal.ads.ll;
import com.google.android.gms.internal.ads.m70;
import com.google.android.gms.internal.ads.p70;
import com.google.android.gms.internal.ads.q70;
import l4.a;

/* loaded from: classes.dex */
public abstract class p0 extends ej implements q0 {
    public p0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        IInterface iInterfaceM;
        Parcelable parcelableH;
        String strT;
        int i12;
        boolean zA5;
        d0 b0Var = null;
        f1 d1Var = null;
        g0 e0Var = null;
        c2 a2Var = null;
        u0 s0Var = null;
        c1 c1Var = null;
        a0 yVar = null;
        y0 v0Var = null;
        switch (i10) {
            case 1:
                iInterfaceM = m();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceM);
                return true;
            case 2:
                A();
                parcel2.writeNoException();
                return true;
            case 3:
                zA5 = a5();
                parcel2.writeNoException();
                int i13 = fj.f8294b;
                i12 = zA5;
                parcel2.writeInt(i12);
                return true;
            case 4:
                c4 c4Var = (c4) fj.a(parcel, c4.CREATOR);
                fj.c(parcel);
                boolean zC1 = C1(c4Var);
                parcel2.writeNoException();
                i12 = zC1;
                parcel2.writeInt(i12);
                return true;
            case 5:
                o0();
                parcel2.writeNoException();
                return true;
            case 6:
                O();
                parcel2.writeNoException();
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    b0Var = iInterfaceQueryLocalInterface instanceof d0 ? (d0) iInterfaceQueryLocalInterface : new b0(strongBinder);
                }
                fj.c(parcel);
                U0(b0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    v0Var = iInterfaceQueryLocalInterface2 instanceof y0 ? (y0) iInterfaceQueryLocalInterface2 : new v0(strongBinder2);
                }
                fj.c(parcel);
                C5(v0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                t0();
                parcel2.writeNoException();
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                parcel2.writeNoException();
                return true;
            case 11:
                F();
                parcel2.writeNoException();
                return true;
            case 12:
                parcelableH = h();
                parcel2.writeNoException();
                fj.e(parcel2, parcelableH);
                return true;
            case 13:
                h4 h4Var = (h4) fj.a(parcel, h4.CREATOR);
                fj.c(parcel);
                B1(h4Var);
                parcel2.writeNoException();
                return true;
            case 14:
                m70 m70VarL5 = l70.L5(parcel.readStrongBinder());
                fj.c(parcel);
                S3(m70VarL5);
                parcel2.writeNoException();
                return true;
            case 15:
                q70 q70VarL5 = p70.L5(parcel.readStrongBinder());
                String string = parcel.readString();
                fj.c(parcel);
                C3(q70VarL5, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                strT = t();
                parcel2.writeNoException();
                parcel2.writeString(strT);
                return true;
            case 19:
                hs hsVarL5 = gs.L5(parcel.readStrongBinder());
                fj.c(parcel);
                p4(hsVarL5);
                parcel2.writeNoException();
                return true;
            case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    yVar = iInterfaceQueryLocalInterface3 instanceof a0 ? (a0) iInterfaceQueryLocalInterface3 : new y(strongBinder3);
                }
                fj.c(parcel);
                h3(yVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c1Var = iInterfaceQueryLocalInterface4 instanceof c1 ? (c1) iInterfaceQueryLocalInterface4 : new c1(strongBinder4);
                }
                fj.c(parcel);
                p2(c1Var);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zG = fj.g(parcel);
                fj.c(parcel);
                w5(zG);
                parcel2.writeNoException();
                return true;
            case 23:
                zA5 = D0();
                parcel2.writeNoException();
                int i132 = fj.f8294b;
                i12 = zA5;
                parcel2.writeInt(i12);
                return true;
            case 24:
                ga0 ga0VarL5 = fa0.L5(parcel.readStrongBinder());
                fj.c(parcel);
                g5(ga0VarL5);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                fj.c(parcel);
                W3(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                iInterfaceM = l();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceM);
                return true;
            case 29:
                v3 v3Var = (v3) fj.a(parcel, v3.CREATOR);
                fj.c(parcel);
                h1(v3Var);
                parcel2.writeNoException();
                return true;
            case 30:
                q2 q2Var = (q2) fj.a(parcel, q2.CREATOR);
                fj.c(parcel);
                k2(q2Var);
                parcel2.writeNoException();
                return true;
            case 31:
                strT = r();
                parcel2.writeNoException();
                parcel2.writeString(strT);
                return true;
            case 32:
                iInterfaceM = j();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceM);
                return true;
            case 33:
                iInterfaceM = i();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceM);
                return true;
            case 34:
                boolean zG2 = fj.g(parcel);
                fj.c(parcel);
                F3(zG2);
                parcel2.writeNoException();
                return true;
            case 35:
                strT = B();
                parcel2.writeNoException();
                parcel2.writeString(strT);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    s0Var = iInterfaceQueryLocalInterface5 instanceof u0 ? (u0) iInterfaceQueryLocalInterface5 : new s0(strongBinder5);
                }
                fj.c(parcel);
                e2(s0Var);
                parcel2.writeNoException();
                return true;
            case 37:
                parcelableH = f();
                parcel2.writeNoException();
                fj.e(parcel2, parcelableH);
                return true;
            case 38:
                String string3 = parcel.readString();
                fj.c(parcel);
                v1(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                n4 n4Var = (n4) fj.a(parcel, n4.CREATOR);
                fj.c(parcel);
                c2(n4Var);
                parcel2.writeNoException();
                return true;
            case 40:
                ll llVarL5 = kl.L5(parcel.readStrongBinder());
                fj.c(parcel);
                m4(llVarL5);
                parcel2.writeNoException();
                return true;
            case 41:
                iInterfaceM = k();
                parcel2.writeNoException();
                fj.f(parcel2, iInterfaceM);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    a2Var = iInterfaceQueryLocalInterface6 instanceof c2 ? (c2) iInterfaceQueryLocalInterface6 : new a2(strongBinder6);
                }
                fj.c(parcel);
                U2(a2Var);
                parcel2.writeNoException();
                return true;
            case 43:
                c4 c4Var2 = (c4) fj.a(parcel, c4.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    e0Var = iInterfaceQueryLocalInterface7 instanceof g0 ? (g0) iInterfaceQueryLocalInterface7 : new e0(strongBinder7);
                }
                fj.c(parcel);
                O2(c4Var2, e0Var);
                parcel2.writeNoException();
                return true;
            case 44:
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                f1(aVarW0);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    d1Var = iInterfaceQueryLocalInterface8 instanceof f1 ? (f1) iInterfaceQueryLocalInterface8 : new d1(strongBinder8);
                }
                fj.c(parcel);
                r1(d1Var);
                parcel2.writeNoException();
                return true;
        }
    }
}
