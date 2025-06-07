package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class ja0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10401a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10402b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10403c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10404d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10405e;

    protected ja0(ja0 ja0Var) {
        this.f10401a = ja0Var.f10401a;
        this.f10402b = ja0Var.f10402b;
        this.f10403c = ja0Var.f10403c;
        this.f10404d = ja0Var.f10404d;
        this.f10405e = ja0Var.f10405e;
    }

    public ja0(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    private ja0(Object obj, int i10, int i11, long j10, int i12) {
        this.f10401a = obj;
        this.f10402b = i10;
        this.f10403c = i11;
        this.f10404d = j10;
        this.f10405e = i12;
    }

    public ja0(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public ja0(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public final ja0 a(Object obj) {
        return this.f10401a.equals(obj) ? this : new ja0(obj, this.f10402b, this.f10403c, this.f10404d, this.f10405e);
    }

    public final boolean b() {
        return this.f10402b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja0)) {
            return false;
        }
        ja0 ja0Var = (ja0) obj;
        return this.f10401a.equals(ja0Var.f10401a) && this.f10402b == ja0Var.f10402b && this.f10403c == ja0Var.f10403c && this.f10404d == ja0Var.f10404d && this.f10405e == ja0Var.f10405e;
    }

    public final int hashCode() {
        return ((((((((this.f10401a.hashCode() + 527) * 31) + this.f10402b) * 31) + this.f10403c) * 31) + ((int) this.f10404d)) * 31) + this.f10405e;
    }
}
