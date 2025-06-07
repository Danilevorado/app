package m3;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.ab3;
import com.google.android.gms.internal.ads.b03;
import com.google.android.gms.internal.ads.ek0;
import com.google.android.gms.internal.ads.gk1;
import com.google.android.gms.internal.ads.hn2;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.ks;
import com.google.android.gms.internal.ads.ll0;
import com.google.android.gms.internal.ads.ln2;
import com.google.android.gms.internal.ads.mt;
import com.google.android.gms.internal.ads.qa3;
import com.google.android.gms.internal.ads.r44;
import com.google.android.gms.internal.ads.y90;
import com.google.android.gms.internal.ads.ye0;
import com.google.android.gms.internal.ads.ze0;
import com.google.android.gms.internal.ads.zq;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import n.d;

/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: i, reason: collision with root package name */
    public static final b03 f25197i = new o1(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    private String f25202e;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f25198a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f25199b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    private boolean f25200c = true;

    /* renamed from: d, reason: collision with root package name */
    private final Object f25201d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f25203f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25204g = false;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f25205h = Executors.newSingleThreadExecutor();

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean H(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.b2.H(android.view.View):boolean");
    }

    public static final void I(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String J(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return u(t(context));
    }

    static final String K() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String L() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final DisplayMetrics M(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] N() {
        return new int[]{0, 0};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long O(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse P(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", j3.t.r().z(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new q0(context).b(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e5) {
            ze0.h("Could not fetch MRAID JS.", e5);
        }
        return null;
    }

    public static final String Q() {
        Resources resourcesD = j3.t.q().d();
        return resourcesD != null ? resourcesD.getString(i3.b.f24303q) : "Test Ad";
    }

    public static final t0 R(Context context) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof IBinder)) {
                ze0.d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof t0 ? (t0) iInterfaceQueryLocalInterface : new r0(iBinder);
        } catch (Exception e5) {
            j3.t.q().u(e5, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean S(Context context, String str) {
        Context contextA = y90.a(context);
        return k4.c.a(contextA).b(str, contextA.getPackageName()) == 0;
    }

    public static final boolean T(Context context) {
        try {
            return i4.i.b(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean U(String str) {
        if (!ye0.k()) {
            return false;
        }
        if (!((Boolean) k3.w.c().b(ir.C4)).booleanValue()) {
            return false;
        }
        String str2 = (String) k3.w.c().b(ir.E4);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) k3.w.c().b(ir.D4);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean V(Context context) {
        KeyguardManager keyguardManagerS;
        return (context == null || (keyguardManagerS = s(context)) == null || !keyguardManagerS.isKeyguardLocked()) ? false : true;
    }

    public static final boolean W(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            ze0.e("Error loading class.", th);
            j3.t.q().u(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean a() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean c(Context context) {
        Bundle bundleT = t(context);
        return TextUtils.isEmpty(u(bundleT)) && !TextUtils.isEmpty(bundleT.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean d(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void e(View view, int i10, MotionEvent motionEvent) {
        String strA;
        int i11;
        int iHeight;
        int iWidth;
        String str;
        hn2 hn2VarW;
        ln2 ln2VarS;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (childAt instanceof gk1) {
                childAt = ((gk1) childAt).getChildAt(0);
            }
            if (childAt instanceof r3.e) {
                strA = "NATIVE";
                i11 = 1;
            } else {
                strA = "UNKNOWN";
                i11 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            j3.t.r();
            long jO = O(childAt);
            childAt.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof ll0) || (ln2VarS = ((ll0) childAt).S()) == null) {
                str = "none";
            } else {
                str = ln2VarS.f11674b;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof ek0) && (hn2VarW = ((ek0) childAt).w()) != null) {
                strA = hn2.a(hn2VarW.f9238b);
                i11 = hn2VarW.f9246f;
                str2 = hn2VarW.F;
            }
            ze0.f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(childAt.hashCode()), packageName, str2, str, strA, Integer.valueOf(i11), childAt.getClass().getName(), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), Integer.valueOf(iWidth), Integer.valueOf(iHeight), Long.valueOf(jO), Integer.toString(i10, 2)));
        } catch (Exception e5) {
            ze0.e("Failure getting view location.", e5);
        }
    }

    public static final AlertDialog.Builder f(Context context) {
        return new AlertDialog.Builder(context, j3.t.s().a());
    }

    public static final void g(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new a1(context, str, (String) it.next()).b();
        }
    }

    public static final void h(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) mt.f12245b.e()).booleanValue()) {
                    i4.g.a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final String i(InputStreamReader inputStreamReader) {
        StringBuilder sb2 = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int i10 = inputStreamReader.read(cArr);
            if (i10 == -1) {
                return sb2.toString();
            }
            sb2.append(cArr, 0, i10);
        }
    }

    public static final int j(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e5) {
            ze0.g("Could not parse value:".concat(e5.toString()));
            return 0;
        }
    }

    public static final Map k(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    public static final int[] l(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? N() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] m(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrN = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? N() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{k3.t.b().e(activity, iArrN[0]), k3.t.b().e(activity, iArrN[1])};
    }

    public static final boolean n(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10 = j3.t.r().f25200c || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || H(view);
        long jO = O(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z10)) {
            if (!((Boolean) k3.w.c().b(ir.f9947g1)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) k3.w.c().b(ir.f9891a9)).booleanValue()) {
                    return true;
                }
                if (jO >= ((Integer) k3.w.c().b(ir.f9913c9)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void o(Context context, Intent intent) {
        if (!((Boolean) k3.w.c().b(ir.f10086s9)).booleanValue()) {
            w(context, intent);
            return;
        }
        try {
            w(context, intent);
        } catch (SecurityException e5) {
            ze0.h("", e5);
            j3.t.q().u(e5, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void p(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            I(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            ze0.b("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e5) {
            ze0.e("No browser is found.", e5);
        }
    }

    public static final int[] q(Activity activity) {
        int[] iArrL = l(activity);
        return new int[]{k3.t.b().e(activity, iArrL[0]), k3.t.b().e(activity, iArrL[1])};
    }

    public static final boolean r(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return n(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, s(context));
    }

    private static KeyguardManager s(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle t(Context context) {
        try {
            return k4.c.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e5) {
            n1.l("Error getting metadata", e5);
            return null;
        }
    }

    private static String u(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    private static boolean v(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void w(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static int x(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return 60000;
        }
        ze0.g("HTTP timeout too low: " + i10 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    public final void B(Context context, String str, boolean z10, HttpURLConnection httpURLConnection, boolean z11, int i10) {
        int iX = x(i10);
        ze0.f("HTTP timeout: " + iX + " milliseconds.");
        httpURLConnection.setConnectTimeout(iX);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iX);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", z(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final boolean C(String str) {
        return v(str, this.f25198a, (String) k3.w.c().b(ir.f9893b0));
    }

    public final boolean D(String str) {
        return v(str, this.f25199b, (String) k3.w.c().b(ir.f9904c0));
    }

    public final boolean E(Context context) {
        if (this.f25204g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        ir.a(context);
        x1 x1Var = null;
        if (!((Boolean) k3.w.c().b(ir.f10075r9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new y1(this, x1Var), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new y1(this, x1Var), intentFilter, 4);
        }
        this.f25204g = true;
        return true;
    }

    public final boolean F(Context context) {
        if (this.f25203f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        ir.a(context);
        z1 z1Var = null;
        if (!((Boolean) k3.w.c().b(ir.f10075r9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new a2(this, z1Var), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new a2(this, z1Var), intentFilter, 4);
        }
        this.f25203f = true;
        return true;
    }

    public final int G(Context context, Uri uri) {
        int i10;
        if (context == null) {
            n1.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i10 = 0;
        } else {
            n1.k("Chrome Custom Tabs can only work with Activity context.");
            i10 = 2;
        }
        zq zqVar = ir.f9972i4;
        Boolean bool = (Boolean) k3.w.c().b(zqVar);
        zq zqVar2 = ir.f9983j4;
        if (true == bool.equals(k3.w.c().b(zqVar2))) {
            i10 = 9;
        }
        if (i10 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i10;
        }
        if (((Boolean) k3.w.c().b(zqVar)).booleanValue()) {
            ks ksVar = new ks();
            ksVar.e(new w1(this, ksVar, context, uri));
            ksVar.b((Activity) context);
        }
        if (!((Boolean) k3.w.c().b(zqVar2)).booleanValue()) {
            return 5;
        }
        n.d dVarA = new d.a().a();
        dVarA.f25427a.setPackage(r44.a(context));
        dVarA.a(context, uri);
        return 5;
    }

    public final ab3 y(final Uri uri) {
        return qa3.j(new Callable() { // from class: m3.u1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = uri;
                b03 b03Var = b2.f25197i;
                j3.t.r();
                return b2.k(uri2);
            }
        }, this.f25205h);
    }

    public final String z(final Context context, String str) {
        Object objA;
        synchronized (this.f25201d) {
            String str2 = this.f25202e;
            if (str2 != null) {
                return str2;
            }
            if (str == null) {
                return K();
            }
            try {
                h1 h1VarA = h1.a();
                if (TextUtils.isEmpty(h1VarA.f25235a)) {
                    if (i4.d.a()) {
                        objA = e1.a(context, new Callable() { // from class: m3.f1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Context context2 = context;
                                SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                String string = sharedPreferences.getString("user_agent", "");
                                if (!TextUtils.isEmpty(string)) {
                                    n1.k("User agent is already initialized on Google Play Services.");
                                    return string;
                                }
                                n1.k("User agent is not initialized on Google Play Services. Initializing.");
                                String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                                i4.p.a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                                return defaultUserAgent;
                            }
                        });
                    } else {
                        final Context contextD = b4.i.d(context);
                        objA = e1.a(context, new Callable() { // from class: m3.g1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                SharedPreferences sharedPreferences;
                                Context context2 = contextD;
                                Context context3 = context;
                                boolean z10 = false;
                                if (context2 != null) {
                                    n1.k("Attempting to read user agent from Google Play Services.");
                                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                } else {
                                    n1.k("Attempting to read user agent from local cache.");
                                    sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                    z10 = true;
                                }
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    n1.k("Reading user agent from WebSettings");
                                    string = WebSettings.getDefaultUserAgent(context3);
                                    if (z10) {
                                        sharedPreferences.edit().putString("user_agent", string).apply();
                                        n1.k("Persisting user agent.");
                                    }
                                }
                                return string;
                            }
                        });
                    }
                    h1VarA.f25235a = (String) objA;
                }
                this.f25202e = h1VarA.f25235a;
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(this.f25202e)) {
                this.f25202e = WebSettings.getDefaultUserAgent(context);
            }
            if (TextUtils.isEmpty(this.f25202e)) {
                this.f25202e = K();
            }
            this.f25202e = this.f25202e + " (Mobile; " + str;
            try {
                if (k4.c.a(context).g()) {
                    this.f25202e = this.f25202e + ";aia";
                }
            } catch (Exception e5) {
                j3.t.q().u(e5, "AdUtil.getUserAgent");
            }
            String str3 = this.f25202e + ")";
            this.f25202e = str3;
            return str3;
        }
    }
}
