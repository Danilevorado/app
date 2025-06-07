package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    final q3 f18869a;

    /* renamed from: b, reason: collision with root package name */
    r4 f18870b;

    /* renamed from: c, reason: collision with root package name */
    final c f18871c;

    /* renamed from: d, reason: collision with root package name */
    private final je f18872d;

    public c1() {
        q3 q3Var = new q3();
        this.f18869a = q3Var;
        this.f18870b = q3Var.f19209b.a();
        this.f18871c = new c();
        this.f18872d = new je();
        q3Var.f19211d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18823a.b();
            }
        });
        q3Var.f19211d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new r8(this.f18832a.f18871c);
            }
        });
    }

    public final c a() {
        return this.f18871c;
    }

    final /* synthetic */ j b() {
        return new fe(this.f18872d);
    }

    public final void c(k5 k5Var) throws x1 {
        j jVar;
        try {
            this.f18870b = this.f18869a.f19209b.a();
            if (this.f18869a.a(this.f18870b, (p5[]) k5Var.x().toArray(new p5[0])) instanceof h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (i5 i5Var : k5Var.v().y()) {
                List listX = i5Var.x();
                String strW = i5Var.w();
                Iterator it = listX.iterator();
                while (it.hasNext()) {
                    q qVarA = this.f18869a.a(this.f18870b, (p5) it.next());
                    if (!(qVarA instanceof n)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    r4 r4Var = this.f18870b;
                    if (r4Var.h(strW)) {
                        q qVarD = r4Var.d(strW);
                        if (!(qVarD instanceof j)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strW)));
                        }
                        jVar = (j) qVarD;
                    } else {
                        jVar = null;
                    }
                    if (jVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strW)));
                    }
                    jVar.a(this.f18870b, Collections.singletonList(qVarA));
                }
            }
        } catch (Throwable th) {
            throw new x1(th);
        }
    }

    public final void d(String str, Callable callable) {
        this.f18869a.f19211d.a(str, callable);
    }

    public final boolean e(b bVar) throws x1 {
        try {
            this.f18871c.d(bVar);
            this.f18869a.f19210c.g("runtime.counter", new i(Double.valueOf(0.0d)));
            this.f18872d.b(this.f18870b.a(), this.f18871c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th) {
            throw new x1(th);
        }
    }

    public final boolean f() {
        return !this.f18871c.c().isEmpty();
    }

    public final boolean g() {
        c cVar = this.f18871c;
        return !cVar.b().equals(cVar.a());
    }
}
