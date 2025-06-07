package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w implements Parcelable.Creator {
    static void a(v vVar, Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 2, vVar.f20460m, false);
        f4.c.p(parcel, 3, vVar.f20461n, i10, false);
        f4.c.q(parcel, 4, vVar.f20462o, false);
        f4.c.n(parcel, 5, vVar.f20463p);
        f4.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        String strF = null;
        t tVar = null;
        String strF2 = null;
        long jU = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 2) {
                strF = f4.b.f(parcel, iR);
            } else if (iL == 3) {
                tVar = (t) f4.b.e(parcel, iR, t.CREATOR);
            } else if (iL == 4) {
                strF2 = f4.b.f(parcel, iR);
            } else if (iL != 5) {
                f4.b.x(parcel, iR);
            } else {
                jU = f4.b.u(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new v(strF, tVar, strF2, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new v[i10];
    }
}
