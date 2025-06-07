package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
final class vh4 implements fh4, eh4 {

    /* renamed from: m, reason: collision with root package name */
    private final fh4[] f16708m;

    /* renamed from: q, reason: collision with root package name */
    private eh4 f16712q;

    /* renamed from: r, reason: collision with root package name */
    private fj4 f16713r;

    /* renamed from: u, reason: collision with root package name */
    private final rg4 f16716u;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList f16710o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    private final HashMap f16711p = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    private zi4 f16715t = new qg4(new zi4[0]);

    /* renamed from: n, reason: collision with root package name */
    private final IdentityHashMap f16709n = new IdentityHashMap();

    /* renamed from: s, reason: collision with root package name */
    private fh4[] f16714s = new fh4[0];

    public vh4(rg4 rg4Var, long[] jArr, fh4... fh4VarArr) {
        this.f16716u = rg4Var;
        this.f16708m = fh4VarArr;
        for (int i10 = 0; i10 < fh4VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f16708m[i10] = new th4(fh4VarArr[i10], j10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final void a(long j10) {
        this.f16715t.a(j10);
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final long b() {
        return this.f16715t.b();
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final boolean c(long j10) {
        if (this.f16710o.isEmpty()) {
            return this.f16715t.c(j10);
        }
        int size = this.f16710o.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((fh4) this.f16710o.get(i10)).c(j10);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final long d() {
        return this.f16715t.d();
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void e(eh4 eh4Var, long j10) {
        this.f16712q = eh4Var;
        Collections.addAll(this.f16710o, this.f16708m);
        for (fh4 fh4Var : this.f16708m) {
            fh4Var.e(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long f() {
        long j10 = -9223372036854775807L;
        for (fh4 fh4Var : this.f16714s) {
            long jF = fh4Var.f();
            if (jF == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && fh4Var.h(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (fh4 fh4Var2 : this.f16714s) {
                    if (fh4Var2 == fh4Var) {
                        break;
                    }
                    if (fh4Var2.h(jF) != jF) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jF;
            } else if (jF != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final fj4 g() {
        fj4 fj4Var = this.f16713r;
        Objects.requireNonNull(fj4Var);
        return fj4Var;
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long h(long j10) {
        long jH = this.f16714s[0].h(j10);
        int i10 = 1;
        while (true) {
            fh4[] fh4VarArr = this.f16714s;
            if (i10 >= fh4VarArr.length) {
                return jH;
            }
            if (fh4VarArr[i10].h(jH) != jH) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.eh4
    public final void i(fh4 fh4Var) {
        this.f16710o.remove(fh4Var);
        if (!this.f16710o.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (fh4 fh4Var2 : this.f16708m) {
            i10 += fh4Var2.g().f8303a;
        }
        j31[] j31VarArr = new j31[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            fh4[] fh4VarArr = this.f16708m;
            if (i11 >= fh4VarArr.length) {
                this.f16713r = new fj4(j31VarArr);
                eh4 eh4Var = this.f16712q;
                Objects.requireNonNull(eh4Var);
                eh4Var.i(this);
                return;
            }
            fj4 fj4VarG = fh4VarArr[i11].g();
            int i13 = fj4VarG.f8303a;
            int i14 = 0;
            while (i14 < i13) {
                j31 j31VarB = fj4VarG.b(i14);
                j31 j31VarC = j31VarB.c(i11 + ":" + j31VarB.f10282b);
                this.f16711p.put(j31VarC, j31VarB);
                j31VarArr[i12] = j31VarC;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    public final fh4 j(int i10) {
        fh4 fh4Var = this.f16708m[i10];
        return fh4Var instanceof th4 ? ((th4) fh4Var).f15847m : fh4Var;
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void k() {
        for (fh4 fh4Var : this.f16708m) {
            fh4Var.k();
        }
    }

    @Override // com.google.android.gms.internal.ads.yi4
    public final /* bridge */ /* synthetic */ void l(zi4 zi4Var) {
        eh4 eh4Var = this.f16712q;
        Objects.requireNonNull(eh4Var);
        eh4Var.l(this);
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final void m(long j10, boolean z10) {
        for (fh4 fh4Var : this.f16714s) {
            fh4Var.m(j10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.fh4
    public final long n(long j10, x84 x84Var) {
        fh4[] fh4VarArr = this.f16714s;
        return (fh4VarArr.length > 0 ? fh4VarArr[0] : this.f16708m[0]).n(j10, x84Var);
    }

    @Override // com.google.android.gms.internal.ads.fh4, com.google.android.gms.internal.ads.zi4
    public final boolean o() {
        return this.f16715t.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // com.google.android.gms.internal.ads.fh4
    public final long q(rk4[] rk4VarArr, boolean[] zArr, xi4[] xi4VarArr, boolean[] zArr2, long j10) {
        int length;
        xi4 xi4Var;
        int length2 = rk4VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = rk4VarArr.length;
            xi4Var = null;
            if (i11 >= length) {
                break;
            }
            xi4 xi4Var2 = xi4VarArr[i11];
            Integer num = xi4Var2 != null ? (Integer) this.f16709n.get(xi4Var2) : null;
            iArr[i11] = num == null ? -1 : num.intValue();
            rk4 rk4Var = rk4VarArr[i11];
            if (rk4Var != null) {
                String str = rk4Var.c().f10282b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        this.f16709n.clear();
        xi4[] xi4VarArr2 = new xi4[length];
        xi4[] xi4VarArr3 = new xi4[length];
        ArrayList arrayList = new ArrayList(this.f16708m.length);
        long j11 = j10;
        int i12 = 0;
        rk4[] rk4VarArr2 = new rk4[length];
        while (i12 < this.f16708m.length) {
            for (int i13 = i10; i13 < rk4VarArr.length; i13++) {
                xi4VarArr3[i13] = iArr[i13] == i12 ? xi4VarArr[i13] : xi4Var;
                if (iArr2[i13] == i12) {
                    rk4 rk4Var2 = rk4VarArr[i13];
                    Objects.requireNonNull(rk4Var2);
                    j31 j31Var = (j31) this.f16711p.get(rk4Var2.c());
                    Objects.requireNonNull(j31Var);
                    rk4VarArr2[i13] = new sh4(rk4Var2, j31Var);
                } else {
                    rk4VarArr2[i13] = xi4Var;
                }
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            xi4[] xi4VarArr4 = xi4VarArr3;
            rk4[] rk4VarArr3 = rk4VarArr2;
            long jQ = this.f16708m[i12].q(rk4VarArr2, zArr, xi4VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jQ;
            } else if (jQ != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < rk4VarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    xi4 xi4Var3 = xi4VarArr4[i15];
                    Objects.requireNonNull(xi4Var3);
                    xi4VarArr2[i15] = xi4Var3;
                    this.f16709n.put(xi4Var3, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    gt1.f(xi4VarArr4[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.f16708m[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            xi4VarArr3 = xi4VarArr4;
            rk4VarArr2 = rk4VarArr3;
            i10 = 0;
            xi4Var = null;
        }
        int i16 = i10;
        System.arraycopy(xi4VarArr2, i16, xi4VarArr, i16, length);
        fh4[] fh4VarArr = (fh4[]) arrayList.toArray(new fh4[i16]);
        this.f16714s = fh4VarArr;
        this.f16715t = new qg4(fh4VarArr);
        return j11;
    }
}
