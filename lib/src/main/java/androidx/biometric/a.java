package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.a;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private BiometricPrompt.AuthenticationCallback f1437a;

    /* renamed from: b, reason: collision with root package name */
    private a.c f1438b;

    /* renamed from: c, reason: collision with root package name */
    final d f1439c;

    /* renamed from: androidx.biometric.a$a, reason: collision with other inner class name */
    class C0012a extends a.c {
        C0012a() {
        }

        @Override // androidx.core.hardware.fingerprint.a.c
        public void a(int i10, CharSequence charSequence) {
            a.this.f1439c.a(i10, charSequence);
        }

        @Override // androidx.core.hardware.fingerprint.a.c
        public void b() {
            a.this.f1439c.b();
        }

        @Override // androidx.core.hardware.fingerprint.a.c
        public void c(int i10, CharSequence charSequence) {
            a.this.f1439c.c(charSequence);
        }

        @Override // androidx.core.hardware.fingerprint.a.c
        public void d(a.d dVar) {
            a.this.f1439c.d(new BiometricPrompt.b(dVar != null ? h.c(dVar.a()) : null, 2));
        }
    }

    private static class b {

        /* renamed from: androidx.biometric.a$b$a, reason: collision with other inner class name */
        class C0013a extends BiometricPrompt.AuthenticationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f1441a;

            C0013a(d dVar) {
                this.f1441a = dVar;
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int i10, CharSequence charSequence) {
                this.f1441a.a(i10, charSequence);
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() {
                this.f1441a.b();
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            }

            @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricPrompt.c cVarB = authenticationResult != null ? h.b(authenticationResult.getCryptoObject()) : null;
                int i10 = Build.VERSION.SDK_INT;
                int iA = -1;
                if (i10 >= 30) {
                    if (authenticationResult != null) {
                        iA = c.a(authenticationResult);
                    }
                } else if (i10 != 29) {
                    iA = 2;
                }
                this.f1441a.d(new BiometricPrompt.b(cVarB, iA));
            }
        }

        static BiometricPrompt.AuthenticationCallback a(d dVar) {
            return new C0013a(dVar);
        }
    }

    private static class c {
        static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    static class d {
        d() {
        }

        abstract void a(int i10, CharSequence charSequence);

        abstract void b();

        abstract void c(CharSequence charSequence);

        abstract void d(BiometricPrompt.b bVar);
    }

    a(d dVar) {
        this.f1439c = dVar;
    }

    BiometricPrompt.AuthenticationCallback a() {
        if (this.f1437a == null) {
            this.f1437a = b.a(this.f1439c);
        }
        return this.f1437a;
    }

    a.c b() {
        if (this.f1438b == null) {
            this.f1438b = new C0012a();
        }
        return this.f1438b;
    }
}
