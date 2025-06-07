package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class n2 implements g3 {

    /* renamed from: b, reason: collision with root package name */
    private static final s2 f19608b = new l2();

    /* renamed from: a, reason: collision with root package name */
    private final s2 f19609a;

    public n2() {
        s2 s2Var;
        s2[] s2VarArr = new s2[2];
        s2VarArr[0] = k1.c();
        try {
            s2Var = (s2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            s2Var = f19608b;
        }
        s2VarArr[1] = s2Var;
        m2 m2Var = new m2(s2VarArr);
        byte[] bArr = v1.f19661d;
        this.f19609a = m2Var;
    }

    private static boolean b(r2 r2Var) {
        return r2Var.d() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final f3 a(Class cls) {
        z2 z2VarA;
        k2 k2VarC;
        v3 v3VarT;
        d1 d1VarA;
        p2 p2VarA;
        v3 v3VarT2;
        d1 d1VarA2;
        h3.y(cls);
        r2 r2VarA = this.f19609a.a(cls);
        if (r2VarA.b()) {
            if (n1.class.isAssignableFrom(cls)) {
                v3VarT2 = h3.u();
                d1VarA2 = f1.b();
            } else {
                v3VarT2 = h3.t();
                d1VarA2 = f1.a();
            }
            return y2.j(v3VarT2, d1VarA2, r2VarA.a());
        }
        if (n1.class.isAssignableFrom(cls)) {
            boolean zB = b(r2VarA);
            z2VarA = a3.b();
            k2VarC = k2.d();
            v3VarT = h3.u();
            d1VarA = zB ? f1.b() : null;
            p2VarA = q2.b();
        } else {
            boolean zB2 = b(r2VarA);
            z2VarA = a3.a();
            k2VarC = k2.c();
            v3VarT = h3.t();
            d1VarA = zB2 ? f1.a() : null;
            p2VarA = q2.a();
        }
        return x2.A(cls, r2VarA, z2VarA, k2VarC, v3VarT, d1VarA, p2VarA);
    }
}
