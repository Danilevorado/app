package d4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class u extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f22925a;

    /* renamed from: b, reason: collision with root package name */
    private final t f22926b;

    public u(t tVar) {
        this.f22926b = tVar;
    }

    public final void a(Context context) {
        this.f22925a = context;
    }

    public final synchronized void b() {
        Context context = this.f22925a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f22925a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f22926b.a();
            b();
        }
    }
}
