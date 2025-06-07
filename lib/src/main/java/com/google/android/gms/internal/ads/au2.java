package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class au2 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    private final cu2 f6252n;

    /* renamed from: o, reason: collision with root package name */
    private String f6253o;

    /* renamed from: p, reason: collision with root package name */
    private String f6254p;

    /* renamed from: q, reason: collision with root package name */
    private tn2 f6255q;

    /* renamed from: r, reason: collision with root package name */
    private k3.w2 f6256r;

    /* renamed from: s, reason: collision with root package name */
    private Future f6257s;

    /* renamed from: m, reason: collision with root package name */
    private final List f6251m = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private int f6258t = 2;

    au2(cu2 cu2Var) {
        this.f6252n = cu2Var;
    }

    public final synchronized au2 a(ot2 ot2Var) {
        if (((Boolean) vs.f16842c.e()).booleanValue()) {
            List list = this.f6251m;
            ot2Var.i();
            list.add(ot2Var);
            Future future = this.f6257s;
            if (future != null) {
                future.cancel(false);
            }
            this.f6257s = of0.f13189d.schedule(this, ((Integer) k3.w.c().b(ir.f9943f8)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized au2 b(String str) {
        if (((Boolean) vs.f16842c.e()).booleanValue() && zt2.e(str)) {
            this.f6253o = str;
        }
        return this;
    }

    public final synchronized au2 c(k3.w2 w2Var) {
        if (((Boolean) vs.f16842c.e()).booleanValue()) {
            this.f6256r = w2Var;
        }
        return this;
    }

    public final synchronized au2 d(ArrayList arrayList) {
        if (((Boolean) vs.f16842c.e()).booleanValue()) {
            if (arrayList.contains("banner") || arrayList.contains(d3.b.BANNER.name())) {
                this.f6258t = 3;
            } else if (arrayList.contains("interstitial") || arrayList.contains(d3.b.INTERSTITIAL.name())) {
                this.f6258t = 4;
            } else if (arrayList.contains("native") || arrayList.contains(d3.b.NATIVE.name())) {
                this.f6258t = 8;
            } else if (arrayList.contains("rewarded") || arrayList.contains(d3.b.REWARDED.name())) {
                this.f6258t = 5;
            } else if (arrayList.contains("app_open_ad")) {
                this.f6258t = 7;
            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(d3.b.REWARDED_INTERSTITIAL.name())) {
                this.f6258t = 6;
            }
        }
        return this;
    }

    public final synchronized au2 e(String str) {
        if (((Boolean) vs.f16842c.e()).booleanValue()) {
            this.f6254p = str;
        }
        return this;
    }

    public final synchronized au2 f(tn2 tn2Var) {
        if (((Boolean) vs.f16842c.e()).booleanValue()) {
            this.f6255q = tn2Var;
        }
        return this;
    }

    public final synchronized void g() {
        if (((Boolean) vs.f16842c.e()).booleanValue()) {
            Future future = this.f6257s;
            if (future != null) {
                future.cancel(false);
            }
            for (ot2 ot2Var : this.f6251m) {
                int i10 = this.f6258t;
                if (i10 != 2) {
                    ot2Var.a(i10);
                }
                if (!TextUtils.isEmpty(this.f6253o)) {
                    ot2Var.s(this.f6253o);
                }
                if (!TextUtils.isEmpty(this.f6254p) && !ot2Var.k()) {
                    ot2Var.W(this.f6254p);
                }
                tn2 tn2Var = this.f6255q;
                if (tn2Var != null) {
                    ot2Var.C0(tn2Var);
                } else {
                    k3.w2 w2Var = this.f6256r;
                    if (w2Var != null) {
                        ot2Var.u(w2Var);
                    }
                }
                this.f6252n.b(ot2Var.l());
            }
            this.f6251m.clear();
        }
    }

    public final synchronized au2 h(int i10) {
        if (((Boolean) vs.f16842c.e()).booleanValue()) {
            this.f6258t = i10;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        g();
    }
}
