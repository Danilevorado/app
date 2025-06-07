package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import f6.k;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final v5.d f21461a;

    /* renamed from: b, reason: collision with root package name */
    private final h0 f21462b;

    /* renamed from: c, reason: collision with root package name */
    private final a4.d f21463c;

    /* renamed from: d, reason: collision with root package name */
    private final h6.b f21464d;

    /* renamed from: e, reason: collision with root package name */
    private final h6.b f21465e;

    /* renamed from: f, reason: collision with root package name */
    private final i6.d f21466f;

    c0(v5.d dVar, h0 h0Var, a4.d dVar2, h6.b bVar, h6.b bVar2, i6.d dVar3) {
        this.f21461a = dVar;
        this.f21462b = h0Var;
        this.f21463c = dVar2;
        this.f21464d = bVar;
        this.f21465e = bVar2;
        this.f21466f = dVar3;
    }

    c0(v5.d dVar, h0 h0Var, h6.b bVar, h6.b bVar2, i6.d dVar2) {
        this(dVar, h0Var, new a4.d(dVar.j()), bVar, bVar2, dVar2);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private b5.i d(b5.i iVar) {
        return iVar.f(h.f21489m, new b5.a() { // from class: com.google.firebase.messaging.b0
            @Override // b5.a
            public final Object a(b5.i iVar2) {
                return this.f21446a.i(iVar2);
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f21461a.l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String g(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i(b5.i iVar) {
        return g((Bundle) iVar.k(IOException.class));
    }

    private void j(String str, String str2, Bundle bundle) {
        k.a aVarB;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f21461a.m().b());
        bundle.putString("gmsv", Integer.toString(this.f21462b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f21462b.a());
        bundle.putString("app_ver_name", this.f21462b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String strB = ((com.google.firebase.installations.g) b5.l.a(this.f21466f.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException | ExecutionException e5) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e5);
        }
        bundle.putString("appid", (String) b5.l.a(this.f21466f.getId()));
        bundle.putString("cliv", "fcm-23.0.7");
        f6.k kVar = (f6.k) this.f21465e.get();
        q6.i iVar = (q6.i) this.f21464d.get();
        if (kVar == null || iVar == null || (aVarB = kVar.b("fire-iid")) == k.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarB.b()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private b5.i k(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f21463c.a(bundle);
        } catch (InterruptedException | ExecutionException e5) {
            return b5.l.d(e5);
        }
    }

    b5.i c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(k(h0.c(this.f21461a), "*", bundle));
    }

    b5.i f() {
        return d(k(h0.c(this.f21461a), "*", new Bundle()));
    }

    b5.i l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(k(str, "/topics/" + str2, bundle));
    }

    b5.i m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(k(str, "/topics/" + str2, bundle));
    }
}
