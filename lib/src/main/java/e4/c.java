package e4;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c {
    private boolean A;
    private volatile e1 B;
    protected AtomicInteger C;

    /* renamed from: a, reason: collision with root package name */
    private int f23078a;

    /* renamed from: b, reason: collision with root package name */
    private long f23079b;

    /* renamed from: c, reason: collision with root package name */
    private long f23080c;

    /* renamed from: d, reason: collision with root package name */
    private int f23081d;

    /* renamed from: e, reason: collision with root package name */
    private long f23082e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f23083f;

    /* renamed from: g, reason: collision with root package name */
    o1 f23084g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f23085h;

    /* renamed from: i, reason: collision with root package name */
    private final Looper f23086i;

    /* renamed from: j, reason: collision with root package name */
    private final i f23087j;

    /* renamed from: k, reason: collision with root package name */
    private final b4.f f23088k;

    /* renamed from: l, reason: collision with root package name */
    final Handler f23089l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f23090m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f23091n;

    /* renamed from: o, reason: collision with root package name */
    private m f23092o;

    /* renamed from: p, reason: collision with root package name */
    protected InterfaceC0124c f23093p;

    /* renamed from: q, reason: collision with root package name */
    private IInterface f23094q;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f23095r;

    /* renamed from: s, reason: collision with root package name */
    private b1 f23096s;

    /* renamed from: t, reason: collision with root package name */
    private int f23097t;

    /* renamed from: u, reason: collision with root package name */
    private final a f23098u;

    /* renamed from: v, reason: collision with root package name */
    private final b f23099v;

    /* renamed from: w, reason: collision with root package name */
    private final int f23100w;

    /* renamed from: x, reason: collision with root package name */
    private final String f23101x;

    /* renamed from: y, reason: collision with root package name */
    private volatile String f23102y;

    /* renamed from: z, reason: collision with root package name */
    private b4.b f23103z;
    private static final b4.d[] E = new b4.d[0];
    public static final String[] D = {"service_esmobile", "service_googleme"};

    public interface a {
        void C(int i10);

        void L0(Bundle bundle);
    }

    public interface b {
        void w0(b4.b bVar);
    }

    /* renamed from: e4.c$c, reason: collision with other inner class name */
    public interface InterfaceC0124c {
        void a(b4.b bVar);
    }

    protected class d implements InterfaceC0124c {
        public d() {
        }

        @Override // e4.c.InterfaceC0124c
        public final void a(b4.b bVar) {
            if (bVar.y()) {
                c cVar = c.this;
                cVar.p(null, cVar.G());
            } else if (c.this.f23099v != null) {
                c.this.f23099v.w0(bVar);
            }
        }
    }

    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected c(Context context, Looper looper, int i10, a aVar, b bVar, String str) {
        i iVarA = i.a(context);
        b4.f fVarH = b4.f.h();
        p.l(aVar);
        p.l(bVar);
        this(context, looper, iVarA, fVarH, i10, aVar, bVar, str);
    }

    protected c(Context context, Looper looper, i iVar, b4.f fVar, int i10, a aVar, b bVar, String str) {
        this.f23083f = null;
        this.f23090m = new Object();
        this.f23091n = new Object();
        this.f23095r = new ArrayList();
        this.f23097t = 1;
        this.f23103z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        p.m(context, "Context must not be null");
        this.f23085h = context;
        p.m(looper, "Looper must not be null");
        this.f23086i = looper;
        p.m(iVar, "Supervisor must not be null");
        this.f23087j = iVar;
        p.m(fVar, "API availability must not be null");
        this.f23088k = fVar;
        this.f23089l = new y0(this, looper);
        this.f23100w = i10;
        this.f23098u = aVar;
        this.f23099v = bVar;
        this.f23101x = str;
    }

    static /* bridge */ /* synthetic */ void g0(c cVar, e1 e1Var) {
        cVar.B = e1Var;
        if (cVar.W()) {
            f fVar = e1Var.f23131p;
            q.b().c(fVar == null ? null : fVar.z());
        }
    }

    static /* bridge */ /* synthetic */ void h0(c cVar, int i10) {
        int i11;
        int i12;
        synchronized (cVar.f23090m) {
            i11 = cVar.f23097t;
        }
        if (i11 == 3) {
            cVar.A = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = cVar.f23089l;
        handler.sendMessage(handler.obtainMessage(i12, cVar.C.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean k0(c cVar, int i10, int i11, IInterface iInterface) {
        synchronized (cVar.f23090m) {
            if (cVar.f23097t != i10) {
                return false;
            }
            cVar.m0(i11, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean l0(c cVar) throws ClassNotFoundException {
        if (cVar.A || TextUtils.isEmpty(cVar.I()) || TextUtils.isEmpty(cVar.F())) {
            return false;
        }
        try {
            Class.forName(cVar.I());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(int i10, IInterface iInterface) {
        o1 o1Var;
        p.a((i10 == 4) == (iInterface != null));
        synchronized (this.f23090m) {
            this.f23097t = i10;
            this.f23094q = iInterface;
            if (i10 == 1) {
                b1 b1Var = this.f23096s;
                if (b1Var != null) {
                    i iVar = this.f23087j;
                    String strB = this.f23084g.b();
                    p.l(strB);
                    iVar.d(strB, this.f23084g.a(), 4225, b1Var, b0(), this.f23084g.c());
                    this.f23096s = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                b1 b1Var2 = this.f23096s;
                if (b1Var2 != null && (o1Var = this.f23084g) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + o1Var.b() + " on " + o1Var.a());
                    i iVar2 = this.f23087j;
                    String strB2 = this.f23084g.b();
                    p.l(strB2);
                    iVar2.d(strB2, this.f23084g.a(), 4225, b1Var2, b0(), this.f23084g.c());
                    this.C.incrementAndGet();
                }
                b1 b1Var3 = new b1(this, this.C.get());
                this.f23096s = b1Var3;
                o1 o1Var2 = (this.f23097t != 3 || F() == null) ? new o1(K(), J(), false, 4225, M()) : new o1(C().getPackageName(), F(), true, 4225, false);
                this.f23084g = o1Var2;
                if (o1Var2.c() && h() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f23084g.b())));
                }
                i iVar3 = this.f23087j;
                String strB3 = this.f23084g.b();
                p.l(strB3);
                if (!iVar3.e(new i1(strB3, this.f23084g.a(), 4225, this.f23084g.c()), b1Var3, b0(), A())) {
                    Log.w("GmsClient", "unable to connect to service: " + this.f23084g.b() + " on " + this.f23084g.a());
                    i0(16, null, this.C.get());
                }
            } else if (i10 == 4) {
                p.l(iInterface);
                O(iInterface);
            }
        }
    }

    protected Executor A() {
        return null;
    }

    public Bundle B() {
        return null;
    }

    public final Context C() {
        return this.f23085h;
    }

    public int D() {
        return this.f23100w;
    }

    protected Bundle E() {
        return new Bundle();
    }

    protected String F() {
        return null;
    }

    protected Set G() {
        return Collections.emptySet();
    }

    public final IInterface H() {
        IInterface iInterface;
        synchronized (this.f23090m) {
            if (this.f23097t == 5) {
                throw new DeadObjectException();
            }
            v();
            iInterface = this.f23094q;
            p.m(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    protected abstract String I();

    protected abstract String J();

    protected String K() {
        return "com.google.android.gms";
    }

    public f L() {
        e1 e1Var = this.B;
        if (e1Var == null) {
            return null;
        }
        return e1Var.f23131p;
    }

    protected boolean M() {
        return h() >= 211700000;
    }

    public boolean N() {
        return this.B != null;
    }

    protected void O(IInterface iInterface) {
        this.f23080c = System.currentTimeMillis();
    }

    protected void P(b4.b bVar) {
        this.f23081d = bVar.f();
        this.f23082e = System.currentTimeMillis();
    }

    protected void Q(int i10) {
        this.f23078a = i10;
        this.f23079b = System.currentTimeMillis();
    }

    protected void R(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.f23089l.sendMessage(this.f23089l.obtainMessage(1, i11, -1, new c1(this, i10, iBinder, bundle)));
    }

    public boolean S() {
        return false;
    }

    public void T(String str) {
        this.f23102y = str;
    }

    public void U(int i10) {
        this.f23089l.sendMessage(this.f23089l.obtainMessage(6, this.C.get(), i10));
    }

    protected void V(InterfaceC0124c interfaceC0124c, int i10, PendingIntent pendingIntent) {
        p.m(interfaceC0124c, "Connection progress callbacks cannot be null.");
        this.f23093p = interfaceC0124c;
        this.f23089l.sendMessage(this.f23089l.obtainMessage(3, this.C.get(), i10, pendingIntent));
    }

    public boolean W() {
        return false;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f23090m) {
            z10 = this.f23097t == 4;
        }
        return z10;
    }

    public void b(e eVar) {
        eVar.a();
    }

    protected final String b0() {
        String str = this.f23101x;
        return str == null ? this.f23085h.getClass().getName() : str;
    }

    public boolean c() {
        return false;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        m mVar;
        synchronized (this.f23090m) {
            i10 = this.f23097t;
            iInterface = this.f23094q;
        }
        synchronized (this.f23091n) {
            mVar = this.f23092o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) I()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (mVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(mVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f23080c > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f23080c;
            printWriterAppend.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.f23079b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f23078a;
            printWriter.append((CharSequence) (i11 != 1 ? i11 != 2 ? i11 != 3 ? String.valueOf(i11) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f23079b;
            printWriterAppend2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.f23082e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) c4.b.a(this.f23081d));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f23082e;
            printWriterAppend3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    public void f(String str) {
        this.f23083f = str;
        q();
    }

    public boolean g() {
        return true;
    }

    public int h() {
        return b4.f.f4422a;
    }

    public boolean i() {
        boolean z10;
        synchronized (this.f23090m) {
            int i10 = this.f23097t;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    protected final void i0(int i10, Bundle bundle, int i11) {
        this.f23089l.sendMessage(this.f23089l.obtainMessage(7, i11, -1, new d1(this, i10, null)));
    }

    public void j(InterfaceC0124c interfaceC0124c) {
        p.m(interfaceC0124c, "Connection progress callbacks cannot be null.");
        this.f23093p = interfaceC0124c;
        m0(2, null);
    }

    public final b4.d[] k() {
        e1 e1Var = this.B;
        if (e1Var == null) {
            return null;
        }
        return e1Var.f23129n;
    }

    public String l() {
        o1 o1Var;
        if (!a() || (o1Var = this.f23084g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return o1Var.a();
    }

    public String o() {
        return this.f23083f;
    }

    public void p(j jVar, Set set) {
        Bundle bundleE = E();
        String str = this.f23102y;
        int i10 = b4.f.f4422a;
        Scope[] scopeArr = g.A;
        Bundle bundle = new Bundle();
        int i11 = this.f23100w;
        b4.d[] dVarArr = g.B;
        g gVar = new g(6, i11, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        gVar.f23142p = this.f23085h.getPackageName();
        gVar.f23145s = bundleE;
        if (set != null) {
            gVar.f23144r = (Scope[]) set.toArray(new Scope[0]);
        }
        if (s()) {
            Account accountY = y();
            if (accountY == null) {
                accountY = new Account("<<default account>>", "com.google");
            }
            gVar.f23146t = accountY;
            if (jVar != null) {
                gVar.f23143q = jVar.asBinder();
            }
        } else if (S()) {
            gVar.f23146t = y();
        }
        gVar.f23147u = E;
        gVar.f23148v = z();
        if (W()) {
            gVar.f23151y = true;
        }
        try {
            synchronized (this.f23091n) {
                m mVar = this.f23092o;
                if (mVar != null) {
                    mVar.t5(new a1(this, this.C.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e5) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e5);
            U(3);
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            R(8, null, null, this.C.get());
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            R(8, null, null, this.C.get());
        }
    }

    public void q() {
        this.C.incrementAndGet();
        synchronized (this.f23095r) {
            int size = this.f23095r.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((z0) this.f23095r.get(i10)).d();
            }
            this.f23095r.clear();
        }
        synchronized (this.f23091n) {
            this.f23092o = null;
        }
        m0(1, null);
    }

    public Intent r() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean s() {
        return false;
    }

    public void u() {
        int iJ = this.f23088k.j(this.f23085h, h());
        if (iJ == 0) {
            j(new d());
        } else {
            m0(1, null);
            V(new d(), iJ, null);
        }
    }

    protected final void v() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract IInterface w(IBinder iBinder);

    protected boolean x() {
        return false;
    }

    public Account y() {
        return null;
    }

    public b4.d[] z() {
        return E;
    }
}
