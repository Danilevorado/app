package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class o3 implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    private int f19615m = -1;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19616n;

    /* renamed from: o, reason: collision with root package name */
    private Iterator f19617o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ s3 f19618p;

    /* synthetic */ o3(s3 s3Var, n3 n3Var) {
        this.f19618p = s3Var;
    }

    private final Iterator b() {
        if (this.f19617o == null) {
            this.f19617o = this.f19618p.f19643o.entrySet().iterator();
        }
        return this.f19617o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f19615m + 1 >= this.f19618p.f19642n.size()) {
            return !this.f19618p.f19643o.isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f19616n = true;
        int i10 = this.f19615m + 1;
        this.f19615m = i10;
        return (Map.Entry) (i10 < this.f19618p.f19642n.size() ? this.f19618p.f19642n.get(this.f19615m) : b().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f19616n) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f19616n = false;
        this.f19618p.n();
        if (this.f19615m >= this.f19618p.f19642n.size()) {
            b().remove();
            return;
        }
        s3 s3Var = this.f19618p;
        int i10 = this.f19615m;
        this.f19615m = i10 - 1;
        s3Var.l(i10);
    }
}
