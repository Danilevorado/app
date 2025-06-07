package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class a {

    /* renamed from: c, reason: collision with root package name */
    private static a f21115c;

    /* renamed from: a, reason: collision with root package name */
    private final Object f21116a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f21117b = new Handler(Looper.getMainLooper(), new C0101a());

    /* renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    class C0101a implements Handler.Callback {
        C0101a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            a5.a.a(message.obj);
            aVar.c(null);
            return true;
        }
    }

    interface b {
    }

    private static class c {
    }

    private a() {
    }

    private boolean a(c cVar, int i10) {
        throw null;
    }

    static a b() {
        if (f21115c == null) {
            f21115c = new a();
        }
        return f21115c;
    }

    private boolean d(b bVar) {
        return false;
    }

    void c(c cVar) {
        synchronized (this.f21116a) {
            a(cVar, 2);
        }
    }

    public void e(b bVar) {
        synchronized (this.f21116a) {
            if (d(bVar)) {
                throw null;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f21116a) {
            if (d(bVar)) {
                throw null;
            }
        }
    }
}
