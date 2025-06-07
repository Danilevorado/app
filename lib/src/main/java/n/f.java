package n;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25440a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final a.b f25441b;

    /* renamed from: c, reason: collision with root package name */
    private final a.a f25442c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f25443d;

    /* renamed from: e, reason: collision with root package name */
    private final PendingIntent f25444e;

    f(a.b bVar, a.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f25441b = bVar;
        this.f25442c = aVar;
        this.f25443d = componentName;
        this.f25444e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f25444e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    IBinder c() {
        return this.f25442c.asBinder();
    }

    ComponentName d() {
        return this.f25443d;
    }

    PendingIntent e() {
        return this.f25444e;
    }

    public boolean f(Uri uri, Bundle bundle, List list) {
        try {
            return this.f25441b.x2(this.f25442c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
