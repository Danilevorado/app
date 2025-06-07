package z0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static Field f28681a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f28682b;

    e0() {
    }

    public abstract void a(View view);

    public abstract float b(View view);

    public abstract void c(View view);

    public abstract void d(View view, int i10, int i11, int i12, int i13);

    public abstract void e(View view, float f5);

    public void f(View view, int i10) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!f28682b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f28681a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f28682b = true;
        }
        Field field = f28681a;
        if (field != null) {
            try {
                f28681a.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}
