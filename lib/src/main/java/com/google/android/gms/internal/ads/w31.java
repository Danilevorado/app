package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class w31 extends z61 implements f21, m31 {

    /* renamed from: n, reason: collision with root package name */
    private final hn2 f16945n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f16946o;

    public w31(Set set, hn2 hn2Var) {
        super(set);
        this.f16946o = new AtomicBoolean();
        this.f16945n = hn2Var;
    }

    private final void b() {
        k3.j4 j4Var;
        if (((Boolean) k3.w.c().b(ir.f10008l7)).booleanValue() && this.f16946o.compareAndSet(false, true) && (j4Var = this.f16945n.f9247f0) != null && j4Var.f24677m == 3) {
            q0(new y61() { // from class: com.google.android.gms.internal.ads.v31
                @Override // com.google.android.gms.internal.ads.y61
                public final void a(Object obj) {
                    this.f16560a.r0((y31) obj);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final void h() {
        if (this.f16945n.f9238b == 1) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.f21
    public final void l() {
        int i10 = this.f16945n.f9238b;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            b();
        }
    }

    final /* synthetic */ void r0(y31 y31Var) {
        y31Var.d(this.f16945n.f9247f0);
    }
}
