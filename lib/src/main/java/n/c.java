package n;

import a.a;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final a.b f25422a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f25423b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f25424c;

    class a extends a.AbstractBinderC0000a {

        /* renamed from: m, reason: collision with root package name */
        private Handler f25425m = new Handler(Looper.getMainLooper());

        a(b bVar) {
        }

        @Override // a.a
        public void D4(String str, Bundle bundle) {
        }

        @Override // a.a
        public Bundle Q3(String str, Bundle bundle) {
            return null;
        }

        @Override // a.a
        public void T4(Bundle bundle) {
        }

        @Override // a.a
        public void f5(int i10, Uri uri, boolean z10, Bundle bundle) {
        }

        @Override // a.a
        public void l3(int i10, Bundle bundle) {
        }

        @Override // a.a
        public void r2(String str, Bundle bundle) {
        }
    }

    c(a.b bVar, ComponentName componentName, Context context) {
        this.f25422a = bVar;
        this.f25423b = componentName;
        this.f25424c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private a.AbstractBinderC0000a b(b bVar) {
        return new a(bVar);
    }

    private f d(b bVar, PendingIntent pendingIntent) {
        boolean zX3;
        a.AbstractBinderC0000a abstractBinderC0000aB = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zX3 = this.f25422a.s5(abstractBinderC0000aB, bundle);
            } else {
                zX3 = this.f25422a.X3(abstractBinderC0000aB);
            }
            if (zX3) {
                return new f(this.f25422a, abstractBinderC0000aB, this.f25423b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f c(b bVar) {
        return d(bVar, null);
    }

    public boolean e(long j10) {
        try {
            return this.f25422a.X4(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
