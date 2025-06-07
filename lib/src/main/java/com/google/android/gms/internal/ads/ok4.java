package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ok4 extends lk4 {
    private final boolean A;
    private final boolean B;
    private final int C;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f13302q;

    /* renamed from: r, reason: collision with root package name */
    private final ek4 f13303r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f13304s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f13305t;

    /* renamed from: u, reason: collision with root package name */
    private final int f13306u;

    /* renamed from: v, reason: collision with root package name */
    private final int f13307v;

    /* renamed from: w, reason: collision with root package name */
    private final int f13308w;

    /* renamed from: x, reason: collision with root package name */
    private final int f13309x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f13310y;

    /* renamed from: z, reason: collision with root package name */
    private final int f13311z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ok4(int r5, com.google.android.gms.internal.ads.j31 r6, int r7, com.google.android.gms.internal.ads.ek4 r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ok4.<init>(int, com.google.android.gms.internal.ads.j31, int, com.google.android.gms.internal.ads.ek4, int, int, boolean):void");
    }

    public static /* synthetic */ int g(ok4 ok4Var, ok4 ok4Var2) {
        k73 k73VarA = (ok4Var.f13302q && ok4Var.f13305t) ? pk4.f13925k : pk4.f13925k.a();
        q53 q53VarI = q53.i();
        Integer numValueOf = Integer.valueOf(ok4Var.f13306u);
        Integer numValueOf2 = Integer.valueOf(ok4Var2.f13306u);
        boolean z10 = ok4Var.f13303r.f12507w;
        return q53VarI.c(numValueOf, numValueOf2, pk4.f13926l).c(Integer.valueOf(ok4Var.f13307v), Integer.valueOf(ok4Var2.f13307v), k73VarA).c(Integer.valueOf(ok4Var.f13306u), Integer.valueOf(ok4Var2.f13306u), k73VarA).a();
    }

    public static /* synthetic */ int i(ok4 ok4Var, ok4 ok4Var2) {
        q53 q53VarC = q53.i().d(ok4Var.f13305t, ok4Var2.f13305t).b(ok4Var.f13309x, ok4Var2.f13309x).d(true, true).d(ok4Var.f13302q, ok4Var2.f13302q).d(ok4Var.f13304s, ok4Var2.f13304s).c(Integer.valueOf(ok4Var.f13308w), Integer.valueOf(ok4Var2.f13308w), k73.c().a());
        boolean z10 = ok4Var.A;
        q53 q53VarD = q53VarC.d(z10, ok4Var2.A);
        boolean z11 = ok4Var.B;
        q53 q53VarD2 = q53VarD.d(z11, ok4Var2.B);
        if (z10 && z11) {
            q53VarD2 = q53VarD2.b(ok4Var.C, ok4Var2.C);
        }
        return q53VarD2.a();
    }

    @Override // com.google.android.gms.internal.ads.lk4
    public final int b() {
        return this.f13311z;
    }

    @Override // com.google.android.gms.internal.ads.lk4
    public final /* bridge */ /* synthetic */ boolean d(lk4 lk4Var) {
        ok4 ok4Var = (ok4) lk4Var;
        if (!sv2.b(this.f11651p.f10898l, ok4Var.f11651p.f10898l)) {
            return false;
        }
        boolean z10 = this.f13303r.f7878g0;
        return this.A == ok4Var.A && this.B == ok4Var.B;
    }
}
