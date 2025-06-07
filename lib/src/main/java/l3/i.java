package l3;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import l4.a;

/* loaded from: classes.dex */
public final class i extends f4.a {
    public static final Parcelable.Creator<i> CREATOR = new h();

    /* renamed from: m, reason: collision with root package name */
    public final String f25061m;

    /* renamed from: n, reason: collision with root package name */
    public final String f25062n;

    /* renamed from: o, reason: collision with root package name */
    public final String f25063o;

    /* renamed from: p, reason: collision with root package name */
    public final String f25064p;

    /* renamed from: q, reason: collision with root package name */
    public final String f25065q;

    /* renamed from: r, reason: collision with root package name */
    public final String f25066r;

    /* renamed from: s, reason: collision with root package name */
    public final String f25067s;

    /* renamed from: t, reason: collision with root package name */
    public final Intent f25068t;

    /* renamed from: u, reason: collision with root package name */
    public final c0 f25069u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f25070v;

    public i(Intent intent, c0 c0Var) {
        this(null, null, null, null, null, null, null, intent, l4.b.p1(c0Var).asBinder(), false);
    }

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z10) {
        this.f25061m = str;
        this.f25062n = str2;
        this.f25063o = str3;
        this.f25064p = str4;
        this.f25065q = str5;
        this.f25066r = str6;
        this.f25067s = str7;
        this.f25068t = intent;
        this.f25069u = (c0) l4.b.L0(a.AbstractBinderC0158a.w0(iBinder));
        this.f25070v = z10;
    }

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, c0 c0Var) {
        this(str, str2, str3, str4, str5, str6, str7, null, l4.b.p1(c0Var).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 2, this.f25061m, false);
        f4.c.q(parcel, 3, this.f25062n, false);
        f4.c.q(parcel, 4, this.f25063o, false);
        f4.c.q(parcel, 5, this.f25064p, false);
        f4.c.q(parcel, 6, this.f25065q, false);
        f4.c.q(parcel, 7, this.f25066r, false);
        f4.c.q(parcel, 8, this.f25067s, false);
        f4.c.p(parcel, 9, this.f25068t, i10, false);
        f4.c.j(parcel, 10, l4.b.p1(this.f25069u).asBinder(), false);
        f4.c.c(parcel, 11, this.f25070v);
        f4.c.b(parcel, iA);
    }
}
