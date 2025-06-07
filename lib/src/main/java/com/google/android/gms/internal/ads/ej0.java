package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ej0 extends yi0 implements wy3 {

    /* renamed from: p, reason: collision with root package name */
    private String f7824p;

    /* renamed from: q, reason: collision with root package name */
    private final kh0 f7825q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f7826r;

    /* renamed from: s, reason: collision with root package name */
    private final dj0 f7827s;

    /* renamed from: t, reason: collision with root package name */
    private final ii0 f7828t;

    /* renamed from: u, reason: collision with root package name */
    private ByteBuffer f7829u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7830v;

    /* renamed from: w, reason: collision with root package name */
    private final Object f7831w;

    /* renamed from: x, reason: collision with root package name */
    private final String f7832x;

    /* renamed from: y, reason: collision with root package name */
    private final int f7833y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f7834z;

    public ej0(lh0 lh0Var, kh0 kh0Var) {
        super(lh0Var);
        this.f7825q = kh0Var;
        this.f7827s = new dj0();
        this.f7828t = new ii0();
        this.f7831w = new Object();
        this.f7832x = (String) e33.d(lh0Var != null ? lh0Var.X() : null).b("");
        this.f7833y = lh0Var != null ? lh0Var.e() : 0;
    }

    protected static final String C(String str) {
        return "cache:".concat(String.valueOf(se0.g(str)));
    }

    private final void v() {
        int iA = (int) this.f7827s.a();
        int iA2 = (int) this.f7828t.a(this.f7829u);
        int iPosition = this.f7829u.position();
        int iRound = Math.round(iA2 * (iPosition / iA));
        int iO = ch0.O();
        int iQ = ch0.Q();
        String str = this.f7824p;
        p(str, C(str), iPosition, iA, iRound, iA2, iRound > 0, iO, iQ);
    }

    public final ByteBuffer A() {
        synchronized (this.f7831w) {
            ByteBuffer byteBuffer = this.f7829u;
            if (byteBuffer != null && !this.f7830v) {
                byteBuffer.flip();
                this.f7830v = true;
            }
            this.f7826r = true;
        }
        return this.f7829u;
    }

    public final boolean B() {
        return this.f7834z;
    }

    @Override // com.google.android.gms.internal.ads.wy3
    public final void c(t53 t53Var, ib3 ib3Var, boolean z10) {
        if (t53Var instanceof rj3) {
            this.f7827s.b((rj3) t53Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.wy3
    public final void i(t53 t53Var, ib3 ib3Var, boolean z10, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.yi0
    public final void j() {
        this.f7826r = true;
    }

    @Override // com.google.android.gms.internal.ads.wy3
    public final void k(t53 t53Var, ib3 ib3Var, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.wy3
    public final void m(t53 t53Var, ib3 ib3Var, boolean z10) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a7, code lost:
    
        r21.f7834z = true;
        o(r22, r4, (int) r21.f7828t.a(r21.f7829u));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:? -> B:45:0x0142). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.yi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ej0.w(java.lang.String):boolean");
    }

    public final String z() {
        return this.f7824p;
    }
}
