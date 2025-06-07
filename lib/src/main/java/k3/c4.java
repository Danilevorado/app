package k3;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.af0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c4 extends f4.a {
    public static final Parcelable.Creator<c4> CREATOR = new e4();
    public final List A;
    public final String B;
    public final String C;
    public final boolean D;
    public final w0 E;
    public final int F;
    public final String G;
    public final List H;
    public final int I;
    public final String J;

    /* renamed from: m, reason: collision with root package name */
    public final int f24614m;

    /* renamed from: n, reason: collision with root package name */
    public final long f24615n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f24616o;

    /* renamed from: p, reason: collision with root package name */
    public final int f24617p;

    /* renamed from: q, reason: collision with root package name */
    public final List f24618q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f24619r;

    /* renamed from: s, reason: collision with root package name */
    public final int f24620s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f24621t;

    /* renamed from: u, reason: collision with root package name */
    public final String f24622u;

    /* renamed from: v, reason: collision with root package name */
    public final s3 f24623v;

    /* renamed from: w, reason: collision with root package name */
    public final Location f24624w;

    /* renamed from: x, reason: collision with root package name */
    public final String f24625x;

    /* renamed from: y, reason: collision with root package name */
    public final Bundle f24626y;

    /* renamed from: z, reason: collision with root package name */
    public final Bundle f24627z;

    public c4(int i10, long j10, Bundle bundle, int i11, List list, boolean z10, int i12, boolean z11, String str, s3 s3Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z12, w0 w0Var, int i13, String str5, List list3, int i14, String str6) {
        this.f24614m = i10;
        this.f24615n = j10;
        this.f24616o = bundle == null ? new Bundle() : bundle;
        this.f24617p = i11;
        this.f24618q = list;
        this.f24619r = z10;
        this.f24620s = i12;
        this.f24621t = z11;
        this.f24622u = str;
        this.f24623v = s3Var;
        this.f24624w = location;
        this.f24625x = str2;
        this.f24626y = bundle2 == null ? new Bundle() : bundle2;
        this.f24627z = bundle3;
        this.A = list2;
        this.B = str3;
        this.C = str4;
        this.D = z12;
        this.E = w0Var;
        this.F = i13;
        this.G = str5;
        this.H = list3 == null ? new ArrayList() : list3;
        this.I = i14;
        this.J = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return this.f24614m == c4Var.f24614m && this.f24615n == c4Var.f24615n && af0.a(this.f24616o, c4Var.f24616o) && this.f24617p == c4Var.f24617p && e4.o.a(this.f24618q, c4Var.f24618q) && this.f24619r == c4Var.f24619r && this.f24620s == c4Var.f24620s && this.f24621t == c4Var.f24621t && e4.o.a(this.f24622u, c4Var.f24622u) && e4.o.a(this.f24623v, c4Var.f24623v) && e4.o.a(this.f24624w, c4Var.f24624w) && e4.o.a(this.f24625x, c4Var.f24625x) && af0.a(this.f24626y, c4Var.f24626y) && af0.a(this.f24627z, c4Var.f24627z) && e4.o.a(this.A, c4Var.A) && e4.o.a(this.B, c4Var.B) && e4.o.a(this.C, c4Var.C) && this.D == c4Var.D && this.F == c4Var.F && e4.o.a(this.G, c4Var.G) && e4.o.a(this.H, c4Var.H) && this.I == c4Var.I && e4.o.a(this.J, c4Var.J);
    }

    public final int hashCode() {
        return e4.o.b(Integer.valueOf(this.f24614m), Long.valueOf(this.f24615n), this.f24616o, Integer.valueOf(this.f24617p), this.f24618q, Boolean.valueOf(this.f24619r), Integer.valueOf(this.f24620s), Boolean.valueOf(this.f24621t), this.f24622u, this.f24623v, this.f24624w, this.f24625x, this.f24626y, this.f24627z, this.A, this.B, this.C, Boolean.valueOf(this.D), Integer.valueOf(this.F), this.G, this.H, Integer.valueOf(this.I), this.J);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f24614m);
        f4.c.n(parcel, 2, this.f24615n);
        f4.c.e(parcel, 3, this.f24616o, false);
        f4.c.k(parcel, 4, this.f24617p);
        f4.c.s(parcel, 5, this.f24618q, false);
        f4.c.c(parcel, 6, this.f24619r);
        f4.c.k(parcel, 7, this.f24620s);
        f4.c.c(parcel, 8, this.f24621t);
        f4.c.q(parcel, 9, this.f24622u, false);
        f4.c.p(parcel, 10, this.f24623v, i10, false);
        f4.c.p(parcel, 11, this.f24624w, i10, false);
        f4.c.q(parcel, 12, this.f24625x, false);
        f4.c.e(parcel, 13, this.f24626y, false);
        f4.c.e(parcel, 14, this.f24627z, false);
        f4.c.s(parcel, 15, this.A, false);
        f4.c.q(parcel, 16, this.B, false);
        f4.c.q(parcel, 17, this.C, false);
        f4.c.c(parcel, 18, this.D);
        f4.c.p(parcel, 19, this.E, i10, false);
        f4.c.k(parcel, 20, this.F);
        f4.c.q(parcel, 21, this.G, false);
        f4.c.s(parcel, 22, this.H, false);
        f4.c.k(parcel, 23, this.I);
        f4.c.q(parcel, 24, this.J, false);
        f4.c.b(parcel, iA);
    }
}
