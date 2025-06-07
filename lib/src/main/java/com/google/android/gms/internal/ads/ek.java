package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class ek {

    /* renamed from: b, reason: collision with root package name */
    int f7846b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f7845a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f7847c = new LinkedList();

    public final dk a(boolean z10) {
        synchronized (this.f7845a) {
            dk dkVar = null;
            if (this.f7847c.isEmpty()) {
                ze0.b("Queue empty");
                return null;
            }
            int i10 = 0;
            if (this.f7847c.size() < 2) {
                dk dkVar2 = (dk) this.f7847c.get(0);
                if (z10) {
                    this.f7847c.remove(0);
                } else {
                    dkVar2.i();
                }
                return dkVar2;
            }
            int i11 = Integer.MIN_VALUE;
            int i12 = 0;
            for (dk dkVar3 : this.f7847c) {
                int iB = dkVar3.b();
                if (iB > i11) {
                    i10 = i12;
                }
                int i13 = iB > i11 ? iB : i11;
                if (iB > i11) {
                    dkVar = dkVar3;
                }
                i12++;
                i11 = i13;
            }
            this.f7847c.remove(i10);
            return dkVar;
        }
    }

    public final void b(dk dkVar) {
        synchronized (this.f7845a) {
            if (this.f7847c.size() >= 10) {
                ze0.b("Queue is full, current size = " + this.f7847c.size());
                this.f7847c.remove(0);
            }
            int i10 = this.f7846b;
            this.f7846b = i10 + 1;
            dkVar.j(i10);
            dkVar.n();
            this.f7847c.add(dkVar);
        }
    }

    public final boolean c(dk dkVar) {
        synchronized (this.f7845a) {
            Iterator it = this.f7847c.iterator();
            while (it.hasNext()) {
                dk dkVar2 = (dk) it.next();
                if (j3.t.q().h().V()) {
                    if (!j3.t.q().h().G() && !dkVar.equals(dkVar2) && dkVar2.f().equals(dkVar.f())) {
                        it.remove();
                        return true;
                    }
                } else if (!dkVar.equals(dkVar2) && dkVar2.d().equals(dkVar.d())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean d(dk dkVar) {
        synchronized (this.f7845a) {
            return this.f7847c.contains(dkVar);
        }
    }
}
