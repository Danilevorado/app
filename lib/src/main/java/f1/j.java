package f1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: f, reason: collision with root package name */
    private final ConnectivityManager f23610f;

    /* renamed from: g, reason: collision with root package name */
    private final a f23611g;

    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            rb.h.e(network, "network");
            rb.h.e(networkCapabilities, "capabilities");
            b1.j.e().a(k.f23613a, "Network capabilities changed: " + networkCapabilities);
            j jVar = j.this;
            jVar.g(k.c(jVar.f23610f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            rb.h.e(network, "network");
            b1.j.e().a(k.f23613a, "Network connection lost");
            j jVar = j.this;
            jVar.g(k.c(jVar.f23610f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, i1.c cVar) {
        super(context, cVar);
        rb.h.e(context, "context");
        rb.h.e(cVar, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        rb.h.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f23610f = (ConnectivityManager) systemService;
        this.f23611g = new a();
    }

    @Override // f1.h
    public void h() {
        try {
            b1.j.e().a(k.f23613a, "Registering network callback");
            h1.k.a(this.f23610f, this.f23611g);
        } catch (IllegalArgumentException | SecurityException e5) {
            b1.j.e().d(k.f23613a, "Received exception while registering network callback", e5);
        }
    }

    @Override // f1.h
    public void i() {
        try {
            b1.j.e().a(k.f23613a, "Unregistering network callback");
            h1.i.c(this.f23610f, this.f23611g);
        } catch (IllegalArgumentException | SecurityException e5) {
            b1.j.e().d(k.f23613a, "Received exception while unregistering network callback", e5);
        }
    }

    @Override // f1.h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public d1.b e() {
        return k.c(this.f23610f);
    }
}
