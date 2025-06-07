package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class te4 implements hf4 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f15806a;

    /* renamed from: b, reason: collision with root package name */
    private final ze4 f15807b;

    /* renamed from: c, reason: collision with root package name */
    private final xe4 f15808c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15809d;

    /* renamed from: e, reason: collision with root package name */
    private int f15810e = 0;

    /* synthetic */ te4(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, se4 se4Var) {
        this.f15806a = mediaCodec;
        this.f15807b = new ze4(handlerThread);
        this.f15808c = new xe4(mediaCodec, handlerThread2);
    }

    static /* synthetic */ void n(te4 te4Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        te4Var.f15807b.f(te4Var.f15806a);
        int i11 = sv2.f15560a;
        Trace.beginSection("configureCodec");
        te4Var.f15806a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        te4Var.f15808c.g();
        Trace.beginSection("startCodec");
        te4Var.f15806a.start();
        Trace.endSection();
        te4Var.f15810e = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String o(int i10, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            str2 = "Audio";
        } else if (i10 == 2) {
            str2 = "Video";
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            str2 = ")";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final ByteBuffer C(int i10) {
        return this.f15806a.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final int a() {
        this.f15808c.c();
        return this.f15807b.a();
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void b(int i10, long j10) {
        this.f15806a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void c(int i10) {
        this.f15806a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void c0(Bundle bundle) {
        this.f15806a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final MediaFormat d() {
        return this.f15807b.c();
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void e(int i10, int i11, int i12, long j10, int i13) {
        this.f15808c.d(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void f(int i10, boolean z10) {
        this.f15806a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void g(int i10, int i11, n44 n44Var, long j10, int i12) {
        this.f15808c.e(i10, 0, n44Var, j10, 0);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void h(Surface surface) {
        this.f15806a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void i() {
        this.f15808c.b();
        this.f15806a.flush();
        this.f15807b.e();
        this.f15806a.start();
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        this.f15808c.c();
        return this.f15807b.b(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final void l() {
        try {
            if (this.f15810e == 1) {
                this.f15808c.f();
                this.f15807b.g();
            }
            this.f15810e = 2;
            if (this.f15809d) {
                return;
            }
            this.f15806a.release();
            this.f15809d = true;
        } catch (Throwable th) {
            if (!this.f15809d) {
                this.f15806a.release();
                this.f15809d = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final boolean r() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hf4
    public final ByteBuffer w(int i10) {
        return this.f15806a.getOutputBuffer(i10);
    }
}
