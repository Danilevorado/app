package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import e4.c;

/* loaded from: classes.dex */
final class ul implements c.a {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ xl f16377m;

    ul(xl xlVar) {
        this.f16377m = xlVar;
    }

    @Override // e4.c.a
    public final void C(int i10) {
        synchronized (this.f16377m.f17622c) {
            this.f16377m.f17625f = null;
            this.f16377m.f17622c.notifyAll();
        }
    }

    @Override // e4.c.a
    public final void L0(Bundle bundle) {
        xl xlVar;
        synchronized (this.f16377m.f17622c) {
            try {
                xlVar = this.f16377m;
            } catch (DeadObjectException e5) {
                ze0.e("Unable to obtain a cache service instance.", e5);
                xl.h(this.f16377m);
            }
            if (xlVar.f17623d != null) {
                xlVar.f17625f = xlVar.f17623d.o0();
                this.f16377m.f17622c.notifyAll();
            } else {
                this.f16377m.f17622c.notifyAll();
            }
        }
    }
}
