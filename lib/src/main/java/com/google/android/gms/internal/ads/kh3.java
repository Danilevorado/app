package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
abstract class kh3 {

    /* renamed from: a, reason: collision with root package name */
    private static final cw3 f11062a;

    /* renamed from: b, reason: collision with root package name */
    private static final xk3 f11063b;

    /* renamed from: c, reason: collision with root package name */
    private static final tk3 f11064c;

    /* renamed from: d, reason: collision with root package name */
    private static final ak3 f11065d;

    /* renamed from: e, reason: collision with root package name */
    private static final wj3 f11066e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11067f = 0;

    static {
        cw3 cw3VarA = vl3.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f11062a = cw3VarA;
        f11063b = xk3.a(new vk3() { // from class: com.google.android.gms.internal.ads.gh3
        }, fh3.class, kl3.class);
        f11064c = tk3.a(new qk3() { // from class: com.google.android.gms.internal.ads.hh3
        }, cw3VarA, kl3.class);
        f11065d = ak3.a(new yj3() { // from class: com.google.android.gms.internal.ads.ih3
        }, ah3.class, jl3.class);
        f11066e = wj3.b(new uj3() { // from class: com.google.android.gms.internal.ads.jh3
            @Override // com.google.android.gms.internal.ads.uj3
            public final gc3 a(ll3 ll3Var, rd3 rd3Var) throws GeneralSecurityException {
                eh3 eh3Var;
                int i10 = kh3.f11067f;
                if (!((jl3) ll3Var).g().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    bu3 bu3VarN = bu3.N(((jl3) ll3Var).d(), qx3.a());
                    if (bu3VarN.K() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ut3 ut3VarC = ((jl3) ll3Var).c();
                    ut3 ut3Var = ut3.UNKNOWN_PREFIX;
                    int iOrdinal = ut3VarC.ordinal();
                    if (iOrdinal == 1) {
                        eh3Var = eh3.f7784b;
                    } else if (iOrdinal == 2) {
                        eh3Var = eh3.f7785c;
                    } else if (iOrdinal == 3) {
                        eh3Var = eh3.f7786d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ut3VarC.a());
                        }
                        eh3Var = eh3.f7785c;
                    }
                    return ah3.a(eh3Var, dw3.b(bu3VarN.O().f(), rd3Var), ((jl3) ll3Var).e());
                } catch (ny3 unused) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            }
        }, cw3VarA, jl3.class);
    }

    public static void a(ok3 ok3Var) {
        ok3Var.f(f11063b);
        ok3Var.e(f11064c);
        ok3Var.d(f11065d);
        ok3Var.c(f11066e);
    }
}
