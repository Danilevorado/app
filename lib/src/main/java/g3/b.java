package g3;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class b extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    private d3.m f23845m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView.ScaleType f23846n;

    public b(Context context) {
        super(context);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f23846n = scaleType;
    }

    public void setMediaContent(d3.m mVar) {
        this.f23845m = mVar;
    }
}
