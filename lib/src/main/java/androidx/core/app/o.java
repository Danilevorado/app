package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.a;
import com.facebook.ads.AdError;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    private static String f2113d;

    /* renamed from: g, reason: collision with root package name */
    private static c f2116g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f2117a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f2118b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f2112c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static Set f2114e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f2115f = new Object();

    private static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final String f2119a;

        /* renamed from: b, reason: collision with root package name */
        final int f2120b;

        /* renamed from: c, reason: collision with root package name */
        final String f2121c;

        /* renamed from: d, reason: collision with root package name */
        final Notification f2122d;

        a(String str, int i10, String str2, Notification notification) {
            this.f2119a = str;
            this.f2120b = i10;
            this.f2121c = str2;
            this.f2122d = notification;
        }

        @Override // androidx.core.app.o.d
        public void a(b.a aVar) {
            aVar.Z4(this.f2119a, this.f2120b, this.f2121c, this.f2122d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f2119a + ", id:" + this.f2120b + ", tag:" + this.f2121c + "]";
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f2123a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f2124b;

        b(ComponentName componentName, IBinder iBinder) {
            this.f2123a = componentName;
            this.f2124b = iBinder;
        }
    }

    private static class c implements Handler.Callback, ServiceConnection {

        /* renamed from: m, reason: collision with root package name */
        private final Context f2125m;

        /* renamed from: n, reason: collision with root package name */
        private final HandlerThread f2126n;

        /* renamed from: o, reason: collision with root package name */
        private final Handler f2127o;

        /* renamed from: p, reason: collision with root package name */
        private final Map f2128p = new HashMap();

        /* renamed from: q, reason: collision with root package name */
        private Set f2129q = new HashSet();

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            final ComponentName f2130a;

            /* renamed from: c, reason: collision with root package name */
            b.a f2132c;

            /* renamed from: b, reason: collision with root package name */
            boolean f2131b = false;

            /* renamed from: d, reason: collision with root package name */
            ArrayDeque f2133d = new ArrayDeque();

            /* renamed from: e, reason: collision with root package name */
            int f2134e = 0;

            a(ComponentName componentName) {
                this.f2130a = componentName;
            }
        }

        c(Context context) {
            this.f2125m = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f2126n = handlerThread;
            handlerThread.start();
            this.f2127o = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f2131b) {
                return true;
            }
            boolean zBindService = this.f2125m.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f2130a), this, 33);
            aVar.f2131b = zBindService;
            if (zBindService) {
                aVar.f2134e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f2130a);
                this.f2125m.unbindService(this);
            }
            return aVar.f2131b;
        }

        private void b(a aVar) {
            if (aVar.f2131b) {
                this.f2125m.unbindService(this);
                aVar.f2131b = false;
            }
            aVar.f2132c = null;
        }

        private void c(d dVar) {
            j();
            for (a aVar : this.f2128p.values()) {
                aVar.f2133d.add(dVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = (a) this.f2128p.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f2128p.get(componentName);
            if (aVar != null) {
                aVar.f2132c = a.AbstractBinderC0072a.C(iBinder);
                aVar.f2134e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = (a) this.f2128p.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f2130a + ", " + aVar.f2133d.size() + " queued tasks");
            }
            if (aVar.f2133d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f2132c == null) {
                i(aVar);
                return;
            }
            while (true) {
                d dVar = (d) aVar.f2133d.peek();
                if (dVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + dVar);
                    }
                    dVar.a(aVar.f2132c);
                    aVar.f2133d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f2130a);
                    }
                } catch (RemoteException e5) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f2130a, e5);
                }
            }
            if (aVar.f2133d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f2127o.hasMessages(3, aVar.f2130a)) {
                return;
            }
            int i10 = aVar.f2134e + 1;
            aVar.f2134e = i10;
            if (i10 <= 6) {
                int i11 = (1 << (i10 - 1)) * AdError.NETWORK_ERROR_CODE;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
                }
                this.f2127o.sendMessageDelayed(this.f2127o.obtainMessage(3, aVar.f2130a), i11);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f2133d.size() + " tasks to " + aVar.f2130a + " after " + aVar.f2134e + " retries");
            aVar.f2133d.clear();
        }

        private void j() {
            Set setF = o.f(this.f2125m);
            if (setF.equals(this.f2129q)) {
                return;
            }
            this.f2129q = setF;
            List<ResolveInfo> listQueryIntentServices = this.f2125m.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setF.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f2128p.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f2128p.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f2128p.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        public void h(d dVar) {
            this.f2127o.obtainMessage(0, dVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((d) message.obj);
                return true;
            }
            if (i10 == 1) {
                b bVar = (b) message.obj;
                e(bVar.f2123a, bVar.f2124b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f2127o.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f2127o.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface d {
        void a(b.a aVar);
    }

    private o(Context context) {
        this.f2117a = context;
        this.f2118b = (NotificationManager) context.getSystemService("notification");
    }

    public static o e(Context context) {
        return new o(context);
    }

    public static Set f(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f2112c) {
            if (string != null) {
                if (!string.equals(f2113d)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    f2114e = hashSet;
                    f2113d = string;
                }
                set = f2114e;
            } else {
                set = f2114e;
            }
        }
        return set;
    }

    private void i(d dVar) {
        synchronized (f2115f) {
            if (f2116g == null) {
                f2116g = new c(this.f2117a.getApplicationContext());
            }
            f2116g.h(dVar);
        }
    }

    private static boolean j(Notification notification) {
        Bundle bundleA = l.a(notification);
        return bundleA != null && bundleA.getBoolean("android.support.useSideChannel");
    }

    public boolean a() throws ClassNotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f2118b.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f2117a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f2117a.getApplicationInfo();
        String packageName = this.f2117a.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void c(String str, int i10) {
        this.f2118b.cancel(str, i10);
    }

    public void d() {
        this.f2118b.cancelAll();
    }

    public void g(int i10, Notification notification) {
        h(null, i10, notification);
    }

    public void h(String str, int i10, Notification notification) {
        if (!j(notification)) {
            this.f2118b.notify(str, i10, notification);
        } else {
            i(new a(this.f2117a.getPackageName(), i10, str, notification));
            this.f2118b.cancel(str, i10);
        }
    }
}
