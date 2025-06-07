package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class ge3 {

    /* renamed from: a, reason: collision with root package name */
    private re3 f8694a = null;

    /* renamed from: b, reason: collision with root package name */
    private dw3 f8695b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f8696c = null;

    /* synthetic */ ge3(fe3 fe3Var) {
    }

    public final ge3 a(Integer num) {
        this.f8696c = num;
        return this;
    }

    public final ge3 b(dw3 dw3Var) {
        this.f8695b = dw3Var;
        return this;
    }

    public final ge3 c(re3 re3Var) {
        this.f8694a = re3Var;
        return this;
    }

    public final ie3 d() throws GeneralSecurityException {
        dw3 dw3Var;
        cw3 cw3VarB;
        re3 re3Var = this.f8694a;
        if (re3Var == null || (dw3Var = this.f8695b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (re3Var.a() != dw3Var.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (re3Var.c() && this.f8696c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f8694a.c() && this.f8696c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f8694a.b() == pe3.f13746d) {
            cw3VarB = cw3.b(new byte[0]);
        } else if (this.f8694a.b() == pe3.f13745c) {
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f8696c.intValue()).array());
        } else {
            if (this.f8694a.b() != pe3.f13744b) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f8694a.b())));
            }
            cw3VarB = cw3.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f8696c.intValue()).array());
        }
        return new ie3(this.f8694a, this.f8695b, cw3VarB, this.f8696c, null);
    }
}
