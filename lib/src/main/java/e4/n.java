package e4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class n extends f4.a {
    public static final Parcelable.Creator<n> CREATOR = new j0();

    /* renamed from: m, reason: collision with root package name */
    private final int f23200m;

    /* renamed from: n, reason: collision with root package name */
    private final int f23201n;

    /* renamed from: o, reason: collision with root package name */
    private final int f23202o;

    /* renamed from: p, reason: collision with root package name */
    private final long f23203p;

    /* renamed from: q, reason: collision with root package name */
    private final long f23204q;

    /* renamed from: r, reason: collision with root package name */
    private final String f23205r;

    /* renamed from: s, reason: collision with root package name */
    private final String f23206s;

    /* renamed from: t, reason: collision with root package name */
    private final int f23207t;

    /* renamed from: u, reason: collision with root package name */
    private final int f23208u;

    public n(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f23200m = i10;
        this.f23201n = i11;
        this.f23202o = i12;
        this.f23203p = j10;
        this.f23204q = j11;
        this.f23205r = str;
        this.f23206s = str2;
        this.f23207t = i13;
        this.f23208u = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23200m;
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, i11);
        f4.c.k(parcel, 2, this.f23201n);
        f4.c.k(parcel, 3, this.f23202o);
        f4.c.n(parcel, 4, this.f23203p);
        f4.c.n(parcel, 5, this.f23204q);
        f4.c.q(parcel, 6, this.f23205r, false);
        f4.c.q(parcel, 7, this.f23206s, false);
        f4.c.k(parcel, 8, this.f23207t);
        f4.c.k(parcel, 9, this.f23208u);
        f4.c.b(parcel, iA);
    }
}
