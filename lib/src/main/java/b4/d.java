package b4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.o;

/* loaded from: classes.dex */
public class d extends f4.a {
    public static final Parcelable.Creator<d> CREATOR = new o();

    /* renamed from: m, reason: collision with root package name */
    private final String f4411m;

    /* renamed from: n, reason: collision with root package name */
    private final int f4412n;

    /* renamed from: o, reason: collision with root package name */
    private final long f4413o;

    public d(String str, int i10, long j10) {
        this.f4411m = str;
        this.f4412n = i10;
        this.f4413o = j10;
    }

    public d(String str, long j10) {
        this.f4411m = str;
        this.f4413o = j10;
        this.f4412n = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((f() != null && f().equals(dVar.f())) || (f() == null && dVar.f() == null)) && h() == dVar.h()) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f4411m;
    }

    public long h() {
        long j10 = this.f4413o;
        return j10 == -1 ? this.f4412n : j10;
    }

    public final int hashCode() {
        return e4.o.b(f(), Long.valueOf(h()));
    }

    public final String toString() {
        o.a aVarC = e4.o.c(this);
        aVarC.a("name", f());
        aVarC.a("version", Long.valueOf(h()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, f(), false);
        f4.c.k(parcel, 2, this.f4412n);
        f4.c.n(parcel, 3, h());
        f4.c.b(parcel, iA);
    }
}
