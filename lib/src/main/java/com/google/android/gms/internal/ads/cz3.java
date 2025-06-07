package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class cz3 implements e04 {

    /* renamed from: b, reason: collision with root package name */
    private static final hz3 f7128b = new az3();

    /* renamed from: a, reason: collision with root package name */
    private final hz3 f7129a;

    public cz3() {
        hz3 hz3Var;
        hz3[] hz3VarArr = new hz3[2];
        hz3VarArr[0] = xx3.c();
        try {
            hz3Var = (hz3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            hz3Var = f7128b;
        }
        hz3VarArr[1] = hz3Var;
        bz3 bz3Var = new bz3(hz3VarArr);
        byte[] bArr = ly3.f11871d;
        this.f7129a = bz3Var;
    }

    private static boolean b(gz3 gz3Var) {
        return gz3Var.d() == 1;
    }

    @Override // com.google.android.gms.internal.ads.e04
    public final d04 a(Class cls) {
        oz3 oz3VarA;
        yy3 yy3VarD;
        i04 i04VarY;
        rx3 rx3VarA;
        ez3 ez3VarA;
        i04 i04VarX;
        rx3 rx3VarA2;
        f04.e(cls);
        gz3 gz3VarA = this.f7129a.a(cls);
        if (gz3VarA.b()) {
            if (by3.class.isAssignableFrom(cls)) {
                i04VarX = f04.a();
                rx3VarA2 = tx3.b();
            } else {
                i04VarX = f04.X();
                rx3VarA2 = tx3.a();
            }
            return nz3.k(i04VarX, rx3VarA2, gz3VarA.a());
        }
        if (by3.class.isAssignableFrom(cls)) {
            boolean zB = b(gz3VarA);
            oz3VarA = pz3.b();
            yy3VarD = yy3.e();
            i04VarY = f04.a();
            rx3VarA = zB ? tx3.b() : null;
            ez3VarA = fz3.b();
        } else {
            boolean zB2 = b(gz3VarA);
            oz3VarA = pz3.a();
            yy3VarD = yy3.d();
            if (zB2) {
                i04VarY = f04.X();
                rx3VarA = tx3.a();
            } else {
                i04VarY = f04.Y();
                rx3VarA = null;
            }
            ez3VarA = fz3.a();
        }
        return mz3.M(cls, gz3VarA, oz3VarA, yy3VarD, i04VarY, rx3VarA, ez3VarA);
    }
}
