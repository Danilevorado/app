package f1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class l extends e {

    /* renamed from: g, reason: collision with root package name */
    private final ConnectivityManager f23614g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, i1.c cVar) {
        super(context, cVar);
        rb.h.e(context, "context");
        rb.h.e(cVar, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        rb.h.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f23614g = (ConnectivityManager) systemService;
    }

    @Override // f1.e
    public IntentFilter j() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // f1.e
    public void k(Intent intent) {
        rb.h.e(intent, "intent");
        if (rb.h.a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            b1.j.e().a(k.f23613a, "Network broadcast received");
            g(k.c(this.f23614g));
        }
    }

    @Override // f1.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public d1.b e() {
        return k.c(this.f23614g);
    }
}
