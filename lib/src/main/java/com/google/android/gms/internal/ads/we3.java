package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
abstract class we3 {

    /* renamed from: a, reason: collision with root package name */
    private static final cw3 f17096a;

    /* renamed from: b, reason: collision with root package name */
    private static final xk3 f17097b;

    /* renamed from: c, reason: collision with root package name */
    private static final tk3 f17098c;

    /* renamed from: d, reason: collision with root package name */
    private static final ak3 f17099d;

    /* renamed from: e, reason: collision with root package name */
    private static final wj3 f17100e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f17101f = 0;

    static {
        cw3 cw3VarA = vl3.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f17096a = cw3VarA;
        f17097b = xk3.a(new vk3() { // from class: com.google.android.gms.internal.ads.se3
        }, re3.class, kl3.class);
        f17098c = tk3.a(new qk3() { // from class: com.google.android.gms.internal.ads.te3
        }, cw3VarA, kl3.class);
        f17099d = ak3.a(new yj3() { // from class: com.google.android.gms.internal.ads.ue3
        }, ie3.class, jl3.class);
        f17100e = wj3.b(new uj3() { // from class: com.google.android.gms.internal.ads.ve3
            @Override // com.google.android.gms.internal.ads.uj3
            public final gc3 a(ll3 ll3Var, rd3 rd3Var) throws GeneralSecurityException {
                pe3 pe3Var;
                int i10 = we3.f17101f;
                if (!((jl3) ll3Var).g().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    hp3 hp3VarN = hp3.N(((jl3) ll3Var).d(), qx3.a());
                    if (hp3VarN.K() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    oe3 oe3Var = new oe3(null);
                    oe3Var.b(hp3VarN.P().n());
                    oe3Var.a(hp3VarN.O().K());
                    oe3Var.c(16);
                    ut3 ut3VarC = ((jl3) ll3Var).c();
                    ut3 ut3Var = ut3.UNKNOWN_PREFIX;
                    int iOrdinal = ut3VarC.ordinal();
                    if (iOrdinal == 1) {
                        pe3Var = pe3.f13744b;
                    } else if (iOrdinal == 2) {
                        pe3Var = pe3.f13745c;
                    } else if (iOrdinal == 3) {
                        pe3Var = pe3.f13746d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ut3VarC.a());
                        }
                        pe3Var = pe3.f13745c;
                    }
                    oe3Var.d(pe3Var);
                    re3 re3VarE = oe3Var.e();
                    ge3 ge3Var = new ge3(null);
                    ge3Var.c(re3VarE);
                    ge3Var.b(dw3.b(hp3VarN.P().f(), rd3Var));
                    ge3Var.a(((jl3) ll3Var).e());
                    return ge3Var.d();
                } catch (ny3 unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            }
        }, cw3VarA, jl3.class);
    }

    public static void a(ok3 ok3Var) {
        ok3Var.f(f17097b);
        ok3Var.e(f17098c);
        ok3Var.d(f17099d);
        ok3Var.c(f17100e);
    }
}
