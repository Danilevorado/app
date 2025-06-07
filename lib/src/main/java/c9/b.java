package c9;

import a9.g;
import a9.i;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Date;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private Date f5071a;

    /* renamed from: b, reason: collision with root package name */
    private final Application f5072b;

    class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: m, reason: collision with root package name */
        private int f5073m;

        /* renamed from: n, reason: collision with root package name */
        private int f5074n;

        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (b.this.f5071a != null) {
                if (new Date().getTime() - b.this.f5071a.getTime() >= 60000) {
                    i.e(new d());
                }
                b.this.f5071a = null;
            } else if (this.f5073m == 0) {
                i.e(new d());
            }
            this.f5073m++;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            this.f5073m--;
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
            if (this.f5074n == 0) {
                i.e(new c());
            }
            this.f5074n++;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i10 = this.f5074n - 1;
            this.f5074n = i10;
            if (i10 == 0) {
                i.e(new C0087b());
            }
        }
    }

    /* renamed from: c9.b$b, reason: collision with other inner class name */
    public static class C0087b implements g {
    }

    public static class c implements g {
    }

    public static class d implements g {
        d() {
        }
    }

    b(Context context) {
        this.f5072b = (Application) context.getApplicationContext();
    }

    public void c(boolean z10) {
        if (z10) {
            i.e(new d());
            this.f5071a = new Date();
        }
        this.f5072b.registerActivityLifecycleCallbacks(new a());
    }
}
