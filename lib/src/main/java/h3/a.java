package h3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b4.g;
import e4.p;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import n4.e;
import n4.f;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    b4.a f24062a;

    /* renamed from: b, reason: collision with root package name */
    f f24063b;

    /* renamed from: c, reason: collision with root package name */
    boolean f24064c;

    /* renamed from: d, reason: collision with root package name */
    final Object f24065d;

    /* renamed from: e, reason: collision with root package name */
    c f24066e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f24067f;

    /* renamed from: g, reason: collision with root package name */
    final long f24068g;

    /* renamed from: h3.a$a, reason: collision with other inner class name */
    public static final class C0142a {

        /* renamed from: a, reason: collision with root package name */
        private final String f24069a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f24070b;

        public C0142a(String str, boolean z10) {
            this.f24069a = str;
            this.f24070b = z10;
        }

        public String a() {
            return this.f24069a;
        }

        public boolean b() {
            return this.f24070b;
        }

        public String toString() {
            String str = this.f24069a;
            boolean z10 = this.f24070b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public a(Context context) {
        this(context, 30000L, false, false);
    }

    public a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        this.f24065d = new Object();
        p.l(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f24067f = context;
        this.f24064c = false;
        this.f24068g = j10;
    }

    public static C0142a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.g(false);
            C0142a c0142aI = aVar.i(-1);
            aVar.h(c0142aI, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return c0142aI;
        } finally {
        }
    }

    public static boolean c(Context context) {
        boolean zF;
        a aVar = new a(context, -1L, false, false);
        try {
            aVar.g(false);
            p.k("Calling this from your main thread can lead to deadlock");
            synchronized (aVar) {
                if (aVar.f24064c) {
                    p.l(aVar.f24062a);
                    p.l(aVar.f24063b);
                    zF = aVar.f24063b.f();
                } else {
                    synchronized (aVar.f24065d) {
                        c cVar = aVar.f24066e;
                        if (cVar == null || !cVar.f24075p) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        aVar.g(false);
                        if (!aVar.f24064c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                        p.l(aVar.f24062a);
                        p.l(aVar.f24063b);
                        try {
                            zF = aVar.f24063b.f();
                        } catch (RemoteException e5) {
                            Log.i("AdvertisingIdClient", "GMS remote exception ", e5);
                            throw new IOException("Remote exception");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
            }
            aVar.j();
            return zF;
        } finally {
            aVar.f();
        }
    }

    public static void d(boolean z10) {
    }

    private final C0142a i(int i10) {
        C0142a c0142a;
        p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f24064c) {
                p.l(this.f24062a);
                p.l(this.f24063b);
                c0142a = new C0142a(this.f24063b.d(), this.f24063b.p0(true));
            } else {
                synchronized (this.f24065d) {
                    c cVar = this.f24066e;
                    if (cVar == null || !cVar.f24075p) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    g(false);
                    if (!this.f24064c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    p.l(this.f24062a);
                    p.l(this.f24063b);
                    try {
                        c0142a = new C0142a(this.f24063b.d(), this.f24063b.p0(true));
                    } catch (RemoteException e5) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e5);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
        }
        j();
        return c0142a;
    }

    private final void j() {
        synchronized (this.f24065d) {
            c cVar = this.f24066e;
            if (cVar != null) {
                cVar.f24074o.countDown();
                try {
                    this.f24066e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f24068g;
            if (j10 > 0) {
                this.f24066e = new c(this, j10);
            }
        }
    }

    public C0142a b() {
        return i(-1);
    }

    public void e() {
        g(true);
    }

    public final void f() {
        p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f24067f == null || this.f24062a == null) {
                return;
            }
            try {
                if (this.f24064c) {
                    h4.a.b().c(this.f24067f, this.f24062a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f24064c = false;
            this.f24063b = null;
            this.f24062a = null;
        }
    }

    protected final void finalize() throws Throwable {
        f();
        super.finalize();
    }

    protected final void g(boolean z10) {
        p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f24064c) {
                f();
            }
            Context context = this.f24067f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int iJ = b4.f.h().j(context, 12451000);
                if (iJ != 0 && iJ != 2) {
                    throw new IOException("Google Play services not available");
                }
                b4.a aVar = new b4.a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!h4.a.b().a(context, intent, aVar, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.f24062a = aVar;
                    try {
                        this.f24063b = e.C(aVar.a(10000L, TimeUnit.MILLISECONDS));
                        this.f24064c = true;
                        if (z10) {
                            j();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } finally {
                    IOException iOException = new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new g(9);
            }
        }
    }

    final boolean h(C0142a c0142a, boolean z10, float f5, long j10, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (c0142a != null) {
            map.put("limit_ad_tracking", true != c0142a.b() ? "0" : "1");
            String strA = c0142a.a();
            if (strA != null) {
                map.put("ad_id_size", Integer.toString(strA.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j10));
        new b(this, map).start();
        return true;
    }
}
