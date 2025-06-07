package com.google.android.gms.internal.ads;

import android.app.Activity;

/* loaded from: classes.dex */
final class by1 extends uy1 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f6710a;

    /* renamed from: b, reason: collision with root package name */
    private final l3.r f6711b;

    /* renamed from: c, reason: collision with root package name */
    private final m3.t0 f6712c;

    /* renamed from: d, reason: collision with root package name */
    private final jy1 f6713d;

    /* renamed from: e, reason: collision with root package name */
    private final xm1 f6714e;

    /* renamed from: f, reason: collision with root package name */
    private final ws2 f6715f;

    /* renamed from: g, reason: collision with root package name */
    private final String f6716g;

    /* renamed from: h, reason: collision with root package name */
    private final String f6717h;

    /* synthetic */ by1(Activity activity, l3.r rVar, m3.t0 t0Var, jy1 jy1Var, xm1 xm1Var, ws2 ws2Var, String str, String str2, ay1 ay1Var) {
        this.f6710a = activity;
        this.f6711b = rVar;
        this.f6712c = t0Var;
        this.f6713d = jy1Var;
        this.f6714e = xm1Var;
        this.f6715f = ws2Var;
        this.f6716g = str;
        this.f6717h = str2;
    }

    @Override // com.google.android.gms.internal.ads.uy1
    public final Activity a() {
        return this.f6710a;
    }

    @Override // com.google.android.gms.internal.ads.uy1
    public final l3.r b() {
        return this.f6711b;
    }

    @Override // com.google.android.gms.internal.ads.uy1
    public final m3.t0 c() {
        return this.f6712c;
    }

    @Override // com.google.android.gms.internal.ads.uy1
    public final xm1 d() {
        return this.f6714e;
    }

    @Override // com.google.android.gms.internal.ads.uy1
    public final jy1 e() {
        return this.f6713d;
    }

    public final boolean equals(Object obj) {
        l3.r rVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uy1) {
            uy1 uy1Var = (uy1) obj;
            if (this.f6710a.equals(uy1Var.a()) && ((rVar = this.f6711b) != null ? rVar.equals(uy1Var.b()) : uy1Var.b() == null) && this.f6712c.equals(uy1Var.c()) && this.f6713d.equals(uy1Var.e()) && this.f6714e.equals(uy1Var.d()) && this.f6715f.equals(uy1Var.f()) && this.f6716g.equals(uy1Var.g()) && this.f6717h.equals(uy1Var.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.uy1
    public final ws2 f() {
        return this.f6715f;
    }

    @Override // com.google.android.gms.internal.ads.uy1
    public final String g() {
        return this.f6716g;
    }

    @Override // com.google.android.gms.internal.ads.uy1
    public final String h() {
        return this.f6717h;
    }

    public final int hashCode() {
        int iHashCode = this.f6710a.hashCode() ^ 1000003;
        l3.r rVar = this.f6711b;
        return (((((((((((((iHashCode * 1000003) ^ (rVar == null ? 0 : rVar.hashCode())) * 1000003) ^ this.f6712c.hashCode()) * 1000003) ^ this.f6713d.hashCode()) * 1000003) ^ this.f6714e.hashCode()) * 1000003) ^ this.f6715f.hashCode()) * 1000003) ^ this.f6716g.hashCode()) * 1000003) ^ this.f6717h.hashCode();
    }

    public final String toString() {
        return "OfflineUtilsParamsBuilder{activity=" + this.f6710a.toString() + ", adOverlay=" + String.valueOf(this.f6711b) + ", workManagerUtil=" + this.f6712c.toString() + ", databaseManager=" + this.f6713d.toString() + ", csiReporter=" + this.f6714e.toString() + ", logger=" + this.f6715f.toString() + ", gwsQueryId=" + this.f6716g + ", uri=" + this.f6717h + "}";
    }
}
