package k3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l4 extends f4.a {
    public static final Parcelable.Creator<l4> CREATOR = new m4();

    /* renamed from: m, reason: collision with root package name */
    public final String f24691m;

    /* renamed from: n, reason: collision with root package name */
    public long f24692n;

    /* renamed from: o, reason: collision with root package name */
    public w2 f24693o;

    /* renamed from: p, reason: collision with root package name */
    public final Bundle f24694p;

    /* renamed from: q, reason: collision with root package name */
    public final String f24695q;

    /* renamed from: r, reason: collision with root package name */
    public final String f24696r;

    /* renamed from: s, reason: collision with root package name */
    public final String f24697s;

    /* renamed from: t, reason: collision with root package name */
    public final String f24698t;

    public l4(String str, long j10, w2 w2Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f24691m = str;
        this.f24692n = j10;
        this.f24693o = w2Var;
        this.f24694p = bundle;
        this.f24695q = str2;
        this.f24696r = str3;
        this.f24697s = str4;
        this.f24698t = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, this.f24691m, false);
        f4.c.n(parcel, 2, this.f24692n);
        f4.c.p(parcel, 3, this.f24693o, i10, false);
        f4.c.e(parcel, 4, this.f24694p, false);
        f4.c.q(parcel, 5, this.f24695q, false);
        f4.c.q(parcel, 6, this.f24696r, false);
        f4.c.q(parcel, 7, this.f24697s, false);
        f4.c.q(parcel, 8, this.f24698t, false);
        f4.c.b(parcel, iA);
    }
}
