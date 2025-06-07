package d;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f22787a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private volatile Context f22788b;

    public void a(b bVar) {
        if (this.f22788b != null) {
            bVar.a(this.f22788b);
        }
        this.f22787a.add(bVar);
    }

    public void b() {
        this.f22788b = null;
    }

    public void c(Context context) {
        this.f22788b = context;
        Iterator it = this.f22787a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(context);
        }
    }
}
