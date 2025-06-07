package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class o0 implements Parcelable.Creator {
    static void c(n0 n0Var, Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.e(parcel, 2, n0Var.f21524m, false);
        f4.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public n0 createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            if (f4.b.l(iR) != 2) {
                f4.b.x(parcel, iR);
            } else {
                bundleA = f4.b.a(parcel, iR);
            }
        }
        f4.b.k(parcel, iY);
        return new n0(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0[] newArray(int i10) {
        return new n0[i10];
    }
}
