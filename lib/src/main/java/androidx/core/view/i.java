package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f2474a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f2475b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map f2476c = new HashMap();

    public i(Runnable runnable) {
        this.f2474a = runnable;
    }

    public void a(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f2475b.iterator();
        while (it.hasNext()) {
            ((k) it.next()).c(menu, menuInflater);
        }
    }

    public void b(Menu menu) {
        Iterator it = this.f2475b.iterator();
        while (it.hasNext()) {
            ((k) it.next()).b(menu);
        }
    }

    public boolean c(MenuItem menuItem) {
        Iterator it = this.f2475b.iterator();
        while (it.hasNext()) {
            if (((k) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void d(Menu menu) {
        Iterator it = this.f2475b.iterator();
        while (it.hasNext()) {
            ((k) it.next()).d(menu);
        }
    }
}
