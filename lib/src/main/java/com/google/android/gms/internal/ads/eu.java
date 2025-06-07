package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import r3.d;

/* loaded from: classes.dex */
public final class eu extends f4.a {
    public static final Parcelable.Creator<eu> CREATOR = new gu();

    /* renamed from: m, reason: collision with root package name */
    public final int f7970m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f7971n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7972o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7973p;

    /* renamed from: q, reason: collision with root package name */
    public final int f7974q;

    /* renamed from: r, reason: collision with root package name */
    public final k3.v3 f7975r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f7976s;

    /* renamed from: t, reason: collision with root package name */
    public final int f7977t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7978u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f7979v;

    public eu(int i10, boolean z10, int i11, boolean z11, int i12, k3.v3 v3Var, boolean z12, int i13, int i14, boolean z13) {
        this.f7970m = i10;
        this.f7971n = z10;
        this.f7972o = i11;
        this.f7973p = z11;
        this.f7974q = i12;
        this.f7975r = v3Var;
        this.f7976s = z12;
        this.f7977t = i13;
        this.f7979v = z13;
        this.f7978u = i14;
    }

    public eu(g3.e eVar) {
        this(4, eVar.f(), eVar.b(), eVar.e(), eVar.a(), eVar.d() != null ? new k3.v3(eVar.d()) : null, eVar.g(), eVar.c(), 0, false);
    }

    public static r3.d f(eu euVar) {
        d.a aVar = new d.a();
        if (euVar == null) {
            return aVar.a();
        }
        int i10 = euVar.f7970m;
        if (i10 == 2) {
            aVar.c(euVar.f7974q);
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    aVar.e(euVar.f7976s);
                    aVar.d(euVar.f7977t);
                    aVar.b(euVar.f7978u, euVar.f7979v);
                }
            }
            k3.v3 v3Var = euVar.f7975r;
            if (v3Var != null) {
                aVar.h(new d3.x(v3Var));
            }
            aVar.c(euVar.f7974q);
        }
        aVar.g(euVar.f7971n);
        aVar.f(euVar.f7973p);
        return aVar.a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, this.f7970m);
        f4.c.c(parcel, 2, this.f7971n);
        f4.c.k(parcel, 3, this.f7972o);
        f4.c.c(parcel, 4, this.f7973p);
        f4.c.k(parcel, 5, this.f7974q);
        f4.c.p(parcel, 6, this.f7975r, i10, false);
        f4.c.c(parcel, 7, this.f7976s);
        f4.c.k(parcel, 8, this.f7977t);
        f4.c.k(parcel, 9, this.f7978u);
        f4.c.c(parcel, 10, this.f7979v);
        f4.c.b(parcel, iA);
    }
}
