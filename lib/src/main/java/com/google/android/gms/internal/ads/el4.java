package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class el4 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f7898a = new CopyOnWriteArrayList();

    public final void a(Handler handler, fl4 fl4Var) {
        c(fl4Var);
        this.f7898a.add(new dl4(handler, fl4Var));
    }

    public final void b(final int i10, final long j10, final long j11) {
        Iterator it = this.f7898a.iterator();
        while (it.hasNext()) {
            final dl4 dl4Var = (dl4) it.next();
            if (!dl4Var.f7405c) {
                dl4Var.f7403a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.cl4
                    @Override // java.lang.Runnable
                    public final void run() {
                        dl4 dl4Var2 = dl4Var;
                        dl4Var2.f7404b.e(i10, j10, j11);
                    }
                });
            }
        }
    }

    public final void c(fl4 fl4Var) {
        Iterator it = this.f7898a.iterator();
        while (it.hasNext()) {
            dl4 dl4Var = (dl4) it.next();
            if (dl4Var.f7404b == fl4Var) {
                dl4Var.c();
                this.f7898a.remove(dl4Var);
            }
        }
    }
}
