package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class h8 {

    /* renamed from: a, reason: collision with root package name */
    private final k7 f9050a;

    /* renamed from: b, reason: collision with root package name */
    private final rt2 f9051b;

    /* renamed from: c, reason: collision with root package name */
    private final il2 f9052c = new il2(new byte[64], 64);

    /* renamed from: d, reason: collision with root package name */
    private boolean f9053d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9054e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9055f;

    public h8(k7 k7Var, rt2 rt2Var) {
        this.f9050a = k7Var;
        this.f9051b = rt2Var;
    }

    public final void a(jm2 jm2Var) {
        long jB;
        char c10;
        jm2Var.b(this.f9052c.f9786a, 0, 3);
        this.f9052c.j(0);
        this.f9052c.l(8);
        this.f9053d = this.f9052c.n();
        this.f9054e = this.f9052c.n();
        this.f9052c.l(6);
        jm2Var.b(this.f9052c.f9786a, 0, this.f9052c.d(8));
        this.f9052c.j(0);
        if (this.f9053d) {
            this.f9052c.l(4);
            long jD = this.f9052c.d(3);
            this.f9052c.l(1);
            int iD = this.f9052c.d(15) << 15;
            this.f9052c.l(1);
            long jD2 = this.f9052c.d(15);
            this.f9052c.l(1);
            if (this.f9055f || !this.f9054e) {
                c10 = 30;
            } else {
                this.f9052c.l(4);
                this.f9052c.l(1);
                int iD2 = this.f9052c.d(15) << 15;
                this.f9052c.l(1);
                long jD3 = this.f9052c.d(15);
                this.f9052c.l(1);
                this.f9051b.b(iD2 | (this.f9052c.d(3) << 30) | jD3);
                this.f9055f = true;
                c10 = 30;
            }
            jB = this.f9051b.b((jD << c10) | iD | jD2);
        } else {
            jB = 0;
        }
        this.f9050a.e(jB, 4);
        this.f9050a.a(jm2Var);
        this.f9050a.d();
    }

    public final void b() {
        this.f9055f = false;
        this.f9050a.c();
    }
}
