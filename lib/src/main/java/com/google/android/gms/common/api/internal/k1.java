package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class k1 implements d4.v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f5762a;

    /* synthetic */ k1(g gVar, d4.i0 i0Var) {
        this.f5762a = gVar;
    }

    @Override // d4.v
    public final void a(Bundle bundle) {
        this.f5762a.f5727y.lock();
        try {
            this.f5762a.f5725w = b4.b.f4399q;
            g.u(this.f5762a);
        } finally {
            this.f5762a.f5727y.unlock();
        }
    }

    @Override // d4.v
    public final void b(int i10, boolean z10) {
        this.f5762a.f5727y.lock();
        try {
            g gVar = this.f5762a;
            if (gVar.f5726x) {
                gVar.f5726x = false;
                g.s(this.f5762a, i10, z10);
            } else {
                gVar.f5726x = true;
                this.f5762a.f5718p.C(i10);
            }
        } finally {
            this.f5762a.f5727y.unlock();
        }
    }

    @Override // d4.v
    public final void c(b4.b bVar) {
        this.f5762a.f5727y.lock();
        try {
            this.f5762a.f5725w = bVar;
            g.u(this.f5762a);
        } finally {
            this.f5762a.f5727y.unlock();
        }
    }
}
