package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.b;
import androidx.lifecycle.j;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import t0.c;

/* loaded from: classes.dex */
public abstract class e extends ComponentActivity implements b.d {
    boolean H;
    boolean I;
    final h F = h.b(new c());
    final androidx.lifecycle.o G = new androidx.lifecycle.o(this);
    boolean J = true;

    class a implements c.InterfaceC0188c {
        a() {
        }

        @Override // t0.c.InterfaceC0188c
        public Bundle a() {
            Bundle bundle = new Bundle();
            e.this.J();
            e.this.G.h(j.b.ON_STOP);
            Parcelable parcelableX = e.this.F.x();
            if (parcelableX != null) {
                bundle.putParcelable("android:support:fragments", parcelableX);
            }
            return bundle;
        }
    }

    class b implements d.b {
        b() {
        }

        @Override // d.b
        public void a(Context context) {
            e.this.F.a(null);
            Bundle bundleB = e.this.c().b("android:support:fragments");
            if (bundleB != null) {
                e.this.F.w(bundleB.getParcelable("android:support:fragments"));
            }
        }
    }

    class c extends j implements k0, androidx.activity.k, androidx.activity.result.d, q {
        public c() {
            super(e.this);
        }

        @Override // androidx.fragment.app.q
        public void a(m mVar, Fragment fragment) {
            e.this.L(fragment);
        }

        @Override // androidx.activity.k
        public OnBackPressedDispatcher b() {
            return e.this.b();
        }

        @Override // androidx.fragment.app.g
        public View e(int i10) {
            return e.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.g
        public boolean f() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.j
        public LayoutInflater k() {
            return e.this.getLayoutInflater().cloneInContext(e.this);
        }

        @Override // androidx.fragment.app.j
        public boolean l(Fragment fragment) {
            return !e.this.isFinishing();
        }

        @Override // androidx.activity.result.d
        public ActivityResultRegistry n() {
            return e.this.n();
        }

        @Override // androidx.fragment.app.j
        public void o() {
            e.this.O();
        }

        @Override // androidx.fragment.app.j
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public e j() {
            return e.this;
        }

        @Override // androidx.lifecycle.k0
        public j0 r() {
            return e.this.r();
        }

        @Override // androidx.lifecycle.n
        public androidx.lifecycle.j s() {
            return e.this.G;
        }
    }

    public e() {
        I();
    }

    private void I() {
        c().h("android:support:fragments", new a());
        x(new b());
    }

    private static boolean K(m mVar, j.c cVar) {
        boolean zK = false;
        for (Fragment fragment : mVar.s0()) {
            if (fragment != null) {
                if (fragment.E() != null) {
                    zK |= K(fragment.u(), cVar);
                }
                z zVar = fragment.f2665f0;
                if (zVar != null && zVar.s().b().b(j.c.STARTED)) {
                    fragment.f2665f0.h(cVar);
                    zK = true;
                }
                if (fragment.f2664e0.b().b(j.c.STARTED)) {
                    fragment.f2664e0.o(cVar);
                    zK = true;
                }
            }
        }
        return zK;
    }

    final View G(View view, String str, Context context, AttributeSet attributeSet) {
        return this.F.v(view, str, context, attributeSet);
    }

    public m H() {
        return this.F.t();
    }

    void J() {
        while (K(H(), j.c.CREATED)) {
        }
    }

    public void L(Fragment fragment) {
    }

    protected boolean M(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void N() {
        this.G.h(j.b.ON_RESUME);
        this.F.p();
    }

    public abstract void O();

    @Override // androidx.core.app.b.d
    public final void a(int i10) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.H);
        printWriter.print(" mResumed=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.F.t().W(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.F.u();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.F.u();
        super.onConfigurationChanged(configuration);
        this.F.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.G.h(j.b.ON_CREATE);
        this.F.f();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return i10 == 0 ? super.onCreatePanelMenu(i10, menu) | this.F.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewG = G(view, str, context, attributeSet);
        return viewG == null ? super.onCreateView(view, str, context, attributeSet) : viewG;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewG = G(null, str, context, attributeSet);
        return viewG == null ? super.onCreateView(str, context, attributeSet) : viewG;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.F.h();
        this.G.h(j.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.F.i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.F.k(menuItem);
        }
        if (i10 != 6) {
            return false;
        }
        return this.F.e(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        this.F.j(z10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        this.F.u();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.F.l(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.I = false;
        this.F.m();
        this.G.h(j.b.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        this.F.n(z10);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        N();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return i10 == 0 ? M(view, menu) | this.F.o(menu) : super.onPreparePanel(i10, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.F.u();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.F.u();
        super.onResume();
        this.I = true;
        this.F.s();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.F.u();
        super.onStart();
        this.J = false;
        if (!this.H) {
            this.H = true;
            this.F.c();
        }
        this.F.s();
        this.G.h(j.b.ON_START);
        this.F.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.F.u();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.J = true;
        J();
        this.F.r();
        this.G.h(j.b.ON_STOP);
    }
}
