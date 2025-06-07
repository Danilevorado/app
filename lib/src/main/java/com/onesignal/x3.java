package com.onesignal;

import android.content.Context;
import android.util.Base64;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.e3;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import v5.j;

/* loaded from: classes.dex */
class x3 extends w3 {

    /* renamed from: f, reason: collision with root package name */
    private v5.d f22516f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f22517g;

    /* renamed from: h, reason: collision with root package name */
    private final a f22518h;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f22519a;

        /* renamed from: b, reason: collision with root package name */
        private final String f22520b;

        /* renamed from: c, reason: collision with root package name */
        private final String f22521c;

        a() {
            this(null, null, null);
        }

        a(String str, String str2, String str3) {
            this.f22519a = str == null ? "onesignal-shared-public" : str;
            this.f22520b = str2 == null ? "1:754795614042:android:c682b8144a8dd52bc1ad63" : str2;
            this.f22521c = str3 == null ? new String(Base64.decode("QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV", 0)) : str3;
        }
    }

    x3(Context context, a aVar) {
        this.f22517g = context;
        if (aVar == null) {
            this.f22518h = new a();
        } else {
            this.f22518h = aVar;
        }
    }

    private String l(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getMethod("getInstance", v5.d.class).invoke(null, this.f22516f);
            return (String) objInvoke.getClass().getMethod("getToken", String.class, String.class).invoke(objInvoke, str, "FCM");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
            throw new Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", e5);
        }
    }

    private String m() throws Exception {
        b5.i iVarR = ((FirebaseMessaging) this.f22516f.i(FirebaseMessaging.class)).r();
        try {
            return (String) b5.l.a(iVarR);
        } catch (ExecutionException unused) {
            throw iVarR.i();
        }
    }

    private void n(String str) {
        if (this.f22516f != null) {
            return;
        }
        this.f22516f = v5.d.p(this.f22517g, new j.b().d(str).c(this.f22518h.f22520b).b(this.f22518h.f22521c).e(this.f22518h.f22519a).a(), "ONESIGNAL_SDK_FCM_APP_NAME");
    }

    @Override // com.onesignal.w3
    String f() {
        return "FCM";
    }

    @Override // com.onesignal.w3
    String g(String str) {
        n(str);
        try {
            return m();
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            e3.a(e3.z.INFO, "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken");
            return l(str);
        }
    }
}
