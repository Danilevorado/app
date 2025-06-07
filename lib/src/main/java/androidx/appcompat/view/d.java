package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static Configuration f659f;

    /* renamed from: a, reason: collision with root package name */
    private int f660a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f661b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f662c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f663d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f664e;

    static class a {
        static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f660a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f661b = theme;
    }

    private Resources b() {
        if (this.f664e == null) {
            Configuration configuration = this.f663d;
            this.f664e = (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) ? super.getResources() : a.a(this, this.f663d).getResources();
        }
        return this.f664e;
    }

    private void d() {
        boolean z10 = this.f661b == null;
        if (z10) {
            this.f661b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f661b.setTo(theme);
            }
        }
        f(this.f661b, this.f660a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f659f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f659f = configuration2;
        }
        return configuration.equals(f659f);
    }

    public void a(Configuration configuration) {
        if (this.f664e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f663d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f663d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f660a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f662c == null) {
            this.f662c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f662c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f661b;
        if (theme != null) {
            return theme;
        }
        if (this.f660a == 0) {
            this.f660a = f.i.f23423d;
        }
        d();
        return this.f661b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f660a != i10) {
            this.f660a = i10;
            d();
        }
    }
}
