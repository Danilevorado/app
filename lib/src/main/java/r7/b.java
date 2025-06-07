package r7;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;

/* loaded from: classes.dex */
class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m, reason: collision with root package name */
    private Handler f26650m = new Handler();

    /* renamed from: n, reason: collision with root package name */
    private c f26651n;

    /* renamed from: o, reason: collision with root package name */
    private int f26652o;

    /* renamed from: p, reason: collision with root package name */
    private String f26653p;

    class a extends m.l {
        a() {
        }

        @Override // androidx.fragment.app.m.l
        public void k(m mVar, Fragment fragment) {
            super.k(mVar, fragment);
            b.this.f();
        }
    }

    /* renamed from: r7.b$b, reason: collision with other inner class name */
    class FragmentManagerFragmentLifecycleCallbacksC0184b extends FragmentManager.FragmentLifecycleCallbacks {
        FragmentManagerFragmentLifecycleCallbacksC0184b() {
        }

        @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentStarted(FragmentManager fragmentManager, android.app.Fragment fragment) {
            super.onFragmentStarted(fragmentManager, fragment);
            b.this.f();
        }
    }

    public interface c {
        void b(String str, String str2);
    }

    b(c cVar) {
        this.f26651n = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f26651n.b("ScreenOpened", this.f26653p);
    }

    private void c(Activity activity) {
        activity.getFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManagerFragmentLifecycleCallbacksC0184b(), true);
    }

    private void d(androidx.fragment.app.e eVar) {
        eVar.H().Z0(new a(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f26650m.removeCallbacksAndMessages(null);
        this.f26650m.postDelayed(new Runnable() { // from class: r7.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f26649m.b();
            }
        }, 100L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof androidx.fragment.app.e) {
            d((androidx.fragment.app.e) activity);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            c(activity);
        }
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        String name = activity.getClass().getName();
        this.f26653p = name;
        if (this.f26652o == 0) {
            this.f26651n.b("ApplicationOpened", name);
        }
        this.f26652o++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i10 = this.f26652o - 1;
        this.f26652o = i10;
        if (i10 == 0) {
            this.f26651n.b("ApplicationClosed", this.f26653p);
        }
    }
}
