package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
abstract class pf3 {

    /* renamed from: a, reason: collision with root package name */
    private static final cw3 f13867a;

    /* renamed from: b, reason: collision with root package name */
    private static final xk3 f13868b;

    /* renamed from: c, reason: collision with root package name */
    private static final tk3 f13869c;

    /* renamed from: d, reason: collision with root package name */
    private static final ak3 f13870d;

    /* renamed from: e, reason: collision with root package name */
    private static final wj3 f13871e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13872f = 0;

    static {
        cw3 cw3VarA = vl3.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f13867a = cw3VarA;
        f13868b = xk3.a(new vk3() { // from class: com.google.android.gms.internal.ads.jf3
        }, if3.class, kl3.class);
        f13869c = tk3.a(new qk3() { // from class: com.google.android.gms.internal.ads.kf3
        }, cw3VarA, kl3.class);
        f13870d = ak3.a(new yj3() { // from class: com.google.android.gms.internal.ads.lf3
        }, af3.class, jl3.class);
        f13871e = wj3.b(new uj3() { // from class: com.google.android.gms.internal.ads.of3
            @Override // com.google.android.gms.internal.ads.uj3
            public final gc3 a(ll3 ll3Var, rd3 rd3Var) throws GeneralSecurityException {
                gf3 gf3Var;
                int i10 = pf3.f13872f;
                if (!((jl3) ll3Var).g().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    qp3 qp3VarN = qp3.N(((jl3) ll3Var).d(), qx3.a());
                    if (qp3VarN.K() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ff3 ff3Var = new ff3(null);
                    ff3Var.b(qp3VarN.O().n());
                    ff3Var.a(12);
                    ff3Var.c(16);
                    ut3 ut3VarC = ((jl3) ll3Var).c();
                    ut3 ut3Var = ut3.UNKNOWN_PREFIX;
                    int iOrdinal = ut3VarC.ordinal();
                    if (iOrdinal == 1) {
                        gf3Var = gf3.f8703b;
                    } else if (iOrdinal == 2) {
                        gf3Var = gf3.f8704c;
                    } else if (iOrdinal == 3) {
                        gf3Var = gf3.f8705d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ut3VarC.a());
                        }
                        gf3Var = gf3.f8704c;
                    }
                    ff3Var.d(gf3Var);
                    if3 if3VarE = ff3Var.e();
                    ye3 ye3Var = new ye3(null);
                    ye3Var.c(if3VarE);
                    ye3Var.b(dw3.b(qp3VarN.O().f(), rd3Var));
                    ye3Var.a(((jl3) ll3Var).e());
                    return ye3Var.d();
                } catch (ny3 unused) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            }
        }, cw3VarA, jl3.class);
    }

    public static void a(ok3 ok3Var) {
        ok3Var.f(f13868b);
        ok3Var.e(f13869c);
        ok3Var.d(f13870d);
        ok3Var.c(f13871e);
    }
}
