package g2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import g2.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import n2.f;

/* loaded from: classes.dex */
final class s {

    /* renamed from: d, reason: collision with root package name */
    private static volatile s f23815d;

    /* renamed from: a, reason: collision with root package name */
    private final c f23816a;

    /* renamed from: b, reason: collision with root package name */
    final Set f23817b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f23818c;

    class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f23819a;

        a(Context context) {
            this.f23819a = context;
        }

        @Override // n2.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f23819a.getSystemService("connectivity");
        }
    }

    class b implements c.a {
        b() {
        }

        @Override // g2.c.a
        public void a(boolean z10) {
            ArrayList arrayList;
            synchronized (s.this) {
                arrayList = new ArrayList(s.this.f23817b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c.a) it.next()).a(z10);
            }
        }
    }

    private interface c {
        void a();

        boolean b();
    }

    private static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        boolean f23822a;

        /* renamed from: b, reason: collision with root package name */
        final c.a f23823b;

        /* renamed from: c, reason: collision with root package name */
        private final f.b f23824c;

        /* renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f23825d = new a();

        class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: g2.s$d$a$a, reason: collision with other inner class name */
            class RunnableC0134a implements Runnable {

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ boolean f23827m;

                RunnableC0134a(boolean z10) {
                    this.f23827m = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f23827m);
                }
            }

            a() {
            }

            private void b(boolean z10) {
                n2.l.t(new RunnableC0134a(z10));
            }

            void a(boolean z10) {
                n2.l.a();
                d dVar = d.this;
                boolean z11 = dVar.f23822a;
                dVar.f23822a = z10;
                if (z11 != z10) {
                    dVar.f23823b.a(z10);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        d(f.b bVar, c.a aVar) {
            this.f23824c = bVar;
            this.f23823b = aVar;
        }

        @Override // g2.s.c
        public void a() {
            ((ConnectivityManager) this.f23824c.get()).unregisterNetworkCallback(this.f23825d);
        }

        @Override // g2.s.c
        public boolean b() {
            this.f23822a = ((ConnectivityManager) this.f23824c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f23824c.get()).registerDefaultNetworkCallback(this.f23825d);
                return true;
            } catch (RuntimeException e5) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e5);
                }
                return false;
            }
        }
    }

    private static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Context f23829a;

        /* renamed from: b, reason: collision with root package name */
        final c.a f23830b;

        /* renamed from: c, reason: collision with root package name */
        private final f.b f23831c;

        /* renamed from: d, reason: collision with root package name */
        boolean f23832d;

        /* renamed from: e, reason: collision with root package name */
        private final BroadcastReceiver f23833e = new a();

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                e eVar = e.this;
                boolean z10 = eVar.f23832d;
                eVar.f23832d = eVar.c();
                if (z10 != e.this.f23832d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f23832d);
                    }
                    e eVar2 = e.this;
                    eVar2.f23830b.a(eVar2.f23832d);
                }
            }
        }

        e(Context context, f.b bVar, c.a aVar) {
            this.f23829a = context.getApplicationContext();
            this.f23831c = bVar;
            this.f23830b = aVar;
        }

        @Override // g2.s.c
        public void a() {
            this.f23829a.unregisterReceiver(this.f23833e);
        }

        @Override // g2.s.c
        public boolean b() {
            this.f23832d = c();
            try {
                this.f23829a.registerReceiver(this.f23833e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                return true;
            } catch (SecurityException e5) {
                if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                    return false;
                }
                Log.w("ConnectivityMonitor", "Failed to register", e5);
                return false;
            }
        }

        boolean c() {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f23831c.get()).getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e5) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e5);
                }
                return true;
            }
        }
    }

    private s(Context context) {
        f.b bVarA = n2.f.a(new a(context));
        b bVar = new b();
        this.f23816a = Build.VERSION.SDK_INT >= 24 ? new d(bVarA, bVar) : new e(context, bVarA, bVar);
    }

    static s a(Context context) {
        if (f23815d == null) {
            synchronized (s.class) {
                if (f23815d == null) {
                    f23815d = new s(context.getApplicationContext());
                }
            }
        }
        return f23815d;
    }

    private void b() {
        if (this.f23818c || this.f23817b.isEmpty()) {
            return;
        }
        this.f23818c = this.f23816a.b();
    }

    private void c() {
        if (this.f23818c && this.f23817b.isEmpty()) {
            this.f23816a.a();
            this.f23818c = false;
        }
    }

    synchronized void d(c.a aVar) {
        this.f23817b.add(aVar);
        b();
    }

    synchronized void e(c.a aVar) {
        this.f23817b.remove(aVar);
        c();
    }
}
