package d4;

import android.app.Activity;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f22903a;

    public e(Activity activity) {
        e4.p.m(activity, "Activity must not be null");
        this.f22903a = activity;
    }

    public final Activity a() {
        return (Activity) this.f22903a;
    }

    public final androidx.fragment.app.e b() {
        return (androidx.fragment.app.e) this.f22903a;
    }

    public final boolean c() {
        return this.f22903a instanceof Activity;
    }

    public final boolean d() {
        return this.f22903a instanceof androidx.fragment.app.e;
    }
}
