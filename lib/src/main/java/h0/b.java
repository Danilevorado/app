package h0;

import android.text.Editable;
import androidx.emoji2.text.n;

/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f23967a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f23968b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f23969c;

    private b() {
        try {
            f23969c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f23968b == null) {
            synchronized (f23967a) {
                if (f23968b == null) {
                    f23968b = new b();
                }
            }
        }
        return f23968b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f23969c;
        return cls != null ? n.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
