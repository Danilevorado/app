package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class j1 implements d4.v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f5758a;

    /* synthetic */ j1(g gVar, d4.h0 h0Var) {
        this.f5758a = gVar;
    }

    @Override // d4.v
    public final void a(Bundle bundle) {
        this.f5758a.f5727y.lock();
        try {
            g.t(this.f5758a, bundle);
            this.f5758a.f5724v = b4.b.f4399q;
            g.u(this.f5758a);
        } finally {
            this.f5758a.f5727y.unlock();
        }
    }

    @Override // d4.v
    public final void b(int i10, boolean z10) {
        this.f5758a.f5727y.lock();
        try {
            g gVar = this.f5758a;
            if (gVar.f5726x || gVar.f5725w == null || !gVar.f5725w.y()) {
                this.f5758a.f5726x = false;
                g.s(this.f5758a, i10, z10);
            } else {
                this.f5758a.f5726x = true;
                this.f5758a.f5719q.C(i10);
            }
        } finally {
            this.f5758a.f5727y.unlock();
        }
    }

    @Override // d4.v
    public final void c(b4.b bVar) {
        this.f5758a.f5727y.lock();
        try {
            this.f5758a.f5724v = bVar;
            g.u(this.f5758a);
        } finally {
            this.f5758a.f5727y.unlock();
        }
    }
}
