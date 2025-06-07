package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class gg4 implements hf4 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f8720a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer[] f8721b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f8722c;

    /* synthetic */ gg4(MediaCodec mediaCodec, fg4 fg4Var) {
        this.f8720a = mediaCodec;
        if (sv2.f15560a < 21) {
            this.f8721b = mediaCodec.getInputBuffers();
            this.f8722c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final ByteBuffer C(int i10) {
        return sv2.f15560a >= 21 ? this.f8720a.getInputBuffer(i10) : this.f8721b[i10];
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final int a() {
        return this.f8720a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void b(int i10, long j10) {
        this.f8720a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void c(int i10) {
        this.f8720a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void c0(Bundle bundle) {
        this.f8720a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final MediaFormat d() {
        return this.f8720a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void e(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        this.f8720a.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void f(int i10, boolean z10) {
        this.f8720a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void g(int i10, int i11, n44 n44Var, long j10, int i12) throws MediaCodec.CryptoException {
        this.f8720a.queueSecureInputBuffer(i10, 0, n44Var.a(), j10, 0);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void h(Surface surface) {
        this.f8720a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void i() {
        this.f8720a.flush();
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f8720a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3) {
                if (sv2.f15560a < 21) {
                    this.f8722c = this.f8720a.getOutputBuffers();
                }
                iDequeueOutputBuffer = -3;
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void l() {
        this.f8721b = null;
        this.f8722c = null;
        this.f8720a.release();
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final boolean r() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final ByteBuffer w(int i10) {
        return sv2.f15560a >= 21 ? this.f8720a.getOutputBuffer(i10) : this.f8722c[i10];
    }
}
