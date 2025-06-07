package e4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e4.j;

/* loaded from: classes.dex */
public final class m0 extends f4.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0();

    /* renamed from: m, reason: collision with root package name */
    final int f23187m;

    /* renamed from: n, reason: collision with root package name */
    final IBinder f23188n;

    /* renamed from: o, reason: collision with root package name */
    private final b4.b f23189o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f23190p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f23191q;

    m0(int i10, IBinder iBinder, b4.b bVar, boolean z10, boolean z11) {
        this.f23187m = i10;
        this.f23188n = iBinder;
        this.f23189o = bVar;
        this.f23190p = z10;
        this.f23191q = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f23189o.equals(m0Var.f23189o) && o.a(h(), m0Var.h());
    }

    public final b4.b f() {
        return this.f23189o;
    }

    public final j h() {
        IBinder iBinder = this.f23188n;
        if (iBinder == null) {
            return null;
        }
        return j.a.w0(iBinder);
    }

    public final boolean v() {
        return this.f23190p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f23187m);
        f4.c.j(parcel, 2, this.f23188n, false);
        f4.c.p(parcel, 3, this.f23189o, i10, false);
        f4.c.c(parcel, 4, this.f23190p);
        f4.c.c(parcel, 5, this.f23191q);
        f4.c.b(parcel, iA);
    }

    public final boolean x() {
        return this.f23191q;
    }
}
