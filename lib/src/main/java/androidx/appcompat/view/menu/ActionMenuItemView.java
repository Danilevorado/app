package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.l0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends d0 implements n.a, View.OnClickListener, ActionMenuView.a {
    private boolean A;
    private int B;
    private int C;
    private int D;

    /* renamed from: t, reason: collision with root package name */
    i f723t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f724u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f725v;

    /* renamed from: w, reason: collision with root package name */
    g.b f726w;

    /* renamed from: x, reason: collision with root package name */
    private l0 f727x;

    /* renamed from: y, reason: collision with root package name */
    b f728y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f729z;

    private class a extends l0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.l0
        public p b() {
            b bVar = ActionMenuItemView.this.f728y;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.l0
        protected boolean c() {
            p pVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f726w;
            return bVar != null && bVar.a(actionMenuItemView.f723t) && (pVarB = b()) != null && pVarB.b();
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f729z = C();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f23529v, i10, 0);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(f.j.f23534w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.D = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.C = -1;
        setSaveEnabled(false);
    }

    private boolean C() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void D() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f724u);
        if (this.f725v != null && (!this.f723t.B() || (!this.f729z && !this.A))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f724u : null);
        CharSequence contentDescription = this.f723t.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z12 ? null : this.f723t.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f723t.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            d1.a(this, z12 ? null : this.f723t.getTitle());
        } else {
            d1.a(this, tooltipText);
        }
    }

    public boolean B() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return B();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return B() && this.f723t.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void f(i iVar, int i10) {
        this.f723t = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f727x == null) {
            this.f727x = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f723t;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f726w;
        if (bVar != null) {
            bVar.a(this.f723t);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f729z = C();
        D();
    }

    @Override // androidx.appcompat.widget.d0, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean zB = B();
        if (zB && (i12 = this.C) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.B) : this.B;
        if (mode != 1073741824 && this.B > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zB || this.f725v == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f725v.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l0 l0Var;
        if (this.f723t.hasSubMenu() && (l0Var = this.f727x) != null && l0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            i iVar = this.f723t;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f725v = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.D;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        D();
    }

    public void setItemInvoker(g.b bVar) {
        this.f726w = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.C = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f728y = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f724u = charSequence;
        D();
    }
}
