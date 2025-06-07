package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class ah3 extends ud3 {

    /* renamed from: a, reason: collision with root package name */
    private final fh3 f6089a;

    /* renamed from: b, reason: collision with root package name */
    private final dw3 f6090b;

    /* renamed from: c, reason: collision with root package name */
    private final cw3 f6091c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f6092d;

    private ah3(fh3 fh3Var, dw3 dw3Var, cw3 cw3Var, Integer num) {
        this.f6089a = fh3Var;
        this.f6090b = dw3Var;
        this.f6091c = cw3Var;
        this.f6092d = num;
    }

    public static ah3 a(eh3 eh3Var, dw3 dw3Var, Integer num) throws GeneralSecurityException {
        cw3 cw3VarB;
        eh3 eh3Var2 = eh3.f7786d;
        if (eh3Var != eh3Var2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + eh3Var.toString() + " the value of idRequirement must be non-null");
        }
        if (eh3Var == eh3Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (dw3Var.a() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + dw3Var.a());
        }
        fh3 fh3VarB = fh3.b(eh3Var);
        if (fh3VarB.a() == eh3Var2) {
            cw3VarB = cw3.b(new byte[0]);
        } else if (fh3VarB.a() == eh3.f7785c) {
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (fh3VarB.a() != eh3.f7784b) {
                throw new IllegalStateException("Unknown Variant: ".concat(fh3VarB.a().toString()));
            }
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new ah3(fh3VarB, dw3Var, cw3VarB, num);
    }
}
