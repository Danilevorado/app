package b4;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import l4.a;

/* loaded from: classes.dex */
public final class a0 extends f4.a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* renamed from: m, reason: collision with root package name */
    private final String f4393m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f4394n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f4395o;

    /* renamed from: p, reason: collision with root package name */
    private final Context f4396p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f4397q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f4398r;

    a0(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f4393m = str;
        this.f4394n = z10;
        this.f4395o = z11;
        this.f4396p = (Context) l4.b.L0(a.AbstractBinderC0158a.w0(iBinder));
        this.f4397q = z12;
        this.f4398r = z13;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, l4.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f4393m;
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, str, false);
        f4.c.c(parcel, 2, this.f4394n);
        f4.c.c(parcel, 3, this.f4395o);
        f4.c.j(parcel, 4, l4.b.p1(this.f4396p), false);
        f4.c.c(parcel, 5, this.f4397q);
        f4.c.c(parcel, 6, this.f4398r);
        f4.c.b(parcel, iA);
    }
}
