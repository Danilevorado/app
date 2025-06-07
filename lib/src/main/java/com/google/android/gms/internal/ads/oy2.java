package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class oy2 extends f4.a {
    public static final Parcelable.Creator<oy2> CREATOR = new py2();

    /* renamed from: m, reason: collision with root package name */
    public final int f13466m;

    /* renamed from: n, reason: collision with root package name */
    private vd f13467n = null;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f13468o;

    oy2(int i10, byte[] bArr) {
        this.f13466m = i10;
        this.f13468o = bArr;
        b();
    }

    private final void b() {
        vd vdVar = this.f13467n;
        if (vdVar != null || this.f13468o == null) {
            if (vdVar == null || this.f13468o != null) {
                if (vdVar != null && this.f13468o != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (vdVar != null || this.f13468o != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final vd f() {
        if (this.f13467n == null) {
            try {
                this.f13467n = vd.G0(this.f13468o, qx3.a());
                this.f13468o = null;
            } catch (ny3 | NullPointerException e5) {
                throw new IllegalStateException(e5);
            }
        }
        b();
        return this.f13467n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f13466m);
        byte[] bArrX = this.f13468o;
        if (bArrX == null) {
            bArrX = this.f13467n.x();
        }
        f4.c.f(parcel, 2, bArrX, false);
        f4.c.b(parcel, iA);
    }
}
