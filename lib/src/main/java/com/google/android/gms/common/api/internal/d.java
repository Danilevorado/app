package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f5670a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f5671b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a f5672c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f5673a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5674b;

        a(Object obj, String str) {
            this.f5673a = obj;
            this.f5674b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5673a == aVar.f5673a && this.f5674b.equals(aVar.f5674b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f5673a) * 31) + this.f5674b.hashCode();
        }
    }

    public interface b {
        void a(Object obj);

        void b();
    }

    d(Looper looper, Object obj, String str) {
        this.f5670a = new j4.a(looper);
        this.f5671b = e4.p.m(obj, "Listener must not be null");
        this.f5672c = new a(obj, e4.p.f(str));
    }

    public void a() {
        this.f5671b = null;
        this.f5672c = null;
    }

    public a b() {
        return this.f5672c;
    }

    public void c(final b bVar) {
        e4.p.m(bVar, "Notifier must not be null");
        this.f5670a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5797m.d(bVar);
            }
        });
    }

    final void d(b bVar) {
        Object obj = this.f5671b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e5) {
            bVar.b();
            throw e5;
        }
    }
}
