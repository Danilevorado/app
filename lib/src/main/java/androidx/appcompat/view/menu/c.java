package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    final Context f778a;

    /* renamed from: b, reason: collision with root package name */
    private q.g f779b;

    /* renamed from: c, reason: collision with root package name */
    private q.g f780c;

    c(Context context) {
        this.f778a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof z.b)) {
            return menuItem;
        }
        z.b bVar = (z.b) menuItem;
        if (this.f779b == null) {
            this.f779b = new q.g();
        }
        MenuItem menuItem2 = (MenuItem) this.f779b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f778a, bVar);
        this.f779b.put(bVar, jVar);
        return jVar;
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    final void e() {
        q.g gVar = this.f779b;
        if (gVar != null) {
            gVar.clear();
        }
        q.g gVar2 = this.f780c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    final void f(int i10) {
        if (this.f779b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f779b.size()) {
            if (((z.b) this.f779b.i(i11)).getGroupId() == i10) {
                this.f779b.k(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f779b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f779b.size(); i11++) {
            if (((z.b) this.f779b.i(i11)).getItemId() == i10) {
                this.f779b.k(i11);
                return;
            }
        }
    }
}
