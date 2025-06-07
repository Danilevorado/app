package k3;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class h4 extends f4.a {
    public static final Parcelable.Creator<h4> CREATOR = new i4();
    public boolean A;

    /* renamed from: m, reason: collision with root package name */
    public final String f24651m;

    /* renamed from: n, reason: collision with root package name */
    public final int f24652n;

    /* renamed from: o, reason: collision with root package name */
    public final int f24653o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f24654p;

    /* renamed from: q, reason: collision with root package name */
    public final int f24655q;

    /* renamed from: r, reason: collision with root package name */
    public final int f24656r;

    /* renamed from: s, reason: collision with root package name */
    public final h4[] f24657s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f24658t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f24659u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f24660v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24661w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24662x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f24663y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f24664z;

    public h4() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public h4(Context context, d3.g gVar) {
        this(context, new d3.g[]{gVar});
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h4(android.content.Context r13, d3.g[] r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.h4.<init>(android.content.Context, d3.g[]):void");
    }

    h4(String str, int i10, int i11, boolean z10, int i12, int i13, h4[] h4VarArr, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f24651m = str;
        this.f24652n = i10;
        this.f24653o = i11;
        this.f24654p = z10;
        this.f24655q = i12;
        this.f24656r = i13;
        this.f24657s = h4VarArr;
        this.f24658t = z11;
        this.f24659u = z12;
        this.f24660v = z13;
        this.f24661w = z14;
        this.f24662x = z15;
        this.f24663y = z16;
        this.f24664z = z17;
        this.A = z18;
    }

    public static int f(DisplayMetrics displayMetrics) {
        return (int) (z(displayMetrics) * displayMetrics.density);
    }

    public static h4 h() {
        return new h4("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static h4 v() {
        return new h4("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static h4 x() {
        return new h4("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static h4 y() {
        return new h4("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    private static int z(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i10 <= 400) {
            return 32;
        }
        return i10 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 2, this.f24651m, false);
        f4.c.k(parcel, 3, this.f24652n);
        f4.c.k(parcel, 4, this.f24653o);
        f4.c.c(parcel, 5, this.f24654p);
        f4.c.k(parcel, 6, this.f24655q);
        f4.c.k(parcel, 7, this.f24656r);
        f4.c.t(parcel, 8, this.f24657s, i10, false);
        f4.c.c(parcel, 9, this.f24658t);
        f4.c.c(parcel, 10, this.f24659u);
        f4.c.c(parcel, 11, this.f24660v);
        f4.c.c(parcel, 12, this.f24661w);
        f4.c.c(parcel, 13, this.f24662x);
        f4.c.c(parcel, 14, this.f24663y);
        f4.c.c(parcel, 15, this.f24664z);
        f4.c.c(parcel, 16, this.A);
        f4.c.b(parcel, iA);
    }
}
