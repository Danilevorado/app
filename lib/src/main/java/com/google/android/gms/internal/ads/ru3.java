package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes.dex */
public final class ru3 implements fc3 {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f14976f = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final uu3 f14977a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14978b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f14979c;

    /* renamed from: d, reason: collision with root package name */
    private final pu3 f14980d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14981e;

    public ru3(ECPublicKey eCPublicKey, byte[] bArr, String str, int i10, pu3 pu3Var) throws GeneralSecurityException {
        sj3.b(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f14977a = new uu3(eCPublicKey);
        this.f14979c = bArr;
        this.f14978b = str;
        this.f14981e = i10;
        this.f14980d = pu3Var;
    }

    @Override // com.google.android.gms.internal.ads.fc3
    public final byte[] a(byte[] bArr, byte[] bArr2) throws IllegalStateException, GeneralSecurityException {
        tu3 tu3VarA = this.f14977a.a(this.f14978b, this.f14979c, bArr2, this.f14980d.a(), this.f14981e);
        byte[] bArrA = this.f14980d.b(tu3VarA.b()).a(bArr, f14976f);
        byte[] bArrA2 = tu3VarA.a();
        return ByteBuffer.allocate(bArrA2.length + bArrA.length).put(bArrA2).put(bArrA).array();
    }
}
