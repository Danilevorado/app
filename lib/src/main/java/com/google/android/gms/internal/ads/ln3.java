package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
abstract class ln3 {

    /* renamed from: a, reason: collision with root package name */
    private static final cw3 f11686a;

    /* renamed from: b, reason: collision with root package name */
    private static final xk3 f11687b;

    /* renamed from: c, reason: collision with root package name */
    private static final tk3 f11688c;

    /* renamed from: d, reason: collision with root package name */
    private static final ak3 f11689d;

    /* renamed from: e, reason: collision with root package name */
    private static final wj3 f11690e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11691f = 0;

    static {
        cw3 cw3VarA = vl3.a("type.googleapis.com/google.crypto.tink.HmacKey");
        f11686a = cw3VarA;
        f11687b = xk3.a(new vk3() { // from class: com.google.android.gms.internal.ads.hn3
        }, gn3.class, kl3.class);
        f11688c = tk3.a(new qk3() { // from class: com.google.android.gms.internal.ads.in3
        }, cw3VarA, kl3.class);
        f11689d = ak3.a(new yj3() { // from class: com.google.android.gms.internal.ads.jn3
        }, wm3.class, jl3.class);
        f11690e = wj3.b(new uj3() { // from class: com.google.android.gms.internal.ads.kn3
            @Override // com.google.android.gms.internal.ads.uj3
            public final gc3 a(ll3 ll3Var, rd3 rd3Var) throws GeneralSecurityException {
                dn3 dn3Var;
                en3 en3Var;
                int i10 = ln3.f11691f;
                if (!((jl3) ll3Var).g().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    nr3 nr3VarO = nr3.O(((jl3) ll3Var).d(), qx3.a());
                    if (nr3VarO.K() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    cn3 cn3Var = new cn3(null);
                    cn3Var.b(nr3VarO.Q().n());
                    cn3Var.c(nr3VarO.P().K());
                    int iP = nr3VarO.P().P();
                    ut3 ut3Var = ut3.UNKNOWN_PREFIX;
                    int i11 = iP - 2;
                    if (i11 == 1) {
                        dn3Var = dn3.f7419b;
                    } else if (i11 == 2) {
                        dn3Var = dn3.f7422e;
                    } else if (i11 == 3) {
                        dn3Var = dn3.f7421d;
                    } else if (i11 == 4) {
                        dn3Var = dn3.f7423f;
                    } else {
                        if (i11 != 5) {
                            throw new GeneralSecurityException("Unable to parse HashType: " + kr3.a(iP));
                        }
                        dn3Var = dn3.f7420c;
                    }
                    cn3Var.a(dn3Var);
                    ut3 ut3VarC = ((jl3) ll3Var).c();
                    int iOrdinal = ut3VarC.ordinal();
                    if (iOrdinal == 1) {
                        en3Var = en3.f7914b;
                    } else if (iOrdinal == 2) {
                        en3Var = en3.f7916d;
                    } else if (iOrdinal == 3) {
                        en3Var = en3.f7917e;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ut3VarC.a());
                        }
                        en3Var = en3.f7915c;
                    }
                    cn3Var.d(en3Var);
                    gn3 gn3VarE = cn3Var.e();
                    tm3 tm3Var = new tm3(null);
                    tm3Var.c(gn3VarE);
                    tm3Var.b(dw3.b(nr3VarO.Q().f(), rd3Var));
                    tm3Var.a(((jl3) ll3Var).e());
                    return tm3Var.d();
                } catch (ny3 | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            }
        }, cw3VarA, jl3.class);
    }

    public static void a(ok3 ok3Var) {
        ok3Var.f(f11687b);
        ok3Var.e(f11688c);
        ok3Var.d(f11689d);
        ok3Var.c(f11690e);
    }
}
