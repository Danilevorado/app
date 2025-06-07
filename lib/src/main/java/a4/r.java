package a4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class r implements ServiceConnection {

    /* renamed from: o, reason: collision with root package name */
    s f141o;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ x f144r;

    /* renamed from: m, reason: collision with root package name */
    int f139m = 0;

    /* renamed from: n, reason: collision with root package name */
    final Messenger f140n = new Messenger(new q4.f(Looper.getMainLooper(), new Handler.Callback() { // from class: a4.k
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            r rVar = this.f131m;
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Received response to request: ");
                sb2.append(i10);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            synchronized (rVar) {
                u uVar = (u) rVar.f143q.get(i10);
                if (uVar == null) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("Received response for unknown request: ");
                    sb3.append(i10);
                    Log.w("MessengerIpcClient", sb3.toString());
                    return true;
                }
                rVar.f143q.remove(i10);
                rVar.f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    uVar.c(new v(4, "Not supported by GmsCore", null));
                    return true;
                }
                uVar.a(data);
                return true;
            }
        }
    }));

    /* renamed from: p, reason: collision with root package name */
    final Queue f142p = new ArrayDeque();

    /* renamed from: q, reason: collision with root package name */
    final SparseArray f143q = new SparseArray();

    /* synthetic */ r(x xVar, q qVar) {
        this.f144r = xVar;
    }

    final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    final synchronized void b(int i10, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
        }
        int i11 = this.f139m;
        if (i11 == 0) {
            throw new IllegalStateException();
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            this.f139m = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f139m = 4;
        h4.a.b().c(this.f144r.f152a, this);
        v vVar = new v(i10, str, th);
        Iterator it = this.f142p.iterator();
        while (it.hasNext()) {
            ((u) it.next()).c(vVar);
        }
        this.f142p.clear();
        for (int i12 = 0; i12 < this.f143q.size(); i12++) {
            ((u) this.f143q.valueAt(i12)).c(vVar);
        }
        this.f143q.clear();
    }

    final void c() {
        this.f144r.f153b.execute(new Runnable() { // from class: a4.m
            @Override // java.lang.Runnable
            public final void run() {
                final u uVar;
                final r rVar = this.f133m;
                while (true) {
                    synchronized (rVar) {
                        if (rVar.f139m != 2) {
                            return;
                        }
                        if (rVar.f142p.isEmpty()) {
                            rVar.f();
                            return;
                        } else {
                            uVar = (u) rVar.f142p.poll();
                            rVar.f143q.put(uVar.f147a, uVar);
                            rVar.f144r.f153b.schedule(new Runnable() { // from class: a4.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    rVar.e(uVar.f147a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(uVar);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(strValueOf);
                        Log.d("MessengerIpcClient", sb2.toString());
                    }
                    Context context = rVar.f144r.f152a;
                    Messenger messenger = rVar.f140n;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = uVar.f149c;
                    messageObtain.arg1 = uVar.f147a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", uVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", uVar.f150d);
                    messageObtain.setData(bundle);
                    try {
                        rVar.f141o.a(messageObtain);
                    } catch (RemoteException e5) {
                        rVar.a(2, e5.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void d() {
        if (this.f139m == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void e(int i10) {
        u uVar = (u) this.f143q.get(i10);
        if (uVar != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i10);
            Log.w("MessengerIpcClient", sb2.toString());
            this.f143q.remove(i10);
            uVar.c(new v(3, "Timed out waiting for response", null));
            f();
        }
    }

    final synchronized void f() {
        if (this.f139m == 2 && this.f142p.isEmpty() && this.f143q.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f139m = 3;
            h4.a.b().c(this.f144r.f152a, this);
        }
    }

    final synchronized boolean g(u uVar) {
        int i10 = this.f139m;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f142p.add(uVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f142p.add(uVar);
            c();
            return true;
        }
        this.f142p.add(uVar);
        e4.p.o(this.f139m == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f139m = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (h4.a.b().a(this.f144r.f152a, intent, this, 1)) {
                this.f144r.f153b.schedule(new Runnable() { // from class: a4.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f134m.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e5) {
            b(0, "Unable to bind to service", e5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f144r.f153b.execute(new Runnable() { // from class: a4.o
            @Override // java.lang.Runnable
            public final void run() {
                r rVar = this.f135m;
                IBinder iBinder2 = iBinder;
                synchronized (rVar) {
                    try {
                        if (iBinder2 == null) {
                            rVar.a(0, "Null service connection");
                            return;
                        }
                        try {
                            rVar.f141o = new s(iBinder2);
                            rVar.f139m = 2;
                            rVar.c();
                        } catch (RemoteException e5) {
                            rVar.a(0, e5.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f144r.f153b.execute(new Runnable() { // from class: a4.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f132m.a(2, "Service disconnected");
            }
        });
    }
}
