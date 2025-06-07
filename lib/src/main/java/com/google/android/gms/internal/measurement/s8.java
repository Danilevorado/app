package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class s8 extends g7 {

    /* renamed from: m, reason: collision with root package name */
    private final u8 f19276m;

    /* renamed from: n, reason: collision with root package name */
    protected u8 f19277n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f19278o = false;

    protected s8(u8 u8Var) {
        this.f19276m = u8Var;
        this.f19277n = (u8) u8Var.u(4, null, null);
    }

    private static final void f(u8 u8Var, u8 u8Var2) {
        ga.a().b(u8Var.getClass()).e(u8Var, u8Var2);
    }

    @Override // com.google.android.gms.internal.measurement.z9
    public final /* synthetic */ y9 a() {
        return this.f19276m;
    }

    @Override // com.google.android.gms.internal.measurement.g7
    protected final /* synthetic */ g7 b(h7 h7Var) {
        i((u8) h7Var);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final /* bridge */ /* synthetic */ g7 c(byte[] bArr, int i10, int i11) throws d9 {
        j(bArr, 0, i11, j8.a());
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.g7
    public final /* bridge */ /* synthetic */ g7 d(byte[] bArr, int i10, int i11, j8 j8Var) throws d9 {
        j(bArr, 0, i11, j8Var);
        return this;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final s8 clone() {
        s8 s8Var = (s8) this.f19276m.u(5, null, null);
        s8Var.i(p());
        return s8Var;
    }

    public final s8 i(u8 u8Var) {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        f(this.f19277n, u8Var);
        return this;
    }

    public final s8 j(byte[] bArr, int i10, int i11, j8 j8Var) throws d9 {
        if (this.f19278o) {
            r();
            this.f19278o = false;
        }
        try {
            ga.a().b(this.f19277n.getClass()).i(this.f19277n, bArr, 0, i11, new k7(j8Var));
            return this;
        } catch (d9 e5) {
            throw e5;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw d9.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.u8 k() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.u8 r0 = r5.p()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.u(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.gms.internal.measurement.ga r3 = com.google.android.gms.internal.measurement.ga.a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.ja r3 = r3.b(r4)
            boolean r3 = r3.g(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.u(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.gms.internal.measurement.oa r1 = new com.google.android.gms.internal.measurement.oa
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s8.k():com.google.android.gms.internal.measurement.u8");
    }

    @Override // com.google.android.gms.internal.measurement.x9
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public u8 p() {
        if (this.f19278o) {
            return this.f19277n;
        }
        u8 u8Var = this.f19277n;
        ga.a().b(u8Var.getClass()).d(u8Var);
        this.f19278o = true;
        return this.f19277n;
    }

    protected void r() {
        u8 u8Var = (u8) this.f19277n.u(4, null, null);
        f(u8Var, this.f19277n);
        this.f19277n = u8Var;
    }
}
