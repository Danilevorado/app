package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

/* loaded from: classes.dex */
final class jm4 extends HandlerThread implements Handler.Callback {

    /* renamed from: m, reason: collision with root package name */
    private nz1 f10587m;

    /* renamed from: n, reason: collision with root package name */
    private Handler f10588n;

    /* renamed from: o, reason: collision with root package name */
    private Error f10589o;

    /* renamed from: p, reason: collision with root package name */
    private RuntimeException f10590p;

    /* renamed from: q, reason: collision with root package name */
    private lm4 f10591q;

    public jm4() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final lm4 a(int i10) {
        boolean z10;
        start();
        this.f10588n = new Handler(getLooper(), this);
        this.f10587m = new nz1(this.f10588n, null);
        synchronized (this) {
            z10 = false;
            this.f10588n.obtainMessage(1, i10, 0).sendToTarget();
            while (this.f10591q == null && this.f10590p == null && this.f10589o == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f10590p;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f10589o;
        if (error != null) {
            throw error;
        }
        lm4 lm4Var = this.f10591q;
        Objects.requireNonNull(lm4Var);
        return lm4Var;
    }

    public final void b() {
        Handler handler = this.f10588n;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    nz1 nz1Var = this.f10587m;
                    Objects.requireNonNull(nz1Var);
                    nz1Var.c();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i11 = message.arg1;
                nz1 nz1Var2 = this.f10587m;
                Objects.requireNonNull(nz1Var2);
                nz1Var2.b(i11);
                this.f10591q = new lm4(this, this.f10587m.a(), i11 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (o02 e5) {
                ad2.c("PlaceholderSurface", "Failed to initialize placeholder surface", e5);
                this.f10590p = new IllegalStateException(e5);
                synchronized (this) {
                    notify();
                }
            } catch (Error e10) {
                ad2.c("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.f10589o = e10;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e11) {
                ad2.c("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.f10590p = e11;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
