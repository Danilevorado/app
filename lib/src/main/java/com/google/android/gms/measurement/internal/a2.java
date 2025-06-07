package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a2 extends b3 {

    /* renamed from: b, reason: collision with root package name */
    private final Map f19741b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f19742c;

    /* renamed from: d, reason: collision with root package name */
    private long f19743d;

    public a2(w4 w4Var) {
        super(w4Var);
        this.f19742c = new q.a();
        this.f19741b = new q.a();
    }

    static /* synthetic */ void g(a2 a2Var, String str, long j10) {
        a2Var.f();
        e4.p.f(str);
        if (a2Var.f19742c.isEmpty()) {
            a2Var.f19743d = j10;
        }
        Integer num = (Integer) a2Var.f19742c.get(str);
        if (num != null) {
            a2Var.f19742c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (a2Var.f19742c.size() >= 100) {
            a2Var.f20269a.b().u().a("Too many ads visible");
        } else {
            a2Var.f19742c.put(str, 1);
            a2Var.f19741b.put(str, Long.valueOf(j10));
        }
    }

    static /* synthetic */ void h(a2 a2Var, String str, long j10) {
        a2Var.f();
        e4.p.f(str);
        Integer num = (Integer) a2Var.f19742c.get(str);
        if (num == null) {
            a2Var.f20269a.b().p().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        a7 a7VarR = a2Var.f20269a.K().r(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            a2Var.f19742c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        a2Var.f19742c.remove(str);
        Long l10 = (Long) a2Var.f19741b.get(str);
        if (l10 == null) {
            a2Var.f20269a.b().p().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = l10.longValue();
            a2Var.f19741b.remove(str);
            a2Var.n(str, j10 - jLongValue, a7VarR);
        }
        if (a2Var.f19742c.isEmpty()) {
            long j11 = a2Var.f19743d;
            if (j11 == 0) {
                a2Var.f20269a.b().p().a("First ad exposure time was never set");
            } else {
                a2Var.m(j10 - j11, a7VarR);
                a2Var.f19743d = 0L;
            }
        }
    }

    private final void m(long j10, a7 a7Var) {
        if (a7Var == null) {
            this.f20269a.b().t().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f20269a.b().t().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        u9.w(a7Var, bundle, true);
        this.f20269a.I().s("am", "_xa", bundle);
    }

    private final void n(String str, long j10, a7 a7Var) {
        if (a7Var == null) {
            this.f20269a.b().t().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f20269a.b().t().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        u9.w(a7Var, bundle, true);
        this.f20269a.I().s("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(long j10) {
        Iterator it = this.f19741b.keySet().iterator();
        while (it.hasNext()) {
            this.f19741b.put((String) it.next(), Long.valueOf(j10));
        }
        if (this.f19741b.isEmpty()) {
            return;
        }
        this.f19743d = j10;
    }

    public final void j(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f20269a.b().p().a("Ad unit id must be a non-empty string");
        } else {
            this.f20269a.B().y(new a(this, str, j10));
        }
    }

    public final void k(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f20269a.b().p().a("Ad unit id must be a non-empty string");
        } else {
            this.f20269a.B().y(new y(this, str, j10));
        }
    }

    public final void l(long j10) {
        a7 a7VarR = this.f20269a.K().r(false);
        for (String str : this.f19741b.keySet()) {
            n(str, j10 - ((Long) this.f19741b.get(str)).longValue(), a7VarR);
        }
        if (!this.f19741b.isEmpty()) {
            m(j10 - this.f19743d, a7VarR);
        }
        o(j10);
    }
}
