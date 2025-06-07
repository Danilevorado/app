package a4;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    private static x f151e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f152a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f153b;

    /* renamed from: c, reason: collision with root package name */
    private r f154c = new r(this, null);

    /* renamed from: d, reason: collision with root package name */
    private int f155d = 1;

    x(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f153b = scheduledExecutorService;
        this.f152a = context.getApplicationContext();
    }

    public static synchronized x b(Context context) {
        if (f151e == null) {
            q4.e.a();
            f151e = new x(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new j4.b("MessengerIpcClient"))));
        }
        return f151e;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f155d;
        this.f155d = i10 + 1;
        return i10;
    }

    private final synchronized b5.i g(u uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(uVar);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(strValueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f154c.g(uVar)) {
            r rVar = new r(this, null);
            this.f154c = rVar;
            rVar.g(uVar);
        }
        return uVar.f148b.a();
    }

    public final b5.i c(int i10, Bundle bundle) {
        return g(new t(f(), 2, bundle));
    }

    public final b5.i d(int i10, Bundle bundle) {
        return g(new w(f(), 1, bundle));
    }
}
