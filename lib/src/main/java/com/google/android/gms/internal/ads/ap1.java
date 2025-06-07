package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ap1 extends xz {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Object f6201m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f6202n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ long f6203o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ ot2 f6204p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ tf0 f6205q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ bp1 f6206r;

    ap1(bp1 bp1Var, Object obj, String str, long j10, ot2 ot2Var, tf0 tf0Var) {
        this.f6206r = bp1Var;
        this.f6201m = obj;
        this.f6202n = str;
        this.f6203o = j10;
        this.f6204p = ot2Var;
        this.f6205q = tf0Var;
    }

    @Override // com.google.android.gms.internal.ads.yz
    public final void e() {
        synchronized (this.f6201m) {
            this.f6206r.v(this.f6202n, true, "", (int) (j3.t.b().b() - this.f6203o));
            this.f6206r.f6622l.d(this.f6202n);
            this.f6206r.f6625o.W(this.f6202n);
            cu2 cu2Var = this.f6206r.f6626p;
            ot2 ot2Var = this.f6204p;
            ot2Var.B0(true);
            cu2Var.b(ot2Var.l());
            this.f6205q.e(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.yz
    public final void s(String str) {
        synchronized (this.f6201m) {
            this.f6206r.v(this.f6202n, false, str, (int) (j3.t.b().b() - this.f6203o));
            this.f6206r.f6622l.b(this.f6202n, "error");
            this.f6206r.f6625o.v(this.f6202n, "error");
            cu2 cu2Var = this.f6206r.f6626p;
            ot2 ot2Var = this.f6204p;
            ot2Var.Y(str);
            ot2Var.B0(false);
            cu2Var.b(ot2Var.l());
            this.f6205q.e(Boolean.FALSE);
        }
    }
}
