package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n44 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12413a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f12414b;

    /* renamed from: c, reason: collision with root package name */
    public int f12415c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f12416d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f12417e;

    /* renamed from: f, reason: collision with root package name */
    public int f12418f;

    /* renamed from: g, reason: collision with root package name */
    public int f12419g;

    /* renamed from: h, reason: collision with root package name */
    public int f12420h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f12421i;

    /* renamed from: j, reason: collision with root package name */
    private final m34 f12422j;

    public n44() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f12421i = cryptoInfo;
        this.f12422j = sv2.f15560a >= 24 ? new m34(cryptoInfo, null) : null;
    }

    public final MediaCodec.CryptoInfo a() {
        return this.f12421i;
    }

    public final void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f12416d == null) {
            int[] iArr = new int[1];
            this.f12416d = iArr;
            this.f12421i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f12416d;
        iArr2[0] = iArr2[0] + i10;
    }

    public final void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f12418f = i10;
        this.f12416d = iArr;
        this.f12417e = iArr2;
        this.f12414b = bArr;
        this.f12413a = bArr2;
        this.f12415c = i11;
        this.f12419g = i12;
        this.f12420h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f12421i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (sv2.f15560a >= 24) {
            m34 m34Var = this.f12422j;
            Objects.requireNonNull(m34Var);
            m34.a(m34Var, i12, i13);
        }
    }
}
