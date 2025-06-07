package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: m, reason: collision with root package name */
    g f815m;

    /* renamed from: n, reason: collision with root package name */
    private int f816n = -1;

    /* renamed from: o, reason: collision with root package name */
    private boolean f817o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f818p;

    /* renamed from: q, reason: collision with root package name */
    private final LayoutInflater f819q;

    /* renamed from: r, reason: collision with root package name */
    private final int f820r;

    public f(g gVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f818p = z10;
        this.f819q = layoutInflater;
        this.f815m = gVar;
        this.f820r = i10;
        a();
    }

    void a() {
        i iVarV = this.f815m.v();
        if (iVarV != null) {
            ArrayList arrayListZ = this.f815m.z();
            int size = arrayListZ.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((i) arrayListZ.get(i10)) == iVarV) {
                    this.f816n = i10;
                    return;
                }
            }
        }
        this.f816n = -1;
    }

    public g b() {
        return this.f815m;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i getItem(int i10) {
        ArrayList arrayListZ = this.f818p ? this.f815m.z() : this.f815m.E();
        int i11 = this.f816n;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (i) arrayListZ.get(i10);
    }

    public void d(boolean z10) {
        this.f817o = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayListZ = this.f818p ? this.f815m.z() : this.f815m.E();
        int i10 = this.f816n;
        int size = arrayListZ.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f819q.inflate(this.f820r, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f815m.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f817o) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.f(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
