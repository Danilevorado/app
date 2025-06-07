package b0;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import rb.f;
import rb.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4305b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C0074c f4306a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c a(Activity activity) {
            h.e(activity, "<this>");
            c cVar = new c(activity, null);
            cVar.b();
            return cVar;
        }
    }

    private static final class b extends C0074c {

        /* renamed from: h, reason: collision with root package name */
        private boolean f4307h;

        /* renamed from: i, reason: collision with root package name */
        private final ViewGroup.OnHierarchyChangeListener f4308i;

        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Activity f4310n;

            a(Activity activity) {
                this.f4310n = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (view2 instanceof SplashScreenView) {
                    b bVar = b.this;
                    bVar.e(bVar.d((SplashScreenView) view2));
                    ((ViewGroup) this.f4310n.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity) {
            super(activity);
            h.e(activity, "activity");
            this.f4307h = true;
            this.f4308i = new a(activity);
        }

        @Override // b0.c.C0074c
        public void b() {
            Resources.Theme theme = a().getTheme();
            h.d(theme, "activity.theme");
            c(theme, new TypedValue());
            ((ViewGroup) a().getWindow().getDecorView()).setOnHierarchyChangeListener(this.f4308i);
        }

        public final boolean d(SplashScreenView splashScreenView) {
            h.e(splashScreenView, "child");
            WindowInsets windowInsetsBuild = new WindowInsets.Builder().build();
            h.d(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return (windowInsetsBuild == splashScreenView.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        public final void e(boolean z10) {
            this.f4307h = z10;
        }
    }

    /* renamed from: b0.c$c, reason: collision with other inner class name */
    private static class C0074c {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f4311a;

        /* renamed from: b, reason: collision with root package name */
        private int f4312b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f4313c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f4314d;

        /* renamed from: e, reason: collision with root package name */
        private Drawable f4315e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f4316f;

        /* renamed from: g, reason: collision with root package name */
        private d f4317g;

        public C0074c(Activity activity) {
            h.e(activity, "activity");
            this.f4311a = activity;
            this.f4317g = new d() { // from class: b0.d
            };
        }

        public final Activity a() {
            return this.f4311a;
        }

        public void b() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.f4311a.getTheme();
            if (theme.resolveAttribute(b0.a.f4303d, typedValue, true)) {
                this.f4313c = Integer.valueOf(typedValue.resourceId);
                this.f4314d = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(b0.a.f4302c, typedValue, true)) {
                this.f4315e = theme.getDrawable(typedValue.resourceId);
            }
            if (theme.resolveAttribute(b0.a.f4301b, typedValue, true)) {
                this.f4316f = typedValue.resourceId == b0.b.f4304a;
            }
            h.d(theme, "currentTheme");
            c(theme, typedValue);
        }

        protected final void c(Resources.Theme theme, TypedValue typedValue) {
            h.e(theme, "currentTheme");
            h.e(typedValue, "typedValue");
            if (theme.resolveAttribute(b0.a.f4300a, typedValue, true)) {
                int i10 = typedValue.resourceId;
                this.f4312b = i10;
                if (i10 != 0) {
                    this.f4311a.setTheme(i10);
                }
            }
        }
    }

    public interface d {
    }

    private c(Activity activity) {
        this.f4306a = Build.VERSION.SDK_INT >= 31 ? new b(activity) : new C0074c(activity);
    }

    public /* synthetic */ c(Activity activity, f fVar) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.f4306a.b();
    }

    public static final c c(Activity activity) {
        return f4305b.a(activity);
    }
}
