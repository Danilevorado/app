package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class wi1 {

    /* renamed from: a, reason: collision with root package name */
    private final c63 f17140a;

    /* renamed from: b, reason: collision with root package name */
    private final List f17141b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f17142c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    private xj1 f17143d;

    /* renamed from: e, reason: collision with root package name */
    private xj1 f17144e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17145f;

    public wi1(c63 c63Var) {
        this.f17140a = c63Var;
        xj1 xj1Var = xj1.f17589e;
        this.f17143d = xj1Var;
        this.f17144e = xj1Var;
        this.f17145f = false;
    }

    private final int i() {
        return this.f17142c.length - 1;
    }

    private final void j(ByteBuffer byteBuffer) {
        boolean z10;
        do {
            int i10 = 0;
            z10 = false;
            while (i10 <= i()) {
                if (!this.f17142c[i10].hasRemaining()) {
                    zl1 zl1Var = (zl1) this.f17141b.get(i10);
                    if (!zl1Var.g()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f17142c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zl1.f18622a;
                        long jRemaining = byteBuffer2.remaining();
                        zl1Var.c(byteBuffer2);
                        this.f17142c[i10] = zl1Var.b();
                        long jRemaining2 = jRemaining - byteBuffer2.remaining();
                        boolean z11 = true;
                        if (jRemaining2 <= 0 && !this.f17142c[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    } else if (!this.f17142c[i10].hasRemaining() && i10 < i()) {
                        ((zl1) this.f17141b.get(i10 + 1)).f();
                    }
                }
                i10++;
            }
        } while (z10);
    }

    public final xj1 a(xj1 xj1Var) throws yk1 {
        if (xj1Var.equals(xj1.f17589e)) {
            throw new yk1("Unhandled input format:", xj1Var);
        }
        for (int i10 = 0; i10 < this.f17140a.size(); i10++) {
            zl1 zl1Var = (zl1) this.f17140a.get(i10);
            xj1 xj1VarA = zl1Var.a(xj1Var);
            if (zl1Var.h()) {
                gt1.f(!xj1VarA.equals(xj1.f17589e));
                xj1Var = xj1VarA;
            }
        }
        this.f17144e = xj1Var;
        return xj1Var;
    }

    public final ByteBuffer b() {
        if (!h()) {
            return zl1.f18622a;
        }
        ByteBuffer byteBuffer = this.f17142c[i()];
        if (!byteBuffer.hasRemaining()) {
            j(zl1.f18622a);
        }
        return byteBuffer;
    }

    public final void c() {
        this.f17141b.clear();
        this.f17143d = this.f17144e;
        this.f17145f = false;
        for (int i10 = 0; i10 < this.f17140a.size(); i10++) {
            zl1 zl1Var = (zl1) this.f17140a.get(i10);
            zl1Var.d();
            if (zl1Var.h()) {
                this.f17141b.add(zl1Var);
            }
        }
        this.f17142c = new ByteBuffer[this.f17141b.size()];
        for (int i11 = 0; i11 <= i(); i11++) {
            this.f17142c[i11] = ((zl1) this.f17141b.get(i11)).b();
        }
    }

    public final void d() {
        if (!h() || this.f17145f) {
            return;
        }
        this.f17145f = true;
        ((zl1) this.f17141b.get(0)).f();
    }

    public final void e(ByteBuffer byteBuffer) {
        if (!h() || this.f17145f) {
            return;
        }
        j(byteBuffer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi1)) {
            return false;
        }
        wi1 wi1Var = (wi1) obj;
        if (this.f17140a.size() != wi1Var.f17140a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f17140a.size(); i10++) {
            if (this.f17140a.get(i10) != wi1Var.f17140a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        for (int i10 = 0; i10 < this.f17140a.size(); i10++) {
            zl1 zl1Var = (zl1) this.f17140a.get(i10);
            zl1Var.d();
            zl1Var.e();
        }
        this.f17142c = new ByteBuffer[0];
        xj1 xj1Var = xj1.f17589e;
        this.f17143d = xj1Var;
        this.f17144e = xj1Var;
        this.f17145f = false;
    }

    public final boolean g() {
        return this.f17145f && ((zl1) this.f17141b.get(i())).g() && !this.f17142c[i()].hasRemaining();
    }

    public final boolean h() {
        return !this.f17141b.isEmpty();
    }

    public final int hashCode() {
        return this.f17140a.hashCode();
    }
}
