package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: v, reason: collision with root package name */
    private int f1533v;

    /* renamed from: w, reason: collision with root package name */
    private int f1534w;

    /* renamed from: x, reason: collision with root package name */
    private u.a f1535x;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n(u.e r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.f1534w = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L12
            int r6 = r3.f1533v
            if (r6 != r2) goto Lf
        Lc:
            r3.f1534w = r5
            goto L1c
        Lf:
            if (r6 != r1) goto L1c
            goto L16
        L12:
            int r6 = r3.f1533v
            if (r6 != r2) goto L19
        L16:
            r3.f1534w = r0
            goto L1c
        L19:
            if (r6 != r1) goto L1c
            goto Lc
        L1c:
            boolean r5 = r4 instanceof u.a
            if (r5 == 0) goto L27
            u.a r4 = (u.a) r4
            int r5 = r3.f1534w
            r4.w1(r5)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.n(u.e, int, boolean):void");
    }

    @Override // androidx.constraintlayout.widget.b
    protected void g(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.g(attributeSet);
        this.f1535x = new u.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f1876n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.f1931u1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == g.f1923t1) {
                    this.f1535x.v1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == g.f1939v1) {
                    this.f1535x.x1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1631p = this.f1535x;
        m();
    }

    public boolean getAllowsGoneWidget() {
        return this.f1535x.q1();
    }

    public int getMargin() {
        return this.f1535x.s1();
    }

    public int getType() {
        return this.f1533v;
    }

    @Override // androidx.constraintlayout.widget.b
    public void h(u.e eVar, boolean z10) {
        n(eVar, this.f1533v, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f1535x.v1(z10);
    }

    public void setDpMargin(int i10) {
        this.f1535x.x1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f1535x.x1(i10);
    }

    public void setType(int i10) {
        this.f1533v = i10;
    }
}
