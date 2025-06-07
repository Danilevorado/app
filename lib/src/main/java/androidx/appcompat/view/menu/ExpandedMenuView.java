package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.z0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f731o = {R.attr.background, R.attr.divider};

    /* renamed from: m, reason: collision with root package name */
    private g f732m;

    /* renamed from: n, reason: collision with root package name */
    private int f733n;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        z0 z0VarV = z0.v(context, attributeSet, f731o, i10, 0);
        if (z0VarV.s(0)) {
            setBackgroundDrawable(z0VarV.g(0));
        }
        if (z0VarV.s(1)) {
            setDivider(z0VarV.g(1));
        }
        z0VarV.w();
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(i iVar) {
        return this.f732m.L(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar) {
        this.f732m = gVar;
    }

    public int getWindowAnimations() {
        return this.f733n;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        a((i) getAdapter().getItem(i10));
    }
}
