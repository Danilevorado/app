package androidx.biometric;

import android.os.CancellationSignal;
import android.util.Log;

/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final c f1497a = new a();

    /* renamed from: b, reason: collision with root package name */
    private CancellationSignal f1498b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.core.os.e f1499c;

    class a implements c {
        a() {
        }

        @Override // androidx.biometric.g.c
        public CancellationSignal a() {
            return b.b();
        }

        @Override // androidx.biometric.g.c
        public androidx.core.os.e b() {
            return new androidx.core.os.e();
        }
    }

    private static class b {
        static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    interface c {
        CancellationSignal a();

        androidx.core.os.e b();
    }

    g() {
    }

    void a() {
        CancellationSignal cancellationSignal = this.f1498b;
        if (cancellationSignal != null) {
            try {
                b.a(cancellationSignal);
            } catch (NullPointerException e5) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e5);
            }
            this.f1498b = null;
        }
        androidx.core.os.e eVar = this.f1499c;
        if (eVar != null) {
            try {
                eVar.a();
            } catch (NullPointerException e10) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e10);
            }
            this.f1499c = null;
        }
    }

    CancellationSignal b() {
        if (this.f1498b == null) {
            this.f1498b = this.f1497a.a();
        }
        return this.f1498b;
    }

    androidx.core.os.e c() {
        if (this.f1499c == null) {
            this.f1499c = this.f1497a.b();
        }
        return this.f1499c;
    }
}
