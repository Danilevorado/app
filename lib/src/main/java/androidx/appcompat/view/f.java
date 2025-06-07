package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f672a;

    /* renamed from: b, reason: collision with root package name */
    final b f673b;

    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f674a;

        /* renamed from: b, reason: collision with root package name */
        final Context f675b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f676c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final q.g f677d = new q.g();

        public a(Context context, ActionMode.Callback callback) {
            this.f675b = context;
            this.f674a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f677d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f675b, (z.a) menu);
            this.f677d.put(menu, oVar);
            return oVar;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f674a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public void b(b bVar) {
            this.f674a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f674a.onActionItemClicked(e(bVar), new j(this.f675b, (z.b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f674a.onCreateActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f676c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f676c.get(i10);
                if (fVar != null && fVar.f673b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f675b, bVar);
            this.f676c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f672a = context;
        this.f673b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f673b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f673b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f672a, (z.a) this.f673b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f673b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f673b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f673b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f673b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f673b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f673b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f673b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f673b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f673b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f673b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f673b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f673b.q(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f673b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f673b.s(z10);
    }
}
