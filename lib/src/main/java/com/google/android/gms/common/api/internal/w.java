package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes.dex */
final class w implements GoogleApiClient.b, GoogleApiClient.c {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ y f5819m;

    /* synthetic */ w(y yVar, d4.m mVar) {
        this.f5819m = yVar;
    }

    @Override // d4.d
    public final void C(int i10) {
    }

    @Override // d4.d
    public final void L0(Bundle bundle) {
        ((y4.e) e4.p.l(this.f5819m.f5835k)).m(new v(this.f5819m));
    }

    @Override // d4.g
    public final void w0(b4.b bVar) {
        this.f5819m.f5826b.lock();
        try {
            if (this.f5819m.p(bVar)) {
                this.f5819m.h();
                this.f5819m.m();
            } else {
                this.f5819m.k(bVar);
            }
        } finally {
            this.f5819m.f5826b.unlock();
        }
    }
}
