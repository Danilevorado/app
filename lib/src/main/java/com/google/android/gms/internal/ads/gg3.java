package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
abstract class gg3 {

    /* renamed from: a, reason: collision with root package name */
    private static final cw3 f8714a;

    /* renamed from: b, reason: collision with root package name */
    private static final xk3 f8715b;

    /* renamed from: c, reason: collision with root package name */
    private static final tk3 f8716c;

    /* renamed from: d, reason: collision with root package name */
    private static final ak3 f8717d;

    /* renamed from: e, reason: collision with root package name */
    private static final wj3 f8718e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8719f = 0;

    static {
        cw3 cw3VarA = vl3.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f8714a = cw3VarA;
        f8715b = xk3.a(new vk3() { // from class: com.google.android.gms.internal.ads.cg3
        }, bg3.class, kl3.class);
        f8716c = tk3.a(new qk3() { // from class: com.google.android.gms.internal.ads.dg3
        }, cw3VarA, kl3.class);
        f8717d = ak3.a(new yj3() { // from class: com.google.android.gms.internal.ads.eg3
        }, tf3.class, jl3.class);
        f8718e = wj3.b(new uj3() { // from class: com.google.android.gms.internal.ads.fg3
            @Override // com.google.android.gms.internal.ads.uj3
            public final gc3 a(ll3 ll3Var, rd3 rd3Var) throws GeneralSecurityException {
                zf3 zf3Var;
                int i10 = gg3.f8719f;
                if (!((jl3) ll3Var).g().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    xp3 xp3VarN = xp3.N(((jl3) ll3Var).d(), qx3.a());
                    if (xp3VarN.K() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    yf3 yf3Var = new yf3(null);
                    yf3Var.a(xp3VarN.O().n());
                    ut3 ut3VarC = ((jl3) ll3Var).c();
                    ut3 ut3Var = ut3.UNKNOWN_PREFIX;
                    int iOrdinal = ut3VarC.ordinal();
                    if (iOrdinal == 1) {
                        zf3Var = zf3.f18562b;
                    } else if (iOrdinal == 2) {
                        zf3Var = zf3.f18563c;
                    } else if (iOrdinal == 3) {
                        zf3Var = zf3.f18564d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ut3VarC.a());
                        }
                        zf3Var = zf3.f18563c;
                    }
                    yf3Var.b(zf3Var);
                    bg3 bg3VarC = yf3Var.c();
                    rf3 rf3Var = new rf3(null);
                    rf3Var.c(bg3VarC);
                    rf3Var.b(dw3.b(xp3VarN.O().f(), rd3Var));
                    rf3Var.a(((jl3) ll3Var).e());
                    return rf3Var.d();
                } catch (ny3 unused) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            }
        }, cw3VarA, jl3.class);
    }

    public static void a(ok3 ok3Var) {
        ok3Var.f(f8715b);
        ok3Var.e(f8716c);
        ok3Var.d(f8717d);
        ok3Var.c(f8718e);
    }
}
