package com.onesignal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.e3;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
abstract class n3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22119a = e3.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    static HashMap f22120b;

    /* renamed from: c, reason: collision with root package name */
    public static a f22121c;

    public static class a extends HandlerThread {

        /* renamed from: m, reason: collision with root package name */
        private Handler f22122m;

        /* renamed from: n, reason: collision with root package name */
        private long f22123n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f22124o;

        /* renamed from: com.onesignal.n3$a$a, reason: collision with other inner class name */
        class RunnableC0110a implements Runnable {
            RunnableC0110a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c();
            }
        }

        a(String str) {
            super(str);
            this.f22123n = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            for (String str : n3.f22120b.keySet()) {
                SharedPreferences.Editor editorEdit = n3.e(str).edit();
                HashMap map = (HashMap) n3.f22120b.get(str);
                synchronized (map) {
                    for (String str2 : map.keySet()) {
                        Object obj = map.get(str2);
                        if (obj instanceof String) {
                            editorEdit.putString(str2, (String) obj);
                        } else if (obj instanceof Boolean) {
                            editorEdit.putBoolean(str2, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof Integer) {
                            editorEdit.putInt(str2, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            editorEdit.putLong(str2, ((Long) obj).longValue());
                        } else if (obj instanceof Set) {
                            editorEdit.putStringSet(str2, (Set) obj);
                        } else if (obj == null) {
                            editorEdit.remove(str2);
                        }
                    }
                    map.clear();
                }
                editorEdit.apply();
            }
            this.f22123n = e3.B0().b();
        }

        private synchronized void d() {
            Handler handler = this.f22122m;
            if (handler == null) {
                return;
            }
            handler.removeCallbacksAndMessages(null);
            if (this.f22123n == 0) {
                this.f22123n = e3.B0().b();
            }
            long jB = (this.f22123n - e3.B0().b()) + 200;
            this.f22122m.postDelayed(new RunnableC0110a(), jB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void e() {
            if (e3.f21882e == null) {
                return;
            }
            f();
            d();
        }

        private void f() {
            if (this.f22124o) {
                return;
            }
            start();
            this.f22124o = true;
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            super.onLooperPrepared();
            this.f22122m = new Handler(getLooper());
            d();
        }
    }

    static {
        h();
    }

    private static Object a(String str, String str2, Class cls, Object obj) {
        HashMap map = (HashMap) f22120b.get(str);
        synchronized (map) {
            if (cls.equals(Object.class) && map.containsKey(str2)) {
                return Boolean.TRUE;
            }
            Object obj2 = map.get(str2);
            if (obj2 == null && !map.containsKey(str2)) {
                SharedPreferences sharedPreferencesE = e(str);
                if (sharedPreferencesE == null) {
                    return obj;
                }
                if (cls.equals(String.class)) {
                    return sharedPreferencesE.getString(str2, (String) obj);
                }
                if (cls.equals(Boolean.class)) {
                    return Boolean.valueOf(sharedPreferencesE.getBoolean(str2, ((Boolean) obj).booleanValue()));
                }
                if (cls.equals(Integer.class)) {
                    return Integer.valueOf(sharedPreferencesE.getInt(str2, ((Integer) obj).intValue()));
                }
                if (cls.equals(Long.class)) {
                    return Long.valueOf(sharedPreferencesE.getLong(str2, ((Long) obj).longValue()));
                }
                if (cls.equals(Set.class)) {
                    return sharedPreferencesE.getStringSet(str2, (Set) obj);
                }
                if (cls.equals(Object.class)) {
                    return Boolean.valueOf(sharedPreferencesE.contains(str2));
                }
                return null;
            }
            return obj2;
        }
    }

    static boolean b(String str, String str2, boolean z10) {
        return ((Boolean) a(str, str2, Boolean.class, Boolean.valueOf(z10))).booleanValue();
    }

    static int c(String str, String str2, int i10) {
        return ((Integer) a(str, str2, Integer.class, Integer.valueOf(i10))).intValue();
    }

    static long d(String str, String str2, long j10) {
        return ((Long) a(str, str2, Long.class, Long.valueOf(j10))).longValue();
    }

    static synchronized SharedPreferences e(String str) {
        Context context = e3.f21882e;
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        e3.b(e3.z.WARN, "OneSignal.appContext null, could not read " + str + " from getSharedPreferences.", new Throwable());
        return null;
    }

    static String f(String str, String str2, String str3) {
        return (String) a(str, str2, String.class, str3);
    }

    public static Set g(String str, String str2, Set set) {
        return (Set) a(str, str2, Set.class, set);
    }

    public static void h() {
        HashMap map = new HashMap();
        f22120b = map;
        map.put(f22119a, new HashMap());
        f22120b.put("GTPlayerPurchases", new HashMap());
        f22120b.put("OneSignalTriggers", new HashMap());
        f22121c = new a("OSH_WritePrefs");
    }

    private static void i(String str, String str2, Object obj) {
        HashMap map = (HashMap) f22120b.get(str);
        synchronized (map) {
            map.put(str2, obj);
        }
        o();
    }

    public static void j(String str, String str2, boolean z10) {
        i(str, str2, Boolean.valueOf(z10));
    }

    public static void k(String str, String str2, int i10) {
        i(str, str2, Integer.valueOf(i10));
    }

    public static void l(String str, String str2, long j10) {
        i(str, str2, Long.valueOf(j10));
    }

    public static void m(String str, String str2, String str3) {
        i(str, str2, str3);
    }

    public static void n(String str, String str2, Set set) {
        i(str, str2, set);
    }

    public static void o() {
        f22121c.e();
    }
}
