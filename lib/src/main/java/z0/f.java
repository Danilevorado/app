package z0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* loaded from: classes.dex */
abstract class f {
    static ObjectAnimator a(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
    }
}
