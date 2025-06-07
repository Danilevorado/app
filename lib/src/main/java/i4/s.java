package i4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f24318a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    private static final Method f24319b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f24320c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f24321d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f24322e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f24323f;

    /* renamed from: g, reason: collision with root package name */
    private static final Method f24324g;

    /* renamed from: h, reason: collision with root package name */
    private static final Method f24325h;

    /* renamed from: i, reason: collision with root package name */
    private static final Method f24326i;

    /* renamed from: j, reason: collision with root package name */
    private static Boolean f24327j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f24319b = method;
        if (m.c()) {
            try {
                method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused2) {
            }
        } else {
            method2 = null;
        }
        f24320c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f24321d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        f24322e = method4;
        if (m.c()) {
            try {
                method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused5) {
            }
        } else {
            method5 = null;
        }
        f24323f = method5;
        if (m.j()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e5) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e5);
            }
        } else {
            method6 = null;
        }
        f24324g = method6;
        if (m.j()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e10);
            }
        } else {
            method7 = null;
        }
        f24325h = method7;
        if (m.j()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", new Class[0]);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
        } else {
            method8 = null;
        }
        f24326i = method8;
        f24327j = null;
    }

    public static void a(WorkSource workSource, int i10, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f24320c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e5) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e5);
                return;
            }
        }
        Method method2 = f24319b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        String str2;
        ApplicationInfo applicationInfoC;
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            applicationInfoC = k4.c.a(context).c(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Could not find package: ";
        }
        if (applicationInfoC == null) {
            str2 = "Could not get applicationInfo from package: ";
            Log.e("WorkSourceUtil", str2.concat(str));
            return null;
        }
        int i10 = applicationInfoC.uid;
        WorkSource workSource = new WorkSource();
        a(workSource, i10, str);
        return workSource;
    }

    public static synchronized boolean c(Context context) {
        Boolean bool = f24327j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        Boolean boolValueOf = Boolean.valueOf(androidx.core.content.a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
        f24327j = boolValueOf;
        return boolValueOf.booleanValue();
    }
}
