package androidx.biometric;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.g0;
import androidx.lifecycle.j;
import androidx.lifecycle.u;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public class BiometricPrompt {

    /* renamed from: a, reason: collision with root package name */
    private androidx.fragment.app.m f1415a;

    private static class ResetCallbackObserver implements androidx.lifecycle.m {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f1416a;

        @u(j.b.ON_DESTROY)
        public void resetCallback() {
            if (this.f1416a.get() != null) {
                ((f) this.f1416a.get()).I();
            }
        }
    }

    public static abstract class a {
        public void a(int i10, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(b bVar) {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final c f1417a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1418b;

        b(c cVar, int i10) {
            this.f1417a = cVar;
            this.f1418b = i10;
        }

        public int a() {
            return this.f1418b;
        }

        public c b() {
            return this.f1417a;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Signature f1419a;

        /* renamed from: b, reason: collision with root package name */
        private final Cipher f1420b;

        /* renamed from: c, reason: collision with root package name */
        private final Mac f1421c;

        /* renamed from: d, reason: collision with root package name */
        private final IdentityCredential f1422d;

        public c(IdentityCredential identityCredential) {
            this.f1419a = null;
            this.f1420b = null;
            this.f1421c = null;
            this.f1422d = identityCredential;
        }

        public c(Signature signature) {
            this.f1419a = signature;
            this.f1420b = null;
            this.f1421c = null;
            this.f1422d = null;
        }

        public c(Cipher cipher) {
            this.f1419a = null;
            this.f1420b = cipher;
            this.f1421c = null;
            this.f1422d = null;
        }

        public c(Mac mac) {
            this.f1419a = null;
            this.f1420b = null;
            this.f1421c = mac;
            this.f1422d = null;
        }

        public Cipher a() {
            return this.f1420b;
        }

        public IdentityCredential b() {
            return this.f1422d;
        }

        public Mac c() {
            return this.f1421c;
        }

        public Signature d() {
            return this.f1419a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f1423a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f1424b;

        /* renamed from: c, reason: collision with root package name */
        private final CharSequence f1425c;

        /* renamed from: d, reason: collision with root package name */
        private final CharSequence f1426d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f1427e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f1428f;

        /* renamed from: g, reason: collision with root package name */
        private final int f1429g;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private CharSequence f1430a = null;

            /* renamed from: b, reason: collision with root package name */
            private CharSequence f1431b = null;

            /* renamed from: c, reason: collision with root package name */
            private CharSequence f1432c = null;

            /* renamed from: d, reason: collision with root package name */
            private CharSequence f1433d = null;

            /* renamed from: e, reason: collision with root package name */
            private boolean f1434e = true;

            /* renamed from: f, reason: collision with root package name */
            private boolean f1435f = false;

            /* renamed from: g, reason: collision with root package name */
            private int f1436g = 0;

            public d a() {
                if (TextUtils.isEmpty(this.f1430a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!androidx.biometric.b.e(this.f1436g)) {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + androidx.biometric.b.a(this.f1436g));
                }
                int i10 = this.f1436g;
                boolean zC = i10 != 0 ? androidx.biometric.b.c(i10) : this.f1435f;
                if (TextUtils.isEmpty(this.f1433d) && !zC) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.f1433d) || !zC) {
                    return new d(this.f1430a, this.f1431b, this.f1432c, this.f1433d, this.f1434e, this.f1435f, this.f1436g);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }

            public a b(boolean z10) {
                this.f1434e = z10;
                return this;
            }

            public a c(CharSequence charSequence) {
                this.f1432c = charSequence;
                return this;
            }

            public a d(CharSequence charSequence) {
                this.f1433d = charSequence;
                return this;
            }

            public a e(CharSequence charSequence) {
                this.f1431b = charSequence;
                return this;
            }

            public a f(CharSequence charSequence) {
                this.f1430a = charSequence;
                return this;
            }
        }

        d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z10, boolean z11, int i10) {
            this.f1423a = charSequence;
            this.f1424b = charSequence2;
            this.f1425c = charSequence3;
            this.f1426d = charSequence4;
            this.f1427e = z10;
            this.f1428f = z11;
            this.f1429g = i10;
        }

        public int a() {
            return this.f1429g;
        }

        public CharSequence b() {
            return this.f1425c;
        }

        public CharSequence c() {
            CharSequence charSequence = this.f1426d;
            return charSequence != null ? charSequence : "";
        }

        public CharSequence d() {
            return this.f1424b;
        }

        public CharSequence e() {
            return this.f1423a;
        }

        public boolean f() {
            return this.f1427e;
        }

        public boolean g() {
            return this.f1428f;
        }
    }

    public BiometricPrompt(androidx.fragment.app.e eVar, Executor executor, a aVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        f(eVar.H(), e(eVar), executor, aVar);
    }

    private void b(d dVar, c cVar) {
        androidx.fragment.app.m mVar = this.f1415a;
        if (mVar == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (mVar.K0()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            d(this.f1415a).L1(dVar, cVar);
        }
    }

    private static androidx.biometric.d c(androidx.fragment.app.m mVar) {
        return (androidx.biometric.d) mVar.i0("androidx.biometric.BiometricFragment");
    }

    private static androidx.biometric.d d(androidx.fragment.app.m mVar) {
        androidx.biometric.d dVarC = c(mVar);
        if (dVarC != null) {
            return dVarC;
        }
        androidx.biometric.d dVarB2 = androidx.biometric.d.b2();
        mVar.l().d(dVarB2, "androidx.biometric.BiometricFragment").g();
        mVar.e0();
        return dVarB2;
    }

    private static f e(androidx.fragment.app.e eVar) {
        if (eVar != null) {
            return (f) new g0(eVar).a(f.class);
        }
        return null;
    }

    private void f(androidx.fragment.app.m mVar, f fVar, Executor executor, a aVar) {
        this.f1415a = mVar;
        if (fVar != null) {
            if (executor != null) {
                fVar.Q(executor);
            }
            fVar.P(aVar);
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        b(dVar, null);
    }
}
