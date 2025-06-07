package j3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j extends f4.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: m, reason: collision with root package name */
    public final boolean f24477m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f24478n;

    /* renamed from: o, reason: collision with root package name */
    public final String f24479o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f24480p;

    /* renamed from: q, reason: collision with root package name */
    public final float f24481q;

    /* renamed from: r, reason: collision with root package name */
    public final int f24482r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f24483s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f24484t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f24485u;

    j(boolean z10, boolean z11, String str, boolean z12, float f5, int i10, boolean z13, boolean z14, boolean z15) {
        this.f24477m = z10;
        this.f24478n = z11;
        this.f24479o = str;
        this.f24480p = z12;
        this.f24481q = f5;
        this.f24482r = i10;
        this.f24483s = z13;
        this.f24484t = z14;
        this.f24485u = z15;
    }

    public j(boolean z10, boolean z11, boolean z12, float f5, int i10, boolean z13, boolean z14, boolean z15) {
        this(z10, z11, null, z12, f5, -1, z13, z14, z15);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.c(parcel, 2, this.f24477m);
        f4.c.c(parcel, 3, this.f24478n);
        f4.c.q(parcel, 4, this.f24479o, false);
        f4.c.c(parcel, 5, this.f24480p);
        f4.c.h(parcel, 6, this.f24481q);
        f4.c.k(parcel, 7, this.f24482r);
        f4.c.c(parcel, 8, this.f24483s);
        f4.c.c(parcel, 9, this.f24484t);
        f4.c.c(parcel, 10, this.f24485u);
        f4.c.b(parcel, iA);
    }
}
