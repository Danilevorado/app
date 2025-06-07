package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
abstract class sg3 {

    /* renamed from: a, reason: collision with root package name */
    private static final cw3 f15238a;

    /* renamed from: b, reason: collision with root package name */
    private static final xk3 f15239b;

    /* renamed from: c, reason: collision with root package name */
    private static final tk3 f15240c;

    /* renamed from: d, reason: collision with root package name */
    private static final ak3 f15241d;

    /* renamed from: e, reason: collision with root package name */
    private static final wj3 f15242e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f15243f = 0;

    static {
        cw3 cw3VarA = vl3.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f15238a = cw3VarA;
        f15239b = xk3.a(new vk3() { // from class: com.google.android.gms.internal.ads.ng3
        }, mg3.class, kl3.class);
        f15240c = tk3.a(new qk3() { // from class: com.google.android.gms.internal.ads.pg3
        }, cw3VarA, kl3.class);
        f15241d = ak3.a(new yj3() { // from class: com.google.android.gms.internal.ads.qg3
        }, hg3.class, jl3.class);
        f15242e = wj3.b(new uj3() { // from class: com.google.android.gms.internal.ads.rg3
            @Override // com.google.android.gms.internal.ads.uj3
            public final gc3 a(ll3 ll3Var, rd3 rd3Var) throws GeneralSecurityException {
                lg3 lg3Var;
                int i10 = sg3.f15243f;
                if (!((jl3) ll3Var).g().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    jq3 jq3VarN = jq3.N(((jl3) ll3Var).d(), qx3.a());
                    if (jq3VarN.K() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ut3 ut3VarC = ((jl3) ll3Var).c();
                    ut3 ut3Var = ut3.UNKNOWN_PREFIX;
                    int iOrdinal = ut3VarC.ordinal();
                    if (iOrdinal == 1) {
                        lg3Var = lg3.f11572b;
                    } else if (iOrdinal == 2) {
                        lg3Var = lg3.f11573c;
                    } else if (iOrdinal == 3) {
                        lg3Var = lg3.f11574d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ut3VarC.a());
                        }
                        lg3Var = lg3.f11573c;
                    }
                    return hg3.a(lg3Var, dw3.b(jq3VarN.O().f(), rd3Var), ((jl3) ll3Var).e());
                } catch (ny3 unused) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            }
        }, cw3VarA, jl3.class);
    }

    public static void a(ok3 ok3Var) {
        ok3Var.f(f15239b);
        ok3Var.e(f15240c);
        ok3Var.d(f15241d);
        ok3Var.c(f15242e);
    }
}
