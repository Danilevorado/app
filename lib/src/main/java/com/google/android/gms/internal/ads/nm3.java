package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
abstract class nm3 {

    /* renamed from: a, reason: collision with root package name */
    private static final cw3 f12707a;

    /* renamed from: b, reason: collision with root package name */
    private static final xk3 f12708b;

    /* renamed from: c, reason: collision with root package name */
    private static final tk3 f12709c;

    /* renamed from: d, reason: collision with root package name */
    private static final ak3 f12710d;

    /* renamed from: e, reason: collision with root package name */
    private static final wj3 f12711e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f12712f = 0;

    static {
        cw3 cw3VarA = vl3.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f12707a = cw3VarA;
        f12708b = xk3.a(new vk3() { // from class: com.google.android.gms.internal.ads.jm3
        }, im3.class, kl3.class);
        f12709c = tk3.a(new qk3() { // from class: com.google.android.gms.internal.ads.km3
        }, cw3VarA, kl3.class);
        f12710d = ak3.a(new yj3() { // from class: com.google.android.gms.internal.ads.lm3
        }, zl3.class, jl3.class);
        f12711e = wj3.b(new uj3() { // from class: com.google.android.gms.internal.ads.mm3
            @Override // com.google.android.gms.internal.ads.uj3
            public final gc3 a(ll3 ll3Var, rd3 rd3Var) throws GeneralSecurityException {
                gm3 gm3Var;
                int i10 = nm3.f12712f;
                if (!((jl3) ll3Var).g().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    io3 io3VarN = io3.N(((jl3) ll3Var).d(), qx3.a());
                    if (io3VarN.K() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    fm3 fm3Var = new fm3(null);
                    fm3Var.a(io3VarN.P().n());
                    fm3Var.b(io3VarN.O().K());
                    ut3 ut3VarC = ((jl3) ll3Var).c();
                    ut3 ut3Var = ut3.UNKNOWN_PREFIX;
                    int iOrdinal = ut3VarC.ordinal();
                    if (iOrdinal == 1) {
                        gm3Var = gm3.f8809b;
                    } else if (iOrdinal == 2) {
                        gm3Var = gm3.f8811d;
                    } else if (iOrdinal == 3) {
                        gm3Var = gm3.f8812e;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ut3VarC.a());
                        }
                        gm3Var = gm3.f8810c;
                    }
                    fm3Var.c(gm3Var);
                    im3 im3VarD = fm3Var.d();
                    xl3 xl3Var = new xl3(null);
                    xl3Var.c(im3VarD);
                    xl3Var.a(dw3.b(io3VarN.P().f(), rd3Var));
                    xl3Var.b(((jl3) ll3Var).e());
                    return xl3Var.d();
                } catch (ny3 | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
        }, cw3VarA, jl3.class);
    }

    public static void a(ok3 ok3Var) {
        ok3Var.f(f12708b);
        ok3Var.e(f12709c);
        ok3Var.d(f12710d);
        ok3Var.c(f12711e);
    }
}
