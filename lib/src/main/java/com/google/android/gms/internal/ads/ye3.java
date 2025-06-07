package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class ye3 {

    /* renamed from: a, reason: collision with root package name */
    private if3 f18003a = null;

    /* renamed from: b, reason: collision with root package name */
    private dw3 f18004b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f18005c = null;

    /* synthetic */ ye3(xe3 xe3Var) {
    }

    public final ye3 a(Integer num) {
        this.f18005c = num;
        return this;
    }

    public final ye3 b(dw3 dw3Var) {
        this.f18004b = dw3Var;
        return this;
    }

    public final ye3 c(if3 if3Var) {
        this.f18003a = if3Var;
        return this;
    }

    public final af3 d() throws GeneralSecurityException {
        dw3 dw3Var;
        cw3 cw3VarB;
        if3 if3Var = this.f18003a;
        if (if3Var == null || (dw3Var = this.f18004b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (if3Var.a() != dw3Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (if3Var.c() && this.f18005c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f18003a.c() && this.f18005c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f18003a.b() == gf3.f8705d) {
            cw3VarB = cw3.b(new byte[0]);
        } else if (this.f18003a.b() == gf3.f8704c) {
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f18005c.intValue()).array());
        } else {
            if (this.f18003a.b() != gf3.f8703b) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f18003a.b())));
            }
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f18005c.intValue()).array());
        }
        return new af3(this.f18003a, this.f18004b, cw3VarB, this.f18005c, null);
    }
}
