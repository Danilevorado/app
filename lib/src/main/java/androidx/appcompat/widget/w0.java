package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class w0 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1396c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList f1397d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f1398a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f1399b;

    private w0(Context context) {
        super(context);
        if (!i1.c()) {
            this.f1398a = new y0(this, context.getResources());
            this.f1399b = null;
            return;
        }
        i1 i1Var = new i1(this, context.getResources());
        this.f1398a = i1Var;
        Resources.Theme themeNewTheme = i1Var.newTheme();
        this.f1399b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof w0) || (context.getResources() instanceof y0) || (context.getResources() instanceof i1) || !i1.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1396c) {
            ArrayList arrayList = f1397d;
            if (arrayList == null) {
                f1397d = new ArrayList();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f1397d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1397d.remove(size);
                    }
                }
                for (int size2 = f1397d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f1397d.get(size2);
                    w0 w0Var = weakReference2 != null ? (w0) weakReference2.get() : null;
                    if (w0Var != null && w0Var.getBaseContext() == context) {
                        return w0Var;
                    }
                }
            }
            w0 w0Var2 = new w0(context);
            f1397d.add(new WeakReference(w0Var2));
            return w0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1398a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1398a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1399b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1399b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
