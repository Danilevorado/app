package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class cn3 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f6996a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f6997b = null;

    /* renamed from: c, reason: collision with root package name */
    private dn3 f6998c = null;

    /* renamed from: d, reason: collision with root package name */
    private en3 f6999d = en3.f7917e;

    /* synthetic */ cn3(bn3 bn3Var) {
    }

    public final cn3 a(dn3 dn3Var) {
        this.f6998c = dn3Var;
        return this;
    }

    public final cn3 b(int i10) {
        this.f6996a = Integer.valueOf(i10);
        return this;
    }

    public final cn3 c(int i10) {
        this.f6997b = Integer.valueOf(i10);
        return this;
    }

    public final cn3 d(en3 en3Var) {
        this.f6999d = en3Var;
        return this;
    }

    public final gn3 e() throws GeneralSecurityException {
        Integer num = this.f6996a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f6997b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f6998c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f6999d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f6996a));
        }
        int iIntValue = this.f6997b.intValue();
        dn3 dn3Var = this.f6998c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(iIntValue)));
        }
        if (dn3Var == dn3.f7419b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(iIntValue)));
            }
        } else if (dn3Var == dn3.f7420c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(iIntValue)));
            }
        } else if (dn3Var == dn3.f7421d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(iIntValue)));
            }
        } else if (dn3Var == dn3.f7422e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(iIntValue)));
            }
        } else {
            if (dn3Var != dn3.f7423f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(iIntValue)));
            }
        }
        return new gn3(this.f6996a.intValue(), this.f6997b.intValue(), this.f6999d, this.f6998c, null);
    }
}
