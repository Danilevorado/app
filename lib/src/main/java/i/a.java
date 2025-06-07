package i;

import android.content.res.Resources;
import android.util.TypedValue;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(Resources resources, int i10, int i11, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        resources.getValueForDensity(i10, i11, typedValue, z10);
    }
}
