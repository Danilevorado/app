package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.w;
import c5.f;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    private TextView f21112m;

    /* renamed from: n, reason: collision with root package name */
    private Button f21113n;

    /* renamed from: o, reason: collision with root package name */
    private int f21114o;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void a(View view, int i10, int i11) {
        if (w.U(view)) {
            w.B0(view, w.G(view), i10, w.F(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean b(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f21112m.getPaddingTop() == i11 && this.f21112m.getPaddingBottom() == i12) {
            return z10;
        }
        a(this.f21112m, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f21113n;
    }

    public TextView getMessageView() {
        return this.f21112m;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f21112m = (TextView) findViewById(f.I);
        this.f21113n = (Button) findViewById(f.H);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = c5.d.f4709e
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = c5.d.f4708d
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f21112m
            android.text.Layout r3 = r3.getLayout()
            int r3 = r3.getLineCount()
            r4 = 0
            if (r3 <= r1) goto L2e
            r3 = r1
            goto L2f
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L48
            int r5 = r7.f21114o
            if (r5 <= 0) goto L48
            android.widget.Button r5 = r7.f21113n
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f21114o
            if (r5 <= r6) goto L48
            int r2 = r0 - r2
            boolean r0 = r7.b(r1, r0, r2)
            if (r0 == 0) goto L53
            goto L54
        L48:
            if (r3 == 0) goto L4b
            goto L4c
        L4b:
            r0 = r2
        L4c:
            boolean r0 = r7.b(r4, r0, r0)
            if (r0 == 0) goto L53
            goto L54
        L53:
            r1 = r4
        L54:
            if (r1 == 0) goto L59
            super.onMeasure(r8, r9)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f21114o = i10;
    }
}
