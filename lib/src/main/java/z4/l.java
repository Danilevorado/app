package z4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.m0;

/* loaded from: classes.dex */
public final class l extends f4.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: m, reason: collision with root package name */
    final int f28878m;

    /* renamed from: n, reason: collision with root package name */
    private final b4.b f28879n;

    /* renamed from: o, reason: collision with root package name */
    private final m0 f28880o;

    l(int i10, b4.b bVar, m0 m0Var) {
        this.f28878m = i10;
        this.f28879n = bVar;
        this.f28880o = m0Var;
    }

    public final b4.b f() {
        return this.f28879n;
    }

    public final m0 h() {
        return this.f28880o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f28878m);
        f4.c.p(parcel, 2, this.f28879n, i10, false);
        f4.c.p(parcel, 3, this.f28880o, i10, false);
        f4.c.b(parcel, iA);
    }
}
