package z7;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private final int f28909b;

    /* renamed from: c, reason: collision with root package name */
    private final a f28910c;

    /* renamed from: a, reason: collision with root package name */
    private final List f28908a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private final Handler f28911d = new Handler(Looper.getMainLooper());

    public interface a {
        void f(List list);
    }

    public b(a aVar, int i10) {
        this.f28909b = i10;
        this.f28910c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        LinkedList linkedList = new LinkedList();
        synchronized (this.f28908a) {
            linkedList.addAll(this.f28908a);
            this.f28908a.clear();
        }
        this.f28910c.f(linkedList);
    }

    public void c(Object obj) {
        synchronized (this.f28908a) {
            if (this.f28908a.isEmpty()) {
                this.f28911d.postDelayed(new Runnable() { // from class: z7.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28907m.b();
                    }
                }, this.f28909b);
            }
            this.f28908a.add(obj);
        }
    }
}
