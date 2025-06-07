package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public final class r9 implements Parcelable.Creator {
    static void a(q9 q9Var, Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, q9Var.f20313m);
        f4.c.q(parcel, 2, q9Var.f20314n, false);
        f4.c.n(parcel, 3, q9Var.f20315o);
        f4.c.o(parcel, 4, q9Var.f20316p, false);
        f4.c.i(parcel, 5, null, false);
        f4.c.q(parcel, 6, q9Var.f20317q, false);
        f4.c.q(parcel, 7, q9Var.f20318r, false);
        f4.c.g(parcel, 8, q9Var.f20319s, false);
        f4.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        String strF = null;
        Long lV = null;
        Float fQ = null;
        String strF2 = null;
        String strF3 = null;
        Double dO = null;
        int iT = 0;
        long jU = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            switch (f4.b.l(iR)) {
                case 1:
                    iT = f4.b.t(parcel, iR);
                    break;
                case 2:
                    strF = f4.b.f(parcel, iR);
                    break;
                case 3:
                    jU = f4.b.u(parcel, iR);
                    break;
                case 4:
                    lV = f4.b.v(parcel, iR);
                    break;
                case 5:
                    fQ = f4.b.q(parcel, iR);
                    break;
                case 6:
                    strF2 = f4.b.f(parcel, iR);
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    strF3 = f4.b.f(parcel, iR);
                    break;
                case 8:
                    dO = f4.b.o(parcel, iR);
                    break;
                default:
                    f4.b.x(parcel, iR);
                    break;
            }
        }
        f4.b.k(parcel, iY);
        return new q9(iT, strF, jU, lV, fQ, strF2, strF3, dO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new q9[i10];
    }
}
