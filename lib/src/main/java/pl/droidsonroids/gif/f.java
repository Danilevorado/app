package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    static final List f26004a = Arrays.asList("raw", "drawable", "mipmap");

    static class a extends b {

        /* renamed from: c, reason: collision with root package name */
        final int f26005c;

        /* renamed from: d, reason: collision with root package name */
        final int f26006d;

        a() {
            this.f26005c = 0;
            this.f26006d = 0;
        }

        a(ImageView imageView, AttributeSet attributeSet, int i10, int i11) {
            super(imageView, attributeSet, i10, i11);
            this.f26005c = a(imageView, attributeSet, true);
            this.f26006d = a(imageView, attributeSet, false);
        }

        private static int a(ImageView imageView, AttributeSet attributeSet, boolean z10) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z10 ? "src" : "background", 0);
            if (attributeResourceValue > 0) {
                if (f.f26004a.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !f.e(imageView, z10, attributeResourceValue)) {
                    return attributeResourceValue;
                }
            }
            return 0;
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        boolean f26007a;

        /* renamed from: b, reason: collision with root package name */
        final int f26008b;

        b() {
            this.f26007a = false;
            this.f26008b = -1;
        }

        b(View view, AttributeSet attributeSet, int i10, int i11) {
            TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, i.f26012b, i10, i11);
            this.f26007a = typedArrayObtainStyledAttributes.getBoolean(i.f26013c, false);
            this.f26008b = typedArrayObtainStyledAttributes.getInt(i.f26014d, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static void a(int i10, Drawable drawable) {
        if (drawable instanceof pl.droidsonroids.gif.b) {
            ((pl.droidsonroids.gif.b) drawable).h(i10);
        }
    }

    static float b(Resources resources, int i10) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.density;
        if (i11 == 0) {
            i11 = 160;
        } else if (i11 == 65535) {
            i11 = 0;
        }
        int i12 = resources.getDisplayMetrics().densityDpi;
        if (i11 <= 0 || i12 <= 0) {
            return 1.0f;
        }
        return i12 / i11;
    }

    static a c(ImageView imageView, AttributeSet attributeSet, int i10, int i11) {
        if (attributeSet == null || imageView.isInEditMode()) {
            return new a();
        }
        a aVar = new a(imageView, attributeSet, i10, i11);
        int i12 = aVar.f26008b;
        if (i12 >= 0) {
            a(i12, imageView.getDrawable());
            a(i12, imageView.getBackground());
        }
        return aVar;
    }

    static boolean d(ImageView imageView, Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            imageView.setImageDrawable(new pl.droidsonroids.gif.b(imageView.getContext().getContentResolver(), uri));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    static boolean e(ImageView imageView, boolean z10, int i10) throws Resources.NotFoundException {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                if (!f26004a.contains(resources.getResourceTypeName(i10))) {
                    return false;
                }
                pl.droidsonroids.gif.b bVar = new pl.droidsonroids.gif.b(resources, i10);
                if (z10) {
                    imageView.setImageDrawable(bVar);
                    return true;
                }
                imageView.setBackground(bVar);
                return true;
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return false;
    }
}
