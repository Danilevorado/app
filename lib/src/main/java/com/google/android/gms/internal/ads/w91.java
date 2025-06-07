package com.google.android.gms.internal.ads;

import d3.w;
import java.util.Set;

/* loaded from: classes.dex */
public final class w91 extends z61 {

    /* renamed from: n, reason: collision with root package name */
    private boolean f17030n;

    protected w91(Set set) {
        super(set);
    }

    public final void a() {
        q0(new y61() { // from class: com.google.android.gms.internal.ads.s91
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((w.a) obj).a();
            }
        });
    }

    public final void b() {
        q0(new y61() { // from class: com.google.android.gms.internal.ads.u91
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((w.a) obj).c();
            }
        });
    }

    public final synchronized void d() {
        if (!this.f17030n) {
            q0(t91.f15746a);
            this.f17030n = true;
        }
        q0(new y61() { // from class: com.google.android.gms.internal.ads.v91
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((w.a) obj).d();
            }
        });
    }

    public final synchronized void f() {
        q0(t91.f15746a);
        this.f17030n = true;
    }
}
