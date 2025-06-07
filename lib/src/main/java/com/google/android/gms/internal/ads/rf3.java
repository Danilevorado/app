package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class rf3 {

    /* renamed from: a, reason: collision with root package name */
    private bg3 f14766a = null;

    /* renamed from: b, reason: collision with root package name */
    private dw3 f14767b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f14768c = null;

    /* synthetic */ rf3(qf3 qf3Var) {
    }

    public final rf3 a(Integer num) {
        this.f14768c = num;
        return this;
    }

    public final rf3 b(dw3 dw3Var) {
        this.f14767b = dw3Var;
        return this;
    }

    public final rf3 c(bg3 bg3Var) {
        this.f14766a = bg3Var;
        return this;
    }

    public final tf3 d() throws GeneralSecurityException {
        dw3 dw3Var;
        cw3 cw3VarB;
        bg3 bg3Var = this.f14766a;
        if (bg3Var == null || (dw3Var = this.f14767b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (bg3Var.a() != dw3Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (bg3Var.c() && this.f14768c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f14766a.c() && this.f14768c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f14766a.b() == zf3.f18564d) {
            cw3VarB = cw3.b(new byte[0]);
        } else if (this.f14766a.b() == zf3.f18563c) {
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f14768c.intValue()).array());
        } else {
            if (this.f14766a.b() != zf3.f18562b) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f14766a.b())));
            }
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f14768c.intValue()).array());
        }
        return new tf3(this.f14766a, this.f14767b, cw3VarB, this.f14768c, null);
    }
}
