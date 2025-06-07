package com.webviewgold.myappname;

import android.os.Handler;
import android.util.Log;
import android.widget.Toast;
import androidx.biometric.BiometricPrompt;
import com.facebook.ads.R;

/* loaded from: classes2.dex */
public abstract class b extends androidx.appcompat.app.c {

    class a extends BiometricPrompt.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f22730a;

        a(c cVar) {
            this.f22730a = cVar;
        }

        @Override // androidx.biometric.BiometricPrompt.a
        public void a(int i10, CharSequence charSequence) {
            super.a(i10, charSequence);
            Log.e(">>>>>>>>>>>", "onAuthenticationError: " + i10 + " " + ((Object) charSequence));
            if (i10 == 2) {
                Toast.makeText(b.this.getApplicationContext(), b.this.getString(R.string.error_while_unlocking), 0).show();
                this.f22730a.b(i10, charSequence);
            } else {
                Toast.makeText(b.this.getApplicationContext(), b.this.getString(R.string.error_while_unlocking), 0).show();
                b.this.finish();
            }
        }

        @Override // androidx.biometric.BiometricPrompt.a
        public void b() {
            super.b();
            b.this.finish();
        }

        @Override // androidx.biometric.BiometricPrompt.a
        public void c(BiometricPrompt.b bVar) {
            super.c(bVar);
            this.f22730a.a();
        }
    }

    /* renamed from: com.webviewgold.myappname.b$b, reason: collision with other inner class name */
    class RunnableC0116b implements Runnable {
        RunnableC0116b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            System.exit(0);
        }
    }

    interface c {
        void a();

        void b(int i10, CharSequence charSequence);
    }

    void c0(c cVar) {
        if (androidx.biometric.e.g(getApplicationContext()).a(33023) == 0) {
            fb.a.a(this, new a(cVar)).a(fb.a.b(this));
            return;
        }
        Toast.makeText(getApplicationContext(), getString(R.string.unable_to_use_biometric_unlock), 1).show();
        new Handler().postDelayed(new RunnableC0116b(), 3000L);
        cVar.a();
    }
}
