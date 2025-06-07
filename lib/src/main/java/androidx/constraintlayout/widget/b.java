package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: m, reason: collision with root package name */
    protected int[] f1628m;

    /* renamed from: n, reason: collision with root package name */
    protected int f1629n;

    /* renamed from: o, reason: collision with root package name */
    protected Context f1630o;

    /* renamed from: p, reason: collision with root package name */
    protected u.h f1631p;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f1632q;

    /* renamed from: r, reason: collision with root package name */
    protected String f1633r;

    /* renamed from: s, reason: collision with root package name */
    protected String f1634s;

    /* renamed from: t, reason: collision with root package name */
    private View[] f1635t;

    /* renamed from: u, reason: collision with root package name */
    protected HashMap f1636u;

    public b(Context context) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context);
        this.f1628m = new int[32];
        this.f1632q = false;
        this.f1635t = null;
        this.f1636u = new HashMap();
        this.f1630o = context;
        g(null);
    }

    public b(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet);
        this.f1628m = new int[32];
        this.f1632q = false;
        this.f1635t = null;
        this.f1636u = new HashMap();
        this.f1630o = context;
        g(attributeSet);
    }

    private void a(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f1630o == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iF = f(strTrim);
        if (iF != 0) {
            this.f1636u.put(Integer.valueOf(iF), strTrim);
            b(iF);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f1629n + 1;
        int[] iArr = this.f1628m;
        if (i11 > iArr.length) {
            this.f1628m = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1628m;
        int i12 = this.f1629n;
        iArr2[i12] = i10;
        this.f1629n = i12 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f1630o == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f1556c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int e(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1630o.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int f(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iE = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objG = constraintLayout.g(0, str);
            if (objG instanceof Integer) {
                iE = ((Integer) objG).intValue();
            }
        }
        if (iE == 0 && constraintLayout != null) {
            iE = e(constraintLayout, str);
        }
        if (iE == 0) {
            try {
                iE = f.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iE == 0 ? this.f1630o.getResources().getIdentifier(str, "id", this.f1630o.getPackageName()) : iE;
    }

    protected void d(ConstraintLayout constraintLayout) {
    }

    protected void g(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f1876n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.f1955x1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f1633r = string;
                    setIds(string);
                } else if (index == g.f1963y1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f1634s = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1628m, this.f1629n);
    }

    public abstract void h(u.e eVar, boolean z10);

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String str;
        int iE;
        if (isInEditMode()) {
            setIds(this.f1633r);
        }
        u.h hVar = this.f1631p;
        if (hVar == null) {
            return;
        }
        hVar.c();
        for (int i10 = 0; i10 < this.f1629n; i10++) {
            int i11 = this.f1628m[i10];
            View viewL = constraintLayout.l(i11);
            if (viewL == null && (iE = e(constraintLayout, (str = (String) this.f1636u.get(Integer.valueOf(i11))))) != 0) {
                this.f1628m[i10] = iE;
                this.f1636u.put(Integer.valueOf(iE), str);
                viewL = constraintLayout.l(iE);
            }
            if (viewL != null) {
                this.f1631p.a(constraintLayout.p(viewL));
            }
        }
        this.f1631p.b(constraintLayout.f1538o);
    }

    public void m() {
        if (this.f1631p == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f1594v0 = (u.e) this.f1631p;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.f1633r;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1634s;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f1632q) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.f1633r = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f1629n = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f1634s = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f1629n = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1633r = null;
        this.f1629n = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f1633r == null) {
            b(i10);
        }
    }
}
