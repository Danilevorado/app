package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class r9 implements ka {

    /* renamed from: b, reason: collision with root package name */
    private static final w9 f19260b = new p9();

    /* renamed from: a, reason: collision with root package name */
    private final w9 f19261a;

    public r9() {
        w9 w9Var;
        w9[] w9VarArr = new w9[2];
        w9VarArr[0] = q8.c();
        try {
            w9Var = (w9) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            w9Var = f19260b;
        }
        w9VarArr[1] = w9Var;
        q9 q9Var = new q9(w9VarArr);
        b9.f(q9Var, "messageInfoFactory");
        this.f19261a = q9Var;
    }

    private static boolean b(v9 v9Var) {
        return v9Var.d() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.ka
    public final ja a(Class cls) {
        da daVarA;
        m9 m9VarC;
        pa paVarA;
        k8 k8VarA;
        t9 t9VarA;
        pa paVarB0;
        k8 k8VarA2;
        la.g(cls);
        v9 v9VarA = this.f19261a.a(cls);
        if (v9VarA.b()) {
            if (u8.class.isAssignableFrom(cls)) {
                paVarB0 = la.b();
                k8VarA2 = m8.b();
            } else {
                paVarB0 = la.b0();
                k8VarA2 = m8.a();
            }
            return ca.j(paVarB0, k8VarA2, v9VarA.a());
        }
        if (u8.class.isAssignableFrom(cls)) {
            boolean zB = b(v9VarA);
            daVarA = ea.b();
            m9VarC = m9.d();
            paVarA = la.b();
            k8VarA = zB ? m8.b() : null;
            t9VarA = u9.b();
        } else {
            boolean zB2 = b(v9VarA);
            daVarA = ea.a();
            m9VarC = m9.c();
            if (zB2) {
                paVarA = la.b0();
                k8VarA = m8.a();
            } else {
                paVarA = la.a();
                k8VarA = null;
            }
            t9VarA = u9.a();
        }
        return ba.F(cls, v9VarA, daVarA, m9VarC, paVarA, k8VarA, t9VarA);
    }
}
