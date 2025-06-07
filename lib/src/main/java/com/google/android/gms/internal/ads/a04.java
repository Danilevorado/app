package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class a04 implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    private final ArrayDeque f5883m;

    /* renamed from: n, reason: collision with root package name */
    private rw3 f5884n;

    /* synthetic */ a04(ww3 ww3Var, zz3 zz3Var) {
        rw3 rw3VarC;
        if (ww3Var instanceof c04) {
            c04 c04Var = (c04) ww3Var;
            ArrayDeque arrayDeque = new ArrayDeque(c04Var.p());
            this.f5883m = arrayDeque;
            arrayDeque.push(c04Var);
            rw3VarC = c(c04Var.f6750r);
        } else {
            this.f5883m = null;
            rw3VarC = (rw3) ww3Var;
        }
        this.f5884n = rw3VarC;
    }

    private final rw3 c(ww3 ww3Var) {
        while (ww3Var instanceof c04) {
            c04 c04Var = (c04) ww3Var;
            this.f5883m.push(c04Var);
            ww3Var = c04Var.f6750r;
        }
        return (rw3) ww3Var;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final rw3 next() {
        rw3 rw3VarC;
        rw3 rw3Var = this.f5884n;
        if (rw3Var == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f5883m;
            rw3VarC = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            rw3VarC = c(((c04) this.f5883m.pop()).f6751s);
        } while (rw3VarC.e());
        this.f5884n = rw3VarC;
        return rw3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5884n != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
