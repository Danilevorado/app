package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import e4.o;
import e4.p;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f5857h = null;

    /* renamed from: i, reason: collision with root package name */
    private static String f5858i = null;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f5859j = false;

    /* renamed from: k, reason: collision with root package name */
    private static int f5860k = -1;

    /* renamed from: l, reason: collision with root package name */
    private static Boolean f5861l;

    /* renamed from: q, reason: collision with root package name */
    private static m f5866q;

    /* renamed from: r, reason: collision with root package name */
    private static n f5867r;

    /* renamed from: a, reason: collision with root package name */
    private final Context f5868a;

    /* renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f5862m = new ThreadLocal();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f5863n = new com.google.android.gms.dynamite.b();

    /* renamed from: o, reason: collision with root package name */
    private static final b.a f5864o = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final b f5851b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final b f5852c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final b f5853d = new f();

    /* renamed from: e, reason: collision with root package name */
    public static final b f5854e = new g();

    /* renamed from: f, reason: collision with root package name */
    public static final b f5855f = new h();

    /* renamed from: g, reason: collision with root package name */
    public static final b f5856g = new i();

    /* renamed from: p, reason: collision with root package name */
    public static final b f5865p = new j();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, Throwable th, m4.d dVar) {
            super(str, th);
        }

        /* synthetic */ a(String str, m4.d dVar) {
            super(str);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z10);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0095b {

            /* renamed from: a, reason: collision with root package name */
            public int f5869a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f5870b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f5871c = 0;
        }

        C0095b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        p.l(context);
        this.f5868a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (o.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e5) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e5.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[Catch: all -> 0x02a4, TRY_LEAVE, TryCatch #1 {all -> 0x02a4, blocks: (B:5:0x002b, B:9:0x0075, B:14:0x007d, B:17:0x0083, B:20:0x008d, B:93:0x01ea, B:94:0x01f5, B:96:0x01f7, B:98:0x01f9, B:99:0x0201, B:118:0x025b, B:119:0x0272, B:101:0x0203, B:103:0x0221, B:116:0x0252, B:117:0x025a, B:120:0x0273, B:121:0x02a3), top: B:136:0x002b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule e(android.content.Context r16, com.google.android.gms.dynamite.DynamiteModule.b r17, java.lang.String r18) throws com.google.android.gms.dynamite.DynamiteModule.a {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5 A[Catch: all -> 0x00af, TryCatch #4 {, blocks: (B:9:0x0026, B:11:0x0032, B:48:0x00ad, B:14:0x0038, B:16:0x003f, B:18:0x0045, B:21:0x0048, B:23:0x004c, B:27:0x0056, B:29:0x005e, B:32:0x0065, B:39:0x008f, B:40:0x0097, B:35:0x006c, B:37:0x0072, B:38:0x0081, B:43:0x009a, B:46:0x009d, B:47:0x00a5, B:15:0x003b), top: B:128:0x0026, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0163 A[Catch: all -> 0x01bf, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01bf, blocks: (B:3:0x0002, B:61:0x00d6, B:63:0x00dc, B:68:0x00fd, B:90:0x0155, B:94:0x0163, B:115:0x01b8, B:116:0x01bb, B:110:0x01b0, B:66:0x00e2, B:119:0x01be, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:59:0x00d3, B:19:0x0046, B:41:0x0098, B:44:0x009b, B:52:0x00b1, B:60:0x00d5, B:58:0x00b7), top: B:136:0x0002, inners: #1, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int g(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) throws a {
        n nVar;
        m4.d dVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder);
            }
            f5867r = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
            throw new a("Failed to instantiate dynamite loader", e5, dVar);
        }
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) f5862m.get();
        if (kVar == null || kVar.f5872a != null) {
            return false;
        }
        kVar.f5872a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f5861l)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (f5861l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (b4.f.h().j(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            f5861l = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f5859j = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f5866q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f5866q = mVar;
                    return mVar;
                }
            } catch (Exception e5) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e5.getMessage());
            }
            return null;
        }
    }

    public Context b() {
        return this.f5868a;
    }

    public IBinder d(String str) throws a {
        try {
            return (IBinder) this.f5868a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e5) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e5, null);
        }
    }
}
