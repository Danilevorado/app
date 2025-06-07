package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
final class r43 extends p43 implements ListIterator {

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ t43 f14622p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r43(t43 t43Var) {
        super(t43Var);
        this.f14622p = t43Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r43(t43 t43Var, int i10) {
        super(t43Var, ((List) t43Var.f14138n).listIterator(i10));
        this.f14622p = t43Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f14622p.isEmpty();
        b();
        ((ListIterator) this.f13585m).add(obj);
        this.f14622p.f15691r.f16167q++;
        if (zIsEmpty) {
            this.f14622p.e();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f13585m).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f13585m).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.f13585m).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f13585m).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f13585m).set(obj);
    }
}
