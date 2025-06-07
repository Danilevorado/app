package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class xh4 extends pg4 {

    /* renamed from: t, reason: collision with root package name */
    private static final v30 f17569t;

    /* renamed from: k, reason: collision with root package name */
    private final jh4[] f17570k;

    /* renamed from: l, reason: collision with root package name */
    private final h11[] f17571l;

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList f17572m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f17573n;

    /* renamed from: o, reason: collision with root package name */
    private final y63 f17574o;

    /* renamed from: p, reason: collision with root package name */
    private int f17575p;

    /* renamed from: q, reason: collision with root package name */
    private long[][] f17576q;

    /* renamed from: r, reason: collision with root package name */
    private wh4 f17577r;

    /* renamed from: s, reason: collision with root package name */
    private final rg4 f17578s;

    static {
        rg rgVar = new rg();
        rgVar.a("MergingMediaSource");
        f17569t = rgVar.c();
    }

    public xh4(boolean z10, boolean z11, jh4... jh4VarArr) {
        rg4 rg4Var = new rg4();
        this.f17570k = jh4VarArr;
        this.f17578s = rg4Var;
        this.f17572m = new ArrayList(Arrays.asList(jh4VarArr));
        this.f17575p = -1;
        this.f17571l = new h11[jh4VarArr.length];
        this.f17576q = new long[0][];
        this.f17573n = new HashMap();
        this.f17574o = g73.a(8).b(2).c();
    }

    @Override // com.google.android.gms.internal.ads.pg4
    protected final /* bridge */ /* synthetic */ hh4 A(Object obj, hh4 hh4Var) {
        if (((Integer) obj).intValue() == 0) {
            return hh4Var;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pg4
    protected final /* bridge */ /* synthetic */ void B(Object obj, jh4 jh4Var, h11 h11Var) {
        int iB;
        if (this.f17577r != null) {
            return;
        }
        if (this.f17575p == -1) {
            iB = h11Var.b();
            this.f17575p = iB;
        } else {
            int iB2 = h11Var.b();
            int i10 = this.f17575p;
            if (iB2 != i10) {
                this.f17577r = new wh4(0);
                return;
            }
            iB = i10;
        }
        if (this.f17576q.length == 0) {
            this.f17576q = (long[][]) Array.newInstance((Class<?>) long.class, iB, this.f17571l.length);
        }
        this.f17572m.remove(jh4Var);
        this.f17571l[((Integer) obj).intValue()] = h11Var;
        if (this.f17572m.isEmpty()) {
            t(this.f17571l[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final v30 L() {
        jh4[] jh4VarArr = this.f17570k;
        return jh4VarArr.length > 0 ? jh4VarArr[0].L() : f17569t;
    }

    @Override // com.google.android.gms.internal.ads.pg4, com.google.android.gms.internal.ads.jh4
    public final void N() throws wh4 {
        wh4 wh4Var = this.f17577r;
        if (wh4Var != null) {
            throw wh4Var;
        }
        super.N();
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final void a(fh4 fh4Var) {
        vh4 vh4Var = (vh4) fh4Var;
        int i10 = 0;
        while (true) {
            jh4[] jh4VarArr = this.f17570k;
            if (i10 >= jh4VarArr.length) {
                return;
            }
            jh4VarArr[i10].a(vh4Var.j(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final fh4 g(hh4 hh4Var, hl4 hl4Var, long j10) {
        int length = this.f17570k.length;
        fh4[] fh4VarArr = new fh4[length];
        int iA = this.f17571l[0].a(hh4Var.f10401a);
        for (int i10 = 0; i10 < length; i10++) {
            fh4VarArr[i10] = this.f17570k[i10].g(hh4Var.c(this.f17571l[i10].f(iA)), hl4Var, j10 - this.f17576q[iA][i10]);
        }
        return new vh4(this.f17578s, this.f17576q[iA], fh4VarArr);
    }

    @Override // com.google.android.gms.internal.ads.pg4, com.google.android.gms.internal.ads.ig4
    protected final void s(wy3 wy3Var) {
        super.s(wy3Var);
        for (int i10 = 0; i10 < this.f17570k.length; i10++) {
            x(Integer.valueOf(i10), this.f17570k[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.pg4, com.google.android.gms.internal.ads.ig4
    protected final void v() {
        super.v();
        Arrays.fill(this.f17571l, (Object) null);
        this.f17575p = -1;
        this.f17577r = null;
        this.f17572m.clear();
        Collections.addAll(this.f17572m, this.f17570k);
    }
}
