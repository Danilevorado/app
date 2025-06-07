package com.google.android.gms.common.api.internal;

import android.os.Looper;
import e4.c;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class p implements c.InterfaceC0124c {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f5786a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f5787b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5788c;

    public p(y yVar, com.google.android.gms.common.api.a aVar, boolean z10) {
        this.f5786a = new WeakReference(yVar);
        this.f5787b = aVar;
        this.f5788c = z10;
    }

    @Override // e4.c.InterfaceC0124c
    public final void a(b4.b bVar) {
        y yVar = (y) this.f5786a.get();
        if (yVar == null) {
            return;
        }
        e4.p.p(Looper.myLooper() == yVar.f5825a.f5742z.h(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        yVar.f5826b.lock();
        try {
            if (yVar.n(0)) {
                if (!bVar.y()) {
                    yVar.l(bVar, this.f5787b, this.f5788c);
                }
                if (yVar.o()) {
                    yVar.m();
                }
            }
        } finally {
            yVar.f5826b.unlock();
        }
    }
}
