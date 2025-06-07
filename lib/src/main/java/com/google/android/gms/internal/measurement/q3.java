package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    final y f19208a;

    /* renamed from: b, reason: collision with root package name */
    final r4 f19209b;

    /* renamed from: c, reason: collision with root package name */
    final r4 f19210c;

    /* renamed from: d, reason: collision with root package name */
    final t7 f19211d;

    public q3() {
        y yVar = new y();
        this.f19208a = yVar;
        r4 r4Var = new r4(null, yVar);
        this.f19210c = r4Var;
        this.f19209b = r4Var.a();
        t7 t7Var = new t7();
        this.f19211d = t7Var;
        r4Var.g("require", new ge(t7Var));
        t7Var.a("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.p2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ie();
            }
        });
        r4Var.g("runtime.counter", new i(Double.valueOf(0.0d)));
    }

    public final q a(r4 r4Var, p5... p5VarArr) {
        q qVarA = q.f19193b;
        for (p5 p5Var : p5VarArr) {
            qVarA = t6.a(p5Var);
            s5.c(this.f19210c);
            if ((qVarA instanceof r) || (qVarA instanceof p)) {
                qVarA = this.f19208a.a(r4Var, qVarA);
            }
        }
        return qVarA;
    }
}
