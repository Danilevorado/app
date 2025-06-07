package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.facebook.ads.AdError;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class tp2 implements sp2 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f16002a;

    /* renamed from: b, reason: collision with root package name */
    private final zp2 f16003b;

    /* renamed from: c, reason: collision with root package name */
    private final vp2 f16004c = new vp2();

    public tp2(zp2 zp2Var) {
        this.f16002a = new ConcurrentHashMap(zp2Var.f18687r);
        this.f16003b = zp2Var;
    }

    private final void f() {
        Parcelable.Creator<zp2> creator = zp2.CREATOR;
        if (((Boolean) k3.w.c().b(ir.Z5)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f16003b.f18685p);
            sb2.append(" PoolCollection");
            sb2.append(this.f16004c.b());
            int i10 = 0;
            for (Map.Entry entry : this.f16002a.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((cq2) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < ((rp2) entry.getValue()).b(); i11++) {
                    sb2.append("[O]");
                }
                for (int iB = ((rp2) entry.getValue()).b(); iB < this.f16003b.f18687r; iB++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((rp2) entry.getValue()).g());
                sb2.append("\n");
            }
            while (i10 < this.f16003b.f18686q) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            ze0.b(sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final zp2 a() {
        return this.f16003b;
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final synchronized boolean b(cq2 cq2Var) {
        rp2 rp2Var = (rp2) this.f16002a.get(cq2Var);
        if (rp2Var != null) {
            return rp2Var.b() < this.f16003b.f18687r;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final cq2 c(k3.c4 c4Var, String str, k3.n4 n4Var) {
        return new dq2(c4Var, str, new o90(this.f16003b.f18683n).a().f13652k, this.f16003b.f18689t, n4Var);
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final synchronized boolean d(cq2 cq2Var, bq2 bq2Var) {
        boolean zH;
        ConcurrentHashMap concurrentHashMap;
        rp2 rp2Var = (rp2) this.f16002a.get(cq2Var);
        bq2Var.f6645d = j3.t.b().a();
        if (rp2Var == null) {
            zp2 zp2Var = this.f16003b;
            rp2Var = new rp2(zp2Var.f18687r, zp2Var.f18688s * AdError.NETWORK_ERROR_CODE);
            int size = this.f16002a.size();
            zp2 zp2Var2 = this.f16003b;
            if (size == zp2Var2.f18686q) {
                int i10 = zp2Var2.f18694y;
                int i11 = i10 - 1;
                cq2 cq2Var2 = null;
                if (i10 == 0) {
                    throw null;
                }
                long jC = Long.MAX_VALUE;
                if (i11 == 0) {
                    for (Map.Entry entry : this.f16002a.entrySet()) {
                        if (((rp2) entry.getValue()).c() < jC) {
                            jC = ((rp2) entry.getValue()).c();
                            cq2Var2 = (cq2) entry.getKey();
                        }
                    }
                    if (cq2Var2 != null) {
                        concurrentHashMap = this.f16002a;
                        concurrentHashMap.remove(cq2Var2);
                    }
                    this.f16004c.g();
                } else if (i11 != 1) {
                    if (i11 == 2) {
                        int iA = Integer.MAX_VALUE;
                        for (Map.Entry entry2 : this.f16002a.entrySet()) {
                            if (((rp2) entry2.getValue()).a() < iA) {
                                iA = ((rp2) entry2.getValue()).a();
                                cq2Var2 = (cq2) entry2.getKey();
                            }
                        }
                        if (cq2Var2 != null) {
                            concurrentHashMap = this.f16002a;
                            concurrentHashMap.remove(cq2Var2);
                        }
                    }
                    this.f16004c.g();
                } else {
                    for (Map.Entry entry3 : this.f16002a.entrySet()) {
                        if (((rp2) entry3.getValue()).d() < jC) {
                            jC = ((rp2) entry3.getValue()).d();
                            cq2Var2 = (cq2) entry3.getKey();
                        }
                    }
                    if (cq2Var2 != null) {
                        concurrentHashMap = this.f16002a;
                        concurrentHashMap.remove(cq2Var2);
                    }
                    this.f16004c.g();
                }
            }
            this.f16002a.put(cq2Var, rp2Var);
            this.f16004c.d();
        }
        zH = rp2Var.h(bq2Var);
        this.f16004c.c();
        up2 up2VarA = this.f16004c.a();
        qq2 qq2VarF = rp2Var.f();
        fn fnVarK = ln.K();
        dn dnVarK = en.K();
        dnVarK.y(2);
        jn jnVarK = kn.K();
        jnVarK.u(up2VarA.f16424m);
        jnVarK.v(up2VarA.f16425n);
        jnVarK.w(qq2VarF.f14444n);
        dnVarK.w(jnVarK);
        fnVarK.u(dnVarK);
        bq2Var.f6642a.b().c().N((ln) fnVarK.m());
        f();
        return zH;
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final synchronized bq2 e(cq2 cq2Var) {
        bq2 bq2VarE;
        rp2 rp2Var = (rp2) this.f16002a.get(cq2Var);
        if (rp2Var != null) {
            bq2VarE = rp2Var.e();
            if (bq2VarE == null) {
                this.f16004c.e();
            }
            qq2 qq2VarF = rp2Var.f();
            if (bq2VarE != null) {
                fn fnVarK = ln.K();
                dn dnVarK = en.K();
                dnVarK.y(2);
                hn hnVarK = in.K();
                hnVarK.u(qq2VarF.f14443m);
                hnVarK.v(qq2VarF.f14444n);
                dnVarK.u(hnVarK);
                fnVarK.u(dnVarK);
                bq2VarE.f6642a.b().c().a0((ln) fnVarK.m());
            }
            f();
        } else {
            this.f16004c.f();
            f();
            bq2VarE = null;
        }
        return bq2VarE;
    }
}
