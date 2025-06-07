package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.app.g;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.h0;
import androidx.core.view.w;
import java.util.ArrayList;

/* loaded from: classes.dex */
class r extends androidx.appcompat.app.a {

    /* renamed from: a, reason: collision with root package name */
    final h0 f597a;

    /* renamed from: b, reason: collision with root package name */
    final Window.Callback f598b;

    /* renamed from: c, reason: collision with root package name */
    final g.f f599c;

    /* renamed from: d, reason: collision with root package name */
    boolean f600d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f601e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f602f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f603g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f604h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final Toolbar.h f605i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.v();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return r.this.f598b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements m.a {

        /* renamed from: m, reason: collision with root package name */
        private boolean f608m;

        c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            if (this.f608m) {
                return;
            }
            this.f608m = true;
            r.this.f597a.h();
            r.this.f598b.onPanelClosed(108, gVar);
            this.f608m = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            r.this.f598b.onMenuOpened(108, gVar);
            return true;
        }
    }

    private final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (r.this.f597a.b()) {
                r.this.f598b.onPanelClosed(108, gVar);
            } else if (r.this.f598b.onPreparePanel(0, null, gVar)) {
                r.this.f598b.onMenuOpened(108, gVar);
            }
        }
    }

    private class e implements g.f {
        e() {
        }

        @Override // androidx.appcompat.app.g.f
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            r rVar = r.this;
            if (rVar.f600d) {
                return false;
            }
            rVar.f597a.c();
            r.this.f600d = true;
            return false;
        }

        @Override // androidx.appcompat.app.g.f
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(r.this.f597a.getContext());
            }
            return null;
        }
    }

    r(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f605i = bVar;
        androidx.core.util.h.f(toolbar);
        c1 c1Var = new c1(toolbar, false);
        this.f597a = c1Var;
        this.f598b = (Window.Callback) androidx.core.util.h.f(callback);
        c1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        c1Var.setWindowTitle(charSequence);
        this.f599c = new e();
    }

    private Menu u() {
        if (!this.f601e) {
            this.f597a.i(new c(), new d());
            this.f601e = true;
        }
        return this.f597a.q();
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        return this.f597a.e();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        if (!this.f597a.n()) {
            return false;
        }
        this.f597a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f602f) {
            return;
        }
        this.f602f = z10;
        int size = this.f603g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a.b) this.f603g.get(i10)).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f597a.p();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        return this.f597a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public boolean k() {
        this.f597a.l().removeCallbacks(this.f604h);
        w.g0(this.f597a.l(), this.f604h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void l(Configuration configuration) {
        super.l(configuration);
    }

    @Override // androidx.appcompat.app.a
    void m() {
        this.f597a.l().removeCallbacks(this.f604h);
    }

    @Override // androidx.appcompat.app.a
    public boolean n(int i10, KeyEvent keyEvent) {
        Menu menuU = u();
        if (menuU == null) {
            return false;
        }
        menuU.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuU.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            p();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean p() {
        return this.f597a.f();
    }

    @Override // androidx.appcompat.app.a
    public void q(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void s(CharSequence charSequence) {
        this.f597a.setWindowTitle(charSequence);
    }

    void v() {
        Menu menuU = u();
        androidx.appcompat.view.menu.g gVar = menuU instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menuU : null;
        if (gVar != null) {
            gVar.d0();
        }
        try {
            menuU.clear();
            if (!this.f598b.onCreatePanelMenu(0, menuU) || !this.f598b.onPreparePanel(0, null, menuU)) {
                menuU.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.c0();
            }
        }
    }
}
