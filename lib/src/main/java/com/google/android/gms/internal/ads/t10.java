package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class t10 extends ag0 {

    /* renamed from: c, reason: collision with root package name */
    private final Object f15646c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final y10 f15647d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15648e;

    public t10(y10 y10Var) {
        this.f15647d = y10Var;
    }

    public final void g() {
        synchronized (this.f15646c) {
            if (this.f15648e) {
                return;
            }
            this.f15648e = true;
            e(new q10(this), new wf0());
            e(new r10(this), new s10(this));
        }
    }
}
