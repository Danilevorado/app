package t7;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f27346a;

    public a(Context context) {
        this.f27346a = new WeakReference(context);
    }

    private Context d() {
        return (Context) this.f27346a.get();
    }

    @Override // t7.b
    public DisplayMetrics a() {
        if (d() == null) {
            return null;
        }
        return d().getResources().getDisplayMetrics();
    }

    @Override // t7.b
    public int b(String str, String str2) {
        if (d() == null) {
            return -1;
        }
        return d().getResources().getIdentifier(str, str2, d().getPackageName());
    }

    @Override // t7.b
    public void c(int i10, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        if (d() == null) {
            return;
        }
        d().getResources().getValue(i10, typedValue, z10);
    }

    @Override // t7.b
    public Configuration e() {
        if (d() == null) {
            return null;
        }
        return d().getResources().getConfiguration();
    }

    @Override // t7.b
    public float g(int i10) {
        if (d() == null) {
            return -1.0f;
        }
        return d().getResources().getDimension(i10);
    }
}
