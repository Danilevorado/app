package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class pg4 extends ig4 {

    /* renamed from: h, reason: collision with root package name */
    private final HashMap f13889h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private Handler f13890i;

    /* renamed from: j, reason: collision with root package name */
    private wy3 f13891j;

    protected pg4() {
    }

    protected abstract hh4 A(Object obj, hh4 hh4Var);

    protected abstract void B(Object obj, jh4 jh4Var, h11 h11Var);

    @Override // com.google.android.gms.internal.ads.jh4
    public void N() {
        Iterator it = this.f13889h.values().iterator();
        while (it.hasNext()) {
            ((og4) it.next()).f13242a.N();
        }
    }

    @Override // com.google.android.gms.internal.ads.ig4
    protected final void q() {
        for (og4 og4Var : this.f13889h.values()) {
            og4Var.f13242a.c(og4Var.f13243b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ig4
    protected final void r() {
        for (og4 og4Var : this.f13889h.values()) {
            og4Var.f13242a.i(og4Var.f13243b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ig4
    protected void s(wy3 wy3Var) {
        this.f13891j = wy3Var;
        this.f13890i = sv2.A(null);
    }

    @Override // com.google.android.gms.internal.ads.ig4
    protected void v() {
        for (og4 og4Var : this.f13889h.values()) {
            og4Var.f13242a.e(og4Var.f13243b);
            og4Var.f13242a.k(og4Var.f13244c);
            og4Var.f13242a.b(og4Var.f13244c);
        }
        this.f13889h.clear();
    }

    protected final void x(final Object obj, jh4 jh4Var) {
        gt1.d(!this.f13889h.containsKey(obj));
        ih4 ih4Var = new ih4() { // from class: com.google.android.gms.internal.ads.mg4
            @Override // com.google.android.gms.internal.ads.ih4
            public final void a(jh4 jh4Var2, h11 h11Var) {
                this.f12098a.B(obj, jh4Var2, h11Var);
            }
        };
        ng4 ng4Var = new ng4(this, obj);
        this.f13889h.put(obj, new og4(jh4Var, ih4Var, ng4Var));
        Handler handler = this.f13890i;
        Objects.requireNonNull(handler);
        jh4Var.f(handler, ng4Var);
        Handler handler2 = this.f13890i;
        Objects.requireNonNull(handler2);
        jh4Var.h(handler2, ng4Var);
        jh4Var.j(ih4Var, this.f13891j, l());
        if (w()) {
            return;
        }
        jh4Var.c(ih4Var);
    }

    protected int y(Object obj, int i10) {
        return 0;
    }

    protected long z(Object obj, long j10) {
        return j10;
    }
}
