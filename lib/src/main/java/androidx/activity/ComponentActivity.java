package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.p;
import androidx.lifecycle.c0;
import androidx.lifecycle.g0;
import androidx.lifecycle.j;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.w;
import androidx.lifecycle.z;
import e.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import t0.c;

/* loaded from: classes.dex */
public abstract class ComponentActivity extends androidx.core.app.g implements k0, androidx.lifecycle.i, t0.e, k, androidx.activity.result.d {
    private final CopyOnWriteArrayList A;
    private final CopyOnWriteArrayList B;
    private final CopyOnWriteArrayList C;
    private boolean D;
    private boolean E;

    /* renamed from: o, reason: collision with root package name */
    final d.a f321o = new d.a();

    /* renamed from: p, reason: collision with root package name */
    private final androidx.core.view.i f322p = new androidx.core.view.i(new Runnable() { // from class: androidx.activity.c
        @Override // java.lang.Runnable
        public final void run() {
            this.f364m.A();
        }
    });

    /* renamed from: q, reason: collision with root package name */
    private final o f323q = new o(this);

    /* renamed from: r, reason: collision with root package name */
    final t0.d f324r;

    /* renamed from: s, reason: collision with root package name */
    private j0 f325s;

    /* renamed from: t, reason: collision with root package name */
    private g0.b f326t;

    /* renamed from: u, reason: collision with root package name */
    private final OnBackPressedDispatcher f327u;

    /* renamed from: v, reason: collision with root package name */
    private int f328v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicInteger f329w;

    /* renamed from: x, reason: collision with root package name */
    private final ActivityResultRegistry f330x;

    /* renamed from: y, reason: collision with root package name */
    private final CopyOnWriteArrayList f331y;

