package ia;

import android.content.Context;
import android.text.TextUtils;
import k9.h;
import w9.f;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final w8.b f24339a;

    /* renamed from: b, reason: collision with root package name */
    private final f f24340b;

    public b(w8.b bVar, f fVar) {
        this.f24339a = bVar;
        this.f24340b = fVar;
    }

    private void a(i9.a aVar) {
        f fVar = this.f24340b;
        if (fVar != null) {
            fVar.a(aVar);
        }
    }

    private boolean b(Context context) {
        return d("com.pushwoosh.amazon.AmazonInitializer", "com.pushwoosh.amazon.internal.registrar.AdmRegistrar", context);
    }

    private boolean c(String str) throws ClassNotFoundException {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private boolean d(String str, String str2, Context context) {
        try {
            Class.forName(str).getMethod("init", Context.class).invoke(null, context);
            Class<?> cls = Class.forName(str2);
            i9.a aVarI = j9.b.d().i();
            if (cls.isInstance(aVarI)) {
                a(aVarI);
                return true;
            }
        } catch (Throwable th) {
            h.l("PushRegistrarHelper", "Unexpected error occurred calling 'initRegistrarClass' method");
            h.l("PushRegistrarHelper", th.getMessage());
        }
        return false;
    }

    private boolean e(Context context) {
        return d("com.pushwoosh.firebase.FirebaseInitializer", "com.pushwoosh.firebase.internal.registrar.FcmRegistrar", context);
    }

    private boolean f(String str) {
        return TextUtils.equals(str, "Native");
    }

    private boolean h() {
        return c("com.pushwoosh.amazon.AmazonInitializer");
    }

    private boolean i() {
        return c("com.pushwoosh.firebase.FirebaseInitializer");
    }

    public boolean g() {
        w8.b bVar = this.f24339a;
        if (bVar == null || f(bVar.a())) {
            return false;
        }
        h.h("PushRegistrarHelper", "Initializing default PushRegistrar in a plugin");
        Context contextB = c9.a.b();
        if (contextB == null) {
            return false;
        }
        if (h() && b(contextB)) {
            return true;
        }
        return i() && e(contextB);
    }
}
