package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class ze4 extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f18544b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f18545c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f18550h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f18551i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f18552j;

    /* renamed from: k, reason: collision with root package name */
    private long f18553k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f18554l;

    /* renamed from: m, reason: collision with root package name */
    private IllegalStateException f18555m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f18543a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final ef4 f18546d = new ef4();

    /* renamed from: e, reason: collision with root package name */
    private final ef4 f18547e = new ef4();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f18548f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f18549g = new ArrayDeque();

    ze4(HandlerThread handlerThread) {
        this.f18544b = handlerThread;
    }

    public static /* synthetic */ void d(ze4 ze4Var) {
        synchronized (ze4Var.f18543a) {
            if (ze4Var.f18554l) {
                return;
            }
            long j10 = ze4Var.f18553k - 1;
            ze4Var.f18553k = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 >= 0) {
                ze4Var.i();
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException();
            synchronized (ze4Var.f18543a) {
                ze4Var.f18555m = illegalStateException;
            }
        }
    }

    private final void h(MediaFormat mediaFormat) {
        this.f18547e.b(-2);
        this.f18549g.add(mediaFormat);
    }

    private final void i() {
        if (!this.f18549g.isEmpty()) {
            this.f18551i = (MediaFormat) this.f18549g.getLast();
        }
        this.f18546d.c();
        this.f18547e.c();
        this.f18548f.clear();
        this.f18549g.clear();
    }

    private final void j() {
        IllegalStateException illegalStateException = this.f18555m;
        if (illegalStateException == null) {
            return;
        }
        this.f18555m = null;
        throw illegalStateException;
    }

    private final void k() {
        MediaCodec.CodecException codecException = this.f18552j;
        if (codecException == null) {
            return;
        }
        this.f18552j = null;
        throw codecException;
    }

    private final boolean l() {
        return this.f18553k > 0 || this.f18554l;
    }

    public final int a() {
        synchronized (this.f18543a) {
            int iA = -1;
            if (l()) {
                return -1;
            }
            j();
            k();
            if (!this.f18546d.d()) {
                iA = this.f18546d.a();
            }
            return iA;
        }
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f18543a) {
            if (l()) {
                return -1;
            }
            j();
            k();
            if (this.f18547e.d()) {
                return -1;
            }
            int iA = this.f18547e.a();
            if (iA >= 0) {
                gt1.b(this.f18550h);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f18548f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iA == -2) {
                this.f18550h = (MediaFormat) this.f18549g.remove();
                iA = -2;
            }
            return iA;
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f18543a) {
            mediaFormat = this.f18550h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.f18543a) {
            this.f18553k++;
            Handler handler = this.f18545c;
            int i10 = sv2.f15560a;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ye4
                @Override // java.lang.Runnable
                public final void run() {
                    ze4.d(this.f18006m);
                }
            });
        }
    }

    public final void f(MediaCodec mediaCodec) {
        gt1.f(this.f18545c == null);
        this.f18544b.start();
        Handler handler = new Handler(this.f18544b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f18545c = handler;
    }

    public final void g() {
        synchronized (this.f18543a) {
            this.f18554l = true;
            this.f18544b.quit();
            i();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f18543a) {
            this.f18552j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f18543a) {
            this.f18546d.b(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f18543a) {
            MediaFormat mediaFormat = this.f18551i;
            if (mediaFormat != null) {
                h(mediaFormat);
                this.f18551i = null;
            }
            this.f18547e.b(i10);
            this.f18548f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f18543a) {
            h(mediaFormat);
            this.f18551i = null;
        }
    }
}
