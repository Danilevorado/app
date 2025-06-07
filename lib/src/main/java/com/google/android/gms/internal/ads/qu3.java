package com.google.android.gms.internal.ads;

import java.security.interfaces.ECPrivateKey;

/* loaded from: classes.dex */
public final class qu3 implements ec3 {

    /* renamed from: a, reason: collision with root package name */
    private final ECPrivateKey f14502a;

    /* renamed from: b, reason: collision with root package name */
    private final su3 f14503b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14504c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f14505d;

    /* renamed from: e, reason: collision with root package name */
    private final pu3 f14506e;

    public qu3(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i10, pu3 pu3Var) {
        this.f14502a = eCPrivateKey;
        this.f14503b = new su3(eCPrivateKey);
        this.f14505d = bArr;
        this.f14504c = str;
        this.f14506e = pu3Var;
    }
}
