package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.core.view.b;

/* loaded from: classes.dex */
public final class i implements z.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a, reason: collision with root package name */
    private final int f851a;

    /* renamed from: b, reason: collision with root package name */
    private final int f852b;

    /* renamed from: c, reason: collision with root package name */
    private final int f853c;

    /* renamed from: d, reason: collision with root package name */
    private final int f854d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f855e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f856f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f857g;

    /* renamed from: h, reason: collision with root package name */
    private char f858h;

    /* renamed from: j, reason: collision with root package name */
    private char f860j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f862l;

    /* renamed from: n, reason: collision with root package name */
    g f864n;

    /* renamed from: o, reason: collision with root package name */
    private r f865o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f866p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f867q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f868r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f869s;

    /* renamed from: z, reason: collision with root package name */
    private int f876z;

    /* renamed from: i, reason: collision with root package name */
    private int f859i = 4096;

    /* renamed from: k, reason: collision with root package name */
    private int f861k = 4096;

    /* renamed from: m, reason: collision with root package name */
    private int f863m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f870t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f871u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f872v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f873w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f874x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f875y = 16;
    private boolean D = false;

    class a implements b.InterfaceC0036b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0036b
        public void onActionProviderVisibilityChanged(boolean z10) {
            i iVar = i.this;
            iVar.f864n.J(iVar);
        }
    }

    i(g gVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f864n = gVar;
        this.f851a = i11;
        this.f852b = i10;
        this.f853c = i12;
        this.f854d = i13;
        this.f855e = charSequence;
        this.f876z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f874x && (this.f872v || this.f873w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.f872v) {
                androidx.core.graphics.drawable.a.o(drawable, this.f870t);
            }
            if (this.f873w) {
                androidx.core.graphics.drawable.a.p(drawable, this.f871u);
            }
            this.f874x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f864n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f876z & 4) == 4;
    }

    @Override // z.b
    public z.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.g();
        }
        this.A = null;
        this.B = bVar;
        this.f864n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.i(new a());
        }
        return this;
    }

    @Override // z.b
    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f864n.I(this);
    }

    @Override // z.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f876z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f864n.f(this);
        }
        return false;
    }

    @Override // z.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f864n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f854d;
    }

    char g() {
        return this.f864n.G() ? this.f860j : this.f858h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // z.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View viewC = bVar.c(this);
        this.A = viewC;
        return viewC;
    }

    @Override // z.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f861k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f860j;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f868r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f852b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f862l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f863m == 0) {
            return null;
        }
        Drawable drawableB = g.a.b(this.f864n.u(), this.f863m);
        this.f863m = 0;
        this.f862l = drawableB;
        return e(drawableB);
    }

    @Override // z.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f870t;
    }

    @Override // z.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f871u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f857g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f851a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // z.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f859i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f858h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f853c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f865o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f855e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f856f;
        return charSequence != null ? charSequence : this.f855e;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f869s;
    }

    String h() {
        int i10;
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f864n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f864n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(f.h.f23418k));
        }
        int i11 = this.f864n.G() ? this.f861k : this.f859i;
        d(sb2, i11, 65536, resources.getString(f.h.f23414g));
        d(sb2, i11, 4096, resources.getString(f.h.f23410c));
        d(sb2, i11, 2, resources.getString(f.h.f23409b));
        d(sb2, i11, 1, resources.getString(f.h.f23415h));
        d(sb2, i11, 4, resources.getString(f.h.f23417j));
        d(sb2, i11, 8, resources.getString(f.h.f23413f));
        if (cG == '\b') {
            i10 = f.h.f23411d;
        } else if (cG == '\n') {
            i10 = f.h.f23412e;
        } else {
            if (cG != ' ') {
                sb2.append(cG);
                return sb2.toString();
            }
            i10 = f.h.f23416i;
        }
        sb2.append(resources.getString(i10));
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f865o != null;
    }

    CharSequence i(n.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // z.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f875y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f875y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f875y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.f()) ? (this.f875y & 8) == 0 : (this.f875y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f876z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.c(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f867q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f864n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f866p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f857g != null) {
            try {
                this.f864n.u().startActivity(this.f857g);
                return true;
            } catch (ActivityNotFoundException e5) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e5);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.d();
    }

    public boolean l() {
        return (this.f875y & 32) == 32;
    }

    public boolean m() {
        return (this.f875y & 4) != 0;
    }

    public boolean n() {
        return (this.f876z & 1) == 1;
    }

    public boolean o() {
        return (this.f876z & 2) == 2;
    }

    @Override // z.b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public z.b setActionView(int i10) {
        Context contextU = this.f864n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i10, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // z.b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public z.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f851a) > 0) {
            view.setId(i10);
        }
        this.f864n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f864n.K(false);
    }

    void s(boolean z10) {
        int i10 = this.f875y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f875y = i11;
        if (i10 != i11) {
            this.f864n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f860j == c10) {
            return this;
        }
        this.f860j = Character.toLowerCase(c10);
        this.f864n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f860j == c10 && this.f861k == i10) {
            return this;
        }
        this.f860j = Character.toLowerCase(c10);
        this.f861k = KeyEvent.normalizeMetaState(i10);
        this.f864n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f875y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f875y = i11;
        if (i10 != i11) {
            this.f864n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f875y & 4) != 0) {
            this.f864n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public z.b setContentDescription(CharSequence charSequence) {
        this.f868r = charSequence;
        this.f864n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f875y = z10 ? this.f875y | 16 : this.f875y & (-17);
        this.f864n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f862l = null;
        this.f863m = i10;
        this.f874x = true;
        this.f864n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f863m = 0;
        this.f862l = drawable;
        this.f874x = true;
        this.f864n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f870t = colorStateList;
        this.f872v = true;
        this.f874x = true;
        this.f864n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f871u = mode;
        this.f873w = true;
        this.f874x = true;
        this.f864n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f857g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f858h == c10) {
            return this;
        }
        this.f858h = c10;
        this.f864n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f858h == c10 && this.f859i == i10) {
            return this;
        }
        this.f858h = c10;
        this.f859i = KeyEvent.normalizeMetaState(i10);
        this.f864n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f867q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f858h = c10;
        this.f860j = Character.toLowerCase(c11);
        this.f864n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f858h = c10;
        this.f859i = KeyEvent.normalizeMetaState(i10);
        this.f860j = Character.toLowerCase(c11);
        this.f861k = KeyEvent.normalizeMetaState(i11);
        this.f864n.K(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f876z = i10;
        this.f864n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f864n.u().getString(i10));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f855e = charSequence;
        this.f864n.K(false);
        r rVar = this.f865o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f856f = charSequence;
        this.f864n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public z.b setTooltipText(CharSequence charSequence) {
        this.f869s = charSequence;
        this.f864n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f864n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f875y = (z10 ? 4 : 0) | (this.f875y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f855e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        this.f875y = z10 ? this.f875y | 32 : this.f875y & (-33);
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // z.b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public z.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(r rVar) {
        this.f865o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f875y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f875y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f864n.A();
    }
}
