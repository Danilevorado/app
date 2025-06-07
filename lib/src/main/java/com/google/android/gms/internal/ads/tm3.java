package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class tm3 {

    /* renamed from: a, reason: collision with root package name */
    private gn3 f15900a = null;

    /* renamed from: b, reason: collision with root package name */
    private dw3 f15901b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f15902c = null;

    /* synthetic */ tm3(sm3 sm3Var) {
    }

    public final tm3 a(Integer num) {
        this.f15902c = num;
        return this;
    }

    public final tm3 b(dw3 dw3Var) {
        this.f15901b = dw3Var;
        return this;
    }

    public final tm3 c(gn3 gn3Var) {
        this.f15900a = gn3Var;
        return this;
    }

    public final wm3 d() throws GeneralSecurityException {
        dw3 dw3Var;
        cw3 cw3VarB;
        gn3 gn3Var = this.f15900a;
        if (gn3Var == null || (dw3Var = this.f15901b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (gn3Var.a() != dw3Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (gn3Var.d() && this.f15902c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f15900a.d() && this.f15902c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f15900a.c() == en3.f7917e) {
            cw3VarB = cw3.b(new byte[0]);
        } else if (this.f15900a.c() == en3.f7916d || this.f15900a.c() == en3.f7915c) {
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f15902c.intValue()).array());
        } else {
            if (this.f15900a.c() != en3.f7914b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f15900a.c())));
            }
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f15902c.intValue()).array());
        }
        return new wm3(this.f15900a, this.f15901b, cw3VarB, this.f15902c, null);
    }
}
