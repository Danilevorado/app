package e4;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class h1 implements Parcelable.Creator {
    static void a(g gVar, Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, gVar.f23139m);
        f4.c.k(parcel, 2, gVar.f23140n);
        f4.c.k(parcel, 3, gVar.f23141o);
        f4.c.q(parcel, 4, gVar.f23142p, false);
        f4.c.j(parcel, 5, gVar.f23143q, false);
        f4.c.t(parcel, 6, gVar.f23144r, i10, false);
        f4.c.e(parcel, 7, gVar.f23145s, false);
        f4.c.p(parcel, 8, gVar.f23146t, i10, false);
        f4.c.t(parcel, 10, gVar.f23147u, i10, false);
        f4.c.t(parcel, 11, gVar.f23148v, i10, false);
        f4.c.c(parcel, 12, gVar.f23149w);
        f4.c.k(parcel, 13, gVar.f23150x);
        f4.c.c(parcel, 14, gVar.f23151y);
        f4.c.q(parcel, 15, gVar.f(), false);
        f4.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        Scope[] scopeArr = g.A;
        Bundle bundle = new Bundle();
        b4.d[] dVarArr = g.B;
        b4.d[] dVarArr2 = dVarArr;
        String strF = null;
        IBinder iBinderS = null;
        Account account = null;
        String strF2 = null;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        boolean zM = false;
        int iT4 = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 2:
                    iT2 = f4.b.t(parcel, iR);
                    break;
                case 3:
                    iT3 = f4.b.t(parcel, iR);
                    break;
                case 4:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 5:
                    iBinderS = f4.b.s(parcel, iR);
                    break;
                case 6:
                    scopeArr = (Scope[]) f4.b.i(parcel, iR, Scope.CREATOR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    bundle = f4.b.a(parcel, iR);
                    break;
                case 8:
                    account = (Account) f4.b.e(parcel, iR, Account.CREATOR);
                    break;
                case 9:
                default:
                    f4.b.x(parcel, iR);
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    dVarArr = (b4.d[]) f4.b.i(parcel, iR, b4.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (b4.d[]) f4.b.i(parcel, iR, b4.d.CREATOR);
                    break;
                case 12:
                    zM = f4.b.m(parcel, iR);
                    break;
                case 13:
                    iT4 = f4.b.t(parcel, iR);
                    break;
                case 14:
                    zM2 = f4.b.m(parcel, iR);
                    break;
                case 15:
                    strF2 = f4.b.f(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new g(iT, iT2, iT3, strF, iBinderS, scopeArr, bundle, account, dVarArr, dVarArr2, zM, iT4, zM2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
