package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class fe0 extends m3.b0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ je0 f8245c;

    fe0(je0 je0Var) {
        this.f8245c = je0Var;
    }

    @Override // m3.b0
    public final void a() {
        je0 je0Var = this.f8245c;
        or orVar = new or(je0Var.f10450e, je0Var.f10451f.f8252m);
        synchronized (this.f8245c.f10446a) {
            try {
                j3.t.g();
                rr.a(this.f8245c.f10453h, orVar);
            } catch (IllegalArgumentException e5) {
                ze0.h("Cannot config CSI reporter.", e5);
            }
        }
    }
}
