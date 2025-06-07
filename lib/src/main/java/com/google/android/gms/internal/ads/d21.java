package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class d21 extends z61 {

    /* renamed from: n, reason: collision with root package name */
    private boolean f7165n;

    public d21(Set set) {
        super(set);
        this.f7165n = false;
    }

    public final synchronized void a() {
        if (this.f7165n) {
            return;
        }
        q0(new y61() { // from class: com.google.android.gms.internal.ads.c21
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((f21) obj).l();
            }
        });
        this.f7165n = true;
    }
}
