package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t62 implements y31 {

    /* renamed from: m, reason: collision with root package name */
    private final AtomicReference f15702m = new AtomicReference();

    public final void a(k3.c2 c2Var) {
        this.f15702m.set(c2Var);
    }

    @Override // com.google.android.gms.internal.ads.y31
    public final void d(final k3.j4 j4Var) {
        kk2.a(this.f15702m, new jk2() { // from class: com.google.android.gms.internal.ads.s62
            @Override // com.google.android.gms.internal.ads.jk2
            public final void a(Object obj) {
                ((k3.c2) obj).F2(j4Var);
            }
        });
    }
}
