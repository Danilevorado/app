package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
final class t33 implements Iterable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ CharSequence f15675m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ w33 f15676n;

    t33(w33 w33Var, CharSequence charSequence) {
        this.f15676n = w33Var;
        this.f15675m = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f15676n.g(this.f15675m);
    }

    public final String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        x23.b(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
