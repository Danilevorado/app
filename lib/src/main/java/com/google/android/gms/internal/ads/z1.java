package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class z1 extends y1 {

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f18349b;

    /* renamed from: c, reason: collision with root package name */
    private final jm2 f18350c;

    /* renamed from: d, reason: collision with root package name */
    private int f18351d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18352e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18353f;

    /* renamed from: g, reason: collision with root package name */
    private int f18354g;

    public z1(s0 s0Var) {
        super(s0Var);
        this.f18349b = new jm2(i0.f9463a);
        this.f18350c = new jm2(4);
    }

    @Override // com.google.android.gms.internal.ads.y1
    protected final boolean a(jm2 jm2Var) throws x1 {
        int iS = jm2Var.s();
        int i10 = iS >> 4;
        int i11 = iS & 15;
        if (i11 == 7) {
            this.f18354g = i10;
            return i10 != 5;
        }
        throw new x1("Video format not supported: " + i11);
    }

    @Override // com.google.android.gms.internal.ads.y1
    protected final boolean b(jm2 jm2Var, long j10) throws oh0 {
        int iS = jm2Var.s();
        long jN = jm2Var.n();
        if (iS == 0) {
            if (!this.f18352e) {
                jm2 jm2Var2 = new jm2(new byte[jm2Var.i()]);
                jm2Var.b(jm2Var2.h(), 0, jm2Var.i());
                qn4 qn4VarA = qn4.a(jm2Var2);
                this.f18351d = qn4VarA.f14423b;
                i7 i7Var = new i7();
                i7Var.s("video/avc");
                i7Var.f0(qn4VarA.f14427f);
                i7Var.x(qn4VarA.f14424c);
                i7Var.f(qn4VarA.f14425d);
                i7Var.p(qn4VarA.f14426e);
                i7Var.i(qn4VarA.f14422a);
                this.f17850a.b(i7Var.y());
                this.f18352e = true;
                return false;
            }
        } else if (iS == 1 && this.f18352e) {
            int i10 = this.f18354g == 1 ? 1 : 0;
            if (!this.f18353f && i10 == 0) {
                return false;
            }
            byte[] bArrH = this.f18350c.h();
            bArrH[0] = 0;
            bArrH[1] = 0;
            bArrH[2] = 0;
            int i11 = 4 - this.f18351d;
            int i12 = 0;
            while (jm2Var.i() > 0) {
                jm2Var.b(this.f18350c.h(), i11, this.f18351d);
                this.f18350c.f(0);
                int iV = this.f18350c.v();
                this.f18349b.f(0);
                this.f17850a.a(this.f18349b, 4);
                this.f17850a.a(jm2Var, iV);
                i12 = i12 + 4 + iV;
            }
            this.f17850a.e(j10 + (jN * 1000), i10, i12, 0, null);
            this.f18353f = true;
            return true;
        }
        return false;
    }
}
