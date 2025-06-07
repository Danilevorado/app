package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class n34 implements Iterator, Closeable, dc {

    /* renamed from: s, reason: collision with root package name */
    private static final cc f12388s = new l34("eof ");

    /* renamed from: t, reason: collision with root package name */
    private static final u34 f12389t = u34.b(n34.class);

    /* renamed from: m, reason: collision with root package name */
    protected zb f12390m;

    /* renamed from: n, reason: collision with root package name */
    protected o34 f12391n;

    /* renamed from: o, reason: collision with root package name */
    cc f12392o = null;

    /* renamed from: p, reason: collision with root package name */
    long f12393p = 0;

    /* renamed from: q, reason: collision with root package name */
    long f12394q = 0;

    /* renamed from: r, reason: collision with root package name */
    private final List f12395r = new ArrayList();

    public void close() {
    }

    @Override // java.util.Iterator
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final cc next() {
        cc ccVarA;
        cc ccVar = this.f12392o;
        if (ccVar != null && ccVar != f12388s) {
            this.f12392o = null;
            return ccVar;
        }
        o34 o34Var = this.f12391n;
        if (o34Var == null || this.f12393p >= this.f12394q) {
            this.f12392o = f12388s;
            throw new NoSuchElementException();
        }
        try {
            synchronized (o34Var) {
                this.f12391n.h(this.f12393p);
                ccVarA = this.f12390m.a(this.f12391n, this);
                this.f12393p = this.f12391n.b();
            }
            return ccVarA;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List g() {
        return (this.f12391n == null || this.f12392o == f12388s) ? this.f12395r : new t34(this.f12395r, this);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        cc ccVar = this.f12392o;
        if (ccVar == f12388s) {
            return false;
        }
        if (ccVar != null) {
            return true;
        }
        try {
            this.f12392o = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f12392o = f12388s;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final void s(o34 o34Var, long j10, zb zbVar) {
        this.f12391n = o34Var;
        this.f12393p = o34Var.b();
        o34Var.h(o34Var.b() + j10);
        this.f12394q = o34Var.b();
        this.f12390m = zbVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < this.f12395r.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((cc) this.f12395r.get(i10)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
