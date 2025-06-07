package k4;

import android.content.Context;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final c f24825b = new c();

    /* renamed from: a, reason: collision with root package name */
    private b f24826a = null;

    public static b a(Context context) {
        return f24825b.b(context);
    }

    public final synchronized b b(Context context) {
        if (this.f24826a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f24826a = new b(context);
        }
        return this.f24826a;
    }
}
