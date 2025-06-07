package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c4.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e4.o;

/* loaded from: classes.dex */
public final class Status extends f4.a implements f, ReflectedParcelable {

    /* renamed from: m, reason: collision with root package name */
    private final int f5600m;

    /* renamed from: n, reason: collision with root package name */
    private final String f5601n;

    /* renamed from: o, reason: collision with root package name */
    private final PendingIntent f5602o;

    /* renamed from: p, reason: collision with root package name */
    private final b4.b f5603p;

    /* renamed from: q, reason: collision with root package name */
    public static final Status f5592q = new Status(-1);

    /* renamed from: r, reason: collision with root package name */
    public static final Status f5593r = new Status(0);

    /* renamed from: s, reason: collision with root package name */
    public static final Status f5594s = new Status(14);

    /* renamed from: t, reason: collision with root package name */
    public static final Status f5595t = new Status(8);

    /* renamed from: u, reason: collision with root package name */
    public static final Status f5596u = new Status(15);

    /* renamed from: v, reason: collision with root package name */
    public static final Status f5597v = new Status(16);

    /* renamed from: x, reason: collision with root package name */
    public static final Status f5599x = new Status(17);

    /* renamed from: w, reason: collision with root package name */
    public static final Status f5598w = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new d();

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }

    Status(int i10, String str, PendingIntent pendingIntent, b4.b bVar) {
        this.f5600m = i10;
        this.f5601n = str;
        this.f5602o = pendingIntent;
        this.f5603p = bVar;
    }

    public Status(b4.b bVar, String str) {
        this(bVar, str, 17);
    }

    public Status(b4.b bVar, String str, int i10) {
        this(i10, str, bVar.v(), bVar);
    }

    @Override // c4.f
    public Status e() {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5600m == status.f5600m && o.a(this.f5601n, status.f5601n) && o.a(this.f5602o, status.f5602o) && o.a(this.f5603p, status.f5603p);
    }

    public b4.b f() {
        return this.f5603p;
    }

    public int h() {
        return this.f5600m;
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f5600m), this.f5601n, this.f5602o, this.f5603p);
    }

    public String toString() {
        o.a aVarC = o.c(this);
        aVarC.a("statusCode", z());
        aVarC.a("resolution", this.f5602o);
        return aVarC.toString();
    }

    public String v() {
        return this.f5601n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, h());
        f4.c.q(parcel, 2, v(), false);
        f4.c.p(parcel, 3, this.f5602o, i10, false);
        f4.c.p(parcel, 4, f(), i10, false);
        f4.c.b(parcel, iA);
    }

    public boolean x() {
        return this.f5602o != null;
    }

    public boolean y() {
        return this.f5600m <= 0;
    }

    public final String z() {
        String str = this.f5601n;
        return str != null ? str : c4.b.a(this.f5600m);
    }
}
