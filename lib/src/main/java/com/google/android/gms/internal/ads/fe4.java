package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class fe4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8249a;

    /* renamed from: b, reason: collision with root package name */
    public final hh4 f8250b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f8251c;

    public fe4() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private fe4(CopyOnWriteArrayList copyOnWriteArrayList, int i10, hh4 hh4Var) {
        this.f8251c = copyOnWriteArrayList;
        this.f8249a = 0;
        this.f8250b = hh4Var;
    }

    public final fe4 a(int i10, hh4 hh4Var) {
        return new fe4(this.f8251c, 0, hh4Var);
    }

    public final void b(Handler handler, ge4 ge4Var) {
        this.f8251c.add(new ee4(handler, ge4Var));
    }

    public final void c(ge4 ge4Var) {
        Iterator it = this.f8251c.iterator();
        while (it.hasNext()) {
            ee4 ee4Var = (ee4) it.next();
            if (ee4Var.f7734b == ge4Var) {
                this.f8251c.remove(ee4Var);
            }
        }
    }
}