    /* renamed from: z, reason: collision with root package name */
    private final CopyOnWriteArrayList f332z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e5) {
                if (!TextUtils.equals(e5.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e5;
                }
            }
        }
    }

    class b extends ActivityResultRegistry {

        class a implements Runnable {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ int f338m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ a.C0121a f339n;

            a(int i10, a.C0121a c0121a) {
                this.f338m = i10;
                this.f339n = c0121a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f338m, this.f339n.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        class RunnableC0004b implements Runnable {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ int f341m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f342n;

            RunnableC0004b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f341m = i10;
                this.f342n = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f341m, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f342n));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public void f(int i10, e.a aVar, Object obj, androidx.core.app.c cVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0121a c0121aB = aVar.b(componentActivity, obj);
            if (c0121aB != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, c0121aB));
                return;
            }
            Intent intentA = aVar.a(componentActivity, obj);
            Bundle bundleExtra = null;
            if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle = bundleExtra;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.r(componentActivity, stringArrayExtra, i10);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                androidx.core.app.b.t(componentActivity, intentA, i10, bundle);
                return;
            }
            androidx.activity.result.e eVar = (androidx.activity.result.e) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                androidx.core.app.b.u(componentActivity, eVar.d(), i10, eVar.a(), eVar.b(), eVar.c(), 0, bundle);
            } catch (IntentSender.SendIntentException e5) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0004b(i10, e5));
            }
        }
    }

    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    static class d {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        Object f344a;

        /* renamed from: b, reason: collision with root package name */
        j0 f345b;

        e() {
        }
    }

    public ComponentActivity() {
        t0.d dVarA = t0.d.a(this);
        this.f324r = dVarA;
        this.f327u = new OnBackPressedDispatcher(new a());
        this.f329w = new AtomicInteger();
        this.f330x = new b();
        this.f331y = new CopyOnWriteArrayList();
        this.f332z = new CopyOnWriteArrayList();
        this.A = new CopyOnWriteArrayList();
        this.B = new CopyOnWriteArrayList();
        this.C = new CopyOnWriteArrayList();
        this.D = false;
        this.E = false;
        if (s() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i10 = Build.VERSION.SDK_INT;
        s().a(new androidx.lifecycle.l() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.l
            public void d(n nVar, j.b bVar) {
                if (bVar == j.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        c.a(viewPeekDecorView);
                    }
                }
            }
        });
        s().a(new androidx.lifecycle.l() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.l
            public void d(n nVar, j.b bVar) {
                if (bVar == j.b.ON_DESTROY) {
                    ComponentActivity.this.f321o.b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.r().a();
                }
            }
        });
        s().a(new androidx.lifecycle.l() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.l
            public void d(n nVar, j.b bVar) {
                ComponentActivity.this.y();
                ComponentActivity.this.s().c(this);
            }
        });
        dVarA.c();
        z.c(this);
        if (i10 <= 23) {
            s().a(new ImmLeaksCleaner(this));
        }
        c().h("android:support:activity-result", new c.InterfaceC0188c() { // from class: androidx.activity.d
            @Override // t0.c.InterfaceC0188c
            public final Bundle a() {
                return this.f365a.B();
            }
        });
        x(new d.b() { // from class: androidx.activity.b
            @Override // d.b
            public final void a(Context context) {
                this.f363a.C(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle B() {
        Bundle bundle = new Bundle();
        this.f330x.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(Context context) {
        Bundle bundleB = c().b("android:support:activity-result");
        if (bundleB != null) {
            this.f330x.g(bundleB);
        }
    }

    private void z() {
        l0.a(getWindow().getDecorView(), this);
        m0.a(getWindow().getDecorView(), this);
        t0.f.a(getWindow().getDecorView(), this);
        m.a(getWindow().getDecorView(), this);
    }

    public void A() {
        invalidateOptionsMenu();
    }

    public Object D() {
        return null;
    }

    public final androidx.activity.result.c E(e.a aVar, androidx.activity.result.b bVar) {
        return F(aVar, this.f330x, bVar);
    }

    public final androidx.activity.result.c F(e.a aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b bVar) {
        return activityResultRegistry.i("activity_rq#" + this.f329w.getAndIncrement(), this, aVar, bVar);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.k
    public final OnBackPressedDispatcher b() {
        return this.f327u;
    }

    @Override // t0.e
    public final t0.c c() {
        return this.f324r.b();
    }

    @Override // androidx.lifecycle.i
    public g0.b l() {
        if (this.f326t == null) {
            this.f326t = new c0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f326t;
    }

    @Override // androidx.lifecycle.i
    public n0.a m() {
        n0.d dVar = new n0.d();
        if (getApplication() != null) {
            dVar.c(g0.a.f3126h, getApplication());
        }
        dVar.c(z.f3180a, this);
        dVar.c(z.f3181b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            dVar.c(z.f3182c, getIntent().getExtras());
        }
        return dVar;
    }

    @Override // androidx.activity.result.d
    public final ActivityResultRegistry n() {
        return this.f330x;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f330x.b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f327u.f();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f331y.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(configuration);
        }
    }

    @Override // androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f324r.d(bundle);
        this.f321o.c(this);
        super.onCreate(bundle);
        w.g(this);
        if (androidx.core.os.a.c()) {
            this.f327u.g(d.a(this));
        }
        int i10 = this.f328v;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.f322p.a(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.f322p.c(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.D) {
            return;
        }
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(new androidx.core.app.i(z10));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.D = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.D = false;
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                ((androidx.core.util.a) it.next()).a(new androidx.core.app.i(z10, configuration));
            }
        } catch (Throwable th) {
            this.D = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        this.f322p.b(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.E) {
            return;
        }
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(new p(z10));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.E = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.E = false;
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                ((androidx.core.util.a) it.next()).a(new p(z10, configuration));
            }
        } catch (Throwable th) {
            this.E = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.f322p.d(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.f330x.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object objD = D();
        j0 j0Var = this.f325s;
        if (j0Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            j0Var = eVar.f345b;
        }
        if (j0Var == null && objD == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f344a = objD;
        eVar2.f345b = j0Var;
        return eVar2;
    }

    @Override // androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.j jVarS = s();
        if (jVarS instanceof o) {
            ((o) jVarS).o(j.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f324r.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.f332z.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(Integer.valueOf(i10));
        }
    }

    @Override // androidx.lifecycle.k0
    public j0 r() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        y();
        return this.f325s;
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (y0.a.d()) {
                y0.a.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            y0.a.b();
        }
    }

    @Override // androidx.lifecycle.n
    public androidx.lifecycle.j s() {
        return this.f323q;
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        z();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        z();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public final void x(d.b bVar) {
        this.f321o.a(bVar);
    }

    void y() {
        if (this.f325s == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f325s = eVar.f345b;
            }
            if (this.f325s == null) {
                this.f325s = new j0();
            }
        }
    }
}
