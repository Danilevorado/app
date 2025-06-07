package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.onesignal.a;
import java.util.HashMap;

/* loaded from: classes.dex */
public class PermissionsActivity extends Activity {

    /* renamed from: o, reason: collision with root package name */
    private static final String f21665o = "com.onesignal.PermissionsActivity";

    /* renamed from: p, reason: collision with root package name */
    private static boolean f21666p;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f21667q;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f21668r;

    /* renamed from: s, reason: collision with root package name */
    private static a.b f21669s;

    /* renamed from: t, reason: collision with root package name */
    private static final HashMap f21670t = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private String f21671m;

    /* renamed from: n, reason: collision with root package name */
    private String f21672n;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int[] f21673m;

        a(int[] iArr) {
            this.f21673m = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = this.f21673m;
            boolean z10 = false;
            if (iArr.length > 0 && iArr[0] == 0) {
                z10 = true;
            }
            c cVar = (c) PermissionsActivity.f21670t.get(PermissionsActivity.this.f21671m);
            if (cVar == null) {
                throw new RuntimeException("Missing handler for permissionRequestType: " + PermissionsActivity.this.f21671m);
            }
            if (z10) {
                cVar.a();
            } else {
                cVar.b(PermissionsActivity.this.h());
            }
        }
    }

    class b extends a.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21675a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21676b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f21677c;

        b(String str, String str2, Class cls) {
            this.f21675a = str;
            this.f21676b = str2;
            this.f21677c = cls;
        }

        @Override // com.onesignal.a.b
        public void a(Activity activity) {
            if (activity.getClass().equals(PermissionsActivity.class)) {
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
            intent.setFlags(131072);
            intent.putExtra("INTENT_EXTRA_PERMISSION_TYPE", this.f21675a).putExtra("INTENT_EXTRA_ANDROID_PERMISSION_STRING", this.f21676b).putExtra("INTENT_EXTRA_CALLBACK_CLASS", this.f21677c.getName());
            activity.startActivity(intent);
            activity.overridePendingTransition(z3.f22563a, z3.f22564b);
        }
    }

    interface c {
        void a();

        void b(boolean z10);
    }

    private void d(Bundle bundle) throws ClassNotFoundException {
        g(bundle);
        this.f21671m = bundle.getString("INTENT_EXTRA_PERMISSION_TYPE");
        String string = bundle.getString("INTENT_EXTRA_ANDROID_PERMISSION_STRING");
        this.f21672n = string;
        f(string);
    }

    public static void e(String str, c cVar) {
        f21670t.put(str, cVar);
    }

    private void f(String str) {
        if (f21666p) {
            return;
        }
        f21666p = true;
        f21668r = !f.b(this, str);
        f.a(this, new String[]{str}, 2);
    }

    private void g(Bundle bundle) throws ClassNotFoundException {
        String string = bundle.getString("INTENT_EXTRA_CALLBACK_CLASS");
        try {
            Class.forName(string);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Could not find callback class for PermissionActivity: " + string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return f21667q && f21668r && !f.b(this, this.f21672n);
    }

    static void i(boolean z10, String str, String str2, Class cls) {
        if (f21666p) {
            return;
        }
        f21667q = z10;
        f21669s = new b(str, str2, cls);
        com.onesignal.a aVarB = com.onesignal.b.b();
        if (aVarB != null) {
            aVarB.c(f21665o, f21669s);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws ClassNotFoundException {
        super.onCreate(bundle);
        e3.Q0(this);
        d(getIntent().getExtras());
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) throws ClassNotFoundException {
        super.onNewIntent(intent);
        d(intent.getExtras());
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        f21666p = false;
        if (i10 == 2) {
            new Handler().postDelayed(new a(iArr), 500L);
        }
        com.onesignal.a aVarB = com.onesignal.b.b();
        if (aVarB != null) {
            aVarB.r(f21665o);
        }
        finish();
        overridePendingTransition(z3.f22563a, z3.f22564b);
    }
}
