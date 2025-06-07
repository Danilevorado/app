package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class hg3 extends ud3 {

    /* renamed from: a, reason: collision with root package name */
    private final mg3 f9132a;

    /* renamed from: b, reason: collision with root package name */
    private final dw3 f9133b;

    /* renamed from: c, reason: collision with root package name */
    private final cw3 f9134c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f9135d;

    private hg3(mg3 mg3Var, dw3 dw3Var, cw3 cw3Var, Integer num) {
        this.f9132a = mg3Var;
        this.f9133b = dw3Var;
        this.f9134c = cw3Var;
        this.f9135d = num;
    }

    public static hg3 a(lg3 lg3Var, dw3 dw3Var, Integer num) throws GeneralSecurityException {
        cw3 cw3VarB;
        lg3 lg3Var2 = lg3.f11574d;
        if (lg3Var != lg3Var2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + lg3Var.toString() + " the value of idRequirement must be non-null");
        }
        if (lg3Var == lg3Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (dw3Var.a() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + dw3Var.a());
        }
        mg3 mg3VarB = mg3.b(lg3Var);
        if (mg3VarB.a() == lg3Var2) {
            cw3VarB = cw3.b(new byte[0]);
        } else if (mg3VarB.a() == lg3.f11573c) {
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (mg3VarB.a() != lg3.f11572b) {
                throw new IllegalStateException("Unknown Variant: ".concat(mg3VarB.a().toString()));
            }
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new hg3(mg3VarB, dw3Var, cw3VarB, num);
    }
}
