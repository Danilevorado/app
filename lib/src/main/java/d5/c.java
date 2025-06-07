package d5;

import android.util.Property;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public static final Property f22936a = new c("childrenAlpha");

    private c(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f5 = (Float) viewGroup.getTag(c5.f.B);
        return f5 != null ? f5 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f5) {
        float fFloatValue = f5.floatValue();
        viewGroup.setTag(c5.f.B, Float.valueOf(fFloatValue));
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(fFloatValue);
        }
    }
}
