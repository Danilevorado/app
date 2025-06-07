package com.google.android.gms.internal.ads;

import e4.c;

/* loaded from: classes.dex */
final class vl implements c.b {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ xl f16766m;

    vl(xl xlVar) {
        this.f16766m = xlVar;
    }

    @Override // e4.c.b
    public final void w0(b4.b bVar) {
        synchronized (this.f16766m.f17622c) {
            this.f16766m.f17625f = null;
            xl xlVar = this.f16766m;
            if (xlVar.f17623d != null) {
                xlVar.f17623d = null;
            }
            this.f16766m.f17622c.notifyAll();
        }
    }
}
