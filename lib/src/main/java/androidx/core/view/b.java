package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2410a;

    /* renamed from: b, reason: collision with root package name */
    private a f2411b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0036b f2412c;

    public interface a {
    }

    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0036b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f2410a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f2412c = null;
        this.f2411b = null;
    }

    public void h(a aVar) {
        this.f2411b = aVar;
    }

    public abstract void i(InterfaceC0036b interfaceC0036b);
}
