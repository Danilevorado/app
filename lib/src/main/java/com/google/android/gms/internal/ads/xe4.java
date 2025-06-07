package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class xe4 {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque f17527g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f17528h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f17529a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f17530b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f17531c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f17532d;

    /* renamed from: e, reason: collision with root package name */
    private final jw1 f17533e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17534f;

    public xe4(MediaCodec mediaCodec, HandlerThread handlerThread) {
        jw1 jw1Var = new jw1(hu1.f9421a);
        this.f17529a = mediaCodec;
        this.f17530b = handlerThread;
        this.f17533e = jw1Var;
        this.f17532d = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* bridge */ /* synthetic */ void a(com.google.android.gms.internal.ads.xe4 r9, android.os.Message r10) throws android.media.MediaCodec.CryptoException {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L3e
            r2 = 1
            if (r0 == r2) goto L22
            r2 = 2
            if (r0 == r2) goto L1c
            java.util.concurrent.atomic.AtomicReference r9 = r9.f17532d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            com.google.android.gms.internal.ads.ue4.a(r9, r1, r0)
            goto L58
        L1c:
            com.google.android.gms.internal.ads.jw1 r9 = r9.f17533e
            r9.e()
            goto L58
        L22:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.we4 r10 = (com.google.android.gms.internal.ads.we4) r10
            int r3 = r10.f17102a
            android.media.MediaCodec$CryptoInfo r5 = r10.f17105d
            long r6 = r10.f17106e
            int r8 = r10.f17107f
            java.lang.Object r0 = com.google.android.gms.internal.ads.xe4.f17528h     // Catch: java.lang.RuntimeException -> L3c
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L3c
            android.media.MediaCodec r2 = r9.f17529a     // Catch: java.lang.Throwable -> L39
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            goto L57
        L39:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r2     // Catch: java.lang.RuntimeException -> L3c
        L3c:
            r0 = move-exception
            goto L52
        L3e:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.we4 r10 = (com.google.android.gms.internal.ads.we4) r10
            int r3 = r10.f17102a
            int r5 = r10.f17104c
            long r6 = r10.f17106e
            int r8 = r10.f17107f
            android.media.MediaCodec r2 = r9.f17529a     // Catch: java.lang.RuntimeException -> L51
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L51
            goto L57
        L51:
            r0 = move-exception
        L52:
            java.util.concurrent.atomic.AtomicReference r9 = r9.f17532d
            com.google.android.gms.internal.ads.ue4.a(r9, r1, r0)
        L57:
            r1 = r10
        L58:
            if (r1 == 0) goto L65
            java.util.ArrayDeque r9 = com.google.android.gms.internal.ads.xe4.f17527g
            monitor-enter(r9)
            r9.add(r1)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L62
            return
        L62:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L62
            throw r10
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xe4.a(com.google.android.gms.internal.ads.xe4, android.os.Message):void");
    }

    private static we4 h() {
        ArrayDeque arrayDeque = f17527g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new we4();
            }
            return (we4) arrayDeque.removeFirst();
        }
    }

    private static byte[] i(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] j(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public final void b() {
        if (this.f17534f) {
            try {
                Handler handler = this.f17531c;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages(null);
                this.f17533e.c();
                Handler handler2 = this.f17531c;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.f17533e.a();
            } catch (InterruptedException e5) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e5);
            }
        }
    }

    public final void c() {
        RuntimeException runtimeException = (RuntimeException) this.f17532d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void d(int i10, int i11, int i12, long j10, int i13) {
        c();
        we4 we4VarH = h();
        we4VarH.a(i10, 0, i12, j10, i13);
        Handler handler = this.f17531c;
        int i14 = sv2.f15560a;
        handler.obtainMessage(0, we4VarH).sendToTarget();
    }

    public final void e(int i10, int i11, n44 n44Var, long j10, int i12) {
        c();
        we4 we4VarH = h();
        we4VarH.a(i10, 0, 0, j10, 0);
        MediaCodec.CryptoInfo cryptoInfo = we4VarH.f17105d;
        cryptoInfo.numSubSamples = n44Var.f12418f;
        cryptoInfo.numBytesOfClearData = j(n44Var.f12416d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j(n44Var.f12417e, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrI = i(n44Var.f12414b, cryptoInfo.key);
        Objects.requireNonNull(bArrI);
        cryptoInfo.key = bArrI;
        byte[] bArrI2 = i(n44Var.f12413a, cryptoInfo.iv);
        Objects.requireNonNull(bArrI2);
        cryptoInfo.iv = bArrI2;
        cryptoInfo.mode = n44Var.f12415c;
        if (sv2.f15560a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(n44Var.f12419g, n44Var.f12420h));
        }
        this.f17531c.obtainMessage(1, we4VarH).sendToTarget();
    }

    public final void f() {
        if (this.f17534f) {
            b();
            this.f17530b.quit();
        }
        this.f17534f = false;
    }

    public final void g() {
        if (this.f17534f) {
            return;
        }
        this.f17530b.start();
        this.f17531c = new ve4(this, this.f17530b.getLooper());
        this.f17534f = true;
    }
}
