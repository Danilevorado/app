package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class bn1 implements ms2 {

    /* renamed from: n, reason: collision with root package name */
    private final sm1 f6554n;

    /* renamed from: o, reason: collision with root package name */
    private final i4.e f6555o;

    /* renamed from: m, reason: collision with root package name */
    private final Map f6553m = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    private final Map f6556p = new HashMap();

    public bn1(sm1 sm1Var, Set set, i4.e eVar) {
        this.f6554n = sm1Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zm1 zm1Var = (zm1) it.next();
            this.f6556p.put(zm1Var.f18641c, zm1Var);
        }
        this.f6555o = eVar;
    }

    private final void d(fs2 fs2Var, boolean z10) {
        fs2 fs2Var2 = ((zm1) this.f6556p.get(fs2Var)).f18640b;
        if (this.f6553m.containsKey(fs2Var2)) {
            String str = true != z10 ? "f." : "s.";
            this.f6554n.a().put("label.".concat(((zm1) this.f6556p.get(fs2Var)).f18639a), str.concat(String.valueOf(Long.toString(this.f6555o.b() - ((Long) this.f6553m.get(fs2Var2)).longValue()))));
        }
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void a(fs2 fs2Var, String str) {
        this.f6553m.put(fs2Var, Long.valueOf(this.f6555o.b()));
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void b(fs2 fs2Var, String str, Throwable th) {
        if (this.f6553m.containsKey(fs2Var)) {
            long jB = this.f6555o.b() - ((Long) this.f6553m.get(fs2Var)).longValue();
            this.f6554n.a().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jB))));
        }
        if (this.f6556p.containsKey(fs2Var)) {
            d(fs2Var, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void c(fs2 fs2Var, String str) {
        if (this.f6553m.containsKey(fs2Var)) {
            long jB = this.f6555o.b() - ((Long) this.f6553m.get(fs2Var)).longValue();
            this.f6554n.a().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jB))));
        }
        if (this.f6556p.containsKey(fs2Var)) {
            d(fs2Var, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void h(fs2 fs2Var, String str) {
    }
}
