package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class xl3 {

    /* renamed from: a, reason: collision with root package name */
    private im3 f17627a = null;

    /* renamed from: b, reason: collision with root package name */
    private dw3 f17628b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f17629c = null;

    /* synthetic */ xl3(wl3 wl3Var) {
    }

    public final xl3 a(dw3 dw3Var) {
        this.f17628b = dw3Var;
        return this;
    }

    public final xl3 b(Integer num) {
        this.f17629c = num;
        return this;
    }

    public final xl3 c(im3 im3Var) {
        this.f17627a = im3Var;
        return this;
    }

    public final zl3 d() throws GeneralSecurityException {
        dw3 dw3Var;
        cw3 cw3VarB;
        im3 im3Var = this.f17627a;
        if (im3Var == null || (dw3Var = this.f17628b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (im3Var.a() != dw3Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (im3Var.d() && this.f17629c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f17627a.d() && this.f17629c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f17627a.c() == gm3.f8812e) {
            cw3VarB = cw3.b(new byte[0]);
        } else if (this.f17627a.c() == gm3.f8811d || this.f17627a.c() == gm3.f8810c) {
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f17629c.intValue()).array());
        } else {
            if (this.f17627a.c() != gm3.f8809b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f17627a.c())));
            }
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f17629c.intValue()).array());
        }
        return new zl3(this.f17627a, this.f17628b, cw3VarB, this.f17629c, null);
    }
}
