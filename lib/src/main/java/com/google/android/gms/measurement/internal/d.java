package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d extends f4.a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: m, reason: collision with root package name */
    public String f19838m;

    /* renamed from: n, reason: collision with root package name */
    public String f19839n;

    /* renamed from: o, reason: collision with root package name */
    public q9 f19840o;

    /* renamed from: p, reason: collision with root package name */
    public long f19841p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19842q;

    /* renamed from: r, reason: collision with root package name */
    public String f19843r;

    /* renamed from: s, reason: collision with root package name */
    public final v f19844s;

    /* renamed from: t, reason: collision with root package name */
    public long f19845t;

    /* renamed from: u, reason: collision with root package name */
    public v f19846u;

    /* renamed from: v, reason: collision with root package name */
    public final long f19847v;

    /* renamed from: w, reason: collision with root package name */
    public final v f19848w;

    d(d dVar) {
        e4.p.l(dVar);
        this.f19838m = dVar.f19838m;
        this.f19839n = dVar.f19839n;
        this.f19840o = dVar.f19840o;
        this.f19841p = dVar.f19841p;
        this.f19842q = dVar.f19842q;
        this.f19843r = dVar.f19843r;
        this.f19844s = dVar.f19844s;
        this.f19845t = dVar.f19845t;
        this.f19846u = dVar.f19846u;
        this.f19847v = dVar.f19847v;
        this.f19848w = dVar.f19848w;
    }

    d(String str, String str2, q9 q9Var, long j10, boolean z10, String str3, v vVar, long j11, v vVar2, long j12, v vVar3) {
        this.f19838m = str;
        this.f19839n = str2;
        this.f19840o = q9Var;
        this.f19841p = j10;
        this.f19842q = z10;
        this.f19843r = str3;
        this.f19844s = vVar;
        this.f19845t = j11;
        this.f19846u = vVar2;
        this.f19847v = j12;
        this.f19848w = vVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 2, this.f19838m, false);
        f4.c.q(parcel, 3, this.f19839n, false);
        f4.c.p(parcel, 4, this.f19840o, i10, false);
        f4.c.n(parcel, 5, this.f19841p);
        f4.c.c(parcel, 6, this.f19842q);
        f4.c.q(parcel, 7, this.f19843r, false);
        f4.c.p(parcel, 8, this.f19844s, i10, false);
        f4.c.n(parcel, 9, this.f19845t);
        f4.c.p(parcel, 10, this.f19846u, i10, false);
        f4.c.n(parcel, 11, this.f19847v);
        f4.c.p(parcel, 12, this.f19848w, i10, false);
        f4.c.b(parcel, iA);
    }
}
