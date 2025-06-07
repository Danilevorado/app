package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class a implements z.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f748a;

    /* renamed from: b, reason: collision with root package name */
    private final int f749b;

    /* renamed from: c, reason: collision with root package name */
    private final int f750c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f751d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f752e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f753f;

    /* renamed from: g, reason: collision with root package name */
    private char f754g;

    /* renamed from: i, reason: collision with root package name */
    private char f756i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f758k;

    /* renamed from: l, reason: collision with root package name */
    private Context f759l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f760m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f761n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f762o;

    /* renamed from: h, reason: collision with root package name */
    private int f755h = 4096;

    /* renamed from: j, reason: collision with root package name */
    private int f757j = 4096;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f763p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f764q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f765r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f766s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f767t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f759l = context;
        this.f748a = i11;
        this.f749b = i10;
        this.f750c = i13;
        this.f751d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f758k;
        if (drawable != null) {
            if (this.f765r || this.f766s) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable);
                this.f758k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f758k = drawableMutate;
                if (this.f765r) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.f763p);
                }
                if (this.f766s) {
                    androidx.core.graphics.drawable.a.p(this.f758k, this.f764q);
                }
            }
        }
    }

    @Override // z.b
    public z.b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // z.b
    public androidx.core.view.b b() {
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // z.b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public z.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // z.b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public z.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // z.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // z.b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public z.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // z.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f757j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f756i;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f761n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f749b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f758k;
    }

    @Override // z.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f763p;
    }

    @Override // z.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f764q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f753f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f748a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f755h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f754g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f750c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f751d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f752e;
        return charSequence != null ? charSequence : this.f751d;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f762o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // z.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f767t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f767t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f767t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f767t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f756i = Character.toLowerCase(c10);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f756i = Character.toLowerCase(c10);
        this.f757j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f767t = (z10 ? 1 : 0) | (this.f767t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f767t = (z10 ? 2 : 0) | (this.f767t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public z.b setContentDescription(CharSequence charSequence) {
        this.f761n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f767t = (z10 ? 16 : 0) | (this.f767t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f758k = androidx.core.content.a.e(this.f759l, i10);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f758k = drawable;
        c();
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f763p = colorStateList;
        this.f765r = true;
        c();
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f764q = mode;
        this.f766s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f753f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f754g = c10;
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f754g = c10;
        this.f755h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f760m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f754g = c10;
        this.f756i = Character.toLowerCase(c11);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f754g = c10;
        this.f755h = KeyEvent.normalizeMetaState(i10);
        this.f756i = Character.toLowerCase(c11);
        this.f757j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f751d = this.f759l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f751d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f752e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public z.b setTooltipText(CharSequence charSequence) {
        this.f762o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f767t = (this.f767t & 8) | (z10 ? 0 : 8);
        return this;
    }
}
