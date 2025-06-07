package w7;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import com.pushwoosh.PushwooshSharedDataProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import n7.l;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static d f27996a;

    /* renamed from: b, reason: collision with root package name */
    private static d f27997b;

    private static class b extends d {
        private b() {
        }

        @Override // w7.a.d
        protected String h() {
            ka.d dVarF = ka.e.f();
            String strA = dVarF.f().a();
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
            String string = UUID.randomUUID().toString();
            dVarF.f().b(string);
            return string;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends d {

        /* renamed from: d, reason: collision with root package name */
        private CountDownLatch f27998d;

        /* renamed from: e, reason: collision with root package name */
        private b f27999e;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w7.a$c$a, reason: collision with other inner class name */
        interface InterfaceC0205a {
            void c(String str);
        }

        private static class b extends AsyncTask {

            /* renamed from: a, reason: collision with root package name */
            private final List f28000a;

            private b() {
                this.f28000a = new ArrayList();
            }

            private void b(String str) {
                ArrayList arrayList;
                if (TextUtils.isEmpty(str)) {
                    str = UUID.randomUUID().toString();
                }
                ka.e.f().f().b(str);
                synchronized (this.f28000a) {
                    arrayList = new ArrayList(this.f28000a);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0205a) it.next()).c(str);
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String doInBackground(Void... voidArr) {
                return c.n();
            }

            void c(InterfaceC0205a interfaceC0205a) {
                synchronized (this.f28000a) {
                    this.f28000a.add(interfaceC0205a);
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(String str) {
                super.onPostExecute(str);
                b(str);
            }

            @Override // android.os.AsyncTask
            protected void onCancelled() {
                super.onCancelled();
                b(null);
            }
        }

        private c() {
            this.f27998d = new CountDownLatch(1);
        }

        private static List k(List list) {
            String[] strArrC = l.i().e().c();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfo = (ProviderInfo) it.next();
                for (String str : strArrC) {
                    if (!TextUtils.isEmpty(providerInfo.packageName) && TextUtils.equals(providerInfo.packageName, str)) {
                        arrayList.add(providerInfo);
                    }
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(Handler handler, d.InterfaceC0206a interfaceC0206a, String str) {
            handler.removeCallbacksAndMessages(null);
            if (interfaceC0206a != null) {
                interfaceC0206a.c(str);
            }
            this.f27998d.countDown();
            this.f27999e = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String n() {
            String str = null;
            try {
                Context contextB = c9.a.b();
                if (contextB == null) {
                    return null;
                }
                List<ProviderInfo> listK = k(contextB.getPackageManager().queryContentProviders((String) null, 0, 0));
                if (listK.size() == 0) {
                    return null;
                }
                String str2 = contextB.getPackageName() + "." + PushwooshSharedDataProvider.class.getSimpleName();
                for (ProviderInfo providerInfo : listK) {
                    if (providerInfo.authority.endsWith("." + PushwooshSharedDataProvider.class.getSimpleName()) && !providerInfo.authority.equals(str2)) {
                        Cursor cursorQuery = contextB.getContentResolver().query(Uri.parse("content://" + providerInfo.authority + "/hwid"), null, null, null, g9.a.h(contextB.getPackageName()));
                        if (cursorQuery == null) {
                            continue;
                        } else {
                            if (cursorQuery.getColumnCount() > 0 && cursorQuery.getColumnName(0).equals("hwid") && cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(0);
                                if (!TextUtils.isEmpty(string)) {
                                    try {
                                        cursorQuery.close();
                                        return string;
                                    } catch (Exception e5) {
                                        e = e5;
                                        str = string;
                                        e.printStackTrace();
                                        return str;
                                    }
                                }
                            }
                            cursorQuery.close();
                        }
                    }
                }
                return null;
            } catch (Exception e10) {
                e = e10;
            }
        }

        private boolean o() {
            b bVar = this.f27999e;
            return (bVar == null || bVar.getStatus() == AsyncTask.Status.FINISHED) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p() {
            b bVar = this.f27999e;
            if (bVar == null || bVar.getStatus() == AsyncTask.Status.FINISHED) {
                return;
            }
            this.f27999e.cancel(true);
        }

        @Override // w7.a.d
        protected void c(final d.InterfaceC0206a interfaceC0206a) {
            if (o()) {
                if (interfaceC0206a != null) {
                    this.f27999e.c(new InterfaceC0205a() { // from class: w7.d
                        @Override // w7.a.c.InterfaceC0205a
                        public final void c(String str) {
                            interfaceC0206a.c(str);
                        }
                    });
                    return;
                }
                return;
            }
            final Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
            InterfaceC0205a interfaceC0205a = new InterfaceC0205a() { // from class: w7.c
                @Override // w7.a.c.InterfaceC0205a
                public final void c(String str) {
                    this.f28005a.l(handler, interfaceC0206a, str);
                }
            };
            try {
                String strA = ka.e.f().f().a();
                if (!TextUtils.isEmpty(strA)) {
                    interfaceC0205a.c(strA);
                    return;
                }
                b bVar = new b();
                this.f27999e = bVar;
                bVar.c(interfaceC0205a);
                handler.postDelayed(new Runnable() { // from class: w7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28004m.p();
                    }
                }, 10000L);
                this.f27999e.execute(new Void[0]);
            } catch (Exception e5) {
                e5.printStackTrace();
                interfaceC0205a.c(null);
            }
        }

        @Override // w7.a.d
        protected String h() throws InterruptedException {
            ka.d dVarF = ka.e.f();
            if (!o()) {
                c(null);
            }
            try {
                this.f27998d.await();
                return dVarF.f().a();
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    public static abstract class d {

        /* renamed from: c, reason: collision with root package name */
        private static List f28001c = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        String f28002a = null;

        /* renamed from: b, reason: collision with root package name */
        d f28003b;

        /* renamed from: w7.a$d$a, reason: collision with other inner class name */
        protected interface InterfaceC0206a {
            void c(String str);
        }

        d() {
            f28001c.add("9774d56d682e549c");
            f28001c.add("1234567");
            f28001c.add("abcdef");
            f28001c.add("dead00beef");
            f28001c.add("unknown");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(f fVar, String str) {
            d dVar;
            if (!g(str) || (dVar = this.f28003b) == null) {
                this.f28002a = str;
            } else {
                str = dVar.b();
            }
            fVar.c(str);
        }

        private boolean g(String str) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str.replace('0', ' ').replace('-', ' ').trim())) {
                return true;
            }
            return f28001c.contains(str.toLowerCase());
        }

        public String b() {
            d dVar;
            synchronized (this) {
                String str = this.f28002a;
                if (str != null) {
                    return str;
                }
                String strH = h();
                if (g(strH) && (dVar = this.f28003b) != null) {
                    return dVar.b();
                }
                this.f28002a = strH;
                return strH;
            }
        }

        protected void c(InterfaceC0206a interfaceC0206a) {
            interfaceC0206a.c(h());
        }

        void d(d dVar) {
            this.f28003b = dVar;
        }

        public void e(final f fVar) {
            synchronized (this) {
                String str = this.f28002a;
                if (str != null) {
                    fVar.c(str);
                } else {
                    c(new InterfaceC0206a() { // from class: w7.e
                        @Override // w7.a.d.InterfaceC0206a
                        public final void c(String str2) {
                            this.f28009a.f(fVar, str2);
                        }
                    });
                }
            }
        }

        protected abstract String h();
    }

    static {
        f27996a = new b();
        f27997b = new c();
        f();
    }

    public static String a() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return b(str2);
        }
        return b(str) + " " + str2;
    }

    private static String b(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char cCharAt = str.charAt(0);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        return Character.toUpperCase(cCharAt) + str.substring(1);
    }

    public static void c(f fVar) {
        f27997b.e(fVar);
    }

    public static String d() {
        return f27997b.b();
    }

    public static String e() {
        return ka.e.f().f().a();
    }

    static void f() {
        f27996a = new b();
        c cVar = new c();
        f27997b = cVar;
        cVar.d(f27996a);
    }

    public static boolean g() {
        PowerManager powerManagerB;
        KeyguardManager keyguardManagerF = c9.a.e().f();
        if (keyguardManagerF == null || keyguardManagerF.inKeyguardRestrictedInputMode() || (powerManagerB = c9.a.e().b()) == null || !powerManagerB.isInteractive()) {
            return false;
        }
        ActivityManager activityManagerD = c9.a.e().d();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManagerD == null ? null : activityManagerD.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String strD = c9.a.a().d();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(strD)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h() {
        Configuration configurationE = c9.a.j().e();
        return configurationE != null && (configurationE.screenLayout & 4) == 4;
    }
}
