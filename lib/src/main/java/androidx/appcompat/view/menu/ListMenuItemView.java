package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.z0;
import androidx.core.view.w;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
    private boolean A;
    private LayoutInflater B;
    private boolean C;

    /* renamed from: m, reason: collision with root package name */
    private i f734m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f735n;

    /* renamed from: o, reason: collision with root package name */
    private RadioButton f736o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f737p;

    /* renamed from: q, reason: collision with root package name */
    private CheckBox f738q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f739r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f740s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f741t;

    /* renamed from: u, reason: collision with root package name */
    private LinearLayout f742u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f743v;

    /* renamed from: w, reason: collision with root package name */
    private int f744w;

    /* renamed from: x, reason: collision with root package name */
    private Context f745x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f746y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f747z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.A);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        z0 z0VarV = z0.v(getContext(), attributeSet, f.j.T1, i10, 0);
        this.f743v = z0VarV.g(f.j.V1);
        this.f744w = z0VarV.n(f.j.U1, -1);
        this.f746y = z0VarV.a(f.j.W1, false);
        this.f745x = context;
        this.f747z = z0VarV.g(f.j.X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, f.a.f23311x, 0);
        this.A = typedArrayObtainStyledAttributes.hasValue(0);
        z0VarV.w();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f742u;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(f.g.f23395h, (ViewGroup) this, false);
        this.f738q = checkBox;
        a(checkBox);
    }

    private void e() {
        ImageView imageView = (ImageView) getInflater().inflate(f.g.f23396i, (ViewGroup) this, false);
        this.f735n = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(f.g.f23398k, (ViewGroup) this, false);
        this.f736o = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.B == null) {
            this.B = LayoutInflater.from(getContext());
        }
        return this.B;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f740s;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f741t;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f741t.getLayoutParams();
        rect.top += this.f741t.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void f(i iVar, int i10) {
        this.f734m = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f734m;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f734m.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f739r.setText(this.f734m.h());
        }
        if (this.f739r.getVisibility() != i10) {
            this.f739r.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        w.s0(this, this.f743v);
        TextView textView = (TextView) findViewById(f.f.M);
        this.f737p = textView;
        int i10 = this.f744w;
        if (i10 != -1) {
            textView.setTextAppearance(this.f745x, i10);
        }
        this.f739r = (TextView) findViewById(f.f.F);
        ImageView imageView = (ImageView) findViewById(f.f.I);
        this.f740s = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f747z);
        }
        this.f741t = (ImageView) findViewById(f.f.f23379r);
        this.f742u = (LinearLayout) findViewById(f.f.f23373l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f735n != null && this.f746y) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f735n.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z10 && this.f736o == null && this.f738q == null) {
            return;
        }
        if (this.f734m.m()) {
            if (this.f736o == null) {
                g();
            }
            compoundButton = this.f736o;
            compoundButton2 = this.f738q;
        } else {
            if (this.f738q == null) {
                c();
            }
            compoundButton = this.f738q;
            compoundButton2 = this.f736o;
        }
        if (z10) {
            compoundButton.setChecked(this.f734m.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f738q;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f736o;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f734m.m()) {
            if (this.f736o == null) {
                g();
            }
            compoundButton = this.f736o;
        } else {
            if (this.f738q == null) {
                c();
            }
            compoundButton = this.f738q;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.C = z10;
        this.f746y = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f741t;
        if (imageView != null) {
            imageView.setVisibility((this.A || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f734m.z() || this.C;
        if (z10 || this.f746y) {
            ImageView imageView = this.f735n;
            if (imageView == null && drawable == null && !this.f746y) {
                return;
            }
            if (imageView == null) {
                e();
            }
            if (drawable == null && !this.f746y) {
                this.f735n.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f735n;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f735n.getVisibility() != 0) {
                this.f735n.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i10;
        TextView textView;
        if (charSequence != null) {
            this.f737p.setText(charSequence);
            if (this.f737p.getVisibility() == 0) {
                return;
            }
            textView = this.f737p;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f737p.getVisibility() == 8) {
                return;
            } else {
                textView = this.f737p;
            }
        }
        textView.setVisibility(i10);
    }
}
