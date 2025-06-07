package fb;

import android.util.Log;
import androidx.appcompat.app.c;
import androidx.biometric.BiometricPrompt;
import com.facebook.ads.R;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: fb.a$a, reason: collision with other inner class name */
    class C0133a extends BiometricPrompt.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BiometricPrompt.a f23682a;

        C0133a(BiometricPrompt.a aVar) {
            this.f23682a = aVar;
        }

        @Override // androidx.biometric.BiometricPrompt.a
        public void a(int i10, CharSequence charSequence) {
            super.a(i10, charSequence);
            this.f23682a.a(i10, charSequence);
        }

        @Override // androidx.biometric.BiometricPrompt.a
        public void b() {
            super.b();
            this.f23682a.b();
        }

        @Override // androidx.biometric.BiometricPrompt.a
        public void c(BiometricPrompt.b bVar) {
            super.c(bVar);
            Log.d("BiometricPromptUtils", "Authentication was successful");
            this.f23682a.c(bVar);
        }
    }

    public static BiometricPrompt a(c cVar, BiometricPrompt.a aVar) {
        return new BiometricPrompt(cVar, androidx.core.content.a.h(cVar), new C0133a(aVar));
    }

    public static BiometricPrompt.d b(c cVar) {
        return new BiometricPrompt.d.a().f(cVar.getString(R.string.prompt_info_title)).e(cVar.getString(R.string.prompt_info_subtitle)).c(cVar.getString(R.string.prompt_info_description)).b(false).d(cVar.getString(R.string.prompt_info_cancel)).a();
    }
}
