package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class b52 implements j3.f {

    /* renamed from: a, reason: collision with root package name */
    private j3.f f6342a;

    @Override // j3.f
    public final synchronized void a(View view) {
        j3.f fVar = this.f6342a;
        if (fVar != null) {
            fVar.a(view);
        }
    }

    @Override // j3.f
    public final synchronized void b() {
        j3.f fVar = this.f6342a;
        if (fVar != null) {
            fVar.b();
        }
    }

    public final synchronized void c(j3.f fVar) {
        this.f6342a = fVar;
    }

    @Override // j3.f
    public final synchronized void d() {
        j3.f fVar = this.f6342a;
        if (fVar != null) {
            fVar.d();
        }
    }
}
