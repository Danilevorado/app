package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class rw1 implements ms2 {

    /* renamed from: m, reason: collision with root package name */
    private final Map f14994m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    private final Map f14995n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private final vs2 f14996o;

    public rw1(Set set, vs2 vs2Var) {
        this.f14996o = vs2Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            qw1 qw1Var = (qw1) it.next();
            this.f14994m.put(qw1Var.f14519b, qw1Var.f14518a);
            this.f14995n.put(qw1Var.f14520c, qw1Var.f14518a);
        }
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void a(fs2 fs2Var, String str) {
        this.f14996o.d("task.".concat(String.valueOf(str)));
        if (this.f14994m.containsKey(fs2Var)) {
            this.f14996o.d("label.".concat(String.valueOf((String) this.f14994m.get(fs2Var))));
        }
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void b(fs2 fs2Var, String str, Throwable th) {
        this.f14996o.e("task.".concat(String.valueOf(str)), "f.");
        if (this.f14995n.containsKey(fs2Var)) {
            this.f14996o.e("label.".concat(String.valueOf((String) this.f14995n.get(fs2Var))), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void c(fs2 fs2Var, String str) {
        this.f14996o.e("task.".concat(String.valueOf(str)), "s.");
        if (this.f14995n.containsKey(fs2Var)) {
            this.f14996o.e("label.".concat(String.valueOf((String) this.f14995n.get(fs2Var))), "s.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void h(fs2 fs2Var, String str) {
    }
}
