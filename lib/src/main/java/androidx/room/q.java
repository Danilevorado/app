package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.l;
import androidx.room.m;
import androidx.room.p;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    final Context f3776a;

    /* renamed from: b, reason: collision with root package name */
    final String f3777b;

    /* renamed from: c, reason: collision with root package name */
    int f3778c;

    /* renamed from: d, reason: collision with root package name */
    final p f3779d;

    /* renamed from: e, reason: collision with root package name */
    final p.c f3780e;

    /* renamed from: f, reason: collision with root package name */
    m f3781f;

    /* renamed from: g, reason: collision with root package name */
    final Executor f3782g;

    /* renamed from: h, reason: collision with root package name */
    final l f3783h = new a();

    /* renamed from: i, reason: collision with root package name */
    final AtomicBoolean f3784i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    final ServiceConnection f3785j;

    /* renamed from: k, reason: collision with root package name */
    final Runnable f3786k;

    /* renamed from: l, reason: collision with root package name */
    final Runnable f3787l;

    class a extends l.a {

        /* renamed from: androidx.room.q$a$a, reason: collision with other inner class name */
        class RunnableC0059a implements Runnable {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ String[] f3789m;

            RunnableC0059a(String[] strArr) {
                this.f3789m = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                q.this.f3779d.f(this.f3789m);
            }
        }

        a() {
        }

        @Override // androidx.room.l
        public void C2(String[] strArr) {
            q.this.f3782g.execute(new RunnableC0059a(strArr));
        }
    }

    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            q.this.f3781f = m.a.C(iBinder);
            q qVar = q.this;
            qVar.f3782g.execute(qVar.f3786k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            q qVar = q.this;
            qVar.f3782g.execute(qVar.f3787l);
            q.this.f3781f = null;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q qVar = q.this;
                m mVar = qVar.f3781f;
                if (mVar != null) {
                    qVar.f3778c = mVar.y3(qVar.f3783h, qVar.f3777b);
                    q qVar2 = q.this;
                    qVar2.f3779d.a(qVar2.f3780e);
                }
            } catch (RemoteException e5) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e5);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q qVar = q.this;
            qVar.f3779d.i(qVar.f3780e);
        }
    }

    class e extends p.c {
        e(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.p.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.p.c
        public void b(Set set) {
            if (q.this.f3784i.get()) {
                return;
            }
            try {
                q qVar = q.this;
                m mVar = qVar.f3781f;
                if (mVar != null) {
                    mVar.L4(qVar.f3778c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e5) {
                Log.w("ROOM", "Cannot broadcast invalidation", e5);
            }
        }
    }

    q(Context context, String str, Intent intent, p pVar, Executor executor) {
        b bVar = new b();
        this.f3785j = bVar;
        this.f3786k = new c();
        this.f3787l = new d();
        Context applicationContext = context.getApplicationContext();
        this.f3776a = applicationContext;
        this.f3777b = str;
        this.f3779d = pVar;
        this.f3782g = executor;
        this.f3780e = new e((String[]) pVar.f3752a.keySet().toArray(new String[0]));
        applicationContext.bindService(intent, bVar, 1);
    }
}
