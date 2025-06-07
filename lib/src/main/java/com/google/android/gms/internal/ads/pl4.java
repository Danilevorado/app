package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class pl4 extends Handler implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final ql4 f13937m;

    /* renamed from: n, reason: collision with root package name */
    private final long f13938n;

    /* renamed from: o, reason: collision with root package name */
    private ml4 f13939o;

    /* renamed from: p, reason: collision with root package name */
    private IOException f13940p;

    /* renamed from: q, reason: collision with root package name */
    private int f13941q;

    /* renamed from: r, reason: collision with root package name */
    private Thread f13942r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13943s;

    /* renamed from: t, reason: collision with root package name */
    private volatile boolean f13944t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ ul4 f13945u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl4(ul4 ul4Var, Looper looper, ql4 ql4Var, ml4 ml4Var, int i10, long j10) {
        super(looper);
        this.f13945u = ul4Var;
        this.f13937m = ql4Var;
        this.f13939o = ml4Var;
        this.f13938n = j10;
    }

    private final void d() {
        this.f13940p = null;
        ul4 ul4Var = this.f13945u;
        ExecutorService executorService = ul4Var.f16384a;
        pl4 pl4Var = ul4Var.f16385b;
        Objects.requireNonNull(pl4Var);
        executorService.execute(pl4Var);
    }

    public final void a(boolean z10) {
        this.f13944t = z10;
        this.f13940p = null;
        if (hasMessages(0)) {
            this.f13943s = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f13943s = true;
                this.f13937m.h();
                Thread thread = this.f13942r;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.f13945u.f16385b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ml4 ml4Var = this.f13939o;
            Objects.requireNonNull(ml4Var);
            ml4Var.l(this.f13937m, jElapsedRealtime, jElapsedRealtime - this.f13938n, true);
            this.f13939o = null;
        }
    }

    public final void b(int i10) {
        IOException iOException = this.f13940p;
        if (iOException != null && this.f13941q > i10) {
            throw iOException;
        }
    }

    public final void c(long j10) {
        gt1.f(this.f13945u.f16385b == null);
        this.f13945u.f16385b = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            d();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f13944t) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            d();
            return;
        }
        if (i10 == 3) {
            throw ((Error) message.obj);
        }
        this.f13945u.f16385b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f13938n;
        ml4 ml4Var = this.f13939o;
        Objects.requireNonNull(ml4Var);
        if (this.f13943s) {
            ml4Var.l(this.f13937m, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            try {
                ml4Var.p(this.f13937m, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e5) {
                ad2.c("LoadTask", "Unexpected exception handling load completed", e5);
                this.f13945u.f16386c = new tl4(e5);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f13940p = iOException;
        int i12 = this.f13941q + 1;
        this.f13941q = i12;
        ol4 ol4VarI = ml4Var.i(this.f13937m, jElapsedRealtime, j10, iOException, i12);
        if (ol4VarI.f13318a == 3) {
            this.f13945u.f16386c = this.f13940p;
        } else if (ol4VarI.f13318a != 2) {
            if (ol4VarI.f13318a == 1) {
                this.f13941q = 1;
            }
            c(ol4VarI.f13319b != -9223372036854775807L ? ol4VarI.f13319b : Math.min((this.f13941q - 1) * AdError.NETWORK_ERROR_CODE, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object tl4Var;
        Message messageObtainMessage;
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.f13943s;
                this.f13942r = Thread.currentThread();
            }
            if (z10) {
                String str = "load:" + this.f13937m.getClass().getSimpleName();
                int i10 = sv2.f15560a;
                Trace.beginSection(str);
                try {
                    this.f13937m.g();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f13942r = null;
                Thread.interrupted();
            }
            if (this.f13944t) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e5) {
            if (this.f13944t) {
                return;
            }
            messageObtainMessage = obtainMessage(2, e5);
            messageObtainMessage.sendToTarget();
        } catch (Exception e10) {
            if (this.f13944t) {
                return;
            }
            ad2.c("LoadTask", "Unexpected exception loading stream", e10);
            tl4Var = new tl4(e10);
            messageObtainMessage = obtainMessage(2, tl4Var);
            messageObtainMessage.sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.f13944t) {
                return;
            }
            ad2.c("LoadTask", "OutOfMemory error loading stream", e11);
            tl4Var = new tl4(e11);
            messageObtainMessage = obtainMessage(2, tl4Var);
            messageObtainMessage.sendToTarget();
        } catch (Error e12) {
            if (!this.f13944t) {
                ad2.c("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(3, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
