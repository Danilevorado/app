package p7;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f25957a;

    public a(Context context) {
        this.f25957a = new WeakReference(context);
    }

    private Context b() {
        return (Context) this.f25957a.get();
    }

    @Override // p7.b
    public void a(Intent intent, String str) {
        if (b() == null) {
            return;
        }
        b().sendBroadcast(intent, str);
    }
}
