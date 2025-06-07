package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class je0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f10446a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final m3.s1 f10447b;

    /* renamed from: c, reason: collision with root package name */
    private final me0 f10448c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10449d;

    /* renamed from: e, reason: collision with root package name */
    private Context f10450e;

    /* renamed from: f, reason: collision with root package name */
    private ff0 f10451f;

    /* renamed from: g, reason: collision with root package name */
    private String f10452g;

    /* renamed from: h, reason: collision with root package name */
    private qr f10453h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f10454i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f10455j;

    /* renamed from: k, reason: collision with root package name */
    private final ie0 f10456k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f10457l;

    /* renamed from: m, reason: collision with root package name */
    private ab3 f10458m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f10459n;

    public je0() {
        m3.s1 s1Var = new m3.s1();
        this.f10447b = s1Var;
        this.f10448c = new me0(k3.t.d(), s1Var);
        this.f10449d = false;
        this.f10453h = null;
        this.f10454i = null;
        this.f10455j = new AtomicInteger(0);
        this.f10456k = new ie0(null);
        this.f10457l = new Object();
        this.f10459n = new AtomicBoolean();
    }

    public final int a() {
        return this.f10455j.get();
    }

    public final Context c() {
        return this.f10450e;
    }

    public final Resources d() {
        if (this.f10451f.f8255p) {
            return this.f10450e.getResources();
        }
        try {
            if (((Boolean) k3.w.c().b(ir.f10010l9)).booleanValue()) {
                return df0.a(this.f10450e).getResources();
            }
            df0.a(this.f10450e).getResources();
            return null;
        } catch (cf0 e5) {
            ze0.h("Cannot load resource from dynamite apk or local jar", e5);
            return null;
        }
    }

    public final qr f() {
        qr qrVar;
        synchronized (this.f10446a) {
            qrVar = this.f10453h;
        }
        return qrVar;
    }

    public final me0 g() {
        return this.f10448c;
    }

    public final m3.p1 h() {
        m3.s1 s1Var;
        synchronized (this.f10446a) {
            s1Var = this.f10447b;
        }
        return s1Var;
    }

    public final ab3 j() {
        if (this.f10450e != null) {
            if (!((Boolean) k3.w.c().b(ir.f10079s2)).booleanValue()) {
                synchronized (this.f10457l) {
                    ab3 ab3Var = this.f10458m;
                    if (ab3Var != null) {
                        return ab3Var;
                    }
                    ab3 ab3VarG = of0.f13186a.g(new Callable() { // from class: com.google.android.gms.internal.ads.ee0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f7731a.n();
                        }
                    });
                    this.f10458m = ab3VarG;
                    return ab3VarG;
                }
            }
        }
        return qa3.h(new ArrayList());
    }

    public final Boolean k() {
        Boolean bool;
        synchronized (this.f10446a) {
            bool = this.f10454i;
        }
        return bool;
    }

    public final String m() {
        return this.f10452g;
    }

    final /* synthetic */ ArrayList n() {
        Context contextA = y90.a(this.f10450e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfoF = k4.c.a(contextA).f(contextA.getApplicationInfo().packageName, 4096);
            if (packageInfoF.requestedPermissions != null && packageInfoF.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = packageInfoF.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((packageInfoF.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void p() {
        this.f10456k.a();
    }

    public final void q() {
        this.f10455j.decrementAndGet();
    }

    public final void r() {
        this.f10455j.incrementAndGet();
    }

    public final void s(Context context, ff0 ff0Var) {
        qr qrVar;
        synchronized (this.f10446a) {
            if (!this.f10449d) {
                this.f10450e = context.getApplicationContext();
                this.f10451f = ff0Var;
                j3.t.d().c(this.f10448c);
                this.f10447b.M(this.f10450e);
                b80.d(this.f10450e, this.f10451f);
                j3.t.g();
                if (((Boolean) ws.f17255c.e()).booleanValue()) {
                    qrVar = new qr();
                } else {
                    m3.n1.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    qrVar = null;
                }
                this.f10453h = qrVar;
                if (qrVar != null) {
                    rf0.a(new fe0(this).b(), "AppState.registerCsiReporter");
                }
                if (i4.m.i()) {
                    if (((Boolean) k3.w.c().b(ir.Q7)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new ge0(this));
                    }
                }
                this.f10449d = true;
                j();
            }
        }
        j3.t.r().z(context, ff0Var.f8252m);
    }

    public final void t(Throwable th, String str) {
        b80.d(this.f10450e, this.f10451f).b(th, str, ((Double) mt.f12250g.e()).floatValue());
    }

    public final void u(Throwable th, String str) {
        b80.d(this.f10450e, this.f10451f).a(th, str);
    }

    public final void v(Boolean bool) {
        synchronized (this.f10446a) {
            this.f10454i = bool;
        }
    }

    public final void w(String str) {
        this.f10452g = str;
    }

    public final boolean x(Context context) {
        if (i4.m.i()) {
            if (((Boolean) k3.w.c().b(ir.Q7)).booleanValue()) {
                return this.f10459n.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
